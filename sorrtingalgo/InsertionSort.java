package sorrtingalgo;

public class InsertionSort {
	public static void SortArray(int arr[]) {
		for(int i=1;i<arr.length;i++) {
			int curr=i;
			int prev=i-1;
			
			//finding correct position to insert
			while(prev>=0 && arr[prev]>arr[curr]) {
				arr[prev+1]=arr[prev];
				prev--;
			}
			arr[prev+1]=arr[curr];
		}
	}
	
	
	public static void PrintArray(int arr[]) {
		for(int i=0;i<arr.length;i++) {
			System.out.print(arr[i]+" ");
		}
		System.out.println();
	}
	public static void main(String[] args) {
		int arr[]= {5,4,1,3,2};
		SortArray(arr);
		PrintArray(arr);
	}

}
