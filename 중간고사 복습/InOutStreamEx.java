package re;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.FileReader;
import java.io.FileWriter;

// 자바의 입출력 스트림 
// 단방향 (입출력 동시에는 불가)
// 기본 단위 : 바이트(InputStream, OutputStream), 문자
// 선입선출

// 문자 스트림 
// (try catch문 필수!!) 
// catch문 : e.printStackTrace (필수!!)
// (catch문의 인자는 Exception e가 꼭 들어가야함!!)
// Reader, Writer
// FileReader, FileWriter		파일에서 문자 데이터 입출력
// 암기 항목 :
// .read(); 					파일 읽기 (int값, 읽을 항목이 없으면 -1 출력된다)

// 버퍼 스트림
// 버퍼를 가진 스트림
// 입출력 데이터를 임시저장하는 '버퍼'를 이용하여 효율 향상
// BufferedInputStream BufferedOutputStream	(바이트)
// BufferedReader, BufferedWriter			(문자 버퍼)
// .close (버퍼 닫기)
// 암기 항목 :
// .read(); 					파일 읽기 (int값, 읽을 항목이 없으면 -1 출력된다)
// .write(int);					파일 출력 (주로 .read에로 저장한 int값을 사용)

public class InOutStreamEx {

	public static void main(String[] args) {
		// 버퍼 스트림 미사용
		int c;
		FileReader flIn = null;

		try {
			flIn = new FileReader("C:\\answer.txt");

			while ((c = flIn.read()) != -1) {	// 읽을게 없으면 -1 출력됨
				// 출력할때는 반드시 (char)형으로 변환해서 출력한다.
				System.out.print((char) c);
			}

		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
			System.out.println("etc err");
		}
		System.out.println("\n");

		// -------------------------------------------------
		// 버퍼 스트림 사용

		int b;

		try {
			BufferedReader br = new BufferedReader(new FileReader("C:\\answer.txt"));
			BufferedWriter bw = new BufferedWriter(new FileWriter("C:\\download\\answer2.txt"));

			while ((b = br.read()) != -1) {	// 읽을게 없으면 -1 출력됨
				bw.write(b);
				// 출력할때는 반드시 (char)형으로 변환해서 출력한다.
				System.out.print((char) b);
			}
			System.out.println("실행 완료");
			br.close();
			bw.close();

		} catch (Exception e) {
			e.printStackTrace();
			System.out.println("etc err");
		}

	}

}
