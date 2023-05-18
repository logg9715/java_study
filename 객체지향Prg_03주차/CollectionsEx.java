package test;

import java.util.Collections;
import java.util.LinkedList;

public class CollectionsEx {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		LinkedList<String> myList = new LinkedList<>();

		myList.add("트랜스포머");
		myList.add("스타워즈");
		myList.add("매트릭스");
		myList.add(0, "터미네이터");
		myList.add(2, "아바타");

		System.out.println(myList);

		Collections.sort(myList);

		System.out.println(myList);

		Collections.reverse(myList);

		System.out.println(myList);

		int index = Collections.binarySearch(myList, "아바타") + 1;

		System.out.println("아바타는 " + index + "번째 요소입니다. ");

	}

}
