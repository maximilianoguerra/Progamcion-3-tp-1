
public class Ejercicio6 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		ArbolBinario nuevoArbol = new  ArbolBinario();
		nuevoArbol.insert(15);
		nuevoArbol.insert(20);
		nuevoArbol.insert(9);
		nuevoArbol.insert(31);
		nuevoArbol.insert(3);
		nuevoArbol.insert(27);
		nuevoArbol.insert(12);
		nuevoArbol.insert(33);
		nuevoArbol.printPreOrder();
		System.out.println(nuevoArbol.hasElem(27));
		System.out.println(nuevoArbol.delete(27));
		System.out.println(nuevoArbol.hasElem(27));
//		nuevoArbol.printPreOrder();
		nuevoArbol.printOrder();
//		nuevoArbol.printPosOrder();
	}

}
