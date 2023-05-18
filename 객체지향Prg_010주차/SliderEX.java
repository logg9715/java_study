package test;

import java.awt.Container;
import java.awt.FlowLayout;

import javax.swing.JFrame;
import javax.swing.JSlider;
import javax.swing.event.ChangeEvent;
import javax.swing.event.ChangeListener;

public class SliderEX extends JFrame {

	public SliderEX() {
		// TODO Auto-generated constructor stub
		setTitle("슬라이더 예제");
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

		Container con = this.getContentPane();
		con.setLayout(new FlowLayout(FlowLayout.CENTER));

		JSlider sli1 = new JSlider(0, 200, 100);
		sli1.setPaintTicks(true);
		sli1.setPaintLabels(true);
		sli1.setPaintTrack(true);
		sli1.setMajorTickSpacing(50);
		sli1.setMinorTickSpacing(10);
		sli1.addChangeListener(new ChangeListener() {

			@Override
			public void stateChanged(ChangeEvent e) {
				// TODO Auto-generated method stub
				System.out.println("state : " + sli1.getValue());
			}
		});

		con.add(sli1);

		setSize(300, 100);
		setVisible(true);
		setLocationRelativeTo(null);
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		new SliderEX();
	}

}
