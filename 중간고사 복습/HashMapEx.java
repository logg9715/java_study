package re;

import java.util.HashMap;
import java.util.Scanner;

// 해쉬맵 예제 (영어를 입력하여 한글 데이터 찾기, exit로 종료)
// (key, value)로 구성
// 반드시 key값으로만 데이터 겁색 
// 특징 : 삽입 삭제 검색이 빠름

// 암기 항목
// HashMap.put(key, value);	데이터 추가
// HashMap.get(key);		데이터 출력
// HashMap.remove(key);		데이터 삭제
// HashMap.clear();			배열 초기화

public class HashMapEx {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		HashMap<String, String> words = new HashMap<>();
		String tmp = "", search;

		words.put("baby", "아기");
		words.put("apple", "사과");
		words.put("car", "자동차");

		Scanner sc = new Scanner(System.in);

		while (true) {
			System.out.print("단어 검색 : ");
			tmp = sc.nextLine();

			if (tmp.equals("exit")) {
				System.out.println("종료합니다.");
				break;
			}

			search = words.get(tmp);
			if (search == null) {
				System.out.println("존재하지 않는 단어입니다.");
			} else
				System.out.println(tmp + " : " + search);

		}
	}

}
