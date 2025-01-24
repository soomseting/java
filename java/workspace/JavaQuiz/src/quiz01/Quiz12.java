package quiz01;

public class Quiz12 {
	public static void main(String[] args) {
		int[] arr = { 1000, 500, 100, 50, 10 };
		int money = 17780;
		
		// 1000원 :17
		// 500원 :1
		// 100원 :2
		// 50원 : 1
		// 10원 :3
		// 가장 최선의 방법으로 금액을 거슬러주면 됩니다.
		
		for (int i = 0; i < arr.length; i++) {
			System.out.println(arr[i] + "원:" + money/arr[i]);
			money = money%arr[i];
		}
		
		/*(money/arr[0]);
		(money%arr[0])/arr[1]);
		(money%arr[0])%arr[1])/arr[2]);
		(money%arr[0])%arr[1])%arr[2])/arr[3]);
		(money%arr[0])%arr[1])%arr[2])%arr[3])/arr[4]);
	*/
		int pocket = 17780;
		int i = 0;
		while(i<arr.length) {
			System.out.println(arr[i] + "원:" + pocket/arr[i]);
			pocket %= arr[i];
			i++;
		}
		
		
	}
}
