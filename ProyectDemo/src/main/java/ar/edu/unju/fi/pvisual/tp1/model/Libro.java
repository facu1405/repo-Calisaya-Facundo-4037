package ar.edu.unju.fi.pvisual.tp1.model;

public class Libro {

	private String nombreLibro;
	private String editorial;
	private int añoEdcion;
	private Autor autor;
	
	public Libro(String nombreLibro, String editorial, int añoEdcion, Autor autor) {
		super();
		this.nombreLibro = nombreLibro;
		this.editorial = editorial;
		this.añoEdcion = añoEdcion;
		this.autor = autor;
	}

	public String getNombreLibro() {
		return nombreLibro;
	}

	public void setNombreLibro(String nombreLibro) {
		this.nombreLibro = nombreLibro;
	}

	public String getEditorial() {
		return editorial;
	}

	public void setEditorial(String editorial) {
		this.editorial = editorial;
	}

	public int getAñoEdcion() {
		return añoEdcion;
	}

	public void setAñoEdcion(int añoEdcion) {
		this.añoEdcion = añoEdcion;
	}

	public Autor getAutor() {
		return autor;
	}

	public void setAutor(Autor autor) {
		this.autor = autor;
	}
	
	
	
}
