package principal;

import java.util.Arrays;

public class Loteria {

	public static void main(String[] args) {
		// 6 nº aleatorios de menos a más sin repetirse del 1 al 49
		/*int [] numeros=new int [49];
		int [] ganadores;
		for(int i=1;i<=49;i++); {
			int bolas=(int)(Math.random()*6+1);
			ganadores.append()
		}
			for(int i=0;i<=bolas.length;i++) {
				System.out.println("Los nº son: "+bolas);
			}
		}*/
		
		//mientras haya menos de 6 nº generados, generamos un nº y comprobamos que no está repetido
		//en caso, lo guardamos y sino vamos a por el siguiente
		int[] combinacion=new int[6];
		int generados=0;
		while (generados<6) {
			int n=(int)(Math.random()*49+1);
			if(!repetido(combinacion,n,generados)) {
				combinacion[generados]=n;
				generados++;//incrementamos la variable al generar un nuevo nº
			}
		}
		ordenar(combinacion);
		mostrar(combinacion);
	}
	static boolean repetido(int[] numeros,int num,int total) {
		/*boolean res=false;
		for(int i=0;i<total;i++) {
			if(numeros[i]==num) {
				res=true;
				break;
			}
		}
		return res;*/
		//otra forma:
		for(int i=0;i<total;i++) {
			if(numeros[i]==num) {
				return true;
			}
		}
		return false;	
	}
	static void ordenar(int[] numeros) {
		/*int aux;
		for (int i=0;i<numeros.length;i++) {
			for (int j=i+1;j<numeros.length;j++) {
				if(numeros[j]<numeros[i]) {//sustitucion
					aux=numeros[j];
					numeros[j]=numeros[i];
					numeros[i]=aux;	
				}
			}
		}*/
		Arrays.sort(numeros);//es una manera abreviada
	}
	static void mostrar(int[] numeros) {
		for (int n:numeros) {
			System.out.print(n+",");
		}
	}
}
