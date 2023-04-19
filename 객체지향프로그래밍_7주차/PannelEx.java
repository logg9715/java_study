package test;

import java.awt.Container;
import java.awt.FlowLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;

public class PannelEx extends JFrame{
	//기본 생성자 
	PannelEx () {
		this.setTitle("판넬예제");
		this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		
		Container con = this.getContentPane();
		// 어차피 JPanel로 넣을거고 기본값은 borderlayout이라 필요 없음
		//con.setLayout(new FlowLayout(FlowLayout.CENTER)); 
		
		JPanel pan =new JPanel();
		
		JButton bt1 = new JButton("Yes");
		bt1.addActionListener(new ActionListener() {
			
			@Override
			public void actionPerformed(ActionEvent e) {
				// TODO Auto-generated method stub
				System.out.println("예, 아이스크림을 좋아합니다.");
			}
		});
		
		JButton bt2 = new JButton("No");
		bt2.addActionListener(new ActionListener() {
			
			@Override
			public void actionPerformed(ActionEvent e) {
				// TODO Auto-generated method stub
				System.out.println("아니오, 아이스크림을 좋아하지 않습니다.");
			}
		});
		
		
		
		pan.add(new JLabel("아이스크림을 좋아하나요??"));
		
		pan.add(bt1);
		pan.add(bt2);
		con.add(pan);
		
		
		this.setSize(400,200);
		this.setLocationRelativeTo(null);
		this.setVisible(true);
		
		
	}
}
