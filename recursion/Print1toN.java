package recursion;

public class Print1toN {
	static void print1toN(int n) {
		if(n>5) {
			return;
		}
		System.out.println(n+" ");
		print1toN(n+1);
		
	}
	
	public static void main(String[] args) {
		int n=1;
		print1toN(n);
		
		
	}

}
