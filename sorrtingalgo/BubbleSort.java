package sorrtingalgo;

public class BubbleSort {
	public static void SortArr(int arr[]) {
		int n=arr.length;
		
		for(int turn=0;turn<n-1;turn++) {
			
			for(int j=0;j<n-1-turn;j++) {
				
				if(arr[j]>arr[j+1]) {
					int temp=arr[j];
					arr[j]=arr[j+1];
					arr[j+1]=temp;
				}
				
			}
		}
		
	}
	public static void PrintArray(int arr[]) {
		for(int i=0;i<arr.length;i++) {
			System.out.print(arr[i]+" ");
		}
		System.out.println();
	}
	public static void main(String[] args) {
		int arr[]= {5,3,4,6,1};
		SortArr(arr);
		PrintArray(arr);
	}

}
