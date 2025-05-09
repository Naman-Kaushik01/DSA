package array1D;

public class LargestArray {
	public static int CheckLargest(int arr[]) {
		int max=Integer.MIN_VALUE;
		int c=0;
		for(int i=0;i<arr.length;i++) {
			
			if(arr[i]>max) {
				max=arr[i];
				c++;
			}
		}
		System.out.println("Index "+c);
		return max;
	}
	public static void main(String[] args) {
		int arr[]= {2,4,5,8,7,25,32,47,6};
		System.out.println(CheckLargest(arr));
	}

}
