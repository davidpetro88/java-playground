package mazeSolver;


public class App {

	public static void main(String[] args) {
		System.out.println("Mazor Solver Ex1");
		ex1();
		System.out.println("\n\n");
		System.out.println("Mazor Solver Ex2");
		ex2();
	}

	private static void ex1() {
		FileReader fileReader = new FileReader("mazorSolverMap.txt", 5, 5);
		fileReader.parseFile();
		MazeSolver mazeSolver = new MazeSolver(fileReader.getMap(),fileReader.getStartPositionRow(), fileReader.getStartPositionCol());
		mazeSolver.findWayOut();
	}
	
	private static void ex2() {
		FileReader fileReader = new FileReader("mapMazorWithoutSolution.txt", 5, 5);
		fileReader.parseFile();
		MazeSolver mazeSolver = new MazeSolver(fileReader.getMap(),fileReader.getStartPositionRow(),fileReader.getStartPositionCol());
		mazeSolver.findWayOut();
	}
}
