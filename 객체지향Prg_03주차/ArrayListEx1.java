package test;

import java.util.ArrayList;

public class ArrayListEx1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		
		ArrayList<Integer> aList = new ArrayList<>();
		
		aList.add(100);
		aList.add(200);
		aList.add(300);
		aList.add(1, 150);
		
		
		for (int i = 0; i <aList.size(); i++)
			System.out.println(aList.get(i));
		
		for (Integer integer : aList) {
			System.out.println(integer);
			
		}
		
	}

}
