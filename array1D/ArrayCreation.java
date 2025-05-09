package array1D;

import java.util.Scanner;

public class ArrayCreation {
	
	//Updating an Array
	public static void Update(int[]numbers) {
		for(int i=0;i<numbers.length;i++) {
			numbers[i]=numbers[i]+2;
		}
		}
	public static void main(String[] args) {
		int marks[]= new int[50];
		
		int []numbers = {1,2,3,4};
		
		Update(numbers);
		for(int i=0;i<numbers.length;i++) {
			System.out.print(numbers[i]+" ");
		}
		
		String fruits[]= {"apple","mango","banana"};
		System.out.println(numbers[0]);
		System.out.println(fruits[2]);
		System.out.println("length of marks array :"+marks.length);
		Scanner sc= new Scanner(System.in);
		marks[0]=sc.nextInt();
		marks[1]=sc.nextInt();
		marks[2]=sc.nextInt();
		int percentage =(marks[0]+ marks[1] +marks[2])/3;
		System.out.println("Physics: "+marks[0] +" Maths: "+marks[1]+" English: "+marks[2]);
		System.out.println("You Got "+percentage+" %");
		
	}

}
