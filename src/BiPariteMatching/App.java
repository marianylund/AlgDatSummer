package BiPariteMatching;

public class App {
	
	
	
	public static void main(String[] args) {
		String[] names = {"s", "Adam", "Sally", "Joe", "Kevin"
				, "Google", "Morgan Stanley", "ExxonMobil", "t"};
		int[][] capacities = 	{	{0,1,1,1,1,0,0,0,0}, 
									{0,0,0,0,0,1,1,0,0},
									{0,0,0,0,0,0,0,1,0},
									{0,0,0,0,0,0,1,0,0},
									{0,0,0,0,0,1,0,1,0},
									{0,0,0,0,0,0,0,0,1},
									{0,0,0,0,0,0,0,0,1},
									{0,0,0,0,0,0,0,0,1},
									{0,0,0,0,0,0,0,0,0}
								};
		FordFulk ff = new FordFulk(names, capacities);
		ff.getMaxFlowAndMatching();
		
	}
	
}
