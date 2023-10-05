package principal;

import java.util.ArrayList;
import java.util.Scanner;

public class Ejercicio {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		ArrayList<Double> notas=new ArrayList<>();
		int opcion;
		// Realizar un programa para la gestión de notas.
		//El programa mostrará el siguiente menú al iniciarse:
		//	1.Añadir nota
		//	2.Eliminar nota por posición
		//	3.Nota media
		//	4.Total de aprobados
		//	5.Salir
		//	Al elegir una opción, se realizarán las acciones pertinentes
		//	y después se mostrará otra vez el menú, hasta
		//	que se elija la opción de salir
		/*var lista=new ArrayList<Integer>();
		var scNota=new Scanner(System.in);
		double nota;
		double media=0;*/
		do {
			mostrarMenu();
			opcion=sc.nextInt();//lee la opción introducida
			switch(opcion) {//evaluamos
			case 1:
				System.out.println("1.Añadir nota");
				notas.add(sc.nextDouble());
				break;
			case 2:
				System.out.println("2.Eliminar nota");
				notas.remove(sc.nextInt());
				break;
			case 3:
				System.out.println("3.Nota media"+media(notas));
				break;
			case 4:
				System.out.println("4.Total aprobados"+aprobados(notas));
				break;
			case 5:
				System.out.println("5.Adios");
			}
		}while(opcion!=5);
		
		
		}
		static void mostrarMenu() {
			System.out.println("1.Añadir nota");
			System.out.println("2.Eliminar nota por posición");
			System.out.println("3.Nota media");
			System.out.println("4.Total de aprobados");
			System.out.println("5.Salir");
		}
		static double media(ArrayList<Double> notas) {
			double res=0;
			for(double d:notas) {
				res+=d;
			}
			return res/notas.size();
			
		}
		static double aprobados(ArrayList<Double> notas) {
			int cont=0;
			for(double d:notas) {
				if(d>=5);
				cont+=d;
			}
			return cont++;
		}
	}

