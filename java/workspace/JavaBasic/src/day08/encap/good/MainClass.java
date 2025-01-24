package day08.encap.good;

public class MainClass {
	public static void main(String[] args) {
		MyDate me = new MyDate();
//		me.setYear(2026);
		me.setYear(2025);

		me.setMonth(2);
		me.setDay(5);
		me.setSsn("1234567891234");
		int year = me.getYear();
		System.out.println("년도: " + year);
		int month = me.getMonth();
		int day = me.getDay();
		String ssn = me.getSsn();
		System.out.println("졸업식 날짜는: " + month + "월 " + day + "일");
		System.out.println("주민번호는:" + ssn);
	}
}
