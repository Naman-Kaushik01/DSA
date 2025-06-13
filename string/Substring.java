package string;

public class Substring {
	public static String Findsubstring(String s,int si,int ei) {
		String substr="";
		for(int i=si;i<ei;i++) {
			substr+=s.charAt(i);
		}
		return substr;
	}
	public static void main(String[] args) {
		String s1="HelloWorld";
		
		//In java it has inbuilt substring function
		System.out.println(s1.substring(0, 5));
		System.out.println(Findsubstring(s1, 0, 4));
	}

}
