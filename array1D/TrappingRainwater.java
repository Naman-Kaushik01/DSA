package array1D;

public class TrappingRainwater {
	public static int WaterTrap(int height []) {
		
		int n=height.length;
		
		//Calculate left max
		
		int leftMax[]=new int[n];
		leftMax[0]=height[0];
		for(int i=1;i<n;i++) {
			leftMax[i]=Math.max(height[i],leftMax[i-1]);
		}
		
		//Calculate Right Max
		
		int rightMax[]= new int[n];
		rightMax[n-1]=height[n-1];
		for(int i=n-2;i>=0;i--) {
			rightMax[i]=Math.max(height[i],rightMax[i+1]);
		}
		int trappedWater=0;
		
		for(int i=0;i<n;i++) {
			
			//Water Level = Minimum (RightMax, LeftMax)
			int waterlevel=Math.min(leftMax[i],rightMax[i]);
			
			//Trapped Water = water level-height
			trappedWater=trappedWater +waterlevel-height[i];
		}
		return trappedWater;
	}
	public static void main(String[] args) {
		
		int height[]= {1,8,6,2,5,4,8,3,7};
		
		System.out.println(WaterTrap(height));
	}

}
