package tp03;

import tp02.ColaGenerica;

public class BinaryTree<T> {
    private T data;
    private BinaryTree<T> leftChild;
    private BinaryTree<T> rightChild;
    
    public BinaryTree(T data) {
        this.data = data;
    }
    
    
    public T getData() {
		return data;
	}

	public void setData(T data) {
		this.data = data;
	}

	public BinaryTree<T> getLeftChild() {
        if (this.leftChild == null) {
            throw new NullPointerException("El árbol no tiene hijo izquierdo.");
        }
        return this.leftChild;
    }
    
    public BinaryTree<T> getRightChild() {
        if (this.rightChild == null) {
            throw new NullPointerException("El árbol no tiene hijo derecho.");
        }
        return this.rightChild;
    }
    
    public void addLeftChild(BinaryTree<T> child) {
        if (this.leftChild != null) {
            throw new IllegalStateException("El árbol ya tiene un hijo izquierdo.");
        }
        this.leftChild = child;
    }
    
    public void addRightChild(BinaryTree<T> child) {
        if (this.rightChild != null) {
            throw new IllegalStateException("El árbol ya tiene un hijo derecho.");
        }
        this.rightChild = child;
    }
    
    public void removeLeftChild() {
        this.leftChild = null;
    }
    
    public void removeRightChild() {
        this.rightChild = null;
    }
    
    public boolean isEmpty() {
        return this.data == null;
    }
    
    public boolean isLeaf() {
        return this.leftChild == null && this.rightChild == null;
    }
    
    public boolean hasLeftChild() {
        return this.leftChild != null;
    }
    
    public boolean hasRightChild() {
        return this.rightChild != null;
    }


	@Override
	public String toString() {
		return this.getData().toString();
	}

	

	public int contarHojas() {
		int cantHojas = 0;
		if (this.isLeaf()) 
			return 1;
		else {
		if (this.hasLeftChild()) 
			cantHojas += this.getLeftChild().contarHojas();
		if (this.hasRightChild()) 
			cantHojas += this.getRightChild().contarHojas();
		}

		return cantHojas;
	} 

	
    public BinaryTree<T> espejo() {
    	
    	BinaryTree <T> espejo = new BinaryTree<T> (this.getData());
		
		if (this.hasLeftChild()) {
			espejo.addRightChild(this.getLeftChild().espejo());
		}
		if (this.hasRightChild()) {
			espejo.addLeftChild(this.getRightChild().espejo());
		}
		
	    return espejo;

    }
    


	public void entreNiveles(int n, int m){
		BinaryTree<T> arbol;
		ColaGenerica<BinaryTree<T>> cola = new ColaGenerica<BinaryTree<T>>();
		cola.encolar(this);
		cola.encolar(null);
		int nivel = 0;
		while ((!cola.esVacia()) && (nivel <= m)) {
			arbol = cola.desencolar();
			if (arbol!= null){
				if (nivel >= n)
					System.out.println(arbol.getData());
				if (arbol.hasLeftChild())
					cola.encolar(arbol.getLeftChild());
				if (arbol.hasRightChild())
					cola.encolar(arbol.getRightChild());
			} else if (!cola.esVacia()) {
				cola.encolar(null);
				nivel++;	
			}
		}
	 	
	}
}
