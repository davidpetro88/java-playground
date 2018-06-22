package dijkstra;

import java.util.PriorityQueue;

public class App {
	
	public static void main(String[] args) {
		System.out.println("Example 1");
		ex1();
		System.out.println("Example 2");
		ex2();
		System.out.println("Example testPriorityQueue");
		testPriorityQueue();
	}

	private static void testPriorityQueue() {
		Vertex vertex = new Vertex("A");
		vertex.setMinDistance(10);
		vertex.setName("TESTE");
		vertex.setVisited(false);
		System.out.println(vertex.getName() +" Visited :" + vertex.isVisited());
		
		PriorityQueue<Vertex> priorityQueue = new PriorityQueue<>();
		priorityQueue.add(vertex);
		
		Vertex actualVertex = priorityQueue.poll();
		priorityQueue.remove(actualVertex);
		actualVertex.setName("Change");
		actualVertex.setVisited(true);
		priorityQueue.add(actualVertex);
		
		System.out.println(vertex.getName() +" Visited :" + vertex.isVisited());
	}

	private static void ex1() {
		Vertex vertex0 = new Vertex("A");
		Vertex vertex1 = new Vertex("B");
		Vertex vertex2 = new Vertex("C");
		
		vertex0.addNeighbour(new Edge(1,vertex0,vertex1));
		vertex0.addNeighbour(new Edge(1,vertex0,vertex2));
		vertex1.addNeighbour(new Edge(1,vertex1,vertex2));
		
		ShortestPath shortestPath = new ShortestPath();
		shortestPath.computePaths(vertex0);
		
		System.out.println(shortestPath.getShortestPathTo(vertex2));
	}
	
	private static void ex2() {
		Vertex vertex0 = new Vertex("A");
		Vertex vertex1 = new Vertex("B");
		Vertex vertex2 = new Vertex("C");
		
		vertex0.addNeighbour(new Edge(1,vertex0,vertex1));
		vertex0.addNeighbour(new Edge(3,vertex0,vertex2));
		vertex1.addNeighbour(new Edge(1,vertex1,vertex2));
		
		ShortestPath shortestPath = new ShortestPath();
		shortestPath.computePaths(vertex0);
		
		System.out.println(shortestPath.getShortestPathTo(vertex2));
	}
}
