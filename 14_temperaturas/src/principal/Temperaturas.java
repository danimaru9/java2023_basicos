package principal;

public class Temperaturas {

	public static void main(String[] args) {
		double [] temps= {12.4,23.3,17.9,30.1,22.4,17.8};
		double media=0;
		int contador=0;
		//calcular media
		for(double t:temps) {
			media+=t;
		}
		media/=temps.length;
		//ahora recorresmos de nuevo y contamos las tº superiores a ese valor
		for(double t:temps) {
			if(t>media) {
				contador++;
			}
		}
		System.out.println("Superan la tª media: "+contador);

	}

}
