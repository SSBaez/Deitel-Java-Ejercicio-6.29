package com.ssbaez.ejercicio629;

import java.security.SecureRandom;
import java.util.Scanner;

public class LanzamientoMoneda {
	
	private static final SecureRandom numAleatorio = new SecureRandom();
	
	private enum Moneda{CARA, CRUZ};
	
	public static void main(String[] args) {
		
		Scanner input = new Scanner(System.in);
		
		int countCara = 0;
		int countCruz = 0;
		int countTiro = 0;
		
		System.out.println("Aplicacion que simula el lanzamiento de una moneda");
		
		while(true) {
			
			System.out.printf("Seleccione una opcion %n%s%n%s%n%s%n%s",
							  "1) Lanzar moneda",
							  "2) Mostrar estadisticas",
							  "3) Terminar",
							  "----> ");
			int seleccion = input.nextInt();
				
				if(seleccion == 1) {
					
					Moneda resultado = tirar();
					System.out.println("\nSe lanza moneda: " + resultado + "\n");
					countTiro++;
					
					if(resultado == Moneda.CARA)
						countCara++;
					
					if(resultado == Moneda.CRUZ)
						countCruz++;
				}
				else if(seleccion == 2) {
					
					System.out.printf("%n%s%d%n%s%d%n%s%d%n%n",
									  "Tiros lanzados: ", countTiro,
									  "Total CARA: ", countCara,
									  "Total CRUZ: ", countCruz);
					
				}
				else if(seleccion == 3) {
					System.out.println("\nPROGRAMA TERMINADO");
					break;
				}
				else {
					System.out.println("\n***SELECCION ERRONEA***\n");
				}
		}
		
	}//Fin metodo main
	
	public static Moneda tirar() {
		
		Moneda cara = Moneda.CARA;
		
		int tiro = 1 + numAleatorio.nextInt(2);
		
		if(tiro == 2)
			cara = Moneda.CRUZ;
		
		return cara;
		
	}

}
