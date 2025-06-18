package array1D;

public class MissingNumber {
	static int FindMissingNo(int nums[]) {
		int missingNo=0;
		int ArraySum=0;
		int n=nums.length;
		int ActualSum=(n*(n+1))/2;;
		for(int i=0;i<nums.length;i++) {
			ArraySum=ArraySum+nums[i];
		}
		missingNo=ActualSum-ArraySum;
		return missingNo;
	}
	public static void main(String[] args) {
		
		int nums[]= {9,6,4,2,3,5,7,0,1};
		System.out.println(FindMissingNo(nums));
		
	}

}
