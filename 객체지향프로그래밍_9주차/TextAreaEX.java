package test;

import java.awt.Container;
import java.awt.FlowLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.ItemEvent;
import java.awt.event.ItemListener;

import javax.swing.ImageIcon;
import javax.swing.JCheckBox;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JScrollPane;
import javax.swing.JTextArea;
import javax.swing.JTextField;

public class TextAreaEX extends JFrame {

	TextAreaEX() {
		setTitle("텍스트영역 예제");
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

		Container con = getContentPane();
		con.setLayout(new FlowLayout(FlowLayout.CENTER, 5, 12));

		JTextField tf = new JTextField(20);
		JTextArea ta = new JTextArea(10, 20);

		tf.addActionListener(new ActionListener() {
			@Override
			public void actionPerformed(ActionEvent e) {
				// TODO Auto-generated method stub
				if (!tf.getText().equals(""))
					ta.append(tf.getText() + "\n");
				tf.setText("");
			}
		});

		con.add(new JLabel("입력 후 <Enter>키를 입력하세요"));
		con.add(tf);
		con.add(new JScrollPane(ta));

		setSize(400, 500);
		setVisible(true);
		setLocationRelativeTo(null);
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		new TextAreaEX();
	}

}
