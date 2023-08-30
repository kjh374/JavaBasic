package oop.encap.good;

public class MainClass {

	public static void main(String[] args) {

		MyBirth my = new MyBirth();
//		my.year = 1992; (x)
		my.setYear(1992);
		my.setMonth(5);
		my.setDay(31);
		my.birthInfo();
		
	}

}
