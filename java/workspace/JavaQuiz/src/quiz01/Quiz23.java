package quiz01;

import java.util.Arrays;
import java.util.Scanner;

public class Quiz23 {
	public static void main(String[] args) {
		
		//백준 2차원 배열 - 2566번
		//9×9 격자판에 쓰여진 81개의 자연수 또는 0이 주어질 때, 
		//이들 중 최댓값을 찾고 그 최댓값이 몇 행 몇 열에 위치한 수인지 구하는 프로그램을 작성하시오.
		
		
		Scanner sc = new Scanner(System.in);
		int[][] arr = new int [9][9];
		//9x9  배열안에 값을 입력할 수 있는 for문을 작성함
		for(int i = 0; i< arr.length;i++) {
			for(int j = 0; j < arr[i].length; j++) {
				arr[i][j] = sc.nextInt();
			}
		}
		int max = arr[0][0];
		//행, 열 출력시 인덱스 번호는 0부터 시작하기 때문에 초기값을 1로 설정.
		int h = 1;
		int y = 1;
		//최대값 찾는 for문
		for(int i = 0; i <arr.length;i++) {
			for(int j = 0; j<arr[i].length; j++) {
				//만약 max값보다 i행 j열에 있는 값이 더 크면
				if(max < arr[i][j]) {
					//max 값에 최댓값 저장, h에 행값 저장, y에 열값 저장
					max = arr[i][j];
					h = i+1;
					y = j+1;
				}
			}
		}
		System.out.println(max);
		System.out.println(h + " "+ y);
	
	}
}
