package tp06;

import static junit.framework.Assert.assertEquals;
import static junit.framework.Assert.assertFalse;
import static junit.framework.Assert.assertTrue;
import tp02.ListaGenerica;

/**
 * @author juan
 *
 */
public class TestGrafoImplMatrizAdy{
	GrafoImplMatrizAdy<Integer> grafo;
	
	public void setUp() throws Exception {
		grafo = new GrafoImplMatrizAdy<Integer>(10);
	}

	public void testAgregarYeliminarVertice() {
		int tamAntes = grafo.listaDeVertices().tamanio();
		VerticeImplMatrizAdy<Integer> vert1 = new VerticeImplMatrizAdy<Integer>(1);
		VerticeImplMatrizAdy<Integer> vert2 = new VerticeImplMatrizAdy<Integer>(2);
		VerticeImplMatrizAdy<Integer> vert3 = new VerticeImplMatrizAdy<Integer>(3);
		grafo.agregarVertice(vert1);
		grafo.agregarVertice(vert2);
		grafo.agregarVertice(vert3);
		grafo.conectar(vert1, vert2);
		grafo.conectar(vert1, vert3);
		grafo.conectar(vert2, vert1);
		grafo.conectar(vert2, vert3);
		grafo.conectar(vert3, vert1);
		grafo.conectar(vert3, vert2);
		int tamDesp = grafo.listaDeVertices().tamanio();
		assertTrue(tamDesp == tamAntes+3);
		grafo.eliminarVertice(vert1);
		grafo.eliminarVertice(vert2);
		grafo.eliminarVertice(vert3);
		int tamFin = grafo.listaDeVertices().tamanio();
		assertTrue(tamFin == tamAntes);
	}

	public void testConectarYdesconectar() {
		VerticeImplMatrizAdy<Integer> vert1 = new VerticeImplMatrizAdy<Integer>(1);
		VerticeImplMatrizAdy<Integer> vert2 = new VerticeImplMatrizAdy<Integer>(2);
		grafo.agregarVertice(vert1);
		grafo.agregarVertice(vert2);
		grafo.conectar(vert1, vert2);
		boolean ok = false;
		ListaGenerica<Arista<Integer>> lista = grafo.listaDeAdyacentes(vert1);
		Arista<Integer> arista;
		lista.comenzar();
		while(!lista.fin()){
			arista = lista.proximo();
			if (arista.verticeDestino() == vert2){
				ok= true;
			}
		}
		assertTrue(ok);
		
		grafo.desConectar(vert1, vert2);
		ok=false;
		lista = grafo.listaDeAdyacentes(vert1);
		lista.comenzar();
		while(!lista.fin()){
			arista = lista.proximo();
			if (arista.verticeDestino() == vert2){
				ok= true;
			}
		}
		assertFalse(ok);
	}

	public void testEsAdyacente() {
		VerticeImplMatrizAdy<Integer> vert1 = new VerticeImplMatrizAdy<Integer>(1);
		VerticeImplMatrizAdy<Integer> vert2 = new VerticeImplMatrizAdy<Integer>(2);
		grafo.agregarVertice(vert1);
		grafo.agregarVertice(vert2);
		grafo.conectar(vert1, vert2);
		assertTrue(grafo.esAdyacente(vert1,vert2));
		assertFalse(grafo.esAdyacente(vert2,vert1));
	}

	public void testEsVacio() {
		assertTrue(grafo.esVacio());
		VerticeImplMatrizAdy<Integer> vert1 = new VerticeImplMatrizAdy<Integer>(1);
		grafo.agregarVertice(vert1);
		assertFalse(grafo.esVacio());
	}

	public void testListaDeVertices() {
		assertTrue(grafo.listaDeVertices().tamanio()==0);
		VerticeImplMatrizAdy<Integer> vert1 = new VerticeImplMatrizAdy<Integer>(1);
		grafo.agregarVertice(vert1);
		assertTrue(grafo.listaDeVertices().tamanio()==1);
		VerticeImplMatrizAdy<Integer> vert2 = new VerticeImplMatrizAdy<Integer>(2);
		grafo.agregarVertice(vert2);
		assertTrue(grafo.listaDeVertices().tamanio()==2);
	}

	public void testPeso() {
		VerticeImplMatrizAdy<Integer> vert1 = new VerticeImplMatrizAdy<Integer>(1);
		VerticeImplMatrizAdy<Integer> vert2 = new VerticeImplMatrizAdy<Integer>(2);
		grafo.agregarVertice(vert1);
		grafo.agregarVertice(vert2);
		grafo.conectar(vert1, vert2,5);
		assertTrue(grafo.peso(vert1, vert2) == 5);
	}

	public void testListaDeAdyacentes() {
		VerticeImplMatrizAdy<Integer> vert1 = new VerticeImplMatrizAdy<Integer>(1);
		grafo.agregarVertice(vert1);
		assertTrue(grafo.listaDeAdyacentes(vert1).tamanio() == 0);
		VerticeImplMatrizAdy<Integer> vert2 = new VerticeImplMatrizAdy<Integer>(2);
		grafo.agregarVertice(vert2);
		assertTrue(grafo.listaDeAdyacentes(vert2).tamanio() == 0);
		grafo.conectar(vert1, vert2);
		assertTrue(grafo.listaDeAdyacentes(vert1).tamanio() == 1);
		assertTrue(grafo.listaDeAdyacentes(vert2).tamanio() == 0);
		grafo.conectar(vert2, vert1);
		assertTrue(grafo.listaDeAdyacentes(vert1).tamanio() == 1);
		assertTrue(grafo.listaDeAdyacentes(vert2).tamanio() == 1);
	}

	public void testVetice() {
		VerticeImplMatrizAdy<Integer> vert1 = new VerticeImplMatrizAdy<Integer>(1);
		grafo.agregarVertice(vert1);
		assertEquals(grafo.vetice(vert1.getPosicion()),vert1);
		
		VerticeImplMatrizAdy<Integer> vert2 = new VerticeImplMatrizAdy<Integer>(1);
		grafo.agregarVertice(vert2);
		assertEquals(grafo.vetice(vert2.getPosicion()),vert2);
	}

}
