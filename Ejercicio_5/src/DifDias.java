import java.util.*;

public class DifDias {

	
	public static void main (String [] args){
		
	int dia1=0,mes1=0,a�o1=0;
	int dia2=0,mes2=0,a�o2=0;
	
	Scanner in= new Scanner (System.in);
	
	
	System.out.println("El siguiente programa calcula la diferencia de dias cuando");
	System.out.println("ingresa dos fechas disntintas.");
	System.out.println();
	System.out.println();
	
	//Para fecha 1
	
	System.out.println("Ingrese la primer fecha ");
	System.out.println();
	System.out.print("Dia: \t");
	dia1=in.nextInt();
	System.out.print("Mes: \t");
	mes1=in.nextInt();
	System.out.print("A�o: \t");
	a�o1=in.nextInt();
	
	System.out.println();
	System.out.println("---------------------------");
	
	//Para fecha 2
	System.out.println("Ingrese la segunda fecha ");
	System.out.println();
	System.out.print("Dia: \t");
	dia2=in.nextInt();
	System.out.print("Mes: \t");
	mes2=in.nextInt();
	System.out.print("A�o: \t");
	a�o2=in.nextInt();
	
	//Calculo de la diferencia de a�os y meses y dias
	int difa�os= Math.abs(a�o2-a�o1);
	int difmeses=Math.abs(mes2-mes1);
	int difdias=Math.abs(dia2-dia1);
	
	//Calculo de la cantidad de dias
	
	int a�os=((difa�os)*12)*30;
	int meses=(difmeses)*30;
	
	int resultado= a�os+meses+difdias;
	
	System.out.println();
	System.out.println("La cantidad de dias transcurridos es: " + resultado + " dias");
	

	
	
	
	}
	
}
