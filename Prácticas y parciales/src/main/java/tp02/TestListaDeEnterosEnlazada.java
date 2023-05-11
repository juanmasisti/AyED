/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package tp02;

/**
 *
 * @author Juanma
 */
public class TestListaDeEnterosEnlazada {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        ListaDeEnterosEnlazada lista = new ListaDeEnterosEnlazada();
        int i;
        for (i=0;i<=2;i++){
            lista.agregarFinal(i+1);
            System.out.println("Posicion " + i +": " + lista.elemento(i+1));
        }
        System.out.println("Tamaño de la lista: " + lista.tamanio());
    }
    
}
