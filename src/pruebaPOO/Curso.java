package pruebaPOO;

import java.util.Objects;

public class Curso {
	private int codCurso;
	private String descripcion;
	private boolean subvencionado;
	
	/**
	 * Constructor completo (necesita todos los atributos)
	 * @param codCurso
	 * @param descripcion
	 * @param subvencionado
	 */
	public Curso(int codCurso, String descripcion, boolean subvencionado) {
		super();
		this.codCurso = codCurso;
		this.descripcion = descripcion;
		this.subvencionado = subvencionado;
	}
	
	/**
	 * 	Constructor vacío
	 */
	public Curso() {
		this.codCurso = 0;
		this.descripcion = "XXXXX";
		this.subvencionado = false;
	}
	public Curso (int codCurso) {
		this.codCurso = codCurso;
		this.descripcion = "XXXXX";
		this.subvencionado = false;
	}

	public int getCodCurso() {
		return codCurso;
	}

	public void setCodCurso(int codCurso) {
		this.codCurso = codCurso;
	}

	public String getDescripcion() {
		return descripcion;
	}

	public void setDescripcion(String descripcion) {
		this.descripcion = descripcion;
	}

	public boolean isSubvencionado() {
		return subvencionado;
	}

	public void setSubvencionado(boolean subvencionado) {
		this.subvencionado = subvencionado;
	}

	@Override
	public String toString() {
		return "Curso [codCurso=" + codCurso + ", descripcion=" + descripcion + ", subvencionado=" + subvencionado
				+ "]";
	}

	@Override
	public int hashCode() {
		return Objects.hash(codCurso, descripcion, subvencionado);
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		Curso other = (Curso) obj;
		return codCurso == other.codCurso && Objects.equals(descripcion, other.descripcion)
				&& subvencionado == other.subvencionado;
	}
	
	
	
	
	
}
