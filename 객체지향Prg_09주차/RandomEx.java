package test;

import java.awt.BorderLayout;
import java.awt.Container;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JTextField;

public class RandomEx extends JFrame {
	private int data;
	private int key;

	RandomEx() {
		this.key = 1 + (int) (Math.random() * 100);
		System.out.println(key);
		setTitle("숫자게임");
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

		Container con = getContentPane();

		JPanel pan1 = new JPanel();
		JPanel pan2 = new JPanel();
		JPanel pan3 = new JPanel();

		JLabel lb1 = new JLabel("시작");

		JTextField txtfInput = new JTextField(20);
		txtfInput.addActionListener(new ActionListener() {

			@Override
			public void actionPerformed(ActionEvent e) {
				// TODO Auto-generated method stub
				

				if (!txtfInput.getText().equals("")) {

					data = Integer.parseInt(txtfInput.getText());

					if (data < key) {
						lb1.setText("key 값보다 작다");
					} else if (data > key) {
						lb1.setText("key 값보다 크다");
					} else {
						lb1.setText("정답");
					}
					
				}
				txtfInput.setText("");
			}
		});

		JButton btRe = new JButton("다시 하기");
		btRe.addActionListener(new ActionListener() {
			
			@Override
			public void actionPerformed(ActionEvent e) {
				// TODO Auto-generated method stub
				key = 1 + (int) (Math.random() * 10);
				System.out.println(key);
			}
		});
		JButton btend = new JButton("종료");
		btend.addActionListener(new ActionListener() {
			
			@Override
			public void actionPerformed(ActionEvent e) {
				// TODO Auto-generated method stub
				System.exit(0);
			}
		});

		pan1.add(new JLabel("숫자 추측"));
		pan1.add(txtfInput);
		pan2.add(lb1);
		pan3.add(btRe);
		pan3.add(btend);

		con.add(pan1, BorderLayout.NORTH);
		con.add(pan2, BorderLayout.CENTER);
		con.add(pan3, BorderLayout.SOUTH);

		setSize(400, 150);
		setVisible(true);
		setLocationRelativeTo(null);
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		new RandomEx();
	}

}
