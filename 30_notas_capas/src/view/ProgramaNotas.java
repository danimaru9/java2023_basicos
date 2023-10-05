package view;

import java.util.Scanner;

import service.NotasService;

public class ProgramaNotas {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		NotasService notasService=new NotasService();
		int opcion;	
		do {
			mostrarMenu();
			opcion=sc.nextInt();//lee la opción introducida
			switch(opcion) {//evaluamos
			case 1:
				System.out.println("1.Añadir nota");
				notasService.guardarNota(sc.nextDouble());
				break;
			case 2:
				System.out.println("2.Eliminar nota");
				notasService.eliminarNota(sc.nextInt());
				break;
			case 3:
				System.out.println("3.Nota media"+notasService.media());
				break;
			case 4:
				System.out.println("4.Total aprobados"+notasService.aprobados());
				break;
			case 5:
				var notas=notasService.notas();
				for(double n:notas) {
					System.out.println(n);
				}
				
			case 6:
				System.out.println("5.Adios");
			}
		}while(opcion!=6);

	}
	public static void mostrarMenu() {
		System.out.println("1.Añadir nota");
		System.out.println("2.Eliminar nota por posición");
		System.out.println("3.Nota media");
		System.out.println("4.Total de aprobados");
		System.out.println("5.Mostrar todas las notas");
		System.out.println("6.Salir");
	}
}
