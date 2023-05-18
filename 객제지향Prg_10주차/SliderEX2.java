package test;

import java.awt.BorderLayout;
import java.awt.Color;
import java.awt.Container;
import java.awt.FlowLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JSlider;


public class SliderEX2 extends JFrame {
	private JSlider[] sliList= new JSlider[3];
	private JLabel lb1;

	public SliderEX2() {
		// TODO Auto-generated constructor stub
		setTitle("RGB 슬라이더 예제");
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

		Container con = this.getContentPane();
		con.setLayout(new FlowLayout());
		
		JPanel pan0 = new JPanel();
		pan0.setLayout(new FlowLayout(FlowLayout.CENTER,20,20));
		
		JPanel pan1 = new JPanel();
		pan1.setLayout(new FlowLayout(FlowLayout.CENTER,20,10));
	
		for (int i = 0; i < sliList.length; i++) {
			sliList[i]= new JSlider(0, 255, 128);
			sliList[i].setPaintTicks(true);
			sliList[i].setPaintLabels(true);
			sliList[i].setPaintTrack(true);
			sliList[i].setMajorTickSpacing(50);
			sliList[i].setMinorTickSpacing(10);
			//sliList[i].setSize(200, 20);
			con.add(sliList[i]);
		}
		
		sliList[0].setForeground(Color.red);
		sliList[1].setForeground(Color.green);
		sliList[2].setForeground(Color.blue);
		
		lb1 = new JLabel("SLIDER EXAMPLE");
		lb1.setOpaque(true);
		lb1.setBackground(new Color(0,0,0));
		
		JButton okBt = new JButton("확인");
		okBt.addActionListener(new ActionListener() {
			
			@Override
			public void actionPerformed(ActionEvent e) {
				// TODO Auto-generated method stub
				//int a = sliList[0].getValue();
				//System.out.println(a);
				lb1.setBackground(new Color(sliList[0].getValue(),sliList[1].getValue(),sliList[2].getValue()));
			}
		});
		JButton cancelBt = new JButton("취소");
		cancelBt.addActionListener(new ActionListener() {
			
			@Override
			public void actionPerformed(ActionEvent e) {
				// TODO Auto-generated method stub
				for (int i = 0; i < sliList.length; i++) {
					sliList[i].setValue(128);
				}
			}
		});
		
		pan0.add(lb1);
		
		pan1.add(okBt);
		pan1.add(cancelBt);
		
		con.add(pan0);
		con.add(pan1);
		
		setSize(280, 300);
		setVisible(true);
		setLocationRelativeTo(null);
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		new SliderEX2();
	}

}
