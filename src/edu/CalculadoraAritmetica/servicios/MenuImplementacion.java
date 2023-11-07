package edu.CalculadoraAritmetica.servicios;

import java.util.Scanner;

public class MenuImplementacion implements MenuInterfaz {

	@Override
	public int mostrarMenuYSeleccion(Scanner comunicacionTecladoM) {

		int opcionSeleccionada;
		System.out.println("0. cerrar aplicacion");
		System.out.println("1. sumar");
		System.out.println("2. restar");
		System.out.println("3. multiplicar");
		System.out.println("4. dividir");
		System.out.println("seleccione opcion");

		opcionSeleccionada = comunicacionTecladoM.nextInt();

		return opcionSeleccionada;
	}

}
