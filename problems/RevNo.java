package problems;

public class RevNo {
	public static void main(String[] args) {
		int n=984562;
		int rev=0;
		while(n>0) {
			int LastDigit=n%10;
			rev=(rev*10)+LastDigit;
			n=n/10;
		}
		System.out.println(rev);
	}

}
