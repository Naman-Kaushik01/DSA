package recursion;

public class Triangle {
	static void PrintTriangle(int r,int c) {
		if(r==0) {
			return;
		}
		if(c<r) {
			System.out.print("*");
			PrintTriangle(r, c+1);
		}else {
			System.out.println();
			PrintTriangle(r-1, 0);
		}
	}
	
	static void PrintTriangle2(int r,int c) {
		if(r==0) {
			return;
		}
		if(c<r) {
			PrintTriangle2(r, c+1);
			System.out.print("*");
			
		}else {
			PrintTriangle2(r-1, 0);
			System.out.println();
			
		}
	}
	public static void main(String[] args) {
		PrintTriangle(4, 0);
		PrintTriangle2(4, 0);
	}

}
