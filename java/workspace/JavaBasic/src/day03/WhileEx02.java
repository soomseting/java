package day03;

public class WhileEx02 {
	public static void main(String[] args) {
		
		//1~50까지의 수 중에서 짝수들의 합계 구하라
		int a = 1;
		int sum = 0;
		while(a<=50) {
			if(a%2 == 0) {
				sum += a;
			}
			a++;
		}
		System.out.println("짝수의 총합 : " + sum);
	}
}
