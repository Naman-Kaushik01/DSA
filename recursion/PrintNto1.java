package recursion;

public class PrintNto1 {
	
	static void printNto1(int n) {
		if(n==0) {
			return;
		}
		System.out.println(n+" ");
		 printNto1(n-1);
	}
	
	//printing both number from 1 to N and N to 1
	static void printNto1and1toN(int n) {
		if(n==0) {
			return;
		}
		
		System.out.println(n+" ");
		 printNto1and1toN(n-1);
		 System.out.println(n);// here we are printing the value when it is removing from the heap memory
	}
	public static void main(String[] args) {
		int n=5;
		printNto1and1toN(n);
		
	}

}
