import java.util.*;


public class ListaMayorYMenor {

	public static void main(String[] args ){
		String rom[]={"i", "ii", "iii", "iv","v","vi","vii","viii","ix","x",
				"xi","xii","xiii","xiv","xv","xvi","xvii","xviii","xix","xx",
				"xxi","xxii","xxiii","xxiv","xxv","xxvi","xxvii","xviii","xxix","xxx",
				"xxxi","xxxii","xxxiii","xxxiv","xxxv","xxxvi","xxxvii","xxxviii","xxxix","xl",
				"xli","xlii","xliii","xliv","xlv","xlvi","xlvii","xlviii","xlix","l",
				"li","lii","liii","liv","lv","lvi","lvii","lviii","lix","lx",
				"lxi","lxii","lxiii","lxiv","lxv","lxvi","lxvii","lxviii","lxix","lxx",
				"lxxi","lxxii","lxiii","lxxiv","lxxv","lxxvi","lxxvii","lxxviii","lxxix","lxxx",
				"lxxxi","lxxxii","lxxxiii","lxxxiv","lxxxv","lxxxvi","lxxxvii","lxxxviii","lxxxix","xc",
				"xci","xcii","xciii","xciv","xcv","xcvi","xcvii","xcviii","xcix","c"};
		int val[]={1,2,3,4,5,6,7,8,9,10,11,12,3,14,15,16,17,18,19,20,21,22,23,24,25,26,27,28,29,30,31,32,33,
				34,35,36,36,38,39,40,41,42,43,44,45,46,47,48,49,50,51,52,53,54,55,56,57,58,59,60,61,62,63,64,
				65,66,67,68,69,70,71,72,73,74,75,76,77,78,79,80,81,82,83,84,85,86,87,88,89,90,91,92,93,94,95,
				96,97,98,99,100};
		String num[]={"uno","dos","tres","cuatro","cinco","seis","siete","ocho","nueve","diez",
				"once","doce","trece","catorce","quince","dieciseis","diecisiete","dieciocho","diecinueve","veinte",
				"veintiuno","veintidos","veintitres","veinticuatro","veinticinco","veintiseis","veintisiete","veintiocho","veintinueve","treinta",
				"treintaiuno","treintaidos","treintaitres","treintaicuatro","treintaicinco","treintaiseis","treintaisiete","treintaiocho","treintainueve","cuareta",
				"cuarentaiuno","cuarentaidos","cuarentaitres","cuarentaicuatro","cuarentaicinco","cuarentaiseis","cuarentaisite","cuarentaiocho","cuarentainueve","cincuenta",
				"cincuentaiuno","cincuentaidos","cicuentaitres","cincuentaicuatro","cincuentaicinco","cincuentaiseis","cincuentaisiente","cincuentaiocho","cincuentainueve","sesenta",
				"sesentaiuno","sesentaidos","sesentaitres","sesentaicuatro","sesentaicinco","sesentaiseis","sesentaisiete","sesentaiocho","sesentainueve","setenta",
				"setentaiuno","setentaidos","setentaitres","setentaicuatro","setentaicinco","setentaiseis","setentaisiete","setentaiocho","setentainueve","ochenta",
				"ochentaiuno","ochentaidos","ochentaitres","ochentaicuatro","ochentaicinco","ochentaiseis","ochentaisiete","ochentaiocho","ochentainueve","noventa",
				"noventaiuno","noventaidos","noventaitres","noventaicuatro","noventaicinco","noventaiseis","noventaisiete","noventaiocho","noventainueve","cien"};
		
		String ing=null;
		Scanner in=new Scanner (System.in);
		 System.out.println("Ingrese un n�mero: ");
 	 	ing=in.nextLine();

 for (int i=0; i<rom.length; i++){
    	
    	 	String temp=ing;
    	 	
			if (ing.equalsIgnoreCase(rom[i])){
				System.out.println(num[i]);
			}
			
		}
		
	}
	
}
