package re;

import java.util.ArrayList;
import java.util.Scanner;

// ArrayList 예제 (이름을 입력받아서 가장 긴 값 출력)
// 특징 : 스레드 동기화 기능 없음
// 개발자가 직접 작성해야 함
// 맨 뒤에 객체 추가 가능	.add(data)
// 중간에 객체 삽입 가능	.add(index, data)
// 임의의 위치 데이터 삭제 가능	.remove(index)

// 암기 항목 : 
// String.length()

public class ArrayListEx {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		ArrayList<String> list = new ArrayList<>();
		int n = 4;
		String maxlen = "d";
		
		Scanner sc = new Scanner(System.in);
		
		for (int i = 0; i < n; i++) {
			System.out.print("이름을 입력하세요 : ");
			list.add(sc.nextLine());
		}
		
		for (String string : list) {
			System.out.print(string + " ");
		}
		
		System.out.print("\n가장 긴 이름 : ");
		
		for (String string : list) {
			if(string.length() > maxlen.length()) {
				maxlen = string;
			}
		}
		
		System.out.println(maxlen);
		
		
	}

}
