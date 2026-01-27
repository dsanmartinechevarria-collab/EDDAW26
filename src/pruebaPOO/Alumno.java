package pruebaPOO;

public class Alumno {
	private int codAlumno;
	private String dniAlumno, Nombre, Apellidos;
	private double cuota;
	private boolean becado;
	private Curso cursoMatriculado;
	public int getCodAlumno() {
		return codAlumno;
	}
	//Constructor//
	public Alumno(int i, String string, String string2, String string3, boolean b, Curso c1) {
		this.codAlumno = 1;
		this.dniAlumno="dnialumno";
		this.Nombre = "Nombre";
		this.Apellidos="Apellido";
		this.becado = false;
		this.cursoMatriculado= null;
		this.cuota = 100;
	}
	
	/////GETTERS Y SETTERS////////
	public void setCodAlumno(int codAlumno) {
		this.codAlumno = codAlumno;
	}
	public String getDniAlumno() {
		return dniAlumno;
	}
	public void setDniAlumno(String dniAlumno) {
		this.dniAlumno = dniAlumno;
	}
	public String getNombre() {
		return Nombre;
	}
	public void setNombre(String nombre) {
		Nombre = nombre;
	}
	public String getApellidos() {
		return Apellidos;
	}
	public void setApellidos(String apellidos) {
		Apellidos = apellidos;
	}
	public double getCuota() {
		return cuota;
	}
	public void setCuota(double cuota) {
		this.cuota = cuota;
	}
	public boolean isBecado() {
		return becado;
	}
	public void setBecado(boolean becado) {
		this.becado = becado;
	}
	public Curso getCursoMatriculado() {
		return cursoMatriculado;
	}
	public void setCursoMatriculado(Curso cursoMatriculado) {
		this.cursoMatriculado = cursoMatriculado;
	}
	
	@Override
	public String toString() {
		return "Alumno [codAlumno=" + codAlumno + ", dniAlumno=" + dniAlumno + ", Nombre=" + Nombre + ", Apellidos="
				+ Apellidos + ", cuota=" + cuota + ", becado=" + becado + ", cursoMatriculado=" + cursoMatriculado
				+ "]";
	}
	
}
