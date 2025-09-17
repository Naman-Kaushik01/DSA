package backtracking;

public class AllPaths {
	static void PrintAllPath(boolean maze[][],String p, int r,int c) {
		if(r==maze.length-1 && c==maze[0].length-1) {
			System.out.println(p);
			return;
		}
		if(!maze[r][c]) {
			return;
		}
		if(r<maze.length-1)  {
			PrintAllPath(maze, p+'D', r+1, c);
		
		}
		if(c<maze[0].length-1) {
			PrintAllPath(maze, p+'R', r, c+1);
		}
		if(r>0)  {
			PrintAllPath(maze, p+'U', r+1, c);
		
		}
		if(c>0)  {
			PrintAllPath(maze, p+'L', r+1, c);
		
		}
	}

}
