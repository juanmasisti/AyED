package ParcialArbolesB;

import tp03.BinaryTree;

public class parcial1 {
	public Integer sumaImparesPosOrderMayorA(BinaryTree<Integer> ab, int limite) {
		Integer suma = 0;
		if (!ab.isEmpty()) {
			if (ab.hasLeftChild()) {
				suma += sumaImparesPosOrderMayorA(ab.getLeftChild(),limite);
			}
			if (ab.hasRightChild()) {
				suma += sumaImparesPosOrderMayorA(ab.getRightChild(),limite);
			}
			if ((ab.getData()%2!=0) && (ab.getData()>limite)){
				suma += ab.getData();
			}
			return suma;
		}
		return -1;
	}
}
