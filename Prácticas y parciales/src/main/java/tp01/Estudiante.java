package tp01;

public class Estudiante {
	private String nombre;
	private String apellido;
	private String comision;
	private String email;
	private String direccion;
	
	public Estudiante() {
		
	}
	public String getNombre() {
		return nombre;
	}
	public void setNombre(String nombre) {
		this.nombre = nombre;
	}
	public String getApellido() {
		return apellido;
	}
	public void setApellido(String apellido) {
		this.apellido = apellido;
	}
	public String getComision() {
		return comision;
	}
	public void setComision(String comision) {
		this.comision = comision;
	}
	public String getEmail() {
		return email;
	}
	public void setEmail(String email) {
		this.email = email;
	}
	public String getDireccion() {
		return direccion;
	}
	public void setDireccion(String direccion) {
		this.direccion = direccion;
	}
	
	// Método tusDatos()
    public String tusDatos() {
        return "Nombre: " + this.getNombre() + "\n" +
               "Apellido: " + this.getApellido() + "\n" +
               "Catedra: " + this.getComision() + "\n" +
               "Email: " + this.getEmail() + "\n" +
               "Dirección: " + this.getDireccion();
    }
	
}
