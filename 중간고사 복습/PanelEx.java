package re;

import java.awt.Container;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;

// JPanel
// JPanel 객체를 새로 생성하고 요소들을 여기에 저장
// 이후 마지막에만 JPanel 객체를 con.add(pan)로 컨테이너에 추가하면 됨.

// awt 종류
// JLable(내용) 텍스트 표시
// JButton(버튼표시) 버튼 생성
// 		액션 리스너 추가 (ActionListener라는 인터페이스 이용해서 익명함수 선언 : 
// 		JButton.addActionListener(new ActionListener() {
//			public void actionPerformed(ActionEvent e) {
//				(여기에 내용 추가)
//			}
// JTextField(기본내용) 글자 작성 공간
// 		JTextField.getText() 입력 글자 읽어오기 

public class PanelEx extends JFrame {

	public PanelEx() {
		setTitle("Panel 예제");
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

		JPanel pan = new JPanel();

		Container con = this.getContentPane();

		pan.add(new JLabel("ㅇㅇㅇㅇ"));
		pan.add(new JButton("zzzz"));

		con.add(pan);

		setSize(250, 150);
		setVisible(true);
		setLocationRelativeTo(null);
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		new PanelEx();
	}

}
