package quiz01;

public class Quiz01 {
	public static void main(String[] args) {
		int x = 2;
		int y = 5;
		char c = 'A'; // 'A'의 문자코드는 65
		
		
		System.out.println(y += 10 - x++); // 5 +10 -2++ = 13 		/*x = 3, y = 13*/
		System.out.println(x+=2);  // 3 + 2 = 5
		System.out.println( !('A' <= c && c <='Z') ); //!( 65 <= 65 &&) = false 
		System.out.println('C'-c); // 67 - 65 = 2
		System.out.println(c+1); // 65 + 1 = 66
		System.out.println(++c); // 66 , B
		System.out.println(c++); // 66, B
		System.out.println(c);  // 67, C
	}
}
