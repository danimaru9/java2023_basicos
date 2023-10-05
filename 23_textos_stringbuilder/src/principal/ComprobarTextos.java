package principal;

public class ComprobarTextos {

	public static void main(String[] args) {
		String productos = "Detergente,Vino,Pan,Agua,Leche,Harina,Mantequilla,Arroz";
		// Tengo que crear una nueva cadena de caracteres que contenga los productos que
		// empizan por A
		String[] datos = productos.split(","); // Separamos los productos
		// Añadimos los productos que cumplen la condición
		StringBuilder resultado = new StringBuilder();
		for (String p : datos) {
			if (p.startsWith("A")) {
				resultado.append(p);
				resultado.append(",");
			}

		}
		System.out.println(resultado.delete(resultado.length() - 1, resultado.length()));


	}

}
