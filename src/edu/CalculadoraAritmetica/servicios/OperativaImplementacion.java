package edu.CalculadoraAritmetica.servicios;

import java.util.Scanner;

public class OperativaImplementacion implements OperativaInterfaz {

	public double pedirOperando()
    {
     double operando;
     
     Scanner sc = new Scanner(System.in);
    System.out.println("Indique operando");
        operando = Double.parseDouble(sc.next());
   return operando;
    }

	
   public void dividir() {
	   double operandoUno = pedirOperando();
		double operandoDos = pedirOperando();
		double resultado = operandoUno / operandoDos;
		System.out.println(resultado);  
	   
   }

	public void multiplicar() {
		double operandoUno = pedirOperando();
		double operandoDos = pedirOperando();
		double resultado = operandoUno * operandoDos;
		System.out.println(resultado);

	}

	public void restar() {
		double operandoUno = pedirOperando();
		double operandoDos = pedirOperando();
		double resultado = operandoUno - operandoDos;
		System.out.println(resultado);
	}

	public void sumar() {
		double operandoUno = pedirOperando();
		double operandoDos = pedirOperando();
		double resultado = operandoUno + operandoDos;
		System.out.println(resultado);
	}

}
