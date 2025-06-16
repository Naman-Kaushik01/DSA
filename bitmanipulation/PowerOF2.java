package bitmanipulation;

public class PowerOF2 {
	public static boolean CheckPower(int n) {
		if((n & (n-1))==0){  
			return true;
		}
		return false;
	}
	public static void main(String[] args) {
		int n=9;
		System.out.println(CheckPower(n));
		
	}

}
