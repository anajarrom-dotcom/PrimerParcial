package EjerciciosParcial;

import java.util.Scanner;

public class Main {
	 static Scanner Sc = new Scanner(System.in);
	 
	public static void main(String[]args) {
		
	}
	//EjercicioNo.1
	static void tablaDeMultiplicar() {
		 
		System.out.println("Ingrese un numero:(1-12)");
		int numero = Sc.nextInt();
	
		for(int i = 1; i <= 12; i++ ) 
			System.out.println(numero + " x " + i + " = " + (numero * i));
	}
}
