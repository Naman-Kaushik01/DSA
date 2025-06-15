package bitmanipulation;

public class OperationOnIthBit {
	public static int GetIthbit(int num,int i) {
		int mask=1<<i;
		if ((num & mask)==0) {
			return 0;
		}
		return 1;
	}
	public static int SetIthBit(int num,int i) {
		int mask=1<<i;
		return num | mask;
	}
	public static int ClearIthBit(int num,int i) {
		int mask=~(1<<i);
		return num & mask;
	}
	
	public static void main(String[] args) {
		System.out.println(GetIthbit(10, 3));
	}

}
