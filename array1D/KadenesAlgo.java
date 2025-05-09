package array1D;

public class KadenesAlgo {
	
	public static void MaxSum(int[]arr) {
		int CurrSum=0;
		int MaxSum=Integer.MIN_VALUE;
		
		for(int i=0;i<arr.length;i++) {
			
			CurrSum=CurrSum+arr[i];
			if (CurrSum<0) {
				CurrSum=0;
			}
			MaxSum=Math.max(CurrSum, MaxSum);
		}
		System.out.println("Max Sum : "+MaxSum);
	}
	public static void main(String[] args) {
		int arr[]= {-1,-2,-4,-5,-3};
		MaxSum(arr);
	}

}
