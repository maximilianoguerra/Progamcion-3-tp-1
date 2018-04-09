import java.util.LinkedList;

public class practico1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Timer time=new Timer();
		time.start();
		MySimpleLinkedList listaPractica1=new MySimpleLinkedList();
		MySimpleLinkedList listaPractica2=new MySimpleLinkedList();
		MySimpleLinkedList listaPractica3=new MySimpleLinkedList();
//		insertN(listaPractica,5);
//		listaPractica1.insert(7);
//		listaPractica1.insert(70);
//		listaPractica1.insert(60);
//		listaPractica1.insert(50);
//		listaPractica1.insert(5);
//		listaPractica1.insert(3);
//		
//		listaPractica2.insert(3);
//		listaPractica2.insert(800);
//		listaPractica2.insert(60);
//		listaPractica2.insert(40);
//		listaPractica2.insert(5);
//		listaPractica2.insert(7);

		 listaPractica1.insert(2);
		listaPractica1.insert(8);
		listaPractica1.insert(1);
		listaPractica1.insert(3);
		listaPractica1.insert(7);
		listaPractica1.insert(9);

		listaPractica2.insert(2);
		listaPractica2.insert(3);
		listaPractica2.insert(7);
		listaPractica2.insert(8);
		listaPractica2.insert(1);
		listaPractica2.insert(4);

		
		buscarComunes(listaPractica3,listaPractica1,listaPractica2);
//		buscarDifEnListas(listaPractica3,listaPractica1,listaPractica2);
//		System.out.println(listaPractica1.buscarPosMaximo());
		listaPractica3.print();
		System.out.println(time.stop());
	}
	public static void insertN(MySimpleLinkedList listaPractica,int n){
		for (int i = 0; i < n; i++) {
			listaPractica.insert(i);
		}
		
	}

	/*metodo solictado ejercicio 5 a y b*/
	public static void buscarComunes(MySimpleLinkedList listaConComunes,MySimpleLinkedList lista1,MySimpleLinkedList lista2){
		for (int i = 0; i < lista1.size(); i++) {
			Object aux=lista1.getNodo();
			int j = 0;
			while(j < lista2.size()) {
				Object aux2=lista2.getNodo();
					if(aux.equals(aux2)){
						listaConComunes.insertarOrdenado(aux);/*para el caso b si las dos listas estan ordenadas cambiamos el metodo a un insertar normal o insertar al final */
						j=lista2.size();
					}
					j++;
				}
				lista2.resetCursor();
			}
	}
	/*metodo solicitado en el ejercicio 6*/
	public static void buscarDifEnListas(MySimpleLinkedList listaConDif,MySimpleLinkedList lista1,MySimpleLinkedList lista2) {
		for (int i = 0; i < lista1.size(); i++) {
			boolean exit=false;
			Object aux=lista1.getNodo();
			int j = 0;
			while((j < lista2.size())&&(!exit)) {
				Object aux2=lista2.getNodo();
					if(aux.equals(aux2)){
						exit=true;
					}
					j++;
				}
			if(!exit) {
				listaConDif.insert(aux);
			}
			lista2.resetCursor();	
			}
	}
	/*metodo solicitado en ejercicio 9*/
	public static void buscarDifEnListasLinked(LinkedList listaConDif, LinkedList lista1, LinkedList lista2) {
		for (int i = 0; i < lista1.size(); i++) {
			boolean exit = false;
			Object aux = lista1.get(i);
			int j = 0;
			while ((j < lista2.size()) && (!exit)) {
				Object aux2 = lista2.get(j);
				if (aux.equals(aux2)) {
					exit = true;
				}
				j++;
			}
			if (!exit) {
				listaConDif.add(aux);
			}
		}
	}
}