//Funci�n que sirve para almacenar la acci�n que el usuario desee realizar


public class Funciones {
	private String AccionARealizar;
	
public void establecerAccion(String accion){
		
		AccionARealizar=accion;
		
	}
	
	public String obtenerAccion(){
		
		return AccionARealizar;
	}
	

}
