package recursion;

public class ProductOFDigits {
	static int DigitProduct(int n) {
		if(n%10==n) {
			return n;
		}
		return (n%10) * DigitProduct(n/10);
	}
	public static void main(String[] args) {
		System.out.println(DigitProduct(543));
		
	}

}
