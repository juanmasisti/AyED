
package Parcial1;

import tp02.ListaEnlazadaGenerica;
import tp02.ListaGenerica;
import tp04.ArbolGeneral;


public class AGCaminosPares {
	
	public ListaGenerica<ListaGenerica<Character>> caminosPares (ArbolGeneral<Character> arbol){
		ListaGenerica<ListaGenerica<Character>> lista = new ListaEnlazadaGenerica<ListaGenerica<Character>>();
		int cantidad = 0;
		ListaGenerica<Character> listaNormal = new ListaEnlazadaGenerica<Character>();
		listaNormal.agregarInicio(arbol.getDato());
		caminosPares(cantidad,arbol,lista,listaNormal);
		return lista;
		
		
	}
	
	private void caminosPares(int cantidad,ArbolGeneral<Character> arbol,ListaGenerica<ListaGenerica<Character>> lista,
			ListaGenerica<Character> listaNormal) {
		cantidad = cantidad + 1;
		if (arbol.esHoja()) {
			if (cantidad % 2 == 0) {
				lista.agregarFinal(listaNormal.clonar());
			}
		}
		if (arbol.tieneHijos()) {
			ListaGenerica<ArbolGeneral<Character>> hijos = arbol.getHijos(); 
			hijos.comenzar(); // Lista con los hijos del nodo .
			while (!hijos.fin()) {
				ArbolGeneral<Character> aux = hijos.proximo(); // Va avanzanzo de hijo mientras siga habiendo.
				listaNormal.agregarFinal(aux.getDato());				
				caminosPares(cantidad,aux,lista,listaNormal);				
				listaNormal.eliminarEn(listaNormal.tamanio());	// Elimina ultimo elemento.
			}
		}
		
	}
}
