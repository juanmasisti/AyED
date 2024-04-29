package ParcialArbolesG;

import tp02.ListaEnlazadaGenerica;
import tp02.ListaGenerica;
import tp04.GeneralTree;

public class ParcialFecha1 {
	GeneralTree<Integer> arbol;
	
	public ListaGenerica<Integer> camino(int num){
		ListaGenerica<Integer> l = new ListaEnlazadaGenerica<Integer>();
		ListaGenerica<Integer> lista = new ListaEnlazadaGenerica<Integer>();
		resolver(arbol,l,lista,num);
		return lista;
	} 
	
	private boolean resolver(GeneralTree<Integer> a, ListaGenerica<Integer> l, ListaGenerica<Integer> lista, int num) {
        boolean ok = false; // Variable de control local

        if (!a.isEmpty()) {
            if (a.getData() % 2 == 0) {
                l.agregarFinal(a.getData());
                if (a.isLeaf()) {
                    ok = clonar(l, lista);
                }
            }

            if (!ok && a.hasChildren()) {
                ListaGenerica<GeneralTree<Integer>> hijos = a.getChildren();
                hijos.comenzar();
                while (!hijos.fin() && !ok) {
                    ok = resolver(hijos.proximo(), l, lista, num);
                    l.eliminarEn(l.tamanio());
                }
            }
        }

        return ok;
    }
	
	
	private boolean clonar (ListaGenerica<Integer> l, ListaGenerica<Integer> camino) {
		camino.comenzar();
		while(!camino.fin())
			camino.eliminar(camino.proximo());
		l.comenzar();
		while(!l.fin())
			camino.agregarFinal(l.proximo());
		return true;
			
	}
	
}

