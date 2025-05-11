package array2d;

import java.util.Scanner;

public class Search2DMatrix {
	
	public static boolean Search2dMatrix(int arr[][],int target) {
		for(int i=0;i<arr.length;i++) {
			for(int j=0;j<arr[0].length;j++) {
				if(arr[i][j]==target) {
					System.out.println("Target Found at" +i+" "+j);
				}
			}
		}
		System.out.println("Not Foundss");
		return false;
	}
	
	public static void main(String[] args) {
		int arr[][] = new int[3][3];
		int m=arr.length;
		int n=arr[0].length;
		int target=4;
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
		Search2dMatrix(arr, target);
		sc.close();
	}

}
