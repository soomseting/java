package quiz01;

import java.util.Arrays;

public class Quiz22 {
	public static void main(String[] args) {
		
		//배열의 크기를 한 개 늘리고, 값을 복사하고, 맨 앞에 data를 추가해보세요.
		int[] arr = {10, 20, 30, 40, 50};
		int data = 100; //추가할 데이터 
		
		//새 배열
		int[] arr2 = new int[arr.length+1];
		//새 배열에 기존 배열 값 복사
		for(int i = 0; i<arr.length; i++) {
			arr2[i] = arr[i];
		}
		//새 배열에 들어간 값을 오른쪽으로 한 칸 땡김
		for(int i = arr2.length-1; i>0; i--) {
			arr2[i] = arr2[i-1];
		}
		arr2[0] = data;
		arr = arr2;
		arr2 = null;
		
		System.out.println(Arrays.toString(arr));
		System.out.println(Arrays.toString(arr2));
	}
}
