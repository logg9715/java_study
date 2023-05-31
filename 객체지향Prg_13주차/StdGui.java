package test;

import java.awt.BorderLayout;
import java.awt.Container;
import java.awt.Dimension;
import java.awt.FlowLayout;
import java.awt.GridLayout;
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

import com.mysql.cj.protocol.Resultset;
import com.mysql.cj.xdevapi.Result;

public class StdGui extends JFrame {
	private JTextField tfId, tfName, tfDept, tfSearch;
	private JButton btInput, btEdit, btDel, btShow, btSearch;
	private JRadioButton radiId, radiName, radiDept;
	private ButtonGroup grp_search;
	private JTextArea ta;
	private Connection conn;
	private Statement stmt;
	private PreparedStatement pstmt;
	private ResultSet rs;

	public StdGui() {
		setTitle("학생 관리 프로젝트");
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		createGui();

		// 입력패널
		btInput.addActionListener(e -> {
			std_insert(tfId.getText(), tfName.getText(), tfDept.getText());
			clearTf();
		});
		btEdit.addActionListener(e -> {
			std_edit(tfId.getText(), tfName.getText(), tfDept.getText());
			clearTf();
		});
		btDel.addActionListener(e -> {
			std_del(tfId.getText());
			clearTf();
		});
		btShow.addActionListener(e -> {
			std_show();
			clearTf();
		});

		// 검색패널
		btSearch.addActionListener(e -> {
			std_search(tfSearch.getText());
			clearTf();
		});

		setSize(280, 700);
		setLocationRelativeTo(null);
		setVisible(true);
		setResizable(false);
	}

	public void createGui() {
		// 컨테이너 생성
		Container con = this.getContentPane();
		GridLayout gridlay = new GridLayout(3, 1);
		con.setLayout(new FlowLayout());

		// 패널 생성
		JPanel pan_input = new JPanel();
		pan_input.setPreferredSize(new Dimension(280, 110));

		JPanel pan_search = new JPanel();
		pan_search.setPreferredSize(new Dimension(280, 100));
		FlowLayout flow_PanSearch = new FlowLayout();
		flow_PanSearch.setVgap(10);
		pan_search.setLayout(flow_PanSearch);

		JPanel pan_output = new JPanel();
		pan_output.setLayout(new BorderLayout());

		// 패널설정 : 인풋패널
		// 라벨
		JLabel lb1 = new JLabel("학번");
		JLabel lb2 = new JLabel("이름");
		JLabel lb3 = new JLabel("학과");
		// 텍스트 필드
		tfId = new JTextField(20);
		tfName = new JTextField(20);
		tfDept = new JTextField(20);
		// 버튼
		btInput = new JButton("입력");
		btEdit = new JButton("수정");
		btDel = new JButton("삭제");
		btShow = new JButton("조회");
		// 장착
		pan_input.add(lb1);
		pan_input.add(tfId);
		pan_input.add(lb2);
		pan_input.add(tfName);
		pan_input.add(lb3);
		pan_input.add(tfDept);
		pan_input.add(btInput);
		pan_input.add(btEdit);
		pan_input.add(btDel);
		pan_input.add(btShow);

		// 패널설정 : 검색패널
		// 타이틀
		TitledBorder tb1 = new TitledBorder("검색");
		// 텍스트필드
		tfSearch = new JTextField(15);
		// 버튼
		btSearch = new JButton("검색");
		// 라디오버튼
		radiId = new JRadioButton("학번");
		radiName = new JRadioButton("이름");
		radiDept = new JRadioButton("학과");
		grp_search = new ButtonGroup();
		grp_search.add(radiId);
		grp_search.add(radiName);
		grp_search.add(radiDept);
		// 장착
		pan_search.setBorder(tb1);
		pan_search.add(tfSearch);
		pan_search.add(btSearch);
		pan_search.add(radiId);
		pan_search.add(radiName);
		pan_search.add(radiDept);

		// 패널설정 : 출력패널
		ta = new JTextArea(26, 20);
		pan_output.add(ta);

		// 패널 붙이기
		con.add(pan_input);
		con.add(pan_search);
		con.add(pan_output);
	}

	public void std_insert(String id, String name, String dept) {
		try {
			conn = DBconn.dbConnection();
			String sql = "insert into studenttbl values(?, ?, ?);";
			pstmt = conn.prepareStatement(sql);
			pstmt.setString(1, id);
			pstmt.setString(2, name);
			pstmt.setString(3, dept);
			pstmt.executeUpdate();

		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}

	}

	public void std_edit(String id, String name, String dept) {

		try {
			conn = DBconn.dbConnection();
			String sql = "update studenttbl set name = ?, dept = ? where id = ?;";
			pstmt = conn.prepareStatement(sql);
			pstmt.setString(3, id);
			pstmt.setString(1, name);
			pstmt.setString(2, dept);
			pstmt.executeUpdate();
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}

	}

	public void std_del(String id) {

		try {
			conn = DBconn.dbConnection();
			String sql = "delete from studenttbl where id = ?;";
			pstmt = conn.prepareStatement(sql);
			pstmt.setString(1, id);
			pstmt.executeUpdate();
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}

	}

	public void std_show() {
		try {
			conn = DBconn.dbConnection();
			stmt = conn.createStatement();
			rs = stmt.executeQuery("select * from studenttbl;");
			ta.setText("        id          name          dept    \n===============================\n");
			while (rs.next()) {
				String temp = rs.getString("id") + " | " + rs.getString("name") + " | " + rs.getString("dept") + "\n";
				ta.append(temp);
			}
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}

	}

	public void std_search(String key) {
		String keycol = "";

		if (radiId.isSelected()) {
			keycol = "id";
		} else if (radiName.isSelected()) {
			keycol = "name";
		} else if (radiDept.isSelected()) {
			keycol = "dept";
		}

		try {
			conn = DBconn.dbConnection();
			String sql = "select * from studenttbl where " + keycol + " = '" + key + "';";
			System.out.println(sql);
			stmt = conn.prepareStatement(sql);
			rs = stmt.executeQuery(sql);
			ta.setText("        id          name          dept    \n===============================\n");
			while (rs.next()) {
				String temp = rs.getString("id") + " | " + rs.getString("name") + " | " + rs.getString("dept") + "\n";
				ta.append(temp);
			}
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}

	}

	public void clearTf() {
		tfDept.setText("");
		tfName.setText("");
		tfId.setText("");
		tfSearch.setText("");
	}

}
