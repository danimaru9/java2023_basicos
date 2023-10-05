package service;

import java.io.BufferedReader;
import java.io.FileOutputStream;
import java.io.FileReader;
import java.io.IOException;
import java.io.PrintStream;
import java.util.ArrayList;

public class NotasService {
	String dir="c:\\temp\\notas.txt";
	
	
	
	public void guardarNota(double nota) {
		try(FileOutputStream fos=new FileOutputStream(dir, true);
				PrintStream out=new PrintStream(fos)) {
			out.println(nota);
		}
		catch(IOException ex) {
			ex.printStackTrace();
		}
	}
	public void eliminarNota(int pos) {
		//este no se hace
	}
	public double media() {
		double media=0;
		int contador=0;
		try(FileReader f=new FileReader(dir);
				BufferedReader bf=new BufferedReader(f);) {
			String nota=bf.readLine();
			while(nota!=null) {
				media+=Double.parseDouble(nota);
				contador++;
				nota=bf.readLine();
			}			
		}
		catch(IOException ex) {
			ex.printStackTrace();
		}
		return media/contador;
		
	}
	public int aprobados() {
		int contador=0;
		try(FileReader f=new FileReader(dir);
				BufferedReader bf=new BufferedReader(f)) {
			String nota=bf.readLine();
			while(nota!=null) {
				if(Double.parseDouble(nota)>5) {
					contador++;
				}
				nota=bf.readLine();
			}
	
		}
		catch(IOException ex) {
			ex.printStackTrace();
		}
		return contador;
		
	}
	public ArrayList<Double> notas() {
		ArrayList<Double> notas=new ArrayList<>();
		try(FileReader f=new FileReader(dir);
				BufferedReader bf=new BufferedReader(f)) {
			String nota=bf.readLine();
			while(nota!=null) {
				notas.add(Double.parseDouble(nota));
				nota=bf.readLine();
			}
			
		}
		catch(IOException ex) {
			ex.printStackTrace();
		}
		return notas;
	}
}

