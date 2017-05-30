package ejercicios;

import java.util.Scanner; 

public class Ejer1 {
	//clase MiClase
	// metodo miMetodo
	
	private Scanner teclado ;
	private int precio;
	private int cant;
	private int oper;
	
	public void Inicio(){
		teclado=new Scanner(System.in);
		System.out.print("Introducir el precio: ");
		precio=teclado.nextInt();
		System.out.print("Introducir la cantidad: ");
		cant=teclado.nextInt();
	}
	public void Abonar(){
		oper=precio*cant;
		System.out.print("La cantidad a pagar es: "+oper);
	}

	public static void main(String[] a){
		Ejer1 x;
		x=new Ejer1();
		x.Inicio();
		x.Abonar();
	}
}


