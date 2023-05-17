package test;

import java.awt.Container;
import java.awt.FlowLayout;

import javax.swing.JFrame;
import javax.swing.JList;

public class ListEx extends JFrame {
	// 필드 선언 :
	// 배열 생성
	private String[] sList = { "apple", "banana", "kiwi", "mango", "pear" };
	private Integer[] iList = { 100, 200, 300, 400, 500 };

	public ListEx() {
		// TODO Auto-generated constructor stub
		setTitle("리스트 예제");
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

		Container con = this.getContentPane();
		con.setLayout(new FlowLayout(FlowLayout.CENTER));

		// JList 생성 << 배열을 참조함
		JList<String> sJList = new JList<>(this.sList);
		JList<Integer> iJList = new JList<>(this.iList);

		con.add(sJList);
		con.add(iJList);

		setSize(300, 300);
		setVisible(true);
		setLocationRelativeTo(null);
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		new ListEx();
	}

}
