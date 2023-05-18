package test;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.FileReader;
import java.io.FileWriter;

public class EX8_1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int c;

		try {
			BufferedReader br = new BufferedReader(new FileReader("C:\\inputFile.txt"));

			BufferedWriter bw = new BufferedWriter(new FileWriter("C:\\outFileBuff.txt"));

			while ((c = br.read()) != -1) {
				bw.write(c);
				//System.out.print((char) c);
			}

			System.out.println("실행 완료");
			br.close();
			bw.close();

		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
			System.out.println("etc err");
		}

	}

}
