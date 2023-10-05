package model;

public class Ciudades {
	private String ciudad;
	private String pais;
	private int poblacion;
	public Ciudades(String ciudad, int poblacion, String pais) {
		super();
		this.ciudad = ciudad;
		this.pais = pais;
		this.poblacion = poblacion;
	}
	public String getCiudad() {
		return ciudad;
	}
	public void setCiudad(String ciudad) {
		this.ciudad = ciudad;
	}
	public String getPais() {
		return pais;
	}
	public void setPais(String pais) {
		this.pais = pais;
	}
	public int getPoblacion() {
		return poblacion;
	}
	public void setPoblacion(int poblacion) {
		this.poblacion = poblacion;
	}

}
/*Programa para gestión de ciudades
Una ciudad se caracteriza por un nombre, habitantes y pais.

1. Nueva ciudad
2. Ciudades por pais
3. Ciudad más poblada
4. Eliminar ciudad
5. Salir

1. Pide los datos de la ciudad y la guarda
2. Se pide el pais, y muestra datos de todas sus ciudades
3. Muestra datos de la ciudad más poblada
4. Pide el nombre de la ciudad y la elimina

Las ciudades se guardan en un ArrayList
*/