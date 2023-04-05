package study;

import java.awt.Color;
import java.awt.Container;
import java.awt.FlowLayout;

import javax.swing.JButton;
import javax.swing.JFrame;

public class ContentPaneEx extends JFrame{
	// 기본 생성자 
	public ContentPaneEx() {
		this.setTitle("20202786김동헌_컴포넌트예제");
		this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		
		Container con = this.getContentPane();
		con.setBackground(Color.orange);
		con.setLayout(new FlowLayout());
		
		JButton bt1 = new JButton("확인");
		con.add(bt1);
		JButton bt2 = new JButton("취소");
		con.add(bt2);
		JButton bt3 = new JButton("ignore");
		con.add(bt3);
		
		this.setSize(400,200);
		this.setVisible(true);
		this.setLocationRelativeTo(null);
	}
}
