package array1D;

public class StocksBuyNSelll {
	public static int maxProfit(int []prices) {
		int buy =Integer.MAX_VALUE;
		int maxProfit=0;
		
		for(int i=0;i<prices.length;i++) {
			if(buy<prices[i]) {
				int profit=prices[i]-buy;
				maxProfit= Math.max(maxProfit,profit);
			}
			else {
				buy=prices[i];
			}
		}
		return maxProfit;
		
		
		
		
	}
	public static void main(String[] args) {
		int prices[]= {7,1,5,3,6,4};
		System.out.println(maxProfit(prices));
	}

}
