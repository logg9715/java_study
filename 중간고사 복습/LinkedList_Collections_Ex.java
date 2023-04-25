package re;

import java.util.Collections;
import java.util.LinkedList;

// LinkedList 예제 (배열 수정하며 출력하기)
// ArrayList와 비슷
// 요소 객체들이 양방향으로 연결되어 관리됨
// 요소는 맨 앞, 뒤 추가 가능
// 중간에 요소 삽입 가능
// 맨 앞,뒤 추가&삭제 기능 -> 스택이나 큐로 사용 가능

// collections 클래스
// 컬렉션에 대한 연산 수행
// 암기 항목 :
// collections.sort(list);							배열 정렬 (오름차순, 숫자>대문자>소문자)
// collections.reverse(list);						배열 반전
// collections.max(list); .min(list) => data;		최대, 최솟값 찾기
// collections.binarySearch(list, data) => index;	특정 값 검색

public class LinkedList_Collections_Ex {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		LinkedList<String> myList = new LinkedList<>();
		myList.add("aaaa"); // 추가
		myList.addFirst("lol"); // 맨앞 추가
		myList.addLast("12"); // 맨뒤 추가
		myList.add(1, "XXXXX"); // 중간 삽입

		System.out.println(myList);

		Collections.sort(myList);
		System.out.println("sort 사용 : " + myList);

		Collections.reverse(myList);
		System.out.println("reverse 사용 : " + myList);

		int index = Collections.binarySearch(myList, "aaaa");
		System.out.println("binarySearch 사용 (aaaa 검색) : " + index);
	}

}
