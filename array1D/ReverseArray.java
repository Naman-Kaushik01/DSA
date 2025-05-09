package array1D;

public class ReverseArray {
	public static void RevArr(int arr[]) {
		int first=0,last=arr.length-1;
		while(first<last) {
			int temp=arr[last];
			arr[last]=arr[first];
			arr[first]=temp;
			first++;
			last--;
		}
	}

	public static void main(String[] args) {
		int arr[]= {2,6,8,7,12,9};
		RevArr(arr);
		
		for(int i=0;i<arr.length;i++) {
			System.out.print(arr[i]+" ");
		}
	
	}

}
