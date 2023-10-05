package principal;

import java.util.ArrayList;

public class Lista {

	public static void main(String[] args) {
		ArrayList<String> dias=new ArrayList<>();
		//var otra=new ArrayList<String>();
		dias.add("Lunes");
		dias.add("Martes");
		dias.add(1, "Miércoles");
		System.out.println(dias.size());
		System.out.println(dias.get(2));

	}

}
