package day03;

public class MultiForEx02 {
	public static void main(String[] args) {
		// 바깥 반복문에 따라서 안쪽 반복문의 회전수가 달리지는 경우.
//		for (int i = 1; i <= 9; i++) {
//			for(int j = 1; j < i+1; j++) {
//				System.out.print(i + "-" + j);
//			}
//			System.out.println();
//		}
		
		//조건이 바뀌는 for문
		//바깥 반복문 - 행
		/*
		 * 
		 **
		 ***
		 ****
		 *****
		 */
		for(int i = 1; i <= 5; i++) {
			for(int j = 1; j<=i; j++) {
				System.out.print("*");
			}
			System.out.println();
		}
		System.out.println("------------------\n");
		/*
		 ***** 
		 ****
		 ***
		 **
		 *
		 */
		for(int i = 1; i<=5;i++) {
//			for (int j = 5; j>i; j--) {
			for (int j = 1; j<= 5+1-i; j++) {
				System.out.print("*");
			}
			System.out.println();
		}
		/*
		 *      *
		 *     ***
		 *    *****
		 *   *******
		 *  *********
		 */
		for(int i = 1; i<= 5;i++) {
//			for(int j = 5; j>=i; j--) {
			for(int j = 1; j <=5-i; j++) {
				System.out.print(" "); //공백을 출력할 용도
			}
//			for(int j = 1; j<=i; j++) {
//				System.out.print("*"); //별을 출력할 용도
//			}
//			for(int j = 2; j <= i; j++) {
//				System.out.print("*");
//			}
			for(int j = 1; j<= i*2-1; j++) {
				System.out.print("*");//별을 출력할 용도
			}
			System.out.println();//줄바꿈
		}
	}
}
