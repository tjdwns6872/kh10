package exception;
import java.util.*;
public class Test01 {
	public static void main(String[] args) {
		//예외(Exception)
		// - 예상치 못한 돌발상황
		// - java.util.InputMismatchException
		// - java.lang.ArithmeticException
		
		Scanner sc = new Scanner(System.in);
		System.out.print("술 값 : ");
		int total = sc.nextInt();
		
		System.out.print("인원 : ");
		int people = sc.nextInt();
		
		sc.close();
		
		int price = total / people;
		int etc = total % people;
		
		System.out.println("1인당 "+price+"원");
		System.out.println("자투리 "+etc+"원");
	}
}

