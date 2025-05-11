package array2d;

import java.util.Scanner;

public class First {
	
	
	public static void main(String[] args) {
		int arr[][] = new int[3][3];
		int m=arr.length;
		int n=arr[0].length;
		
		System.out.println("Enter the numbers");
		Scanner sc= new Scanner(System.in);

		for(int i=0;i<m;i++) {
			for(int j=0;j<n;j++) {
				arr[i][j]=sc.nextInt();			}
		}
		
		for(int i=0;i<m;i++) {
			for(int j=0;j<m;j++) {
				System.out.print(arr[i][j]+" ");
			}
			System.out.println();
		}
		
		sc.close();
	}

}
