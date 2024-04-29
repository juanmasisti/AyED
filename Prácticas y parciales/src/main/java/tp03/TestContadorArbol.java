package tp03;


import tp02.ListaGenerica;
import tp03.ContadorArbol;

public class TestContadorArbol {
    public static void main(String[] args) {
        // Creamos un árbol binario de ejemplo
    	BinaryTree<Integer> arbol = new BinaryTree<>(1);
        arbol.addLeftChild(new BinaryTree<>(2));
        arbol.addRightChild(new BinaryTree<>(3));
        arbol.getLeftChild().addLeftChild(new BinaryTree<>(4));
        arbol.getRightChild().addRightChild(new BinaryTree<>(5));

        // Creamos un objeto ContadorArbol con el árbol creado
        ContadorArbol contador = new ContadorArbol(arbol);

        // Probamos el método numerosPares()
        ListaGenerica<Integer> pares = contador.numerosPares();
        System.out.println("Números pares encontrados:");
        while (!pares.fin()) {
            System.out.println(pares.proximo());
        }
    }
}
