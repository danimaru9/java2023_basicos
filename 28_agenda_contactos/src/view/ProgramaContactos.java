package view;

import java.util.Scanner;

import service.ContactosService;

public class ProgramaContactos {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		ContactosService contactosService=new ContactosService();
		int opcion;
		do {
			mostrarMenu();
			opcion=sc.nextInt();
			switch (opcion) {
				case 1: 	
					pedirContacto();
					break;
				case 2:
					buscarContacto();
					break;
				case 3:
					eliminarContacto();
					break;
				case 4:
					mostrarContactos();
					break;
				case 5:
					salir();
			}
		
		}while(opcion!=5);
	}	
	public static void mostrarMenu() {
		System.out.println("1. Nuevo contacto.");
		System.out.println("2. Buscar contacto.");
		System.out.println("3. Eliminar contacto");
		System.out.println("4. Mostrar contactos");
		System.out.println("5. Salir");
	}
	static void pedirContacto () {
		Scanner sc=new Scanner(System.in);
		String email;
		String nombre;
		System.out.println("Introduce Email");
		email=sc.nextLine();
		System.out.println("Introduce nombre");
		nombre=sc.nextLine();
		contactosService.agregar(email, nombre);
	}
	static void eliminarContacto() {
		Scanner sc=new Scanner(System.in);
		String email;
		System.out.println("Introduce email");
		email=sc.nextLine();
		contactosService.eliminar(email);
	}
	static void mostrarContacto() {
		String[] nombres=contactosService.nombres();
		for(String n:nombres) {
			System.out.println(n);

}
