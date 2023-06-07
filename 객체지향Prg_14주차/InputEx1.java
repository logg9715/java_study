package test;

import java.awt.BorderLayout;
import java.awt.Container;
import java.awt.FlowLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import javax.swing.ButtonGroup;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JRadioButton;
import javax.swing.JTextArea;
import javax.swing.JTextField;
import javax.swing.border.TitledBorder;

public class InputEx1 extends JFrame {
	JButton btnInsert, btnSelect, btnSearch;
	JTextField tfId, tfName, tfDept, tfSearch;
	JTextArea ta;
	JRadioButton rbId, rbName, rbDept;
	Connection conn;
	Statement stmt;
	ResultSet rs;
	PreparedStatement pstmt;

	// 생성자
	public InputEx1() {
		this.setTitle("학생 관리 프로젝트");
		this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		createGUI();
		btnInsert.addActionListener(new ActionListener() {
			@Override
			public void actionPerformed(ActionEvent e) {
				// TODO Auto-generated method stub
				dbInsert();
			}
		});
		btnSelect.addActionListener(new ActionListener() {
			@Override
			public void actionPerformed(ActionEvent e) {
				// TODO Auto-generated method stub
				dbSelect();
			}
		});
		btnSearch.addActionListener(new ActionListener() {
			@Override
			public void actionPerformed(ActionEvent e) {
				// TODO Auto-generated method stub
				dbSearch();
			}
		});

		this.setSize(290, 550);
		this.setVisible(true);
		this.setLocationRelativeTo(null);
		this.setResizable(false);
	}

	// 화면구현
	public void createGUI() {
		Container c = this.getContentPane();
		c.setLayout(new FlowLayout());
		// 학번 학과 이름 입력버튼, 조회버튼
		c.add(new JLabel("학번"));
		tfId = new JTextField(20);
		c.add(tfId);
		c.add(new JLabel("학과"));
		tfDept = new JTextField(20);
		c.add(tfDept);
		c.add(new JLabel("이름"));
		tfName = new JTextField(20);
		c.add(tfName);
		btnInsert = new JButton("입력");
		c.add(btnInsert);
		btnSelect = new JButton("조회");
		c.add(btnSelect);

		// 검색부분
		tfSearch = new JTextField(18);
		rbId = new JRadioButton("학번", true);
		rbName = new JRadioButton("이름");
		rbDept = new JRadioButton("학과");
		ButtonGroup group = new ButtonGroup();
		group.add(rbId);
		group.add(rbName);
		group.add(rbDept);
		btnSearch = new JButton("검색");
		JPanel pn1 = new JPanel();
		pn1.add(new JLabel(" "));
		pn1.add(tfSearch);
		pn1.add(btnSearch);
		JPanel pn2 = new JPanel();
		pn2.add(rbId);
		pn2.add(rbName);
		pn2.add(rbDept);
		JPanel pMiddle = new JPanel(new BorderLayout(0, 0));
		pMiddle.add(BorderLayout.NORTH, pn1);
		pMiddle.add(BorderLayout.CENTER, pn2);
		TitledBorder tb = new TitledBorder("검색");
		pMiddle.setBorder(tb);
		c.add(pMiddle);
		//
		ta = new JTextArea(15, 20);
		c.add(ta);
	}

	public void dbSearch() {
		ta.setText("");
		conn = DBConn.DBconnection();
		String sql = "";

		if (rbId.isSelected())
			sql = "select * from student where id =?;";
		else if (rbDept.isSelected())
			sql = "select * from student where dept =?;";
		else if (rbName.isSelected())
			sql = "select * from student where name =?;";

		try {
			pstmt = conn.prepareStatement(sql);
			pstmt.setString(1, tfSearch.getText());

			rs = pstmt.executeQuery();
			while (rs.next()) {
				String temp = rs.getString("id") + " | " + rs.getString("name") + " | " + rs.getString("dept") + "\n";
				ta.append(temp);
				System.out.println(temp);
			}

			rs.close();
			pstmt.close();
			conn.close();
		} catch (SQLException e) {
			e.printStackTrace();
		}
	}

	public void dbSelect() {
		ta.setText("");
		conn = DBConn.DBconnection();
		String sql = "select * from student;";
		try {
			pstmt = conn.prepareStatement(sql);
			rs = pstmt.executeQuery();
			while (rs.next()) {
				String temp = rs.getString("id") + " | " + rs.getString("name") + " | " + rs.getString("dept") + "\n";
				ta.append(temp);
			}

			rs.close();
			pstmt.close();
			conn.close();
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}

	}

	public void dbInsert() {
		ta.setText("");
		conn = DBConn.DBconnection();
		String sql = "insert into student values (?,?,?);";
		if (tfId.getText().equals("") || tfName.getText().equals("") || tfDept.getText().equals("")) {
			ta.setText("올바른 값을 입력하시오.");
			return;
		}

		try {
			pstmt = conn.prepareStatement(sql);
			pstmt.setString(1, tfId.getText());
			pstmt.setString(2, tfDept.getText());
			pstmt.setString(3, tfName.getText());
			pstmt.executeUpdate();
			ta.setText("추가 완료.");
			tfId.setText("");
			tfDept.setText("");
			tfName.setText("");

			pstmt.close();
			conn.close();
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
			ta.setText("올바른 값을 입력하시오.");
		}

	}
}
