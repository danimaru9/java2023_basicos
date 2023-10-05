package principal;

import java.util.ArrayList;
import java.util.Scanner;

public class Numeros {

	public static void main(String[] args) {
		//Realizar un programa que vaya solicitando la introdución de nº enteros y los va guardando. 
		//Cada vez que pide un nº y lo guarda, preguntará al usuario si quiere introducir otro nº. 
		//Cuando diga que no quiere introducir más nº se mostrará la suma de los nº introducidos.
		/*Scanner sc=new Scanner(System.in);
		ArrayList<Integer> numeros=new ArrayList<>();
		System.out.println("Introduce un número entero: ");
		numeros=sc.next();
		System.out.println("Números: "+numeros);*/
		var lista=new ArrayList<Integer>();
		var scNumeros=new Scanner(System.in);
		var scTextos=new Scanner(System.in);
		int num;
		String resp;
		int suma=0;
		
		do {
			System.out.println("Introduce un número: ");
			num=scNumeros.nextInt();
			lista.add(num);//autoboxing de int a Integer
			System.out.println("¿Desea introducir otro múmero? (si/no)");
			resp=scTextos.nextLine();
		}while(resp.equals("si"));
		for(int n:lista) {
			suma+=n;
			
		}
		System.out.println("La suma es: "+suma);

	}

}
