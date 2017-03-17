package breathFirstSearch.firstExample;

public class App {
	
	public static void main(String[] args) {
		BFS bfs = new BFS();
		System.out.println("Run Breath First Search Ex1");
		bfs.bfs(ex1());
		System.out.println("Run Breath First Search Ex2");
		bfs.bfs(ex2());
	}

	private static Vertex ex1() {
		Vertex vertex1 = new Vertex(1);
		Vertex vertex2 = new Vertex(2);
		Vertex vertex3 = new Vertex(3);
		Vertex vertex4 = new Vertex(4);
		Vertex vertex5 = new Vertex(5);
		
		vertex1.addNeighbour(vertex2);
		vertex1.addNeighbour(vertex4);
		vertex4.addNeighbour(vertex5);
		vertex2.addNeighbour(vertex3);
		return vertex1;
	}
	
	private static Vertex ex2() {
		Vertex vertex1 = new Vertex(1);
		Vertex vertex2 = new Vertex(2);
		Vertex vertex3 = new Vertex(3);
		Vertex vertex4 = new Vertex(4);
		Vertex vertex5 = new Vertex(5);
		
		vertex1.addNeighbour(vertex4);
		vertex1.addNeighbour(vertex2);
		vertex4.addNeighbour(vertex5);
		vertex2.addNeighbour(vertex3);
		return vertex1;
	}
}
