import java.util.Scanner;

public class ParOImpar {
	
	public static void main(String [] args){
		
		
		Scanner in= new Scanner(System.in);
		
		System.out.println("Ingrese un número: ");
		int x=in.nextInt();
		
		if (x%2==0)
			System.out.println("Es par");
		else
			System.out.println("Es impar");
		
		
		
	}

}
