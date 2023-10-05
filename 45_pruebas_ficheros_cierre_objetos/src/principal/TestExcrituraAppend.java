package principal;

import java.io.FileOutputStream;
import java.io.IOException;
import java.io.PrintStream;

public class TestExcrituraAppend {

	public static void main(String[] args) {
		
		try(FileOutputStream fos=new FileOutputStream("c:\\temp\\dias.txt", true);
				PrintStream	out=new PrintStream(fos);) {
			out.println("Jueves");
			out.println("Viernes");
		}
		catch(IOException ex) {
			ex.printStackTrace();	
		}

	}

}
