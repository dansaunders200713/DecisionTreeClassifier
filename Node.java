import java.util.*;

public class Node {
	Node parent;
	ArrayList<Node> children;
	Variable data;
	String classification;
	boolean label;
	double prob;
	
	public Node(Variable data) {
		this.data = data;
		children = new ArrayList<Node>();
	}
	
	public Node(String classification) {
		this.classification = classification;
		children = new ArrayList<Node>();
	}
	
	public void add(boolean label, Node n) {
		children.add(n);
		n.label = label;
	}
	
	public Node get(boolean label) {
		for (Node n : children) {
			if (label == n.label) {
				return n;
			}
		}
		return null;
	}
	
	public String toString() {
		String toStr = "";
		if (classification != null) {
			return classification + " ";
		}
		for (Node n : children) {
			toStr += n.toString();
		}
		return toStr + this.data.toString();
	}
}
