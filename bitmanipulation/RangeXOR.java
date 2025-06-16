package bitmanipulation;

public class RangeXOR {
	static int XOR(int n) {
		if(n % 4==0) {
			return n;
		}
		if(n % 4==1) {
			return 1;
		}
		if(n % 4==2) {
			return n+1;
		}
		return 0;
	}
	public static void main(String[] args) {
		int a=3;
		int b=5;
		int res =XOR(b) ^ XOR(a-1);
		System.out.println(res);
		
		
	}

}
