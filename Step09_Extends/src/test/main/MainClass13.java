package test.main;

import test.mypac.HandPhone;
import test.mypac.Phone;
import test.mypac.SmartPhone;


public class MainClass13 {

	public static void main(String[] args) {
		/* 다형성 확인
		SmartPhone p1 = new SmartPhone();
		
		HandPhone p2=new SmartPhone();
		
		Phone p3 = new SmartPhone();
		
		Object p4 = new SmartPhone();
		
		// type casting(형변환)
		SmartPhone P5 = (SmartPhone)p4;
		
		Object p6=p4;
		*/
		
		usePhone(new Phone());	
	}

	public static void usePhone(Phone p) {
		p.call();
	}	
}
