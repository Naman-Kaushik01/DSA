package bitmanipulation;

public class FindUnique {
	public static int CheckUnique(int arr[]) {
		int unique=0;
		for (int n:arr) {
			unique ^= n;
		}
		return unique;
	}
	public static void main(String[] args) {
		int arr[]= {1,3,4,5,1,3,4,6,5};
		
		System.out.println(CheckUnique(arr));
		
	}

}
