package datastructure;
import java.util.ArrayList;
public class NodeComponent {
	public ArrayList<NodeComponent> components;
	public int val;
	
	public NodeComponent(NodeComponent node) {
		components = new ArrayList<NodeComponent>(node);
	}
	
}
