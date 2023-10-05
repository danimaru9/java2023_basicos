package principal;

public class Sumados {

	public static void main(String[] args) {
		//¿Cuántos nº, empezando por 1, tenemos que sumar hasta alcanzar o superar 1000?
		int n=0, s=0;
		while(s<1000) {
			n++;
			s+=n;
		}
		System.out.println("Hay que sumar hasta: "+n);

	}

}
