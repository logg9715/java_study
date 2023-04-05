package study;

import java.awt.BorderLayout;
import java.awt.Button;
import java.awt.Container;

import javax.swing.JFrame;

public class BorderLayoutEx extends JFrame{
	public BorderLayoutEx() {
		this.setTitle("보더 예제");
		this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

		Container con = this.getContentPane();

		// 레이아웃 지정 구문을 사용하지 않는다고 하였기에, 버튼 간격을 설정할 수 없습니다. 
		
		con.add(new Button("add"), BorderLayout.NORTH);
		con.add(new Button("sub"), BorderLayout.SOUTH);
		con.add(new Button("mul"), BorderLayout.EAST);
		con.add(new Button("div"), BorderLayout.WEST);
		con.add(new Button("Calculate"), BorderLayout.CENTER);

		this.setSize(300, 200);
		this.setLocationRelativeTo(null);
		this.setVisible(true);
	}

}
