package ParcialArbolesG;

import tp02.ListaEnlazadaGenerica;
import tp02.ListaGenerica;
import tp04.GeneralTree;

public class Parcial2 {
	
	private GeneralTree<Integer> arbol;
	
	public Parcial2 (GeneralTree<Integer> arbol) {
		this.arbol = arbol;
	}
	
	public ListaGenerica<Integer> resolver(){
		ListaGenerica<Integer> l = new ListaEnlazadaGenerica<Integer>();
		
		postOrden (arbol,l);
		
		return l;
	}
	
	private void postOrden (GeneralTree<Integer> a, ListaGenerica<Integer> l) {
		Integer suma = 0;
		Boolean ok = false;
		
		if (a.hasChildren()) {
			ListaGenerica<GeneralTree<Integer>> hijos = a.getChildren();
			while (!hijos.fin()) {
				GeneralTree<Integer> aux = hijos.proximo();
				if ((hijos.tamanio()%2) == 1) {
					ok = true;
					suma+= aux.getData();
				}
				postOrden(aux,l);
				}
			}
		if (!a.isLeaf()) {
			if (ok) {
				l.agregarFinal(suma);
			}
		}
		
	}

}