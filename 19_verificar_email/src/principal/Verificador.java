package principal;

import java.util.Scanner;

public class Verificador {

	public static void main(String[] args) {
		//realizar un programa que solicite la introduccion de un correo electrónico y nos digas si es válida
		//dirección válida es aquella que contiene al menos un punto y un @
		Scanner sc=new Scanner(System.in);
		String correo;
		System.out.println("Introduce un correo: ");
		correo=sc.nextLine();
		/*int posarroba=correo.indexOf("@");
		int pospunto=correo.indexOf(".");
		if(posarroba!=-1&&pospunto!=-1) {
			System.out.println("Dirección válida.");
		}else {
			System.out.println("Dirección no válida.");
		}*/
		if(correo.indexOf("@")!=-1&&correo.indexOf(".")!=-1) {
			System.out.println("Dirección válida.");
		}else {
			System.out.println("Dirección no válida.");
		}
		
	}
		
		

}


