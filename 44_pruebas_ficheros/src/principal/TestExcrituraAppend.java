package principal;

import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.PrintStream;

public class TestExcrituraAppend {

	public static void main(String[] args) {
		FileOutputStream fos=null;
		PrintStream out=null;
		try {
			//objeto para configurar la forma de escritura
			fos=new FileOutputStream("c:\\temp\\dias.txt", true);
			//a partir del objeto anterio creamos el PrintStream
			out=new PrintStream(fos);
			out.println("Jueves");
			out.println("Viernes");
		}
		catch(FileNotFoundException ex) {
			ex.printStackTrace();
		}
		finally {
			if(out!=null) {
				out.close();
			}
			if(fos!=null) {
				out.close();
			}
			
		}

	}

}
