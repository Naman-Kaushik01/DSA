package array1D;

public class PairsInArray {
	public static void PrintPairs(int arr[]) {
		int totalPairs=0;
		for(int i=0;i<arr.length;i++) {
			for(int j=i+1;j<arr.length;j++) {
				System.out.print("("+arr[i]+","+arr[j]+")");
				totalPairs++;
				
			}
			System.out.println();
			
		}
		System.out.println("Total no. of pairs is "+totalPairs);
	}
	public static void main(String[] args) {
		int arr[]= {2,4,5,6,7,8};
		PrintPairs(arr);
		for(int i=0;i<arr.length;i++) {
			System.out.print(arr);
		}
		
		
	}

}
