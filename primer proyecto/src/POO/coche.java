package poo;

public class coche {

	private int ruedas;
	
	private int largo;
	
	private int ancho;
	
	private int motor;
	
	private int peso_plataforma;
	
	  String color;
	
	private int peso_total;
	
	private boolean asientos_cuero;
	
	public coche() {
		
		ruedas=4;
		
		largo=2000;
		
		ancho=300;
		
		motor=1600;
		
		peso_plataforma=500;
		
	}
	
	//metodo getter
	
	public String dime_ruedas() {
		return "Las ruedas del coche son " + ruedas;
	}
	
	//metodo setter
	
	public void establece_color(){
		color="azul";
	}
	
	public String dime_color() {
		return "El color del coche es " + color;
	}
	
}
