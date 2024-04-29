package ParcialArbolesG;

import tp02.ListaEnlazadaGenerica;
import tp02.ListaGenerica;
import tp04.GeneralTree;

public class Parcial3 {
	private GeneralTree<Integer> arbol;

	public Parcial3 (GeneralTree<Integer> arbol) {
		this.arbol = arbol;
	}
	
	public ListaGenerica<Integer> devolverCamino(){
		ListaGenerica<Integer> l = new ListaEnlazadaGenerica<Integer>();
		ListaGenerica<Integer> camino = new ListaEnlazadaGenerica<Integer>();
		resolver(arbol,l,camino);
		return camino;
	} 
	
	private void resolver(GeneralTree<Integer> a,ListaGenerica<Integer> l, ListaGenerica<Integer> camino) {
		if (!a.isEmpty()) {
			l.agregarFinal(a.getData());
			if(a.isLeaf()) {
				if(l.tamanio() > camino.tamanio())
					clonar(l,camino);
			}
			else{
				ListaGenerica<GeneralTree<Integer>> hijos = a.getChildren();
				hijos.comenzar();
				while(!hijos.fin()) {
					resolver(hijos.proximo(),l,camino);
					l.eliminarEn(l.tamanio());
				}
			}
		}
	}
	
	
	private void clonar (ListaGenerica<Integer> l, ListaGenerica<Integer> camino) {
		camino.comenzar();
		while(!camino.fin())
			camino.eliminar(camino.proximo());
		l.comenzar();
		while(!l.fin())
			camino.agregarFinal(l.proximo());
			
	}
	
}