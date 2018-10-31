package MazeSolver;

import java.util.Arrays;

public class MazeSolver {
	
	public int[][] maze;
	public int col;
	public int row;
	
	private int[][] visited;
	public MazeSolver(int[][] maze, int col, int row) {
		this.maze = maze;
		visited = new int[row][col];
		this.col = col;
		this.row = row;
	}
	
	private void solveMaze() {
		int[] start = findStart();
		if(start == null) {
			throw new IllegalArgumentException("Maze does not have a start");
		}
		
		dfs(start[0],start[1]);
		
		// use dfs:
		// check all possible ways if 0 add to LIFO continue
		// if found 3 print to road there somehow don't know yet
	}
	
	private int[] dfs(int c, int r) {
		visited[c][r] = 1;
	
		if(maze[c][r]==3) {
			System.out.println("Found it!");
			String s = "Visited:\n";
			for(int i=0;i<row;i++) {
				s += Arrays.toString(visited[i]) + "\n";
			}
			
			System.out.println(s);
			return new int[] {c,r};
		} if (c!=0 && maze[c-1][r]!=1 && visited[c-1][r]!=1){
			if(dfs(c-1,r)!= null) {
				return dfs(c-1,r);				
			}
		} if (c+1<=col && maze[c+1][r]!=1 && visited[c+1][r]!=1){
			if(dfs(c+1,r)!= null) {
				return dfs(c+1,r);				
			}
		} if (r!=0 && maze[c][r-1]!=1 && visited[c][r-1]!=1){
			if(dfs(c,r-1)!= null) {
				return dfs(c,r-1);				
			}
		} if (r+1<=row && maze[c][r+1]!=1 && visited[c][r+1]!=1){
			if(dfs(c,r+1)!= null) {
				return dfs(c,r+1);				
			}
		}
		System.out.println("The way we go " + c + ", " + r);
		return null;
	}
	


	
	private int[] findStart() {
		for(int i = 0; i < row;i++) {
			for(int j = 0; j < col;j++) {
				if(maze[i][j] == 2) {
					return new int[] {i,j};
				}
			}
		}
		return null;

	}
	
	public static void main(String[] args) {
		FileReaderMaze frm = new FileReaderMaze();
		int[][] maze = frm.readMaze("C:\\Users\\vvovv\\eclipse-workspace\\AlgDatSommer\\src\\MazeSolver\\maze1.txt",5,7);
		MazeSolver ms = new MazeSolver(maze, 5,7);
		ms.solveMaze();
		
	}
}
