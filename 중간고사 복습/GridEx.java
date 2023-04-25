package re;
import java.awt.Container;
import java.awt.GridLayout;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JTextField;

// 자바 GUI
// import 항목 : .awt .swing

// swing
// 사용시, extends JFrame 필요 (중요!!)
// 기본 구성 :
// 프레임 - 전체적인 기본 틀
// 메뉴바 - 화면 상단의 메뉴 부착 공간
// 컨텐트 팬 - GUI 컴포넌트들이 부착되는 공간, 중앙 출력부

// 암기 항목 : 
// - 화면을 만들면 먼저 해야할 것들 
// extends JFrame
// setTitle(String) 제목
// setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE); 창 닫으면 종료
// setSize(int, int) 창 크기 지정
// setVisible(true) 화면에 보이게 하기



// Container
// 다른 GUI 컴포넌트를 포함할 수 있음
// Container con = this.getContentPane();
// con.setLayout(레이아웃 객체) 이떄, 기본값은 BorderLayout (중요!!) 
// con.add(컴포넌트 객체)


// GridLayout
// 세로축 가로축을 지정하여, 좌측 상단부터 칸을 채워나간다.
// 암기 항목 : 
// new GridLayout(세로축, 가로축)
// grd.setVgap(int) 상하 간격
// grd.setHgap(int) 좌우 간격

public class GridEx extends JFrame{
	
	public GridEx() {
		// TODO Auto-generated constructor stub
		setTitle("그리드 레이아웃 예제");
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		
		GridLayout grd = new GridLayout(3, 2);
		grd.setVgap(10);
		grd.setHgap(5);
		
		Container con = this.getContentPane();
		con.setLayout(grd);
		
		con.add(new JLabel("ddfs"));
		con.add(new JButton("ㅇㅇ"));
		con.add(new JLabel("텍스트 필드"));
		con.add(new JTextField());
		con.add(new JButton("11"));
		con.add(new JButton("22"));
		
		setSize(250,200);
		setVisible(true);
		setLocationRelativeTo(null);
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		new GridEx();
	}

}


