package problems;

import java.util.Scanner;

public class CandyShop {
	public static void main(String[] args) {
		int CandyMax=50;
		int CandyMin=10;
		Scanner scanner= new Scanner(System.in);
		System.out.println("How much Candy You Want ?");
		int input= scanner.nextInt();
		if(input>50) {
			System.out.println("Invalid");
		}
		if(input>CandyMax-CandyMin) {
			System.out.println("Jar Capacity "+CandyMax);
		}
		else {
			System.out.println("Left "+(CandyMax-input));
			
		}
		
	}

}
