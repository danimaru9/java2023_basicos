package principal;

public class UsoSplit {

	public static void main(String[] args) {
		String datos="Lunes,Martes,Miercoles,Jueves";
		String[] dias=datos.split(","); //mete cada dia en una pos. del array
		System.out.println(dias.length);

	}

}
