package tp01;

public class ejercicio3 {
	
	public static void main(String[] args){
		// Crear un arreglo con 2 objetos Estudiante
        Estudiante[] estudiantes = new Estudiante[2];
        estudiantes[0] = new Estudiante();
        estudiantes[0].setNombre("Juan");
        estudiantes[0].setApellido("Perez");
        estudiantes[0].setComision("A");
        estudiantes[0].setEmail("juan@example.com");
        estudiantes[0].setDireccion("Calle 123");

        estudiantes[1] = new Estudiante();
        estudiantes[1].setNombre("María");
        estudiantes[1].setApellido("Gómez");
        estudiantes[1].setComision("B");
        estudiantes[1].setEmail("maria@example.com");
        estudiantes[1].setDireccion("Avenida 456");

        // Crear un arreglo con 3 objetos Profesor
        Profesor[] profesores = new Profesor[3];
        profesores[0] = new Profesor();
        profesores[0].setNombre("Pedro");
        profesores[0].setApellido("Martínez");
        profesores[0].setEmail("pedro@example.com");
        profesores[0].setCatedra("Algebra");
        profesores[0].setDireccion("Calle1");

        profesores[1] = new Profesor();
        profesores[1].setNombre("Ana");
        profesores[1].setApellido("López");
        profesores[1].setEmail("ana@example.com");
        profesores[1].setCatedra("Física");
        profesores[1].setDireccion("Calle2");

        profesores[2] = new Profesor();
        profesores[2].setNombre("Laura");
        profesores[2].setApellido("García");
        profesores[2].setEmail("laura@example.com");
        profesores[2].setCatedra("Historia");
        profesores[2].setDireccion("Calle3");

        // Recorrer y mostrar datos de estudiantes
        System.out.println("Datos de estudiantes:");
        for (Estudiante estudiante : estudiantes) {
            System.out.println(estudiante.tusDatos());
            System.out.println();
        }

        // Recorrer y mostrar datos de profesores
        System.out.println("Datos de profesores:");
        for (Profesor profesor : profesores) {
            System.out.println(profesor.tusDatos());
            System.out.println();
        }
	}
}
