package study;

import java.awt.Button;
import java.awt.Container;
import java.awt.GridLayout;

import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JTextField;

public class GridLayoutEx extends JFrame{
	public GridLayoutEx() {
		this.setTitle("그리드 예제");
		this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		
		GridLayout grid = new GridLayout(5,2);
		grid.setVgap(5);
		
		Container con = this.getContentPane();
		con.setLayout(grid);
		
		con.add(new JLabel("이름"));
		con.add(new JTextField(""));
		con.add(new JLabel("학번"));
		con.add(new JTextField(""));
		con.add(new JLabel("학과"));
		con.add(new JTextField(""));
		con.add(new JLabel("과목"));
		con.add(new JTextField(""));
		con.add(new Button("OK"));
		con.add(new Button("Cancel"));
		
		this.setSize(300,500);
		this.setLocationRelativeTo(null);
		this.setVisible(true);
	}

}
