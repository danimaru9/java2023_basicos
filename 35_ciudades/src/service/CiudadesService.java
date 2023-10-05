package service;

import java.util.ArrayList;

import model.Ciudades;

public class CiudadesService {
	ArrayList<Ciudades> ciudades=new ArrayList <> ();
	
	public void guardarCiudad (String nombre, int habitantes,String pais) {
		ciudades.add(new Ciudades(nombre,habitantes,pais));
	}
	public ArrayList<Ciudades> ciudadesPorPais(String pais) {
		ArrayList<Ciudades> aux=new ArrayList<>();
		for(Ciudades c:ciudades) {
			if(pais.equals(c.getPais())) {
				aux.add(c);
			}
		}
		return aux;
	}
	public Ciudades ciudadMasPoblada() {
		int habitantesMax=0;
		Ciudades ciudad=null;//en esta se tendrá que guardar la ciudad con más habitantes
		for(Ciudades c:ciudades) {
			//si encontramos un nuevo max, actualizamos la variable 
			if(c.getPoblacion()>habitantesMax) {
				habitantesMax=c.getPoblacion();
				ciudad=c;
			}
		}
		return ciudad;
	}
	public void eliminarCiudad(String nombre) {
		for(int i=0;i<ciudades.size();i++) {
			if(nombre.equals(ciudades.get(i).getCiudad())) {
				ciudades.remove(i);
				break;
			}
		}
		
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

JUNIT

ArrayList<Ciudad> ciudades=new ArrayList<>();
	
	public void guardarCiudad(String nombre, int habitantes, String pais) {
		ciudades.add(new Ciudad(nombre,habitantes,pais));
	}
	
	public Ciudad ciudadMasPoblada() {
		int habitantesMax=0;
		Ciudad ciudad=null; //en esta se tendrá que guardar la ciudad con mayor número de habitantes
		for(Ciudad c:ciudades) {
			//si encontramos un nuevo máximo de habitantes, actualizamos la variable habitantesMax
			//y también la que guarda la ciudad con máximo de habitantes
			if(c.getHabitantes()>habitantesMax) {
				habitantesMax=c.getHabitantes();
				ciudad=c;
			}
		}
		return ciudad;
	}
	
	public ArrayList<Ciudad>  ciudadesPorPais(String pais) {
		ArrayList<Ciudad> aux=new ArrayList<>();
		for(Ciudad c:ciudades) {
			if(pais==c.getPais()){ //si la ciudad es del pais buscado, la añadimos a la nueva lista
				aux.add(c);
			}
		}
		return aux;
	}
	public void eliminarCiudad(String nombre) {
		for(int i=0;i<ciudades.size();i++) {
			if(nombre.equals(ciudades.get(i).getNombre())) {
				ciudades.remove(i);
				break;
			}
		}
	}
*/