package study;

import java.time.LocalDateTime;
import java.util.ArrayList;
import java.util.Scanner;

public class AddrMain {

	static Scanner sc = new Scanner(System.in);
	static ArrayList<Addr> addrList = new ArrayList<>();

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		int con = 1;

		String search;
		// boolean searchBo = false;

		while (con != 0) {
			System.out.println("\n-------------");
			System.out.println("1. 주소록 입력");
			System.out.println("2. 주소록 검색");
			System.out.println("3. 주소록 조회");
			System.out.println("4. 주소록 수정");
			System.out.println("5. 주소록 삭제");
			System.out.println("0. 종료");
			System.out.println("-------------");

			// 입력 부분1
			System.out.print("\n메뉴를 입력하세요 : ");
			con = sc.nextInt();

			switch (con) {
			case 0:
				System.out.println("종료합니다.");
				break;

			case 1: // 1. 주소록 입력
				addrInput();
				break;

			case 2: // 2. 주소록 검색
				System.out.print("검색할 이름을 이입력하세요. (like검색) : ");
				search = sc.next();
				for (Addr addr : addrList) {
					if (addr.getName().equals(search)) {
						System.out.println(addr.toString());
						// searchBo = true;
					}
				}
				break;

			default: // 예외) 잘못된 입력입니다.
				System.out.println("잘못된 입력입니다. 다시 입력하세요.");
				break;
			}
		} // while 끝

	}

	public static void addrInput() {
		Addr generateAddr = new Addr();

		System.out.print("이름을 입력하세요 : ");
		generateAddr.setName(sc.next());

		System.out.print("전화번호를 입력하세요 : ");
		generateAddr.setPhoneNum(sc.next());

		System.out.print("회사 이름을 입력하세요 : ");
		generateAddr.setCompany(sc.next());

		addrList.add(generateAddr);
	}
}
