package EjerciciosParcial;

import java.util.Scanner;

public class Main {
	 static Scanner Sc = new Scanner(System.in);
	 
	public static void main(String[]args) {
		
		tablaDeMultiplicar();
		calificacionesPromedio();
		generadorCoreoElectronico();
	}
	//EjercicioNo.1
	static void tablaDeMultiplicar() {
		 
		System.out.println("Ingrese un numero:(1-12)");
		int numero = Sc.nextInt();
	
		for(int i = 1; i <= 12; i++ ) 
			System.out.println(numero + " x " + i + " = " + (numero * i));
	}
	//EjercicioNo.2
	static void calificacionesPromedio() {
		double promedio = 0 ;
		
		System.out.println("Ingrese: calificacion 1:");
		double calificacion1 = Sc.nextDouble();
		System.out.println("Ingrese: calificacion 2:");
		double calificacion2 = Sc.nextDouble();
		System.out.println("Ingrese: calificacion 3:");
		double calificacion3 = Sc.nextDouble();
		System.out.println("Ingrese: calificacion 4:");
		double calificacion4 = Sc.nextDouble();
		System.out.println("Ingrese: calificacion 5:");
		double calificacion5 = Sc.nextInt();
		
		promedio = (calificacion1 + calificacion2+calificacion3+calificacion4+calificacion5)/5;
		
		System.out.println("El promedio es:" + promedio);
	}
	//EjercicioNo.3
	static void generadorCoreoElectronico() {
		
		System.out.print("Ingrese su nombre: ");
		String nombre = Sc.nextLine();

		System.out.print("Ingrese su apellido: ");
		String apellido = Sc.nextLine();

		
		String nombreProcesado = nombre.toLowerCase().replace(" ", "");
		String apellidoProcesado = apellido.toLowerCase().replace(" ", "");

		
		String correo = nombreProcesado + "" + apellidoProcesado + "@umg.edu.gt";

		System.out.println("Correo creado: " + correo);
	}
}
