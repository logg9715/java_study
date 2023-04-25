# 중간고사 내용 정리


## 해쉬맵 예제 (영어를 입력하여 한글 데이터 찾기, exit로 종료)
- (key, value)로 구성
- 반드시 key값으로만 데이터 겁색 
- 특징 : **삽입 삭제 검색이 빠름**

### 암기 항목
HashMap.put(key, value);	데이터 추가 <br>
HashMap.get(key);		데이터 출력<br>
HashMap.remove(key);		데이터 삭제<br>
HashMap.clear();			배열 초기화<br>
<br><br><br>


## ArrayList 예제 (이름을 입력받아서 가장 긴 값 출력)
- 특징 : 스레드 동기화 기능 없음
- 개발자가 직접 작성해야 함
- 맨 뒤에 객체 추가 가능	.add(data)
- 중간에 객체 삽입 가능	.add(index, data)
- 임의의 위치 데이터 삭제 가능	.remove(index)

### 암기 항목 : 
 String.length()<br>
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
 collections.sort(list);							배열 정렬 (오름차순, 숫자>대문자>소문자) <br>
 collections.reverse(list);						배열 반전<br>
 collections.max(list); .min(list) => data;		최대, 최솟값 찾기<br>
 collections.binarySearch(list, data) => index;	특정 값 검색<br>
 <br><br><br>
 
 ## 자바의 입출력 스트림 
- 단방향 (입출력 동시에는 불가)
- 기본 단위 : 바이트(InputStream, OutputStream), 문자
- 선입선출

## 문자 스트림 
- **(try catch문 필수!!)** 
- catch문 : **e.printStackTrace** (필수!!)
- (catch문의 인자는 **Exception e**가 꼭 들어가야함!!)
- Reader, Writer
- FileReader, FileWriter		파일에서 문자 데이터 입출력
### 암기 항목 :
.read(); 					파일 읽기 (int값, 읽을 항목이 없으면 **-1 출력**된다)

## 버퍼 스트림
- 버퍼를 가진 스트림
- 입출력 데이터를 임시저장하는 '버퍼'를 이용하여 효율 향상
- BufferedInputStream BufferedOutputStream	(바이트)
- BufferedReader, BufferedWriter			(문자 버퍼)
- **.close (버퍼 닫기)**
### 암기 항목 :
 .read(); 					파일 읽기 (int값, 읽을 항목이 없으면 -1 출력된다)<br>
 .write(int);					파일 출력 (주로 .read에로 저장한 int값을 사용)<br>
<br><br><br>

