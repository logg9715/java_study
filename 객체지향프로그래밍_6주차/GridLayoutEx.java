package test;

import java.awt.Container;
import java.awt.GridLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.ArrayList;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JTextField;

public class GridLayoutEx extends JFrame {
	// 필드 선언
	private String name;
	private String stdNum;
	private String major;
	private String subject;

	private ArrayList<Student> stdList = new ArrayList<>();

	// 기본 생성자
	public GridLayoutEx() {
		this.setTitle("그리드 예제");
		this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

		// 레이아웃 : grid
		GridLayout gd = new GridLayout(6, 2);
		gd.setVgap(5);

		Container con = this.getContentPane();
		con.setLayout(gd);

		// 텍스트 필드 : 이름 입력
		//
		JTextField tf_Name = new JTextField();

		// 텍스트 필드 : 학번 입력
		//
		JTextField tf_StdNum = new JTextField();

		// 텍스트 필드 : 전공 입력
		//
		JTextField tf_Major = new JTextField();

		// 텍스트 필드 : 과목 입력
		//
		JTextField tf_Subject = new JTextField();

		// 버튼 : 확인버튼
		// 입력 내용 콘솔창에 출력
		JButton bt_Ok = new JButton("확인");
		bt_Ok.addActionListener(new ActionListener() {
			@Override
			public void actionPerformed(ActionEvent e) {
				// TODO Auto-generated method stub
				name = tf_Name.getText();
				stdNum = tf_StdNum.getText();
				major = tf_Major.getText();
				subject = tf_Subject.getText();

				stdList.add(new Student(name, stdNum, major, subject));

				System.out.printf("%s %s %s %s\n", name, stdNum, major, subject);
				System.out.println("학생 추가됨!!");
			}
		});

		// 버튼 : 취소버튼
		// 입력란 초기화
		JButton bt_Cancel = new JButton("취소");
		bt_Cancel.addActionListener(new ActionListener() {
			@Override
			public void actionPerformed(ActionEvent e) {
				// TODO Auto-generated method stub
				tf_Name.setText("");
				tf_StdNum.setText("");
				tf_Major.setText("");
				tf_Subject.setText("");
			}
		});

		// 버튼 : 조회버튼
		//
		JButton bt_Search = new JButton("조회");
		bt_Search.addActionListener(new ActionListener() {
			@Override
			public void actionPerformed(ActionEvent e) {
				// TODO Auto-generated method stub
				System.out.println("");

				for (Student student : stdList)
					System.out.println(student.toString());
			}
		});

		// 컨테이너 배열
		con.add(new JLabel("이름"));
		con.add(tf_Name);

		con.add(new JLabel("학번"));
		con.add(tf_StdNum);

		con.add(new JLabel("학과"));
		con.add(tf_Major);

		con.add(new JLabel("과목"));
		con.add(tf_Subject);

		con.add(bt_Ok);
		con.add(bt_Cancel);

		con.add(bt_Search);

		// 화면 조정, 출력
		this.setSize(300, 350);
		this.setLocationRelativeTo(null);
		this.setVisible(true);
	}

}
