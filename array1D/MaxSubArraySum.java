package array1D;

public class MaxSubArraySum {
	public static void FindMaxSum(int[]arr) {
		int CurrSum=0;
		int MaxSum=Integer.MIN_VALUE;
		for(int i=0;i<arr.length;i++) {
			
			for(int j=i;j<arr.length;j++) {
				 CurrSum=0;
				for(int k=i;k<=j;k++) {
					CurrSum=CurrSum+arr[k];
				}
				System.out.println(CurrSum);
				if(CurrSum>MaxSum) {
					MaxSum=CurrSum;
				}
			}
		}
		System.out.println("Max Sum is "+MaxSum);
	}
	
	public static void main(String[] args) {
		int arr[]= {1,2,-4,5,3};
		
		FindMaxSum(arr);
		
		
	}

}
