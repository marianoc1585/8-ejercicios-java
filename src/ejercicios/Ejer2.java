package ejercicios;

import java.util.Scanner; 

public class Ejer2 {
	private Scanner teclado ;
	private int num ;
	public void inicio(){
		teclado=new Scanner(System.in);
		System.out.print("Introducir el numero a Analizar: ");
		num=teclado.nextInt();
		}
	public void analizar(){
		if(num<10){
			System.out.print("El numero ingresado es de un solo digito ");
		}else {
			int i;
			for(i=0;num>=10;i++){
				num=num/10;
			}
			i=i+1;
			System.out.print("El numero ingresado tiene "+i+" Digitos");
		}
	
	}
public static void main(String[] a){
	Ejer2 x;
	x=new Ejer2();
	x.inicio();
	x.analizar();
}
}
