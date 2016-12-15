import java.util.HashSet;

public interface Graph {
	
	void addEdge(Node u, Node v);
	
	HashSet<Node> getNeighbors(Node u);

	boolean isNeighbor(Node u, Node v);
	
	void removeNode(Node u);
	
	void removeEdge(Node u, Node v);
	
	void traverseDFS(Node u);
	
	void traverseBFS(Node u);
	
	HashSet<Node> getSourceNodes();
	
	HashSet<Node> getSinkNodes();
	
	default int foo() {
		return 0;
	}
		
}
