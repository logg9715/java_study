package test;

import java.awt.Container;
import java.awt.FlowLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JComboBox;
import javax.swing.JFrame;
import javax.swing.JScrollPane;

public class ComboBoxEx extends JFrame {
	// 필드 선언 :
	// 배열 생성
	private String[] sList = { "apple", "banana", "kiwi", "mango", "pear" };
	private Integer[] iList = { 100, 200, 300, 400, 500 };

	public ComboBoxEx() {
		// TODO Auto-generated constructor stub
		setTitle("콤보박스 예제");
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

		Container con = this.getContentPane();
		con.setLayout(new FlowLayout(FlowLayout.CENTER));

		JComboBox<String> sCom = new JComboBox<>(sList);
		sCom.addActionListener(new ActionListener() {
			
			@Override
			public void actionPerformed(ActionEvent e) {
				// 선택된 인덱스&객체 반환
				String selItem = (String) sCom.getSelectedItem();
				System.out.println(sCom.getSelectedIndex() + " " + selItem);
				
			}
		});
		
		JComboBox<Integer> iCom = new JComboBox<>();
		for (int i = 0; i < iList.length; i++) {
			iCom.addItem(iList[i]);
		}
		for (Integer integer : iList) {
			iCom.addItem(integer);
		}
		iCom.addActionListener(new ActionListener() {
			
			@Override
			public void actionPerformed(ActionEvent e) {
				int selItem = (int) iCom.getSelectedItem();
				System.out.println(iCom.getSelectedIndex() +" "+ selItem);
			}
		});

		con.add(sCom);
		con.add(new JScrollPane(iCom));

		setSize(300, 300);
		setVisible(true);
		setLocationRelativeTo(null);
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		new ComboBoxEx();
	}

}
