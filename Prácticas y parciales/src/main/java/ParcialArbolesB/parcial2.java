package ParcialArbolesB;

import tp02.ListaEnlazadaGenerica;
import tp02.ListaGenerica;
import tp03.BinaryTree;

public class parcial2 {
	public ListaGenerica<Integer> resolver(BinaryTree<Integer> arbol){
		ListaGenerica<Integer> l = new ListaEnlazadaGenerica<Integer>();
		resolver(arbol,l);
		return l;
	}
	
	private Integer resolver(BinaryTree<Integer> a, ListaGenerica<Integer> l) {
		int cant = 0;
		int cantizq = 0;
		int cantder = 0;
		
		if (a.isLeaf())
			l.agregarFinal(a.getData());
		else {
			if (a.hasLeftChild()) {
				cantizq+= resolver(a.getLeftChild(), l);
				cant+= cantizq;
			}
			if (a.hasRightChild()) {
				cantder+= resolver(a.getRightChild(), l);
				cant+=cantder;
			}
			if (cantder == cantizq) 
				l.agregarFinal(a.getData());
		}
		return cant + 1;
	}
}
