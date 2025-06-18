package array1D;

public class SecondLargest {
		
		static int Smallest(int arr[] ) {
			int smallest=Integer.MAX_VALUE;
			for(int i=0;i<arr.length;i++) {
				if(arr[i]<smallest) {
					smallest=arr[i];
				}
			}
			return smallest;
			
		}
		static int SecondSmallest(int arr[]) {
			Smallest(arr);
			int SecondSmallest=1;
			for(int i=0;i<arr.length;i++) {
				if((arr[i]<SecondSmallest)&&(arr[i]!=Smallest(arr))) {
					SecondSmallest =arr[i];
				}
			}
			return SecondSmallest;
		}
	public static void main(String[] args) {
		int arr[]= {3, 3, 6, 1};
		
		System.out.println(Smallest(arr));
		System.out.println(SecondSmallest(arr));
	}

}
