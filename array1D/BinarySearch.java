package array1D;

public class BinarySearch {
	public static int SearchKey(int arr[],int key) {
		int start=0,end=arr.length-1;
		
		
		while(start<=end) {
			int mid=(start+end)/2;
			if(arr[mid]==key) { //FOUND
				return mid;
			}
			if(arr[mid]<key) { //RIGHT
				start=mid+1;
			}
			else { //LEFT
				end=mid-1;
			}
		}
		return -1;
	}
	public static void main(String[] args) {
		int arr[]= {2,4,6,8,10,12,14};
		int key=10;
		
		System.out.println("Index for key is :"+SearchKey(arr, key));
		
	}

}
