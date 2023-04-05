package study;

import java.util.ArrayList;
import java.util.Scanner;

public class AddrMain {

	static Scanner sc = new Scanner(System.in);
	static ArrayList<Addr> addrList = new ArrayList<>();

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		int con = 1;

		String search;

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
				System.out.print("검색할 이름을 입력하세요. (like검색) : ");
				search = sc.next();
				addrSearch(search);
				break;

			case 3: // 3. 주소록 전체조회
				for (Addr addr : addrList) {
					System.out.println(addr.toString());
				}
				break;

			case 4: // 4. 주소록 수정
				System.out.print("수정할 주소록의 이름을 입력하시오. : ");
				search = sc.next();
				addrEdit(search);
				break;

			case 5: // 5. 주소록 삭제
				System.out.print("삭제할 주소록의 이름을 입력하시오. : ");
				search = sc.next();
				addrDel(search);
				break;

			default: // 예외) 잘못된 입력입니다.
				System.out.println("잘못된 입력입니다. 다시 입력하세요.");
				break;
			}
		} // while 끝

	}

	// 메소드 :
	// 주소록 검색
	public static void addrSearch(String data) {
		boolean searchBo = false;
		for (Addr addr : addrList) {
			if (addr.getName().equals(data)) {
				System.out.println(addr.toString());
				searchBo = true;
			}
		}
		if (searchBo == false)
			System.out.println("해당하는 이름을 찾을 수 없습니다.");
		else
			searchBo = false;

	}

	// 메소드 :
	// 주소록 추가
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

	// 메소드 :
	// 주소록 수정
	public static void addrEdit(String data) {
		for (Addr addr : addrList) {
			if (addr.getName().equals(data)) {
				System.out.println(data + "의 정보를 수정합니다.\n");

				System.out.print("[수정] 이름을 입력하세요 : ");
				addr.setName(sc.next());

				System.out.print("[수정] 전화번호를 입력하세요 : ");
				addr.setPhoneNum(sc.next());

				System.out.print("[수정] 회사 이름을 입력하세요 : ");
				addr.setCompany(sc.next());
			}
		}
	}

	// 메소드 :
	// 주소록 삭제
	public static void addrDel(String data) {
		boolean searchBo = false;
		int delIndex = 0;

		for (int i = 0; i < addrList.size(); i++) {
			if (addrList.get(i).getName().equals(data)) {
				System.out.println("[삭제] " + addrList.get(i).getName() + "의 주소록을 삭제했습니다.");
				delIndex = i;
				searchBo = true;
			}
		}

		if (searchBo == false)
			System.out.println("해당하는 이름을 찾을 수 없습니다.");
		else {
			searchBo = false;
			addrList.remove(delIndex);
		}
	}
}
