package main;

import java.awt.BorderLayout;
import java.awt.Color;
import java.awt.Container;
import java.awt.Dimension;
import java.awt.FlowLayout;
import java.awt.Font;
import java.awt.GridLayout;
import java.util.ArrayList;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JScrollPane;
import javax.swing.JTextArea;
import javax.swing.JTextField;

import java.time.LocalDateTime;

public class AddrGui extends JFrame {
	public static ArrayList<Addr> addlist = new ArrayList<Addr>();
	public static JTextArea ta1 = new JTextArea("");

	AddrGui() {
		setTitle("주소록 관리 프로그램");
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setResizable(false);
		Font btFont = new Font("맑은 고딕", Font.PLAIN, 17);
		Font taFont = new Font("맑은 고딕", Font.PLAIN, 15);

		// 컨테이너 설정
		Container con = this.getContentPane();
		con.setLayout(new FlowLayout(FlowLayout.LEFT, 10, 10));

		// 좌측 정보표시 패널 설정
		JPanel pan_Info = new JPanel();
		pan_Info.setBackground(Color.white);
		pan_Info.setPreferredSize(new Dimension(450, 300));
		pan_Info.setLayout(new BorderLayout());

		// 우측 메뉴버튼 패널 설정
		JPanel pan_Menu = new JPanel();
		pan_Menu.setPreferredSize(new Dimension(125, 300));
		GridLayout grLay1 = new GridLayout(6, 1);
		grLay1.setVgap(10);
		pan_Menu.setLayout(grLay1);
		// pan_Menu.setBackground(Color.blue);

		// txtArea 객체 생성

		ta1.setEditable(false);
		ta1.setFont(taFont);

		// JButton 객체 생성
		JButton bt_Register = new JButton("주소록 입력");
		bt_Register.setFont(btFont);
		bt_Register.addActionListener(e -> {
			new SubGui_regi();
		});

		JButton bt_Search = new JButton("주소록 검색");
		bt_Search.setFont(btFont);
		bt_Search.addActionListener(e -> new SubGui_Search());

		JButton bt_Show = new JButton("주소록 조회");
		bt_Show.setFont(btFont);
		bt_Show.addActionListener(e -> {
			ta1.setText("등록된 모든 주소록 : \n");
			for (Addr addr : addlist) {
				ta1.append(addr.toString() + "\n");
			}
		});

		JButton bt_Update = new JButton("주소록 수정");
		bt_Update.setFont(btFont);
		bt_Update.addActionListener(e -> new SubGui_Update());

		JButton bt_Delete = new JButton("주소록 삭제");
		bt_Delete.setFont(btFont);
		bt_Delete.addActionListener(e -> new SubGui_Del());

		JButton bt_Exit = new JButton("종료");
		bt_Exit.setFont(btFont);
		bt_Exit.addActionListener(e -> System.exit(0));

		// 화면에 객체 붙이기 :
		// 좌측 정보표시 패널
		// pan_Info.add(new JLabel("정보표시부분"));
		pan_Info.add(new JScrollPane(ta1));

		// 우측 메뉴버튼 패널
		pan_Menu.add(bt_Register);
		pan_Menu.add(bt_Search);
		pan_Menu.add(bt_Show);
		pan_Menu.add(bt_Update);
		pan_Menu.add(bt_Delete);
		pan_Menu.add(bt_Exit);

		// 컨테이너
		con.add(pan_Info);
		con.add(pan_Menu);

		setSize(620, 360);
		setLocationRelativeTo(null);
		setVisible(true);

	}

	public static void main(String[] args) {
		new AddrGui();
	}

	// 주소록 등록창
	class SubGui_regi extends JFrame {
		private Font btFont = new Font("맑은 고딕", Font.PLAIN, 17);
		private Font lbFont = new Font("맑은 고딕", Font.PLAIN, 15);

		SubGui_regi() {
			setTitle("주소록 입력");
			setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE);

			// 컨테이너 설정
			Container con = this.getContentPane();
			con.setLayout(new FlowLayout(FlowLayout.CENTER, 20, 11));

			// 패널 설정
			JPanel pan = new JPanel();
			GridLayout grLay1 = new GridLayout(4, 2, 7, 7);
			pan.setLayout(grLay1);
			pan.setPreferredSize(new Dimension(260, 140));

			// JTextField 객체 생성
			JTextField txtf_Name = new JTextField();
			JTextField txtf_Phone = new JTextField();
			JTextField txtf_Conpany = new JTextField();
			txtf_Conpany.addActionListener(e->{
				Addr init = new Addr(txtf_Name.getText(), txtf_Phone.getText(), txtf_Conpany.getText(),
						LocalDateTime.now());
				addlist.add(init);
				ta1.setText("추가한 데이터 : \n" + init.toString());
				this.dispose();
			});

			// JButton 객체 생성
			JButton bt_OK = new JButton("확인");
			bt_OK.setFont(btFont);
			bt_OK.addActionListener(e -> {
				Addr init = new Addr(txtf_Name.getText(), txtf_Phone.getText(), txtf_Conpany.getText(),
						LocalDateTime.now());
				addlist.add(init);
				ta1.setText("추가한 데이터 : \n" + init.toString());
				this.dispose();
			});

			JButton bt_Cancel = new JButton("취소");
			bt_Cancel.setFont(btFont);
			bt_Cancel.addActionListener(e -> this.dispose());

			// JLabel 객체 생성
			JLabel lb_Name = new JLabel("  이름");
			lb_Name.setFont(lbFont);
			JLabel lb_Phone = new JLabel("  전화번호");
			lb_Phone.setFont(lbFont);
			JLabel lb_Company = new JLabel("  회사 이름");
			lb_Company.setFont(lbFont);

			// 화면에 객체 붙이기 :
			// 컨테이너
			pan.add(lb_Name);
			pan.add(txtf_Name);
			pan.add(lb_Phone);
			pan.add(txtf_Phone);
			pan.add(lb_Company);
			pan.add(txtf_Conpany);
			pan.add(bt_OK);
			pan.add(bt_Cancel);
			con.add(pan, BorderLayout.CENTER);

			setSize(300, 200);
			setLocationRelativeTo(null);
			setVisible(true);
		}

		SubGui_regi(Addr data) {
			setTitle("주소록 수정");
			setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE);

			// 컨테이너 설정
			Container con = this.getContentPane();
			con.setLayout(new FlowLayout(FlowLayout.CENTER, 20, 11));

			// 패널 설정
			JPanel pan = new JPanel();
			GridLayout grLay1 = new GridLayout(4, 2, 7, 7);
			pan.setLayout(grLay1);
			pan.setPreferredSize(new Dimension(260, 140));

			// JTextField 객체 생성
			JTextField txtf_Name = new JTextField();
			JTextField txtf_Phone = new JTextField();
			JTextField txtf_Conpany = new JTextField();
			txtf_Conpany.addActionListener(e->{
				data.setName(txtf_Name.getText());
				data.setTel(txtf_Phone.getText());
				data.setCom(txtf_Conpany.getText());
				data.setCreate(LocalDateTime.now());
				ta1.setText("수정한 데이터 : \n" + data.toString());
				this.dispose();
			});

			// JButton 객체 생성
			JButton bt_OK = new JButton("확인");
			bt_OK.setFont(btFont);
			bt_OK.addActionListener(e -> {
				data.setName(txtf_Name.getText());
				data.setTel(txtf_Phone.getText());
				data.setCom(txtf_Conpany.getText());
				data.setCreate(LocalDateTime.now());
				ta1.setText("수정한 데이터 : \n" + data.toString());
				this.dispose();
			});

			JButton bt_Cancel = new JButton("취소");
			bt_Cancel.setFont(btFont);
			bt_Cancel.addActionListener(e -> this.dispose());

			// JLabel 객체 생성
			JLabel lb_Name = new JLabel("  이름");
			lb_Name.setFont(lbFont);
			JLabel lb_Phone = new JLabel("  전화번호");
			lb_Phone.setFont(lbFont);
			JLabel lb_Company = new JLabel("  회사 이름");
			lb_Company.setFont(lbFont);

			// 화면에 객체 붙이기 :
			// 컨테이너
			pan.add(lb_Name);
			pan.add(txtf_Name);
			pan.add(lb_Phone);
			pan.add(txtf_Phone);
			pan.add(lb_Company);
			pan.add(txtf_Conpany);
			pan.add(bt_OK);
			pan.add(bt_Cancel);
			con.add(pan, BorderLayout.CENTER);

			setSize(300, 200);
			setLocationRelativeTo(null);
			setVisible(true);
		}

	}

	// 주소록 검색창
	class SubGui_Search extends JFrame {
		private Font btFont = new Font("맑은 고딕", Font.PLAIN, 17);
		private Font lbFont = new Font("맑은 고딕", Font.PLAIN, 15);
		private boolean found = false;

		SubGui_Search() {
			setTitle("주소록 검색");
			setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE);

			// 컨테이너 설정
			Container con = this.getContentPane();
			con.setLayout(new FlowLayout(FlowLayout.CENTER, 20, 11));

			// 패널 설정
			JPanel pan = new JPanel();
			GridLayout grLay1 = new GridLayout(2, 2, 7, 7);
			pan.setLayout(grLay1);
			pan.setPreferredSize(new Dimension(260, 70));

			// JTextField 객체 생성
			JTextField txtf_Name = new JTextField();
			txtf_Name.addActionListener(e -> {
				ta1.setText(txtf_Name.getText() + "로 검색한 결과 : \n");
				for (Addr addr : addlist) {
					if (addr.getName().equals(txtf_Name.getText())) {
						ta1.append(addr.toString() + "\n");
						found = true;
					}
				}

				if (!found) {
					found = false;
					ta1.setText("[" + txtf_Name.getText() + "]는 존재하지 않는 이름입니다.");
				}
				this.dispose();
			});

			// JButton 객체 생성
			JButton bt_OK = new JButton("확인");
			bt_OK.setFont(btFont);
			bt_OK.addActionListener(e -> {
				ta1.setText("[" + txtf_Name.getText() + "]로 검색한 결과 : \n");
				for (Addr addr : addlist) {
					if (addr.getName().equals(txtf_Name.getText())) {
						ta1.append(addr.toString() + "\n");
						found = true;
					}
				}
				if (!found) {
					found = false;
					ta1.setText("[" + txtf_Name.getText() + "]는 존재하지 않는 이름입니다.");
				}

				this.dispose();
			});

			JButton bt_Cancel = new JButton("취소");
			bt_Cancel.setFont(btFont);
			bt_Cancel.addActionListener(e -> this.dispose());

			// JLabel 객체 생성
			JLabel lb_Name = new JLabel("  이름");
			lb_Name.setFont(lbFont);

			// 화면에 객체 붙이기 :
			// 컨테이너
			pan.add(lb_Name);
			pan.add(txtf_Name);
			pan.add(bt_OK);
			pan.add(bt_Cancel);
			con.add(pan, BorderLayout.CENTER);

			setSize(300, 130);
			setLocationRelativeTo(null);
			setVisible(true);
		}

	}

	// 주소록 수정
	class SubGui_Update extends JFrame {
		private Font btFont = new Font("맑은 고딕", Font.PLAIN, 17);
		private Font lbFont = new Font("맑은 고딕", Font.PLAIN, 15);
		private boolean found = false;

		SubGui_Update() {
			setTitle("주소록 수정");
			setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE);

			// 컨테이너 설정
			Container con = this.getContentPane();
			con.setLayout(new FlowLayout(FlowLayout.CENTER, 20, 11));

			// 패널 설정
			JPanel pan = new JPanel();
			GridLayout grLay1 = new GridLayout(2, 2, 7, 7);
			pan.setLayout(grLay1);
			pan.setPreferredSize(new Dimension(260, 70));

			// JTextField 객체 생성
			JTextField txtf_Name = new JTextField();
			txtf_Name.addActionListener(e -> {
				for (Addr addr : addlist) {
					if (addr.getName().equals(txtf_Name.getText())) {
						found = true;
						new SubGui_regi(addr);
						break;
					}

				}

				if (!found) {
					found = false;
					ta1.setText("[" + txtf_Name.getText() + "]는 존재하지 않는 이름입니다.");
				}
				this.dispose();
			});

			// JButton 객체 생성
			JButton bt_OK = new JButton("확인");
			bt_OK.setFont(btFont);
			bt_OK.addActionListener(e -> {
				for (Addr addr : addlist) {
					if (addr.getName().equals(txtf_Name.getText())) {
						found = true;
						new SubGui_regi(addr);
						break;
					}

				}

				if (!found) {
					found = false;
					ta1.setText("[" + txtf_Name.getText() + "]는 존재하지 않는 이름입니다.");
				}
				this.dispose();
			});

			JButton bt_Cancel = new JButton("취소");
			bt_Cancel.setFont(btFont);
			bt_Cancel.addActionListener(e -> this.dispose());

			// JLabel 객체 생성
			JLabel lb_Name = new JLabel("  이름");
			lb_Name.setFont(lbFont);

			// 화면에 객체 붙이기 :
			// 컨테이너
			pan.add(lb_Name);
			pan.add(txtf_Name);
			pan.add(bt_OK);
			pan.add(bt_Cancel);
			con.add(pan, BorderLayout.CENTER);

			setSize(300, 130);
			setLocationRelativeTo(null);
			setVisible(true);
		}

	}

	// 주소록 삭제창
	class SubGui_Del extends JFrame {
		private Font btFont = new Font("맑은 고딕", Font.PLAIN, 17);
		private Font lbFont = new Font("맑은 고딕", Font.PLAIN, 15);
		private boolean found = false;

		SubGui_Del() {
			setTitle("주소록 삭제");
			setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE);

			// 컨테이너 설정
			Container con = this.getContentPane();
			con.setLayout(new FlowLayout(FlowLayout.CENTER, 20, 11));

			// 패널 설정
			JPanel pan = new JPanel();
			GridLayout grLay1 = new GridLayout(2, 2, 7, 7);
			pan.setLayout(grLay1);
			pan.setPreferredSize(new Dimension(260, 70));

			// JTextField 객체 생성
			JTextField txtf_Name = new JTextField();
			txtf_Name.addActionListener(e -> {
				for (int i = 0; i < addlist.size(); i++) {
					if (addlist.get(i).getName().equals(txtf_Name.getText())) {
						ta1.setText("삭제된 데이터 : \n" + addlist.get(i).toString());
						addlist.remove(i);
						found = true;
						break;
					}
				}
				if (!found) {
					found = false;
					ta1.setText("[" + txtf_Name.getText() + "]는 존재하지 않는 이름입니다.");
				}

				this.dispose();
			});

			// JButton 객체 생성
			JButton bt_OK = new JButton("확인");
			bt_OK.setFont(btFont);
			bt_OK.addActionListener(e -> {
				for (int i = 0; i < addlist.size(); i++) {
					if (addlist.get(i).getName().equals(txtf_Name.getText())) {
						ta1.setText("삭제된 데이터 : \n" + addlist.get(i).toString());
						addlist.remove(i);
						found = true;
						break;
					}
				}
				if (!found) {
					found = false;
					ta1.setText("[" + txtf_Name.getText() + "]는 존재하지 않는 이름입니다.");
				}

				this.dispose();
			});

			JButton bt_Cancel = new JButton("취소");
			bt_Cancel.setFont(btFont);
			bt_Cancel.addActionListener(e -> this.dispose());

			// JLabel 객체 생성
			JLabel lb_Name = new JLabel("  이름");
			lb_Name.setFont(lbFont);

			// 화면에 객체 붙이기 :
			// 컨테이너
			pan.add(lb_Name);
			pan.add(txtf_Name);
			pan.add(bt_OK);
			pan.add(bt_Cancel);
			con.add(pan, BorderLayout.CENTER);

			setSize(300, 130);
			setLocationRelativeTo(null);
			setVisible(true);
		}

	}

}
