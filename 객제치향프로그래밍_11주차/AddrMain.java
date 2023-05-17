package test;

import java.time.LocalDateTime;
import java.util.ArrayList;
import java.util.Scanner;

public class AddrMain {
	static Scanner sc = new Scanner(System.in);
	static ArrayList<Addr> addlist = new ArrayList<Addr>();

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		while (true) {
			System.out.println("-------------");
			System.out.println("1. 주소록 입력");
			System.out.println("2. 주소록 검색");
			System.out.println("3. 주소록 전체 조회");
			System.out.println("4. 주소록 수정");
			System.out.println("5. 주소록 삭제");
			System.out.println("0. 종료");
			System.out.println("-------------");
			System.out.println("메뉴를 입력하세요: ");
			int in = sc.nextInt();
			if (in < 6 || in > -1) {
				if (in == 1) {
					addrInput();
				} else if (in == 2) {
					addrSearch();
				} else if (in == 3) {
					addrJohoi();
				} else if (in == 4) {
					addrUpdate();
				} else if (in == 5) {
					addrDelete();
				} else if (in == 0) {
					break;
				}
			}
		}
		sc.close(); // 프로그램이 끝나는 곳에 넣어야 함
	}

	static void addrDelete() {
		System.out.println("삭제할 이름을 입력하시오.");
		String name = sc.next();
		for (int i = 0; i < addlist.size(); i++) {
			if (addlist.get(i).getName().equals(name)) {
				addlist.remove(i);
			}
		}
	}

	static void addrUpdate() {
		System.out.println("수정할 이름을 입력하시오.");
		String name = sc.next();
		System.out.println("수정할 전화번호를 입력하시오.");
		String tel = sc.next();
		System.out.println("수정할 회사이름을 입력하시오.");
		String com = sc.next();
		for (Addr addr : addlist) {
			if (addr.getName().equals(name)) {
				addr.setTel(tel);
				addr.setCom(com);
				System.out.println(addr + "로 수정되었습니다.");
			}
		}

	}

	public static void addrInput() {
		System.out.print("이름을 입력하세요: ");
		String name = sc.next();
		System.out.print("전화번호를 입력하세요: ");
		String tel = sc.next();
		System.out.print("회사이름을 입력하세요: ");
		String com = sc.next();
		LocalDateTime date = LocalDateTime.now();
		Addr add1 = new Addr(name, tel, com, date);
		addlist.add(add1);
		System.out.println(add1);
		// 방법2 addlist.add(new Addr(name,tel,com,date));
	}

	static void addrJohoi() {
		for (Addr item : addlist) {
			System.out.println(item);
		}
	}

	static private void addrSearch() {
		System.out.println("검색할 이름을 입력하시오.");
		String name = sc.next();
		/*
		 * 방법1 for (int i = 0 ; i < addlist.size(); i++) {
		 * if(addlist.get(i).getName().equals(name)) {
		 * System.out.println(addlist.get(i)); } }
		 */
		for (Addr item : addlist) {
			if (item.getName().equals(name)) {
				System.out.println(item);
			}
		}
	}
}
