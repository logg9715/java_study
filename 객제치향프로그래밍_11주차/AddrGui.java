package test;

import java.awt.Container;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;
import javax.swing.JFrame;

public class AddrGui extends JFrame {

	// 기본 생성자
	public AddrGui() {
		setTitle("주소록 관리 프로그램");
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

		Container con = this.getContentPane();

		setSize(400, 400);
		setVisible(true);
		setLocationRelativeTo(null);
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		new AddrGui();
	}


}
