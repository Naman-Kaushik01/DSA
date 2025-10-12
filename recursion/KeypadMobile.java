package recursion;



public class KeypadMobile {
	static void pad(String p, String up) {
		if(up.isEmpty()) {
			System.out.println(p);
			return;
		}
		
		int digit=up.charAt(0)-'0'; // this will convert '2'into 2
	
		for(int i=(digit-1)*3;i<digit*3;i++) {
			char ch=(char)('a'+i);
			pad(p+ch, up.substring(1));
		}
//		public List<String> letterCombinations(String up,String p) {
//			if(up.isEmpty()) {
//				List<String> list=new ArrayList<String>();
//				list.add(p);
//				return list;
//			}
	    }
	}

