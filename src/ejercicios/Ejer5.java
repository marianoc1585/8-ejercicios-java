package ejercicios;
import java.util.Scanner;
public class Ejer5{
private Scanner teclado;
private int[] nume;
private int n, aux;
private int total;

public void ingresar(){

	teclado=new Scanner(System.in);
	do{
		System.out.print("Ingrese un numero:");
		aux = teclado.nextInt();
		if(aux!=9999){
			total += aux;
		}
	
	}while(aux!=9999);
	
}
public void sumar(){
//for(n=0;n<10000;n++){
	//total+=nums[n];
//}

			for(n=1;n<=2;n++){
			total=total+nume[n];
			}

}
public void imprimir(){
	System.out.print("La acumulacion es:"+total);
}
public static void main(String[]ar){
	Ejer5 numeros1;
	numeros1=new Ejer5();
	numeros1.ingresar();
	//numeros1.sumar();
	numeros1.imprimir();
}
}
