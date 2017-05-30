package ejercicios;

import java.util.Scanner;

public class Ejer3 {
	private int	num, pares=0, impares=0;
	private Scanner teclado;
	
	public void analisis(){
		int i;
		for(i=0; i<10; i++){
			teclado=new Scanner(System.in);
			System.out.print("Ingrese numero a analizar: ");
			num=teclado.nextInt();
			//lees numero
			if (num%2==0){
				pares += 1;
		}else{
			impares += 1;
		}
	} System.out.print("Los numeros pares son "+pares+" y los impares son "+impares);
}
	public static void main(String[] a){
		Ejer3 x;
		x=new Ejer3();
		x.analisis();
	}
}