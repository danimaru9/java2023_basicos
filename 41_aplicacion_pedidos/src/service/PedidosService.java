package service;

import java.util.ArrayList;
import java.util.Date;

import model.Pedidos;

public class PedidosService {
	ArrayList<Pedidos> pedidos=new ArrayList<>();
	
	public void altaPedido (String producto, Date fecha, double precio) {
		pedidos.add(new Pedidos(producto, fecha, precio));
	}
	public Pedidos pedidoMasReciente() {
		Pedidos pedido=pedidos.get(0);
		Date masReciente=pedido.getFechaPedido();
		for(Pedidos p:pedidos) {
			if(p.getFechaPedido().after(masReciente)) {
				masReciente=p.getFechaPedido();
				pedido=p;
			}
			
		}
		return pedido;
	}
	public ArrayList<Pedidos> pedidoMasBaratos(double precioMax) {
		ArrayList<Pedidos> resultado=new ArrayList<Pedidos>();
		for(Pedidos p:pedidos) {
			if(p.getPrecio()<precioMax) {
				resultado.add(p);
			}
			
		}
		return resultado;
	}
}

/*Aplicación de pedidos

Un pedido se caracteriza por: producto,fechaPedido,precio

1.- Alta pedido
2.- Pedido más reciente
3.- Pedidos por precio inferior
4.- Salir*/