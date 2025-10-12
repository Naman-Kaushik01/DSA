package array1D;

public class MajorityElement {
	static int FindMajority(int nums[]) {
		int count=0,candidate=0;
		for(int i=0;i<nums.length;i++) {
			if(count==0) {
				candidate=nums[i];
			}
			if(candidate==nums[i]) {
				count+=1;
			}else {
				count-=1;
			}
		}
		
		return candidate;
	}
	public static void main(String[] args) {
		int nums[]= {2,2,1,1,1,2,2};
		System.out.println(FindMajority(nums));
		
	}

}
