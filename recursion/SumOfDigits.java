package recursion;

public class SumOfDigits {
	static int DigitSum(int n) {
		
		if(n==0) {
			return 0;
		}
		return DigitSum(n/10)+(n%10);
	}
public static void main(String[] args) {
	System.out.println(DigitSum(1234));
}
}
