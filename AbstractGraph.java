import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;

public abstract class AbstractGraph {
	
	protected List<Node> nodes;
	
	protected AbstractGraph() {
		nodes = new ArrayList<>();
		System.out.println(ret());
	}
	
	abstract void addEdge(Node u, Node v);
	
	abstract void addEdge(Node u);
	
	abstract HashSet<Node> getNeighbors(Node u);

	abstract boolean isNeighbor(Node u, Node v);
	
	abstract void removeNode(Node u);
	
	abstract void removeEdge(Node u, Node v);
	
	abstract void traverseDFS(Node u);
	
	abstract void traverseBFS(Node u);
	
	abstract HashSet<Node> getSourceNodes();
	
	abstract HashSet<Node> getSinkNodes();
	
	int foo() {
		return Integer.parseInt(ret());
	}
	
	private String ret() {
		return "38472";
	}

}
