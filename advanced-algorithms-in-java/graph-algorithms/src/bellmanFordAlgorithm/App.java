package bellmanFordAlgorithm;

import java.util.ArrayList;
import java.util.List;

public class App {
	
	/**
	 * Bellman-Ford algorithm : O(E*V)
	 * Dijkastra method: O(E+V*logV)
	 * DAG shortest path method: O(E+V)
	 *
	 */
	
	public static void main(String[] args) {
		System.out.println("Run example 1");
		ex1();
		
		System.out.println(" \n Run example 2");
		ex2NegativeEdgeWeightCycles();
	}
	
	private static void ex1() {
		List<Vertex> vertexList = new ArrayList<>();		
		vertexList.add(new Vertex(1));
		vertexList.add(new Vertex(2));
		vertexList.add(new Vertex(3));
		vertexList.add(new Vertex(4));
		vertexList.add(new Vertex(5));
		List<Edge> edgeList = new ArrayList<>();
		edgeList.add(new Edge(vertexList.get(0),vertexList.get(1),5));
		edgeList.add(new Edge(vertexList.get(0),vertexList.get(3),-4));
		edgeList.add(new Edge(vertexList.get(0),vertexList.get(2),8));
		edgeList.add(new Edge(vertexList.get(1),vertexList.get(0),-2));
		edgeList.add(new Edge(vertexList.get(2),vertexList.get(1),-3));
		edgeList.add(new Edge(vertexList.get(2),vertexList.get(3),9));
		edgeList.add(new Edge(vertexList.get(3),vertexList.get(1),7));
		edgeList.add(new Edge(vertexList.get(4),vertexList.get(0),6));
		edgeList.add(new Edge(vertexList.get(4),vertexList.get(2),7));
		
		BellmanFord bellmannFordAlgorithm = new BellmanFord(vertexList,edgeList);
		bellmannFordAlgorithm.bellmanFord(vertexList.get(4),vertexList.get(3));
	}
	
	private static void ex2NegativeEdgeWeightCycles() {
		List<Vertex> vertexList = new ArrayList<>();
		vertexList.add(new Vertex("A"));
		vertexList.add(new Vertex("B"));
		vertexList.add(new Vertex("C"));
		
		List<Edge> edgeList = new ArrayList<>();
		edgeList.add(new Edge(vertexList.get(0),vertexList.get(1),1));
		edgeList.add(new Edge(vertexList.get(1),vertexList.get(2),-1));
		edgeList.add(new Edge(vertexList.get(2),vertexList.get(0),-11));
		BellmanFord bellmannFordAlgorithm = new BellmanFord(vertexList,edgeList);
		bellmannFordAlgorithm.bellmanFord(vertexList.get(0),vertexList.get(2));
	}

}
