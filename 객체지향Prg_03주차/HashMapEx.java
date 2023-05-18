package test;

import java.util.HashMap;
import java.util.Scanner;

public class HashMapEx {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		HashMap<String, String> dic = new HashMap<>();
		
		String input, kor;
		
		dic.put("baby", "아기");
		dic.put("love", "사랑");
		dic.put("apple", "사과");
		
		Scanner sc = new Scanner(System.in);
		
		while (true) {
			System.out.print("찾을 단어 입력 : ");
			input = sc.nextLine();
			
			if(input.equals("exit")) {
				System.out.println("종료합니다.");
				break;
			}
			
			kor = dic.get(input);
			
			if(kor == null)
				System.out.println(input + "은(는) 존재하지 않는 단어입니다.");
			else
				System.out.println(kor);
		
		}
		sc.close();
		
	}

}
