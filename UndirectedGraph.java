import java.util.HashMap;
import java.util.HashSet;

public class UndirectedGraph implements Graph {
	
	private HashMap<Node, HashSet<Node>> map;
	
	public UndirectedGraph() {
		this.map = new HashMap<Node, HashSet<Node>>();
		
	}

	@Override
	 /**
     * add Node u to Node v's neighbors, and add Node v to Node u's neighbors
     *
     * @param u and v the Nodes to be connected by a Graph edge
     */
	public void addEdge(Node u, Node v) {
		map.get(u).add(v);
		map.get(v).add(u);
	}


	@Override
	public HashSet<Node> getNeighbors(Node u) {
		return map.get(u);
	}

	@Override
	 /**
     * return true if u and v have an edge connecting them in the Graphs,
     * otherwise, return false.
     *
     * @param u and v the Nodes to check
     */
	public boolean isNeighbor(Node u, Node v) {
		if(map.get(u).contains(v)){
			return true;
		}
		return false;
	}

	@Override
	public void removeNode(Node u) {
		map.remove(u);
		for(Node n: map.keySet()) {
			if (map.get(n).contains(u)) {
				map.get(n).remove(u);
			}
		}
		
	}

	@Override
	public void removeEdge(Node u, Node v) {
		map.get(u).remove(v);
		map.get(v).remove(u);
		
	}

	@Override
	public void traverseDFS(Node u) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void traverseBFS(Node u) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public HashSet<Node> getSourceNodes() {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public HashSet<Node> getSinkNodes() {
		// TODO Auto-generated method stub
		return null;
	}

}
