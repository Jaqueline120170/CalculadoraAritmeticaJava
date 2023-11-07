package edu.CalculadoraAritmetica.controladores;

import java.util.Scanner;

import edu.CalculadoraAritmetica.servicios.MenuImplementacion;
import edu.CalculadoraAritmetica.servicios.MenuInterfaz;
import edu.CalculadoraAritmetica.servicios.OperativaImplementacion;
import edu.CalculadoraAritmetica.servicios.OperativaInterfaz;

public class Inicio {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		int seleccionUsuario;
	      boolean cerrarMenu = false; 
	      Scanner comunicacionTecladoM = new Scanner(System.in);
	      MenuInterfaz mi = new MenuImplementacion ();
	      OperativaInterfaz oi = new OperativaImplementacion ();
	      
         while (!cerrarMenu)
         {
             int opcionSeleccionada = mi.mostrarMenuYSeleccion(comunicacionTecladoM);
             switch (opcionSeleccionada)
             {
                 case 0:
                     cerrarMenu = true;
                     break;
                 case 1:
                     oi.sumar();
                     break;
                 case 2:
                     oi.restar();
                     break;
                 case 3:
                     oi.multiplicar();
                     break;
                 case 4:
                     oi.dividir();
                     break;
                 default:
                     System.out.println("No se ha elegido una opción correcta");
                     break;
             }
         }

	}

}
