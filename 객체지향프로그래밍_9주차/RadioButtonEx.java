package test;

import java.awt.Container;
import java.awt.FlowLayout;
import java.awt.event.ItemEvent;
import java.awt.event.ItemListener;

import javax.swing.ButtonGroup;
import javax.swing.ImageIcon;
import javax.swing.JCheckBox;
import javax.swing.JFrame;
import javax.swing.JRadioButton;

public class RadioButtonEx extends JFrame {

	RadioButtonEx() {
		setTitle("라디오버튼 예제");
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

		Container con = getContentPane();
		con.setLayout(new FlowLayout());

		ImageIcon imgCherry1 = new ImageIcon("images/c1.PNG");
		ImageIcon imgCherry2 = new ImageIcon("images/c2.PNG");
		
		ButtonGroup btGrp1 = new ButtonGroup();
		
		JRadioButton rbApple = new JRadioButton("사과");
		rbApple.addItemListener(new ItemListener() {
			@Override
			public void itemStateChanged(ItemEvent e) {
				// TODO Auto-generated method stub
				if (rbApple.isSelected())
					System.out.println("사과가 선택됨");
				else
					System.out.println("사과가 선택 안됨");
			}
		});
		
		JRadioButton rbPear = new JRadioButton("배");
		rbPear.addItemListener(new ItemListener() {
			@Override
			public void itemStateChanged(ItemEvent e) {
				// TODO Auto-generated method stub
				if (rbPear.isSelected())
					System.out.println("배가 선택됨");
				else
					System.out.println("배가 선택 안됨");
			}
		});
		
		JRadioButton rbCherry = new JRadioButton("체리", imgCherry1);
		rbCherry.setSelectedIcon(imgCherry2);
		rbCherry.setBorderPainted(true);
		rbCherry.addItemListener(new ItemListener() {
			@Override
			public void itemStateChanged(ItemEvent e) {
				// TODO Auto-generated method stub
				if (rbCherry.isSelected())
					System.out.println("체리가 선택됨");
				else
					System.out.println("체리가 선택 안됨");
			}
		});
		
		btGrp1.add(rbApple);
		btGrp1.add(rbPear);
		btGrp1.add(rbCherry);
		
		con.add(rbApple);
		con.add(rbPear);
		con.add(rbCherry);

		setSize(600, 400);
		setVisible(true);
		setLocationRelativeTo(null);
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		new RadioButtonEx();
	}

}
