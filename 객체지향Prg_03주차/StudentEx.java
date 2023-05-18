package test;

import java.util.ArrayList;

public class StudentEx {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		ArrayList<Student> sData = new ArrayList<Student>();

		sData.add(new Student("김동헌", "컴소과", "010-1234-1234", 20202786));
		sData.add(new Student("홍길동", "국방과", "010-1111-1111", 11112783));
		sData.add(new Student("김첨지", "컴소과", "010-2222-2222", 22222782));
		sData.add(new Student("이순신", "국방과", "010-3333-3333", 33332781));

		System.out.println("컴소과 명단 : ");

		for (Student student : sData) {
			if (student.getDept().equals("컴소과"))
				System.out.println(student.toString());
		}

		System.out.println("국방과 명단 : ");

		for (Student student : sData) {
			if (student.getDept().equals("국방과"))
				System.out.println(student.toString());
		}

	}

}
