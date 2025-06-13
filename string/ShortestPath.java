package string;

public class ShortestPath {
	public static double FindShortestPath(String path) {
		int x=0,y=0;
		for(int i=0;i<path.length();i++) {
			char Dir=path.charAt(i);
			
			if(Dir=='S') {
				y=y-1;
			}else if(Dir=='N') {
				y=y+1;
			}else if(Dir=='W') {
				x=x-1;
			}else {
				x=x+1;
			}
		}
		int x2=x*x;
		int y2=y*y;
		return Math.sqrt(x2+y2);
	}
	public static void main(String[] args) {
		String path="WNEENESENNN";
		System.out.println(FindShortestPath(path));
		
	}

}
