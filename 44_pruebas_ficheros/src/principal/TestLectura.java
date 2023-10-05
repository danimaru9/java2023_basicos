package principal;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;

public class TestLectura {

	public static void main(String[] args) {
		FileReader f=null;
		BufferedReader bf=null;
		try {
			f=new FileReader("c:\\temp\\dias.txt");
			bf=new BufferedReader(f);
			String dia=bf.readLine();
			while(dia!=null) {
				System.out.println(dia);
				dia=bf.readLine();
			}
			
		}
		catch(IOException ex) {
			ex.printStackTrace();
		}
		finally {
			if(bf!=null) {
				try {
					bf.close();
				}
				catch(IOException ex) {
					ex.printStackTrace();
				}
				if(f!=null) {
					try {
						f.close();
					}
					catch(IOException ex) {
						ex.printStackTrace();
					}
			}
		}
		
	}

}
}
