import java.util.*;

public class AreaYPerimetro {
	
	public static void main(String args[]){
		final String circulo="C";
		final String cuadrado="U";
		final String triangulo="T";
		int x=0, y=0;
		Funciones realizar=new Funciones();
		Operaciones operaciones=new Operaciones();
		Scanner in= new Scanner(System.in);
		
		
		System.out.println("A continuaci�n se le presenta las siguientes opciones con las que");
		System.out.println("podr� calcular el �rea y Per�metro de los cuerpos");
		System.out.println("ingresando los valores que se le indiquen");
		System.out.println();
		System.out.println();
		System.out.println("Ingrese C para circulo, U para el cuadrado y T para el triangulo  si es equilatero");
		System.out.println();
		System.out.println("1) Circulo ");
		System.out.println("2) Cuadrado ");
		System.out.println("3) Tri�ngulo ");
		System.out.print("Opci�n: ");
		
		String Accion= in.nextLine();
		realizar.establecerAccion(Accion);
		
		
		System.out.println();
		
		//Hace la comparaci�n de lo que quiere realizar
		if (Accion.equalsIgnoreCase("C")){
			operaciones.circulo();}
			else if(Accion.equalsIgnoreCase("U")){
				operaciones.cuadrado();}
				else if (Accion.equalsIgnoreCase("T")){
					operaciones.triangulo();
				}
				
			
		
			
			
		
	
		
		
		

		
	}

}
