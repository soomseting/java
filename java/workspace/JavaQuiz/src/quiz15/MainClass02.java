package quiz15;

import java.util.*;

public class MainClass02 {
	public static void main(String[] args) {
		/*
		updown게임			
		1~100사이의 정답이 주어지고, 사용자는 정답을 맞추는 게임입니다.
		정답보다, 입력값이 작다면 "더 큰 값을 입력하세요"
		정답보다, 입력값이 크다면 "더 작은 값을 입력하세요"
		를 출력합니다.
		
		정답을 맞추면, 정답횟수를 출력해주면 됩니다.
		잘못된 값을 입력한 경우에 에러처리를 하고, 정답횟수를 증가 시켜주세요.
		
		
		
		*/
		int a = (int) ((Math.random()*100)+1);
		int cnt = 0;
		Scanner sc = new Scanner(System.in);
//		System.out.println(a);
		for(;;) {
			try {
				System.out.print("숫자를 입력해주세요>");
				int b = sc.nextInt();
				cnt++;
				if(b == a) {
					System.out.println("정답입니다");
					System.out.println("시도한 횟수: " +cnt);
					break;
				}else if(b < a) {
					System.out.println("더 큰 값을 입력하세요");
					cnt++;
					sc.next();
				}else if(b>a) {
					System.out.println("더 작은 값을 입력하세요");
					cnt++;
				}
			} catch (Exception e) {
				System.out.println("잘못된 값을 입력했습니다");
				cnt++;
				sc.next();
			}
		}
	}
}
