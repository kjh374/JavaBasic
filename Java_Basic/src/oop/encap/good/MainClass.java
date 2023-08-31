package oop.encap.good;

public class MainClass {

	public static void main(String[] args) {

		MyBirth my = new MyBirth();
//		my.year = 1992; (x)
		my.setYear(992);
		my.setMonth(4);
		my.setDay(31);
		my.birthInfo();
		
	}

}
