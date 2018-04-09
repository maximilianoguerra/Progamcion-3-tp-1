/*ejercico 7*/
public class MyDoubleLinkedList {
	protected Node first;
	protected int size;
	public MyDoubleLinkedList() {
	first = null;
	}
	public void insert(Object o) {
	Node tmp = new Node(o, null , null);
	tmp.setNext(first);
	first.setPrevious(tmp);
	first = tmp;
	size++;
	}
	public Object extract() {
		Node aux = first;
		first = first.getNext();
		first.setPrevious(null);
		return aux;
	}
	public void print() { 
		Node aux = first;
		for (int i = 0; i < this.size(); i++) {
			System.out.println(aux.getInfo());
			aux = aux.getNext();
		}
	}
	public boolean isEmpty() {
		return size==0;
	}
	public int size () {
		return size;
	}
}
