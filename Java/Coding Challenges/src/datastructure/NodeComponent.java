package datastructure;
import java.util.ArrayList;
public class NodeComponent {
	public ArrayList<NodeComponent> components;
	public int val;
	
	public NodeComponent() {
		components = new ArrayList<NodeComponent>();
	}
	
	public void node(int val) {
		this.val = val;
	}
	
}
