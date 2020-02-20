package base;

public class Profesor {
	private String nombre;
	private String apellidos;
	private int edad;
	private String materia;
	private int horas;
	private String tipos;
	private int telefono;
	private int maximo_horas;
	
	
	public String getNombre() {
		return nombre;
	}
	public void setNombre(String nombre) {
		this.nombre = nombre;
	}
	public String getApellidos() {
		return apellidos;
	}
	public void setApellidos(String apellidos) {
		this.apellidos = apellidos;
	}
	public int getEdad() {
		return edad;
	}
	public void setEdad(int edad) {
		this.edad = edad;
	}
	public String getMateria() {
		return materia;
	}
	public void setMateria(String materia) {
		this.materia = materia;
	}
	public int getHoras() {
		return horas;
	}
	public void setHoras(int horas) {
		this.horas = horas;
	}
	public String getTipos() {
		return tipos;
	}
	public void setTipos(String tipos) {
		this.tipos = tipos;
	}
	public int getTelefono() {
		return telefono;
	}
	public void setTelefono(int telefono) {
		this.telefono = telefono;
	}
	public int getMaximo_horas() {
		return maximo_horas;
	}
	public void setMaximo_horas(int maximo_horas) {
		this.maximo_horas = maximo_horas;
	}
	public Profesor () {	
	}
	public Profesor (String nombre,String apellidos,int edad,String materia,int horas,String tipos,int telefono,int maximo_horas ) {	
		this.nombre=nombre;
		this.apellidos=apellidos;
		this.edad=edad;
		this.materia=materia;
		this.horas=horas;
		this.tipos=tipos;
		this.telefono=telefono;
		this.maximo_horas=maximo_horas;
	}
	public void tipos ( ) {
		String profesor1, profesor2;
		profesor1=this.tipos="1 Profesor titular";
		profesor2=this.tipos="2 profesor asociado";
		
	}
	public void saldo () {
		if (this.horas>20) {
			System.out.print("");
		}
	}
}
