package MazeSolver;

import java.io.*;
import java.util.Arrays;


public class FileReaderMaze {
	
	protected int[][] readMaze(String fileName, int col, int row) {
		String line = null;
		int[][] mazeMap = new int[row][col];
		
		try {
			
			FileReader fileReader = new FileReader(fileName);
			
			//Wrap reader in bufferReader (!)
			BufferedReader bufferedReader = new BufferedReader(fileReader);
			int lineNum = 0;
			while((line = bufferedReader.readLine()) != null) {
				String[] lines = line.split("\\s+");
				mazeMap[lineNum++] = Arrays.stream(lines).mapToInt(Integer::parseInt).toArray(); // ++ legger til etter at linjen er kjørt
			}
			bufferedReader.close();
			String s = "Maze:\n";
			for(int i=0;i<row;i++) {
				s += Arrays.toString(mazeMap[i]) + "\n";
			}
			
			System.out.println(s);
			
		} catch (FileNotFoundException e) {
			System.out.println("Unable to open the file: " + fileName);
		} catch (IOException ex) {
			ex.printStackTrace();
		}
		return mazeMap;
	}

	
}
