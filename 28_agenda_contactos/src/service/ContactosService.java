package service;

import java.util.Collection;
import java.util.HashMap;


public class ContactosService {
	HashMap<String, String> contactos=new HashMap<>();
	
	public boolean nuevoContacto (String email, String nombre) {
		//si el email no está, añadimos contacto y devolvemos true
		if(!contactos.containsKey(email)) {
			contactos.put(email, nombre);
			return true;
		}
		return false;
	}
	public String buscarContacto (String email) {
		//a partir de la clave devuelve el nombre, si no existiera devuelve directamente null
		return contactos.get(email);
		
		
	}
	public boolean borrarContacto (String email) {
		if(contactos.containsKey(email)) {
			contactos.remove(email);
			return true;
		}
		return false;
	}
	public String [] mostrarContactos () {
		/*String[] datos=new String[contactos.size()];
		var nombres=contactos.values();
		int cont=0;
		for(String n:mostrarContactos()) {
			datos[cont]=n;
			cont++;
		}
		return datos;*/
		/*Collection<String> nombre=contactos.values();    Este es mi intento
		for(String s:nombre) {
			
		}
		return null;*/
		return contactos.values().toArray(new String[0]);
	}

}
/*Agenda de contactos

1.-Nuevo contactos
2.-Buscar contacto
3.-Eliminar contacto
4.-Mostrar todos los nombres
5.-Salir

Un contacto tiene como valor el nombre y clave su email.

1.- Se pide el nombre y el email. Si no existe un contacto
con ese email, se guarda, si ya existe, mensaje de error
2.- Se pide el email del contacto y se muestra el nombre
correspondiente. Si no hay contacto con ese email, mensaje
3.-Se pide el email y se elimina el contacto. Si no existe, mensaje
4. Muestra todos los nombres de contactos*/
