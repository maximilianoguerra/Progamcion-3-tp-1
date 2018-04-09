
public class MySimpleLinkedList {
	protected Node first;
	protected int size;
	protected Node cursor;

	public MySimpleLinkedList() {
		first = null;
	}

	public void insert(Object o) {
		Node tmp = new Node(o, null);
		tmp.setNext(first);
		first = tmp;
		cursor = first;
		size++;
	}
	public void insertarOrdenado(Object numeroLista2) {
		boolean exit = false;

		if (this.isEmpty()) {
			this.insert(numeroLista2);
		} else {
			while (!exit) {
				Node tmp = cursor;
				Object auxiliar = this.getNodo();
				Node tmp2 = new Node(numeroLista2, null);
				if (((int) numeroLista2 < (int) auxiliar) && (tmp == first)) {
					this.insert(numeroLista2);
					exit = true;
				} else if (((int) numeroLista2 > (int) auxiliar) && !(this.hasNext())) {
					tmp.setNext(tmp2);
					exit = true;
					size++;

				} else if (((int) numeroLista2 > (int) auxiliar)&& ((int) tmp.getNext().getInfo() > (int) numeroLista2)) {		
					tmp.setNext(tmp2);
					tmp2.setNext(cursor);
					exit = true;
					size++;

				}else if ((int) numeroLista2 == (int) auxiliar) {
					exit = true;
				}

			}

		}
		this.resetCursor();
	}

	// public void insertN(int n){
	// for (int i = 0; i < n; i++) {
	// insert(i);
	// }
	//
	// }
	public Object extract() {
		Node aux = first;
		first = first.getNext();
		return aux.getInfo();
	}

	public void print() {
		Node aux = first;
		for (int i = 0; i < this.size(); i++) {
			System.out.println(aux.getInfo());
			aux = aux.getNext();
		}
	}

	public boolean isEmpty() {
		return size == 0;
	}

	public int size() {
		return size;
	}

	public Object getNodo() {
		Node tmp = cursor;
		cursor = cursor.getNext();
		return tmp.getInfo();
	}
	/*metodo para ejercicio 4*/
	public int buscarPosMaximo() {
		int pos = 1;
		Node aux = first;
		Node aux2 = first.getNext();
		while (aux2.getNext() != null) {
			if ((int) aux.getInfo() < (int) aux2.getInfo()) {
				aux = aux2;
				aux2 = aux2.getNext();
				pos++;
			} else {
				aux2 = aux2.getNext();
			}
			if (aux2.getNext() == null) {
				if ((int) aux.getInfo() < (int) aux2.getInfo()) {
					pos++;
				}
			}
		}
		return pos;
	}

	public void resetCursor() {
		cursor = first;
	}

	public boolean hasNext() {
		return cursor != null;
	}

}