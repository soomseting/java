package day10.inter.basic3;

public class MainClass {
	public static void main(String[] args) {
//		Lg lg = new Lg();
//		lg.print("LG로 실행함");
//		lg.copy(5);

		Printed pt = new Lg();//Lg로 만들어서 printed에 저장
		pt.print("LG로 실행함");
		pt.copy(5);
		
		Printed pt2 = new Samsung();
		pt2.print("print 실행함");
		pt2.copy(5);
	}
}
