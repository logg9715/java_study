package test;

import java.awt.Color;
import java.awt.Container;
import java.awt.FlowLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;
import javax.swing.JFrame;

public class AnonyLisEx extends JFrame {
	// 기본 생성자
	AnonyLisEx() {
		setTitle("익명 클래스 리스너 예제");
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

		Container con = getContentPane();
		con.setLayout(new FlowLayout());

		// 배경
		con.setBackground(Color.cyan);

		// 버튼 : 액션버튼
		JButton bt1 = new JButton("Action");
		bt1.addActionListener(new ActionListener() {
			@Override
			public void actionPerformed(ActionEvent e) {
				// TODO Auto-generated method stub
				JButton b = (JButton) e.getSource();
				if (b.getText().equals("Action"))
					b.setText("액션");
				else
					b.setText("Action");
			}
		});
		con.add(bt1);

//		con.add(new JButton("확인"));
//		con.add(new JButton("취소"));

		setSize(350, 150);
		setLocationRelativeTo(null);
		setVisible(true);
	}
}
