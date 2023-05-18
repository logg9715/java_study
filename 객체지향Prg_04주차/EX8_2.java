package test;

import java.io.BufferedInputStream;
import java.io.BufferedOutputStream;
import java.io.FileInputStream;
import java.io.FileOutputStream;

public class EX8_2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		String fileName = "C:\\dino.jpg";
		int c;

		try {
			BufferedInputStream bin = new BufferedInputStream(new FileInputStream(fileName));

			BufferedOutputStream bout = new BufferedOutputStream(new FileOutputStream("C:\\dinoCopybuff.jpg"));

			while ((c = bin.read()) != -1) {
				bout.write(c);
			}
			System.out.println("\n 파일을 읽었습니다. ");

			bin.close();
			bout.close();

		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}

	}

}
