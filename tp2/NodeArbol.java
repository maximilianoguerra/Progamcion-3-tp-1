
public class NodeArbol {
	private int info;
	private NodeArbol nodeDer;
	private NodeArbol nodeIzq;

	public NodeArbol(int o) {
		info = o;
		nodeDer = null;
		nodeIzq = null;
	}

	public NodeArbol(int o, NodeArbol n , NodeArbol p) {
		setInfo(o);
		setNodeDer(n);
		setNodeIzq(p);
	}

	public void setNodeIzq(NodeArbol p) {
		// TODO Auto-generated method stub
		nodeIzq = p; 
	}

	public void setInfo(int o) {
		info = o;
	}

	public void setNodeDer(NodeArbol n) {
		nodeDer = n;
	}

	public int getInfo() {
		return info;
	}

	public NodeArbol getNodeDer() {
		return nodeDer;
	}
	public NodeArbol getNodeIzq() {
		return nodeIzq;
	}

	
}
