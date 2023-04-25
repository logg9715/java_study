# 중간고사 내용 정리


## 해쉬맵 예제 (영어를 입력하여 한글 데이터 찾기, exit로 종료)
- (key, value)로 구성
- 반드시 key값으로만 데이터 겁색 
- 특징 : **삽입 삭제 검색이 빠름**

### 암기 항목
**HashMap.put(key, value);**	데이터 추가 <br>
**HashMap.get(key);**		데이터 출력<br>
**HashMap.remove(key);**		데이터 삭제<br>
**HashMap.clear();**			배열 초기화<br>
<br><br><br>


## ArrayList 예제 (이름을 입력받아서 가장 긴 값 출력)
- 특징 : 스레드 동기화 기능 없음
- 개발자가 직접 작성해야 함
- 맨 뒤에 객체 추가 가능	.add(data)
- 중간에 객체 삽입 가능	.add(index, data)
- 임의의 위치 데이터 삭제 가능	.remove(index)

### 암기 항목 : 
 **String.length()**<br>
 <br><br><br>




## LinkedList 예제 (배열 수정하며 출력하기)
- ArrayList와 비슷
- 요소 객체들이 **양방향**으로 연결되어 관리됨
- 요소는 맨 앞, 뒤 추가 가능
- 중간에 요소 삽입 가능
- 맨 앞,뒤 추가&삭제 기능 -> 스택이나 큐로 사용 가능

## collections 클래스
- 컬렉션에 대한 연산 수행
 
### 암기 항목 :
 **collections.sort(list);**							배열 정렬 (오름차순, 숫자>대문자>소문자) <br>
 **collections.reverse(list);**						배열 반전<br>
 **collections.max(list); .min(list)** => data;		최대, 최솟값 찾기<br>
 **collections.binarySearch(list, data)** => index;	특정 값 검색<br>
 <br><br><br>
 
 ## 자바의 입출력 스트림 
- **단방향** (입출력 동시에는 불가)
- 기본 단위 : 바이트(InputStream, OutputStream), 문자
- 선입선출

## 문자 스트림 
- **(try catch문 필수!!)** 
- catch문 : **e.printStackTrace** (필수!!)
- (catch문의 인자는 **Exception e**가 꼭 들어가야함!!)
- Reader, Writer
- FileReader, FileWriter		파일에서 문자 데이터 입출력
### 암기 항목 :
**.read();** 					파일 읽기 (int값, 읽을 항목이 없으면 **-1 출력**된다)

## 버퍼 스트림
- 버퍼를 가진 스트림
- 입출력 데이터를 임시저장하는 '버퍼'를 이용하여 효율 향상
- BufferedInputStream BufferedOutputStream	(바이트)
- BufferedReader, BufferedWriter			(문자 버퍼)
- **.close (버퍼 닫기)**
### 암기 항목 :
 **.read();** 					파일 읽기 (int값, 읽을 항목이 없으면 -1 출력된다)<br>
 **.write(int);**					파일 출력 (주로 .read에로 저장한 int값을 사용)<br>
<br><br><br>


## 자바 GUI
- import 항목 : .awt .swing

## swing
- 사용시, **extends JFrame** 필요 (중요!!)
- 기본 구성 :
- 프레임 - 전체적인 기본 틀
- 메뉴바 - 화면 상단의 메뉴 부착 공간
- 컨텐트 팬 - GUI 컴포넌트들이 부착되는 공간, 중앙 출력부

### 암기 항목 (화면을 만들면 먼저 해야할 것들) : <br>
**extends JFrame**<br>
 **setTitle(String)** 제목 지정<br>
 **setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);** 창 닫으면 종료<br>
 **setSize(int, int)** 창 크기 지정<br>
 **setVisible(true)** 화면에 보이게 하기<br>
<br><br><br>


## Container
- 다른 GUI 컴포넌트를 **포함**할 수 있음
- Container con = this.getContentPane();
- con.setLayout(레이아웃 객체) 이떄, **기본값은 BorderLayout** (중요!!) 
- con.add(컴포넌트 객체)
<br><br><br>

## GridLayout
- 세로축 가로축을 지정하여, 좌측 상단부터 칸을 채워나간다.
### 암기 항목 : 
 **new GridLayout**(세로축, 가로축) <br>
 **grd.setVgap(int)** 상하 간격<br>
 **grd.setHgap(int)** 좌우 간격<br>
 <br><br><br>
 
 
##  FlowLayout
- 정렬 방향을 지정하고, 화면 크기에 따라 객체를 정렬시킨다.
### 암기 항목 :
- new FlowLayout(정렬방향, 수직간격, 수평간격) <br>
- 정렬방향 => FlowLayout.RIGHT, .LEFT, .CENTER 등등.. <br>
<br><br><br>

### BorderLayout
- 컨테이너 기본 레이아웃
- BorderLayout.SOUTH, .NORTH, .EAST, .WEST, .CENTER 다섯 구역으로 분할
<br><br><br>

## JPanel
- **JPanel pan = new JPanel();** 객체를 새로 생성하고 요소들을 여기에 저장 >> **pan.add(new JLabel("aa"));** 
- 이후 마지막에만 JPanel 객체를 **con.add(pan)**로 컨테이너에 추가하면 됨.
<br><br><br>

## awt 종류
- JLable(내용) 텍스트 표시
- JButton(버튼표시) 버튼 생성<br>
 		**액션 리스너 추가** (ActionListener라는 **인터페이스** 이용해서 **익명함수** 선언 : <br>
 		JButton.addActionListener(new ActionListener() {<br>
			public void actionPerformed(ActionEvent e) {<br>
				(여기에 내용 추가)<br>
			}<br>

- JTextField(기본내용) 글자 작성 공간<br>
 		JTextField.getText() 입력 글자 읽어오기 

