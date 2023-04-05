package study;

import javax.swing.JFrame;

public class MyFrame extends JFrame {
	// 기본 생성자
	public MyFrame() {
		this.setTitle("프레임 만들기 실습");
		this.setSize(300,300);
		this.setVisible(true);	
		this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		this.setLocationRelativeTo(null);
	}
}
