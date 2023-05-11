package tp01;

import java.util.Scanner;

public class Test {
    
    public static void main(String[] args) {
		Estudiante [] vectorE = {new Estudiante(),new Estudiante ()};
		Profesor [] vectorP = {new Profesor (),new Profesor(),new Profesor()};
		
		// ESTUDIANTES
		
		vectorE[0].setNombre("Tulipan");
		vectorE[0].setApellido("T t");
		vectorE[0].setComision("A");
		vectorE[0].setEmail("tulipan@gmail.com");
		vectorE[0].setDireccion("tulidireccion");
		vectorE[1].setNombre("Yerba");
		vectorE[1].setApellido("Playadito");
		vectorE[1].setComision("B");
		vectorE[1].setEmail("playadito@gmail.com");
		vectorE[1].setDireccion("playdireccion");
		
		//PROFESORES
		
		vectorP[0].setNombre("Leandro");
		vectorP[0].setApellido("Morales");
		vectorP[0].setCatedra ("CADP");
		vectorP[0].setEmail("elyacare@gmail.com");
		vectorP[0].setFacultad("UNLP");
		vectorP[1].setNombre("Cristian");
		vectorP[1].setApellido("Tarragona");
		vectorP[1].setCatedra("XI");
		vectorP[1].setEmail("tarragona@gmail.com");
		vectorP[1].setFacultad("Lobito");
		vectorP[2].setNombre("Nacho");
		vectorP[2].setApellido("Miramon");
		vectorP[2].setCatedra("5");
		vectorP[2].setEmail("nacho@gmail.com");
		vectorP[2].setFacultad("ScotingGroup");
	
	
		for (int i = 0; i < 2; i++) {
			System.out.println( vectorE[i].tusDatos());
		}
		
		for (int i = 0; i < 3; i++) {
			System.out.println(vectorP[i].tusDatos());
		}

	}
}