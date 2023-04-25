package re;

import java.awt.Container;
import java.awt.FlowLayout;

import javax.swing.JFrame;
import javax.swing.JLabel;

// FlowLayout
// 정렬 방향을 지정하고, 화면 크기에 따라 객체를 정렬시킨다.
// 암기 항목 :
// new FlowLayout(정렬방향, 수직간격, 수평간격)
// 정렬방향 => FlowLayout.RIGHT, .LEFT, .CENTER 등등..

public class FlowLayoutEx extends JFrame{
	
	public FlowLayoutEx() {
		setTitle("플로우 레이아웃 예제");
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		
		Container con = this.getContentPane();
		con.setLayout(new FlowLayout(FlowLayout.LEFT, 30, 40));
		
		con.add(new JLabel("ddd"));
		con.add(new JLabel("ddd"));
		con.add(new JLabel("ddd"));
		con.add(new JLabel("ddd"));
		con.add(new JLabel("ddd"));
		
		
		setSize(250, 150);
		setVisible(true);
		
		setLocationRelativeTo(null);
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		new FlowLayoutEx();

	}

}
