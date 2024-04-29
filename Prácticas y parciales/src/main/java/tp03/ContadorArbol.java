package tp03;

import tp02.ListaEnlazadaGenerica;
import tp02.ListaGenerica;

public class ContadorArbol {
	private BinaryTree<Integer> dato;
	
	public ContadorArbol(BinaryTree<Integer> dato) {
		this.dato = dato;
	}
	
	public ListaGenerica<Integer> numerosPares(){
		ListaGenerica<Integer> lista = new ListaEnlazadaGenerica<Integer>();
		contarParesPostOrden(lista,dato);
		//contarParesInOrden(lista,dato);
		return lista;
	}
	
	private void contarParesInOrden(ListaGenerica<Integer> lista,BinaryTree<Integer>arbol) {
		if (arbol.hasLeftChild())
			contarParesInOrden(lista,arbol.getLeftChild());
		if (arbol.getData() % 2 == 0)
			lista.agregarFinal(arbol.getData());
		if (arbol.hasRightChild())
			contarParesInOrden(lista,arbol.getRightChild());
	}

	private void contarParesPostOrden(ListaGenerica<Integer> lista,BinaryTree<Integer>arbol) {
		if (arbol.hasLeftChild())
			contarParesPostOrden(lista,arbol.getLeftChild());
		if (arbol.hasRightChild())
			contarParesPostOrden(lista,arbol.getRightChild());
		if (arbol.getData() % 2 == 0)
			lista.agregarFinal(arbol.getData());
	}
}
