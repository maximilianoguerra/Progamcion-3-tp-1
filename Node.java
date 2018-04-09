
public class Node {
	private Object info;
	private Node next;
	private Node previous;

	public Node() {
		info = null;
		next = null;
		previous = null;
	}
	public Node(Object o, Node n) {
		setInfo(o);
		setNext(n);
		setPrevious(null);
	}
	public Node(Object o, Node n , Node p) {
		setInfo(o);
		setNext(n);
		setPrevious(p);
	}

	public void setPrevious(Node p) {
		// TODO Auto-generated method stub
		previous = p; 
	}

	public void setInfo(Object o) {
		info = o;
	}

	public void setNext(Node n) {
		next = n;
	}

	public Object getInfo() {
		return info;
	}

	public Node getNext() {
		return next;
	}
	public Node getPrevious() {
		return previous;
	}
}
