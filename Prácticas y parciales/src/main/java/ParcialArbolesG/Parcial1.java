package ParcialArbolesG;

import tp02.ListaEnlazadaGenerica;
import tp02.ListaGenerica;
import tp04.GeneralTree;

public class Parcial1 {
	
	public ListaGenerica<ListaGenerica<Character>> caminosPares (GeneralTree<Character> arbol){
		ListaGenerica<ListaGenerica<Character>> lista = new ListaEnlazadaGenerica<ListaGenerica<Character>>();
		int cantidad = 0;
		ListaGenerica<Character> listaNormal = new ListaEnlazadaGenerica<Character>();
		listaNormal.agregarInicio(arbol.getData());
		caminosPares(cantidad,arbol,lista,listaNormal);
		return lista;
		
		
	}
	
	private void caminosPares(int cantidad,GeneralTree<Character> arbol,ListaGenerica<ListaGenerica<Character>> lista,
		ListaGenerica<Character> listaNormal) {
		cantidad = cantidad + 1;
		if (arbol.isLeaf()) {
			if (cantidad % 2 == 0) {
				lista.agregarFinal(listaNormal.clonar());
			}
		}
		if (arbol.hasChildren()) {
			ListaGenerica<GeneralTree<Character>> hijos = arbol.getChildren(); 
			hijos.comenzar();
			while (!hijos.fin()) {
				GeneralTree<Character> aux = hijos.proximo();
				listaNormal.agregarFinal(aux.getData());				
				caminosPares(cantidad,aux,lista,listaNormal);				
				listaNormal.eliminarEn(listaNormal.tamanio());	
			}
		}
		
	}
}