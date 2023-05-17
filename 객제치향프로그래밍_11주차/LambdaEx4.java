package test;

import java.awt.Container;
import java.awt.FlowLayout;


import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;

public class LambdaEx4 extends JFrame {
	// 기본 생성자
	LambdaEx4() {
		setTitle("버튼 2개 예제");
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

		Container con = getContentPane();
		con.setLayout(new FlowLayout());

		con.add(new JLabel("아이스크림을 좋아하나요?"));

		// 확인버튼
		JButton bt1 = new JButton("예");
		bt1.addActionListener((e) -> System.out.println("예, 좋아합니다."));
		con.add(bt1);

		// 버튼 :
		// 취소버튼
		JButton bt2 = new JButton("아니오");
		bt2.addActionListener(e -> System.out.println("아니오, 좋아하지 않습니다."));
		con.add(bt2);

		setSize(350, 150);
		setLocationRelativeTo(null);
		setVisible(true);
		
	}

	public static void main(String[] args) {
		new LambdaEx4();
	}
}