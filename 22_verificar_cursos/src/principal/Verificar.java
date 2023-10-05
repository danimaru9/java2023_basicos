package principal;

public class Verificar {

	public static void main(String[] args) {
		String cursos="Ofimática,Java básico,JavaEE,Spring Boot,Angular,Programación Java avanzada";
		//¿Cuántos cursos hay de Java?	
		String[] nombre=cursos.toLowerCase().split(",");
		int contador=0;
		for(String n:nombre) {
			if(n.contains("java")) {
				contador++;
			}
		}
		System.out.println("Cursos Java: "+contador);

	}

}
