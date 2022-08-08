package oop.keyword4;

public class Robot {
	public static int squared(int a) {
		return a * a;
	}
	
	public static double bmi(double cm, double kg) {
		cm = cm / 100;
		return kg / (cm * cm);
	}
	
	public static int price(int year) {
		int age = (2022-year)+1;
		if(age >= 8 && age <= 13) {
			return 450;
		}else if(age >= 20 && age <= 64) { 
			return 1250;
		}else if(age >= 14 && age <= 19) { 
			return 720;
		}else {	 
			return 0;
		}
	}
	
	public static double triangle(int base, int height) {
		return (base*height)/2.0;
	}
	
	public static double circle(int radius) {
		return (radius * radius) * 3.14;
	}
}
