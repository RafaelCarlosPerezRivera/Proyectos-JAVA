
public class Manipula_cadenas2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		String frase="Hoy es un día estupendo para programar en Java";
		
		String frase_resumen=frase.substring(0, 29) + " avanzar en Java y " +
		frase.substring(29, 46);
		
		System.out.println(frase_resumen);

	}

}
