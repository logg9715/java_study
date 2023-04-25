package re;

import java.awt.Container;
import java.awt.GridLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JTextField;

public class StuEx extends JFrame {
	// 필드
	private ArrayList<Student> stdList = new ArrayList<>();
	private String search;

	public StuEx() {
		setTitle("학생 관리부 예제");
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

		GridLayout gd = new GridLayout(6, 2);
		gd.setVgap(3);

		Container con = this.getContentPane();
		con.setLayout(gd);

		JTextField txName = new JTextField();
		JTextField txId = new JTextField();
		JTextField txMajor = new JTextField();
		JTextField txSubject = new JTextField();

		JButton btOk = new JButton("확인");
		btOk.addActionListener(new ActionListener() {
			@Override
			public void actionPerformed(ActionEvent e) {
				// TODO Auto-generated method stub
				stdList.add(new Student(txName.getText(), txId.getText(), txMajor.getText(), txSubject.getText()));
				System.out.println("추가됨 : " + stdList.get(stdList.size()-1).toString());
			}
		});

		JButton btCancel = new JButton("취소");
		btCancel.addActionListener(new ActionListener() {
			
			@Override
			public void actionPerformed(ActionEvent e) {
				// TODO Auto-generated method stub
				txName.setText("");
				txId.setText("");
				txMajor.setText("");
				txSubject.setText("");
				
			}
		});
		
		JButton btList = new JButton("조회");
		btList.addActionListener(new ActionListener() {
			
			@Override
			public void actionPerformed(ActionEvent e) {
				// TODO Auto-generated method stub
				for (Student student : stdList) {
					System.out.println(student.toString());
				}
			}
		});
		
		JButton btSearch = new JButton("이름으로 검색");
		btSearch.addActionListener(new ActionListener() {
			
			@Override
			public void actionPerformed(ActionEvent e) {
				// TODO Auto-generated method stub
				search = txName.getText();
				for (Student student : stdList) {
					if(student.getName().equals(search))
						System.out.println("검색 결과 : " + student.toString());
				}
				
			}
		});
		
		con.add(new JLabel("이름"));
		con.add(txName);

		con.add(new JLabel("학번"));
		con.add(txId);

		con.add(new JLabel("학과"));
		con.add(txMajor);

		con.add(new JLabel("과목"));
		con.add(txSubject);

		con.add(btOk);
		con.add(btCancel);
		con.add(btList);
		con.add(btSearch);

		setSize(300, 300);
		setVisible(true);
		setLocationRelativeTo(null);
	}

	public static void main(String[] args) {
		new StuEx();
	}

}

class Student {
	private String name;
	private String id;
	private String major;
	private String subject;

	public Student() {
		// TODO Auto-generated constructor stub
	}

	public Student(String name, String id, String major, String subject) {
		super();
		this.name = name;
		this.id = id;
		this.major = major;
		this.subject = subject;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getId() {
		return id;
	}

	public void setId(String id) {
		this.id = id;
	}

	public String getMajor() {
		return major;
	}

	public void setMajor(String major) {
		this.major = major;
	}

	public String getSubject() {
		return subject;
	}

	public void setSubject(String subject) {
		this.subject = subject;
	}

	@Override
	public String toString() {
		return "Student [name=" + name + ", id=" + id + ", major=" + major + ", subject=" + subject + "]";
	}

}