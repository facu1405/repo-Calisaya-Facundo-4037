package ar.edu.unju.fi.pvisual.tp1.model;

public class Autor {

	private String nombreau;
	private int edadau;
	private String nacionalidad;
	
	public Autor(String nombreau, int edadau, String nacionalidad) {
		super();
		this.nombreau = nombreau;
		this.edadau = edadau;
		this.nacionalidad = nacionalidad;
	}

	public String getNombreau() {
		return nombreau;
	}

	public void setNombreau(String nombreau) {
		this.nombreau = nombreau;
	}

	public int getEdadau() {
		return edadau;
	}

	public void setEdadau(int edadau) {
		this.edadau = edadau;
	}

	public String getNacionalidad() {
		return nacionalidad;
	}

	public void setNacionalidad(String nacionalidad) {
		this.nacionalidad = nacionalidad;
	}
	
	
}
