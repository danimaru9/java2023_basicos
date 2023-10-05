package principal;

import java.util.Scanner;

public class Sumatorio {

	public static void main(String[] args) {
		Scanner sc=new Scanner (System.in);
		System.out.println("Escribe primer nº: ");
		int a=sc.nextInt();
		System.out.println("Escribe segundo nº: ");
		int b=sc.nextInt();
		//calcular la suma de todos los nº comprendidos entre esos 2 nº
		int suma=0;
		int mayor=Math.max(a, b);//a>b?a:b;
		int menor=Math.min(a, b);//a>b?b:a;
		for (int i=menor;i<=mayor;i++) {
			suma+=i;	
		}
		
		System.out.println("La suma es :"+suma);

	}

}
