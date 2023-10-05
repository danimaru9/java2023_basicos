package principal;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;

public class TestLectura {

	public static void main(String[] args) {
		
		try(FileReader f=new FileReader("c:\\temp\\dias.txt");
				BufferedReader bf=new BufferedReader(f);) {
			
			/*String dia=bf.readLine();
			while(dia!=null) {
				System.out.println(dia);
				dia=bf.readLine();
			}*/
			String dia;
			while((dia=bf.readLine())!=null) {
				System.out.println(dia);
			}
		}
		catch(IOException ex) {
			ex.printStackTrace();
		}
		
	}

}
