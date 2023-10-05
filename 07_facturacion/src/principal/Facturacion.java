package principal;

public class Facturacion {

	public static void main(String[] args) {
		double precio=4.5;
		int unidades=3;
		/*calcular precio final, tenieno en cuenta que:
		 * si compramos 5, 6 o 7 unidades 10% descuento
		 * si compramos 3 o 4 unidades 5% descuento
		 * si compramos 1 o 2 unidades sin descuento
		 */
		switch (unidades) {
		case 5, 6, 7:
			System.out.println("Precio total: "+precio*unidades*0.9);
			break;
			
		case 3, 4:
			System.out.println("Precio total: "+precio*unidades*0.95);
			break;
			
		case 1, 2:
			System.out.println("Precio total: "+precio*unidades);
			break;
			
		}
		//solución utilizando expresiones switch de Java 17
		double pFinal=switch(unidades) {
		case 5, 6, 7 -> precio*unidades*0.9;
		case 3, 4 -> precio*unidades*0.95;
		case 1, 2 -> precio*unidades;
		default -> -1; // Estoy obligado a usar default
		};
		System.out.println("Precio final: " + pFinal);
		

	}

}
