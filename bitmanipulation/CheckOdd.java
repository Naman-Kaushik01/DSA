package bitmanipulation;

import java.util.Scanner;

public class CheckOdd {
	public static boolean CheckEvenOdd(int num) {
		if((num & 1)==1) {
			return false;
		}
		return true;
		
	}
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		System.out.println("Enter a number");
		int num=scanner.nextInt();
		System.out.println(CheckEvenOdd(num));
		
		scanner.close();
	}

}
