package api.buffered;

import java.util.*;
import java.io.*;

public class BufferedReaderEx {
	public static void main(String[] args) {

		/*
		 * 2바이트 기반의 성능향상 보조스트림
		 * 
		 * readLine() - 한 줄씩 통째로 읽어들입니다.
		 */

		String path = "C:\\Users\\user\\Desktop\\course\\java\\file\\test02.txt";

		BufferedReader br = null;

		try {
			
			
			
			br = new BufferedReader(new FileReader(path));
			
//			System.out.println(br.readLine()); // 더 이상 읽을 데이터가 없으면 null을 읽어들인다.
			String str ;
			while((str = br.readLine())!= null) {
				System.out.println(str);
			}
			
			
		} catch (Exception e) {
			e.printStackTrace();
		} finally {
			try {
				br.close();
			} catch (Exception e2) {
				// TODO: handle exception
			}
		}

	}
}
