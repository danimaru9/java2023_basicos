package view;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Date;
import java.util.Scanner;

import model.Pedidos;
import service.PedidosService;

public class ProgramaPedidos {
	
	static PedidosService pedidosService=new PedidosService();
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		int opcion;
		do {
			mostrarMenu();
			try {
				opcion=Integer.parseInt(sc.nextLine());
				switch(opcion) {
				case 1:
					nuevoPedido();
					break;
				case 2:
					pedidoMasReciente();
					break;
				case 3:
					mostrarPedidos();
					break;
				case 4:
					System.out.println("Adios");
				}
			}catch(NumberFormatException ex) {
				ex.printStackTrace();
				System.out.println("Tienes que introducir un número.");
				opcion=0;
			}	
		}while(opcion!=4);
		
		
		
		

	}
	static void mostrarMenu() {
		System.out.println("1.- Alta pedido");
		System.out.println("2.- Pedido más reciente");
		System.out.println("3.- Pedidos por precio inferior");
		System.out.println("4.- Salir");
	}
	static void nuevoPedido() {
		Scanner sc=new Scanner(System.in);
		//para el parseado de fechas
		SimpleDateFormat format=new SimpleDateFormat("dd/MM/yyyy");
		String producto;
		Date fecha;
		double precio;
		System.out.println("Introduce producto: ");
		producto=sc.nextLine();
		System.out.println("Introduce fecha (dd/MM/yyyy)");
		try {
			fecha=format.parse(sc.nextLine());
			System.out.println("Introducir precio: ");
			precio=sc.nextDouble();
		} 
		catch (ParseException e) {
			System.out.println("La fecha no es válida, el producto no se guardará.");
		}
		
	}
	static void pedidoMasReciente() {
		Pedidos pedido=pedidosService.pedidoMasReciente();
		System.out.println("Producto: "+pedido.getProducto());
		System.out.println("Fecha: "+pedido.getFechaPedido());
		System.out.println("Precio: "+pedido.getPrecio());
	}
	static void mostrarPedidos() {
		Scanner sc=new Scanner(System.in);
		System.out.println("Introduce precio máximo: ");
		double precioMax=Double.parseDouble(sc.nextLine());
		ArrayList<Pedidos> pedidos=pedidosService.pedidoMasBaratos(precioMax);
		for(Pedidos p:pedidos) {
			
		}
		
	}

}
/*Aplicación de pedidos

Un pedido se caracteriza por: producto,fechaPedido,precio

1.- Alta pedido
2.- Pedido más reciente
3.- Pedidos por precio inferior
4.- Pedidos anteriores a cierta fecha
5.- Salir*/