package test;

import java.awt.Container;
import java.awt.GridLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JTextField;

public class LoginEx extends JFrame{
	// 필드 선언
	String email = "hong@google.com";
	String pw = "1234";
	// 기본 생성자
	LoginEx () {
		this.setTitle("LOGIN FORM");
		this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		
		GridLayout gd = new GridLayout(3,2);
		gd.setVgap(1);
		
		Container con = this.getContentPane();
		con.setLayout(gd);
		
//		JPanel pan = new JPanel();
		
		JTextField txfEmail = new JTextField();
		JTextField txfPw = new JTextField();
		
		JButton bt1 = new JButton("로그인");
		bt1.addActionListener(new ActionListener() {
			
			@Override
			public void actionPerformed(ActionEvent e) {
				// TODO Auto-generated method stub
				if (txfEmail.getText().equals(email) && txfPw.getText().equals(pw))
					System.out.println("로그인 되었습니다.");
				else
					System.out.println("이메일과 비밀번호를 다시 입력하십시오.");
			}
		});
		JButton bt2 = new JButton("취소");
		bt2.addActionListener(new ActionListener() {
			
			@Override
			public void actionPerformed(ActionEvent e) {
				// TODO Auto-generated method stub
				txfEmail.setText("");
				txfPw.setText("");
			}
		});
		
		
		
		
		con.add(new JLabel("이메일"));
		con.add(txfEmail);
		
		con.add(new JLabel("비밀번호"));
		con.add(txfPw);
		
		con.add(bt1);
		con.add(bt2);
		
//		con.add(pan);
		
		this.setSize(400,150);
		this.setLocationRelativeTo(null);
		this.setVisible(true);

	}
	
}
