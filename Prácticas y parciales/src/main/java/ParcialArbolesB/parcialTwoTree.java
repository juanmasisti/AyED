package ParcialArbolesB;

import tp03.BinaryTree;

//Escribir en una clase ParcialArboles que contiene UNA UNICA variable de instancia de tipo ArbolBinario de valores enteros NO repetidos. 
//El metodo publico debe tener la siguiente firma: public Boolean isTwoTree (int num)
//El metodo devuelve true si el subarbol cuya raiz es "num", tiene en su subarbol izquierdo la misma cantidad de arboles con dos hijos que en su subarbol derecho. 
//Y Falso en caso contrario.
//Consideraciones: Si num no se encuentra en el arbol devuelve false.
//Si el arbol con razin "num" no cuenta con una de sus ramas, considere que en esa rama hay -1 arboles con dos hijos

public class parcialTwoTree {
	private BinaryTree<Integer> a;
	
	public boolean isTwoTree(int num) {
	    return resolver(a, num, false) == 2;
	}

	private int resolver(BinaryTree<Integer> a, int num, boolean corte) {
	        int cantizq = 0;
	        int cantder = 0; 

	        if (a.isLeaf())
	            return 0;

	        if (a.getData() == num)  {
	            corte = true;
	            if (a.hasLeftChild()) {
	                cantizq = resolver(a.getLeftChild(), num, corte);
	            }
	            if (a.hasRightChild()) {
	                cantder = resolver(a.getRightChild(), num, corte);
	            }
	        } else {
	            if (corte) {
	                if ((a.hasLeftChild()) && (a.hasRightChild())) {
	                    return resolver(a.getRightChild(), num, corte) + resolver(a.getLeftChild(), num, corte) + 1;
	                } else {
	                    if (a.hasRightChild()) {
	                      resolver(a.getRightChild(), num, corte);
	                    }
	                    if (a.hasLeftChild()) {
	                       resolver(a.getLeftChild(), num, corte);
	                    }
	                }
	            }
	        }

	        if (cantizq==cantder) {
	            return 2;
	        } else {
	            return 3;
	        }
	}
}
