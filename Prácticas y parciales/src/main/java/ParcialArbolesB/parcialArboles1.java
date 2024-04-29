package ParcialArbolesB;

import tp03.BinaryTree;

public class parcialArboles1 {
	private BinaryTree<Integer> arbol;
	
	public parcialArboles1(BinaryTree<Integer> arbol){
		this.arbol = arbol;
	}
	
	public boolean isLeftTree(int num) {
		return contarArbolesUnicoHijo(arbol,num)>0;
	}
	
	private int contarArbolesUnicoHijo(BinaryTree<Integer> arbol, int num) {
		
        if (arbol.isEmpty())
            return -1;

        if (arbol.getData() == num) {
            int cantHijosUnicosIzq = contarHijosUnicos(arbol.getLeftChild());
            int cantHijosUnicosDer = contarHijosUnicos(arbol.getRightChild());
            return cantHijosUnicosIzq - cantHijosUnicosDer;
        }
        else
        	if (arbol.hasLeftChild())
        		contarArbolesUnicoHijo(arbol.getLeftChild(), num);
        	if (arbol.hasRightChild())
                contarArbolesUnicoHijo(arbol.getRightChild(), num);


        return 0;
    }

    private int contarHijosUnicos(BinaryTree<Integer> arbol) {
    	int cant = 0;
    
        if (tieneUnicoHijo(arbol))
            cant++;
        if(arbol.hasLeftChild())
        	cant += contarHijosUnicos(arbol.getLeftChild());
        if(arbol.hasRightChild())
        	cant += contarHijosUnicos(arbol.getRightChild());

        return cant;
    }

    private boolean tieneUnicoHijo(BinaryTree<Integer> arbol) {
        return (arbol.hasLeftChild() && !arbol.hasRightChild()) || (!arbol.hasLeftChild() && arbol.hasRightChild());
    }
}
