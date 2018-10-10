package MazeSolver;

import java.io.*;


public class FileReaderMaze {
	
	private void readMaze(String fileName, int col, int row) {
		String line = null;
		
		try {
			int[][] mazeMap = new int[col][row];
			
			FileReader fileReader = new FileReader(fileName);
			
			//Wrap reader in bufferReader (!)
			BufferedReader bufferedReader = new BufferedReader(fileReader);
			while((line = bufferedReader.readLine()) != null) {
				String[] lines = line.split("\\s+");
				
			}
			bufferedReader.close();
		} catch (FileNotFoundException e) {
			System.out.println("Unable to open the file: " + fileName);
		} catch (IOException ex) {
			ex.printStackTrace();
		}
	}

	public static void main(String[] args) {
		FileReaderMaze frm = new FileReaderMaze();
		frm.readMaze("C:\\Users\\vvovv\\eclipse-workspace\\AlgDatSommer\\src\\MazeSolver\\maze1.txt",5,5);
	}
}
