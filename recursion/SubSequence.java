package recursion;

import java.util.ArrayList;

public class SubSequence {
	static void PrintSubSequence(String p,String up) {
		if(up.isEmpty()) {
			System.out.println(p);
			return;
		}
		char ch=up.charAt(0);
		PrintSubSequence(p+ch, up.substring(1));
		PrintSubSequence(p, up.substring(1));
	}
	
	static ArrayList<String> SubSequenceUsingArrayList(String p,String up) {
		if(up.isEmpty()) {
			ArrayList<String> list=new ArrayList<String>();
			list.add(p);
			return list;
		}
		char ch=up.charAt(0);
		ArrayList<String> left=SubSequenceUsingArrayList(p+ch, up.substring(1));
		ArrayList<String> right=SubSequenceUsingArrayList(p, up.substring(1));
		
		left.addAll(right);
		return left;
	}
	
	static void SubSequenceWithAscii(String p,String up) {
		if(up.isEmpty()) {
			System.out.println(p);
			return;
		}
		char ch=up.charAt(0);
		SubSequenceWithAscii(p+ch, up.substring(1));
		SubSequenceWithAscii(p, up.substring(1));
		SubSequenceWithAscii(p+(ch+0), up.substring(1));
	}
	
	static ArrayList<String> SubSequenceAsciiUsingArrayList(String p,String up) {
		if(up.isEmpty()) {
			ArrayList<String> list=new ArrayList<String>();
			list.add(p);
			return list;
		}
		char ch=up.charAt(0);
		ArrayList<String> first=SubSequenceAsciiUsingArrayList(p+ch, up.substring(1));
		ArrayList<String> second=SubSequenceAsciiUsingArrayList(p, up.substring(1));
		ArrayList<String> third=SubSequenceAsciiUsingArrayList(p+(ch+0), up.substring(1));
		
		first.addAll(second);
		first.addAll(third);
		return first;
	}
	public static void main(String[] args) {
		PrintSubSequence("","abc");
		
		System.out.println(SubSequenceUsingArrayList("", "abc"));
		
		SubSequenceWithAscii("", "abc");
		
		System.out.println(SubSequenceAsciiUsingArrayList("","abc"));
	}

}
