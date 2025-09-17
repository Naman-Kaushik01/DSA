package backtracking;

import java.util.ArrayList;

public class MazeProblem {
	static int count(int row,int col) {
		if(row==1 || col==1) {
			return 1;
		}
		int left= count(row-1,col);
		int right= count(row,col-1);
		
		
		return left+right;
	}
	static void path(String p,int r,int c) {
		if(r==1 && c==1) {
			System.out.println(p);
			return;
		}
		if(r>1)  {
			path(p +'D', r-1, c);
		
		}
		if(c>1) {
			path(p + 'R', r, c-1);
		}
	}
	
	static ArrayList<String> pathReturn(String p,int r, int c){
		if(r==1 && c==1) {
			ArrayList<String> list= new ArrayList<String>();
			list.add(p);
			return list;
		}
		ArrayList<String> list= new ArrayList<String>();
		
		if(r>1) {
			list.addAll(pathReturn(p+ 'D', r-1, c));
		}
		if(c>1) {
			list.addAll(pathReturn(p+'R', r, c-1));
		}
		
		return list;
	}
	static ArrayList<String> pathDiagonalReturn(String p,int r, int c){
		if(r==1 && c==1) {
			ArrayList<String> list= new ArrayList<String>();
			list.add(p);
			return list;
		}
		ArrayList<String> list= new ArrayList<String>();
		
		if(r>1 && c>1) {
			list.addAll(pathDiagonalReturn(p+'D', r-1, c-1));
		}
		if(r>1) {
			list.addAll(pathDiagonalReturn(p+ 'V', r-1, c));
		}
		if(c>1) {
			list.addAll(pathDiagonalReturn(p+'H', r, c-1));
		}
		
		return list;
	}
	
	static void pathRestrictions(boolean maze[][],String p, int r,int c) {
		if(r==maze.length-1 && c==maze[0].length-1) {
			System.out.println(p);
			return;
		}
		if(!maze[r][c]) {
			return;
		}
		if(r<maze.length-1)  {
			pathRestrictions(maze, p+'D', r+1, c);
		
		}
		if(c<maze[0].length-1) {
			pathRestrictions(maze, p+'R', r, c+1);
		}
	}
	public static void main(String[] args) {
//		path("", 3,3);
//		System.out.println(pathReturn("", 4, 4));;
		//System.out.println(pathDiagonalReturn("", 3, 3));
	
	}
}
