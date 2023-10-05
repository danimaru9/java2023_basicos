package principal;

public class PruebaString {

	public static void main(String[] args) {
		String cad1="Hola";
		String cad2=" adios";
		//concatenación
		cad1=cad1+cad2; //"hola adios"
		//cuenta el nº de caracteres
		System.out.println(cad1.length());//10
		//lo convierte en mayúsculas. Para minúsculas toLowerCase()
		System.out.println(cad1.toUpperCase());
		System.out.println(cad1.charAt(5));

	}

}
