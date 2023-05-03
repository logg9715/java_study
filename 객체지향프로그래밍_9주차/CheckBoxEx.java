package test;

import java.awt.Container;
import java.awt.FlowLayout;
import java.awt.event.ItemEvent;
import java.awt.event.ItemListener;

import javax.swing.ImageIcon;
import javax.swing.JCheckBox;
import javax.swing.JFrame;

public class CheckBoxEx extends JFrame {

	CheckBoxEx() {
		setTitle("체크박스 예제");
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

		Container con = getContentPane();
		con.setLayout(new FlowLayout());

		ImageIcon imgCherry1 = new ImageIcon("images/c1.PNG");
		ImageIcon imgCherry2 = new ImageIcon("images/c2.PNG");

		JCheckBox ckApple = new JCheckBox("사과");
		ckApple.addItemListener(new ItemListener() {
			@Override
			public void itemStateChanged(ItemEvent e) {
				// 체크박스 선택 되었는지 여부 확인
				if (ckApple.isSelected())
					System.out.println("사과가 선택됨");
				else
					System.out.println("사과가 선택 안됨");
			}
		});

		JCheckBox ckPear = new JCheckBox("배", true);
		ckPear.addItemListener(new ItemListener() {
			@Override
			public void itemStateChanged(ItemEvent e) {
				// TODO Auto-generated method stub
				if (ckPear.isSelected())
					System.out.println("배가 선택됨");
				else
					System.out.println("배가 선택 안됨");
			}
		});

		JCheckBox ckCherry = new JCheckBox("체리",imgCherry1);
		ckCherry.setSelectedIcon(imgCherry2);
		ckCherry.setBorderPainted(true);
		ckCherry.addItemListener(new ItemListener() {
			@Override
			public void itemStateChanged(ItemEvent e) {
				// TODO Auto-generated method stub
				if (ckCherry.isSelected())
					System.out.println("체리가 선택됨");
				else
					System.out.println("체리가 선택 안됨");
			}
		});

		con.add(ckApple);
		con.add(ckPear);
		con.add(ckCherry);

		setSize(600, 400);
		setVisible(true);
		setLocationRelativeTo(null);
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		new CheckBoxEx();
	}

}
