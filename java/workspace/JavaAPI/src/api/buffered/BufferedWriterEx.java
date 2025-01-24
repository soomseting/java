package api.buffered;

import java.io.*;
import java.util.*;

public class BufferedWriterEx {
	public static void main(String[] args) {

		/*
		 * 2바이트 기반에 성능향상 보조 스트림 BufferedWriter
		 */

		Scanner sc = new Scanner(System.in);

		String path = "C:\\Users\\user\\Desktop\\course\\java\\file\\test02.txt";
		BufferedWriter bw = null;
		try {

			bw = new BufferedWriter(new FileWriter(path));
//			bw = new BufferedWriter(new FileWriter(path, true));//true를 주게 되면 기존 파일이 있을 경우, 내용을 이어서 작성하게 됩니다.

			while (true) {
				System.out.print(">");
				String str = sc.nextLine();

				if (str.equals("exit")) {
					break;
				}
				str += "\r\n"; // 줄바꿈
				bw.write(str);
				bw.flush(); //쓸 때마다
			}
//			bw.flush(); // 다 쓰고 나서
		} catch (Exception e) {
			e.printStackTrace();
		} finally {
			try {
				bw.close();
			} catch (Exception e2) {
				// TODO: handle exception
			}
		}

	}
}
