package string;

public class StringOperations {
	
	public static void StringChar(String s) {
		for(int i=0;i<s.length();i++) {
			System.out.print(s.charAt(i)+" ");
		}
		System.out.println();
	}
	public static void main(String[] args) {
		String firstName="Naman";
		String LastName="Kaushik";
		
		String FullName=firstName+" "+LastName;
		
		System.out.println(FullName);
		
		StringChar(FullName);
		
	}

}
