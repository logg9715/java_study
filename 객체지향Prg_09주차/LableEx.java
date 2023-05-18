package test;

import java.awt.BorderLayout;
import java.awt.Container;

import javax.swing.ImageIcon;
import javax.swing.JFrame;
import javax.swing.JLabel;

public class LableEx extends JFrame {

	public LableEx() {
		setTitle("레이블 예제");
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

		Container con = getContentPane();

		JLabel lbText1 = new JLabel("사랑합니다.");
		
		ImageIcon img1 = new ImageIcon("images/img1.PNG");
		JLabel lbImg1 = new JLabel(img1);

		con.add(lbText1, BorderLayout.NORTH);
		con.add(lbImg1, BorderLayout.CENTER);

		setSize(600, 600);
		setVisible(true);
		setLocationRelativeTo(null);

	}
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		new LableEx();
	}

}
