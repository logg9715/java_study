package study;

import java.awt.Button;
import java.awt.Container;
import java.awt.FlowLayout;

import javax.swing.JFrame;

public class FlowLayoutEx extends JFrame{
	public FlowLayoutEx() {
		this.setTitle("플로우 예제");
		this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		
		Container con = this.getContentPane();
		con.setLayout(new FlowLayout(FlowLayout.LEFT,30,40));
		
		con.add(new Button("add"));
		con.add(new Button("sub"));
		con.add(new Button("mul"));
		con.add(new Button("div"));
		con.add(new Button("Calculate"));
		
		this.setSize(300,200);
		this.setLocationRelativeTo(null);
		this.setVisible(true);
	}
	

}

