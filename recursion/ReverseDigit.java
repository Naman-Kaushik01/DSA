package recursion;

public class ReverseDigit {
	static int sum=0;
	static void Approach1(int n) {
		if(n==0) {
			return;
		}
		int rem=n%10;
		sum=sum*10+rem;
		Approach1(n/10);
		
		
	}
	public static void main(String[] args) {
		Approach1(543);
		System.out.println(sum);
		
		
	}

}
