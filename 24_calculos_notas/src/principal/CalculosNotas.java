package principal;

public class CalculosNotas {

	public static void main(String[] args) {
		String notas="4.5,2.7,8.9,5.1,3.4,9.0,6.7,7.2";
		//Calcular nota media, nota más alta, nota más baja y total de aprobados.
		String[] valores=notas.split(","); //hasta aquí llegué
		double media=0;
		int aprobados=0;
		double mayor=Double.parseDouble(valores[0]);
		double menor=Double.parseDouble(valores[0]);
		for(String s:valores) {
			//convertimos la nota leida en un double
			double nota=Double.parseDouble(s);
			media+=nota;//hay que hacer esto para poder sumar los valores ya que están en String
			if(nota>=5) {
				aprobados++;			
			}
			if(nota>mayor) {
				mayor=nota;
			}
			if(nota<menor) {
				menor=nota;
			}
		}
		System.out.println("La media es: "+String.format("%.2f",media/valores.length));
		System.out.println("La nota más alta es: "+mayor);
		System.out.println("La nota más baja es: "+menor);
		System.out.println("Han aprobadi: "+aprobados);
		
			
		
	}

}
