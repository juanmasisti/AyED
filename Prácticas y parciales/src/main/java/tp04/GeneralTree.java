package tp04;

import tp02.ColaGenerica;
import tp02.ListaEnlazadaGenerica;
import tp02.ListaGenerica;

public class GeneralTree<T> {

	private T dato;
	private ListaGenerica<GeneralTree<T>> hijos = new ListaEnlazadaGenerica<GeneralTree<T>>();

	public T getData() {
		return dato;
	}

	public void setData(T dato) {
		this.dato = dato;
	}

	public void setChildren(ListaGenerica<GeneralTree<T>> hijos) {
		if (hijos==null)
			this.hijos = new ListaEnlazadaGenerica<GeneralTree<T>>();
		else
			this.hijos = hijos;
	}

	public GeneralTree(T dato) {
		this.dato = dato;
	}

	public GeneralTree(T dato, ListaGenerica<GeneralTree<T>> hijos) {
		this(dato);
		if (hijos==null)
			this.hijos = new ListaEnlazadaGenerica<GeneralTree<T>>();
		else
			this.hijos = hijos;
	}

	public ListaGenerica<GeneralTree<T>> getChildren() {
		return this.hijos;
	}

	public void addChild(GeneralTree<T> unHijo) {

		this.getChildren().agregarFinal(unHijo);
	}

	public boolean isLeaf() {

		return !this.hasChildren();
	}
	
	public boolean hasChildren() {
		return !this.hijos.esVacia();
	}
	
	public boolean isEmpty() {

		return this.dato == null && !this.hasChildren();
	}

	

	public void removeChild(GeneralTree<T> hijo) {
		if (this.hasChildren()) {
			ListaGenerica<GeneralTree<T>> hijos = this.getChildren();
			if (hijos.incluye(hijo)) 
				hijos.eliminar(hijo);
		}
	}
	
	
public ListaGenerica<T> numerosImparesMayoresQuePreOrden (Integer n){
		ListaGenerica<T> l = new ListaEnlazadaGenerica<T>();
		if (this.getData().getClass().getSimpleName().equals("Integer")) {
			numerosImparesMayoresQuePreOrden(n,l);
		}
		return l;
	}
	
	private void numerosImparesMayoresQuePreOrden (Integer n,ListaGenerica<T> l){
		int num = (int) this.getData();
		if (((num % 2) == 1) && (num > n )) 
			l.agregarFinal(this.getData());
		if(this.hasChildren()) {
			ListaGenerica <GeneralTree<T>> lhijos = this.getChildren();
			lhijos.comenzar();
			while (!lhijos.fin()) 
				lhijos.proximo().numerosImparesMayoresQuePreOrden(n,l);
		}
	}
	
	public ListaGenerica<T> numerosImparesMayoresQueInOrden (Integer n){
		ListaGenerica<T> l = new ListaEnlazadaGenerica<T>();
		if (this.getData().getClass().getSimpleName().equals("Integer")) {
			numerosImparesMayoresQueInOrden(n,l);
		}
	return l;
	}
	
	private void numerosImparesMayoresQueInOrden (Integer n,ListaGenerica<T> l){
		if (this.hasChildren()) {
			ListaGenerica <GeneralTree<T>> lhijos = this.getChildren();
			lhijos.comenzar();
			lhijos.proximo().numerosImparesMayoresQueInOrden(n,l);
		}
		int num = (int) this.getData();
		if (((num % 2) == 1) && (num > n )) 
			l.agregarFinal(this.getData());
		if(this.hasChildren()) {
			ListaGenerica <GeneralTree<T>> lhijos = this.getChildren();
			while (!lhijos.fin()) 
				lhijos.proximo().numerosImparesMayoresQuePreOrden(n,l);
		}
	}
	
	public ListaGenerica<T> numerosImparesMayoresQuePostOrden (Integer n){
		ListaGenerica<T> l = new ListaEnlazadaGenerica<T>();
		if (this.getData().getClass().getSimpleName().equals("Integer")) // if (object instanceof Integer)
		{
			numerosImparesMayoresQuePostOrden(n,l);
		}
	return l;
	}
	
	private void numerosImparesMayoresQuePostOrden (Integer n,ListaGenerica<T> l){
		if(this.hasChildren()) {
			ListaGenerica <GeneralTree<T>> lhijos = this.getChildren();
			lhijos.comenzar();
			while (!lhijos.fin()) 
				lhijos.proximo().numerosImparesMayoresQuePostOrden(n,l);
		}
		int num = (int) this.getData();
		if (((num % 2) == 1) && (num > n )) 
			l.agregarFinal(this.getData());
		
	}

	
	public ListaGenerica<T> numerosImparesMayoresQuePorNiveles(Integer n){
		ListaGenerica<T> l = new ListaEnlazadaGenerica<T>();
		if (this.getData().getClass().getSimpleName().equals("Integer")) {
			int num = (int) this.getData();
			ColaGenerica<GeneralTree<T>> cola = new ColaGenerica<GeneralTree<T>>();
			GeneralTree<T> aux;
			
			cola.encolar(this);
			cola.encolar(null);
			
			while(!cola.esVacia()) {
				aux = cola.desencolar();
				if (aux!= null) {
					num = (int) aux.getData();
					if (((num % 2) == 1) && (num > n )) 
						l.agregarFinal(aux.getData());
					if (aux.hasChildren()) {
						ListaGenerica<GeneralTree<T>> lhijos = aux.getChildren();
						lhijos.comenzar();
						while (!lhijos.fin()) {
							cola.encolar(lhijos.proximo());
						}
						
					}
				}
				else
					if (!cola.esVacia())
						cola.encolar(null);		
			}
		}
		return l;
	}

	
	public Integer altura() {
		int altura=-1;
		if (this.isLeaf())
			return 0;
		if (this.hasChildren()) {
			ListaGenerica<GeneralTree<T>> lhijos = this.getChildren();
			lhijos.comenzar();
			while (!lhijos.fin())
				altura = Math.max(altura,lhijos.proximo().altura());
		}
		return altura + 1;
	}

	public Integer nivel(T dato) {
		ColaGenerica<GeneralTree<T>> cola = new ColaGenerica<GeneralTree<T>>();
		GeneralTree<T> aux;
		
		cola.encolar(this);
		cola.encolar(null);
		
		int nivel = 0;
		
		while (!cola.esVacia()) {
			aux = cola.desencolar();
			if (aux != null) {
				if (aux.getData() == dato)
					return nivel;
				if (aux.hasChildren()) {
					ListaGenerica<GeneralTree<T>> lhijos = aux.getChildren();
					lhijos.comenzar();
					while (!lhijos.fin()){
						cola.encolar(lhijos.proximo());
					}
				}
			}
			else
				if (!cola.esVacia()) {			
					cola.encolar(null);
					nivel++;
				}
		}
		return -1;
	}

	public Integer ancho() {
		ColaGenerica<GeneralTree<T>> cola = new ColaGenerica<GeneralTree<T>>();
		GeneralTree<T> aux;
		
		cola.encolar(this);
		cola.encolar(null);
		
		int cantidad=0,max = -1,nivel = 0;
		
		while (!cola.esVacia()) {
			aux = cola.desencolar();
			if (aux != null) {
				cantidad++;
				if (aux.hasChildren()) {
					ListaGenerica<GeneralTree<T>> lhijos = aux.getChildren();
					lhijos.comenzar();
					while (!lhijos.fin())
						cola.encolar(lhijos.proximo());
				}
			}
			else {					
				if(cantidad > max)
					max = cantidad;
				cantidad=0;		
				if (!cola.esVacia()) {			
					cola.encolar(null);
					nivel++;

				}
			}
		}
		return max;
	}

	public Boolean esAncestro (T a,T b) {
		ListaGenerica<T> lista = new ListaEnlazadaGenerica<T>();
		ListaGenerica<T> camino = new ListaEnlazadaGenerica<T>();
		lista.agregarInicio(this.getData());
		esAncestro (a,b,lista,camino);
		if ((camino.incluye(a)) && (camino.incluye(b))){
			return true;
		}
		return false;	
	}
	
	public Boolean esAncestro2 (T a,T b) {
		return buscarA(a,b,this);
	}
	
	private Boolean buscarA (T a, T b, GeneralTree<T> arbol) {
		Boolean ok = false;
		if (arbol.getData() == a) {
			if (arbol.hasChildren()) {
				ListaGenerica <GeneralTree<T>> l = arbol.getChildren();
				l.comenzar();
				while((!l.fin())&& (!ok)) 
					ok = buscarB(a,b,l.proximo());
			}
		}
		if (arbol.hasChildren()) {
			ListaGenerica <GeneralTree<T>> l = arbol.getChildren();
			l.comenzar();
			while((!l.fin())&& (!ok)) 
				ok = buscarA(a,b,l.proximo());	
		}
	 return ok;
    }
	
	private Boolean buscarB (T a, T b,GeneralTree<T> arbol) {
		Boolean ok = false;
		if (arbol.getData() == b)
			return true;
		if (arbol.hasChildren()) {
			ListaGenerica <GeneralTree<T>> l = arbol.getChildren();
			l.comenzar();
			while((!l.fin())&& (!ok)) 
				ok = buscarB(a,b,l.proximo());
		}
	return ok;	
	}
	
	private void clonar(ListaGenerica<T> lista,ListaGenerica<T> camino) {
		lista.comenzar();
		while (!lista.fin()) {
			camino.agregarFinal(lista.proximo());
		}
	}

	private void esAncestro(T a, T b,ListaGenerica<T> lista,ListaGenerica<T> camino) {
		if (this.getData() == b) 
			clonar(lista,camino);
		if (camino.esVacia()){
			ListaGenerica<GeneralTree<T>> lhijos = this.getChildren();
			lhijos.comenzar();
			while ((!lhijos.fin()) && (camino.esVacia())){
					GeneralTree<T> aux = lhijos.proximo();
					lista.agregarFinal(aux.getData());
					aux.esAncestro(a,b,lista,camino);
					lista.eliminarEn(lista.tamanio());
				}
			}
		}
			
}
