package dephFirstSearch;

import java.util.List;
import java.util.Stack;

public class DFS {

	private Stack<Vertex> stack;
	
	public DFS() {
		this.stack = new Stack<>();
	}
	
	public void dfsEx1(List<Vertex> vertexList){
		for(Vertex v : vertexList){
			if (!v.isVisited()){
				v.setVisited(true);
				dfsWithVertex(v);
			}
		}
	}
	
	public void dfsEx2(List<Vertex> vertexList){
		for(Vertex v : vertexList){
			if (!v.isVisited()){
				v.setVisited(true);
				dfsRecursive(v);
			}
		}
	}
	
	private void dfsRecursive(Vertex rootVertex){
		System.out.println(rootVertex+" ");
		for(Vertex vertex : rootVertex.getNeighbourList()){
			if(!vertex.isVisited()){
				vertex.setVisited(true);
				dfsRecursive(vertex);
			}
		}
	}

	private void dfsWithVertex(Vertex rootVertex) {
		this.stack.add(rootVertex);
		rootVertex.setVisited(true);
		while(!stack.isEmpty()){
			Vertex actulVertex = this.stack.pop();
			System.out.println(actulVertex+" ");
			
			for(Vertex v : actulVertex.getNeighbourList()){
				if(!v.isVisited()){
					v.setVisited(true);
					this.stack.push(v);
				}
			}
		}
		
	}
}
