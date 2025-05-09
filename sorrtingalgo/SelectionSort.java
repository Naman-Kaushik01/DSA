package sorrtingalgo;

public class SelectionSort {
	public static void SortArray(int arr[]) {
		for(int i=0;i<arr.length-1;i++) {
			int minPos=i;
			for(int j=i+1;j<arr.length-1;j++) {
				if(arr[minPos]>arr[j]) {
					minPos=j;
				}
			}
			int temp=arr[minPos];
			arr[minPos]=arr[i];
			arr[i]=temp;
		}
	}
	public static void PrintArray(int arr[]) {
		for(int i=0;i<arr.length;i++) {
			System.out.print(arr[i]+" ");
		}
		System.out.println();
	}
	public static void main(String[] args) {
		int arr[]= {3,6,4,2,5,1,9};
		SortArray(arr);
		PrintArray(arr);
	}

}
