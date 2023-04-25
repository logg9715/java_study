# 중간고사 내용 정리


## 해쉬맵 예제 (영어를 입력하여 한글 데이터 찾기, exit로 종료)
- (key, value)로 구성
- 반드시 key값으로만 데이터 겁색 
- 특징 : 삽입 삭제 검색이 빠름

### 암기 항목
HashMap.put(key, value);	데이터 추가 <br>
HashMap.get(key);		데이터 출력<br>
HashMap.remove(key);		데이터 삭제<br>
HashMap.clear();			배열 초기화<br>


--------
## LinkedList 예제 (배열 수정하며 출력하기)
- ArrayList와 비슷
- 요소 객체들이 양방향으로 연결되어 관리됨
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
