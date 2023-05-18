package test;


import java.awt.Container;
import java.awt.GridLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.ArrayList;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JTextField;
public class GridEx extends JFrame {
	ArrayList<Student> stulist = new ArrayList<Student>();
	public GridEx() {
		setTitle("GridLayout Sample");
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		
		GridLayout grid = new GridLayout(6, 2);
		grid.setVgap(5);
		
		Container c = getContentPane();
		c.setLayout(grid);
		c.add(new JLabel(" 이름"));
		
		JTextField  txtName = new JTextField(); 
		c.add(txtName);
		c.add(new JLabel(" 학번"));
		JTextField  txtHb = new JTextField(); 
		c.add(txtHb);
		c.add(new JLabel(" 학과"));
		JTextField  txtHk = new JTextField(); 
		c.add(txtHk);
		c.add(new JLabel(" 과목"));
		JTextField  txtGm = new JTextField(); 
		c.add(txtGm);
		JButton btnOk = new JButton("확인"); 
		c.add(btnOk);	
		btnOk.addActionListener(new ActionListener() {			
			@Override
			public void actionPerformed(ActionEvent e) {
				// TODO Auto-generated method stub
				String name =txtName.getText(); 
				String hb = txtHb.getText();
				String hk = txtHk.getText();
				String gm = txtGm.getText();
				System.out.println(name + hb + hk + gm);
				stulist.add(new Student(name, hb, hk, gm)); 
			}
		});
		JButton btnCancel = new JButton("취소");		//취소버튼 	
		c.add(btnCancel); 
		btnCancel.addActionListener(new ActionListener() {			
			@Override
			public void actionPerformed(ActionEvent e) {
				// TODO Auto-generated method stub
				txtName.setText("");  txtHb.setText("");
				txtHk.setText("");    txtGm.setText("");
			}
		});
		
		JButton btnJohoi = new JButton("조회");
		c.add(btnJohoi); 
		btnJohoi.addActionListener(new ActionListener() {			
			@Override
			public void actionPerformed(ActionEvent e) {
				// TODO Auto-generated method stub
				for (Student stu : stulist) {
					System.out.println(stu);
				}				
			}
		});
		JButton btnSearch = new JButton("이름으로검색");
		btnSearch.addActionListener(new ActionListener() {
			// 메소드 :
			// 학생 이름으로 검색
			@Override
			public void actionPerformed(ActionEvent e) {
				// TODO Auto-generated method stub
				String sch = txtName.getText();
				for (Student student : stulist) {
					if (student.getName().equals(sch))
						System.out.println(student.toString());
				}
			}
		});
		c.add(btnSearch); 
		
		setSize(300, 200);
		this.setLocationRelativeTo(null);
		setVisible(true);
		}
}






