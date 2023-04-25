package re;

import java.awt.BorderLayout;
import java.awt.Container;

import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;

// BorderLayout
// 컨테이너 기본 레이아웃
// BorderLayout.SOUTH, .NORTH, .EAST, .WEST, .CENTER 다섯 구역으로 분할

public class BorderEx extends JFrame {

	public BorderEx() {
		setTitle("BorderLayout 예제");
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

		Container con = this.getContentPane();
		// 기본 레이아웃이기에 따로 설정 X

		con.add(new JLabel("ff"),BorderLayout.EAST);
		con.add(new JLabel("ff"),BorderLayout.SOUTH);
		con.add(new JLabel("ff"),BorderLayout.CENTER);

		setSize(250, 150);
		setVisible(true);
		setLocationRelativeTo(null);
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		new BorderEx();
	}

}
