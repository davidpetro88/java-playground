package dagShortestPath;

import java.util.ArrayList;
import java.util.List;

public class App {

	/**
	 * 
	 * A legaltalanosabb algortimus: a Bellman-Ford -> O(E*V) nagyon lassu de robosztus...negativokat is kezelni tud
	 * Ha nem kellenek negativ elek -> jo a Dijkstra algoritmus is -> O(E+VlogV) time complexity dominal
	 * 	Meg ennel is leget gyorsabb, ha nem tartalmat cycleket ... DAG !!
	 * 		Ilyenkor -> O(E+V) lesz a time complexity
	 * 			pl.: Knapsack probelmet is vissza lehet vezetni egy ilyen DAG shortest path eljarasra
	 * 			
	 */
	
	public static void main(String[] args) {
		System.out.println("Run example 1");
		ex1();
		System.out.println(" \n Run example 2");
		ex2();

	}
	
	private static void ex1() {
		Vertex vertex0 = new Vertex("A");
		Vertex vertex1 = new Vertex("B");
		Vertex vertex2 = new Vertex("C");
		
		List<Vertex> vertexList = new ArrayList<>();
		vertexList.add(vertex0);
		vertexList.add(vertex1);
		vertexList.add(vertex2);
		
		vertex0.addNeighbour(new Edge(1, vertex0, vertex1));
		vertex0.addNeighbour(new Edge(10, vertex0, vertex2));
		vertex1.addNeighbour(new Edge(1, vertex1, vertex2));
		
		AcyclicShortestPath acyclicShortestPath = new AcyclicShortestPath();
		acyclicShortestPath.shortestPath(vertexList, vertex0, vertex2);
	}

	private static void ex2() {
		Vertex vertex0 = new Vertex("r");
		Vertex vertex1 = new Vertex("t");
		Vertex vertex2 = new Vertex("x");
		Vertex vertex3 = new Vertex("s");
		Vertex vertex4 = new Vertex("y");
		Vertex vertex5 = new Vertex("z");
		
		List<Vertex> vertexList = new ArrayList<>();
		vertexList.add(vertex0);
		vertexList.add(vertex1);
		vertexList.add(vertex2);
		vertexList.add(vertex3);
		vertexList.add(vertex4);
		vertexList.add(vertex5);
		
		vertex0.addNeighbour(new Edge(3, vertex0, vertex1));
		vertex0.addNeighbour(new Edge(5, vertex0, vertex3));
		
		vertex1.addNeighbour(new Edge(7, vertex1, vertex2));
		vertex1.addNeighbour(new Edge(4, vertex1, vertex4));
		vertex1.addNeighbour(new Edge(2, vertex1, vertex5));
		
		vertex2.addNeighbour(new Edge(-1, vertex2, vertex4));
		vertex2.addNeighbour(new Edge(1, vertex2, vertex5));
		
		vertex3.addNeighbour(new Edge(6, vertex3, vertex2));
		
		vertex4.addNeighbour(new Edge(-2, vertex4, vertex5));
		
		AcyclicShortestPath acyclicShortestPath = new AcyclicShortestPath();
		acyclicShortestPath.shortestPath(vertexList, vertex3, vertex0);
	}
}
