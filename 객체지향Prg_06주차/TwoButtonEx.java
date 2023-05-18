package test;

import java.awt.Color;
import java.awt.Container;
import java.awt.FlowLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;
import javax.swing.JFrame;

public class TwoButtonEx extends JFrame {
	// 기본 생성자
	TwoButtonEx() {
		setTitle("버튼 2개 예제");
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

		Container con = getContentPane();
		con.setLayout(new FlowLayout());

		// 배경
		con.setBackground(Color.cyan);

		// 버튼 :
		// 확인버튼
		JButton bt1 = new JButton("확인");
		bt1.addActionListener(new ActionListener() {
			@Override
			public void actionPerformed(ActionEvent e) {
				// TODO Auto-generated method stub
				System.out.println("확인버튼 눌림");
			}
		});
		con.add(bt1);

		// 버튼 :
		// 취소버튼
		JButton bt2 = new JButton("취소");
		bt2.addActionListener(new ActionListener() {
			@Override
			public void actionPerformed(ActionEvent e) {
				// TODO Auto-generated method stub
				System.out.println("취소버튼 눌림");
			}
		});
		con.add(bt2);

		setSize(350, 150);
		setLocationRelativeTo(null);
		setVisible(true);
	}
}
