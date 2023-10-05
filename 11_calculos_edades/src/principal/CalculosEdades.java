package principal;

public class CalculosEdades {

	public static void main(String[] args) {
		int[] edades= {34,19,28,55,61,40};
		//calcular la media de edad
		//edad mayor y menor
		double suma=0; // aquí fallé y puse int
		var mayor=edades[0];
		var menor=edades[0];
		/*for(int i=0;i<edades.length;i++) {
			media+=edades[i];
			if(edades[i]>mayor) {
				mayor=edades[i];
			}
			if(edades[i]<menor) {
				menor=edades[i];
			}
		}*/
		for(int e:edades) {
			suma+=e;
			if(e>mayor) {
				mayor=e;
			}
			if(e<menor) {
				menor=e;
			}
		}
			
			
		System.out.println("La media de edad es: "+suma/edades.length);
		System.out.println("La edad más alta es: "+mayor);
		System.out.println("La edad más baja es: "+menor);
		}
	}


