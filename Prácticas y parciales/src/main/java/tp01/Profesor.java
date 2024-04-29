package tp01;

public class Profesor {
	private String nombre;
	private String apellido;
	private String email;
	private String catedra;
	private String direccion;
	
	public Profesor() {
		
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
	public String getEmail() {
		return email;
	}
	public void setEmail(String email) {
		this.email = email;
	}
	public String getCatedra() {
		return catedra;
	}
	public void setCatedra(String catedra) {
		this.catedra = catedra;
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
               "Catedra: " + this.getCatedra() + "\n" +
               "Email: " + this.getEmail() + "\n" +
               "Dirección: " + this.getDireccion();
    }
}
