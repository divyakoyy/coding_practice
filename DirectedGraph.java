import java.util.HashMap;
import java.util.HashSet;
import java.util.Map;


public class DirectedGraph implements Graph {
	
	private Map<Node, HashSet<Node>> map;
	
	public DirectedGraph() {
		this.map = new HashMap<Node, HashSet<Node>>();
		
	}
	
	@Override
	 /**
    * add Node v to Node u's neighbors (u -> v)
    *
    * @param u and v the Nodes to be connected by a Graph edge
    */
	public void addEdge(Node u, Node v) {
		map.get(u).add(v);
	}

	@Override
	public HashSet<Node> getNeighbors(Node u) {
		return map.get(u);
	}


	@Override
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
