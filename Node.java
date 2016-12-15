
public class Node {

	
	private String name;
	private int value;
	
	public Node(String name, int value){
		this.name = name;
		this.value = value;
	}

	public String getName() {
		return this.name;
	}
	
	public int getValue() {
		return this.value;
	}
	
	public int hashCode() {
		int hash = 7;
		hash *= 31 + (name == null ? 0 : name.hashCode());
		hash *= 31 + value;
		return hash;
	}
	
	public boolean equals(Node n) {
		if(this == n){
			return true;
		}
		if(this == null || n == null || this.getClass() != n.getClass()){
			return false;
		}
		
		return value == n.value && (name == n.name || name.equals(n.name));
		
	}
	
}
