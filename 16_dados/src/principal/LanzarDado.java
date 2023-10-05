package principal;

public class LanzarDado {

	public static void main(String[] args) {
		//Hacer un programa que simule el lanzamiento de un dado	
		/*int numero=(int)(Math.random()*6+1);
		System.out.println(numero);*/
		
		//Lanzamos el dado 10000 veces y mostraremos los porcetajes de cada cara
		int[] contadores=new int[6];
		for(int i=1;i<=10000;i++); {
				//lanzo dado
				int dado=(int)(Math.random()*6+1);
				/*switch(dado) {
				case 1:
					contadores[0]++;
					break;
				case 2:
					contadores[1]++;
					break;
				case 3:
					contadores[2]++;
					break;
				case 4:
					contadores[3]++;
					break;
				case 5:
					contadores[4]++;
					break;
				case 6:
					contadores[5]++;
					break;
				}*/			
				//siempre se incrementa la posición del array cuyo indice es el valor del dado -1
				contadores[dado-1]++;
			}
			for(int i=0;i<=contadores.length;i++); {
				
		}
		System.out.println("Porcentaje de "+(i+1)+": "+contadores[i]*100.0/10000);
}
}
