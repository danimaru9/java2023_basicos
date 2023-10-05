package principal;

public class Notas {

	public static void main(String[] args) {
		int nota=6;
		/*En función de la nota muestra calificaión:
		Entre 1 y 4: suspenso
		Entre 5 y 6: aprobado
		Entre 7 y 8: notable
		Entre 9 y 10: sobresaliente
		Otro valor: nota no válida
		*/
		switch (nota) {
		case 1,2,3,4:
			System.out.println("Suspenso.");
			break;
		
		case 5,6:
			System.out.println("Aprobado.");
			break;
		
		case 7,8:
			System.out.println("Notable");
			break;
			
		case 9,10:
			System.out.println("Sobresaliente.");
			break;
			
		default:
			System.out.println("Nota no válida.");
		}
		// En versiones anteriores a Java 17 hay que  ir caso por caso
	}

}
