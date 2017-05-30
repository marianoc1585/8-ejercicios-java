package ejercicios;
import java.util.Scanner;
public class Ejer6 {
private String nombre;
private int sueldo;
private Scanner teclado;

public void ingresar(){
	teclado=new Scanner(System.in);
	System.out.print("Ingrese su nombre: ");
	nombre=teclado.nextLine();
	System.out.print("Ingrese su sueldo:");
	sueldo=teclado.nextInt();
}
public void informacion(){
	System.out.print("Nombre ingresado:"+nombre+"\n");
	System.out.print("Sueldo ingresado:"+sueldo+"\n");
	if(sueldo>3000){
		System.out.print("Excedio el minimo, debe pagar impuestos");
	}else{
		System.out.println("por su sueldo, usted no debe pagar impuestos");
	}
}

public static void main(String[]ar){
	Ejer6 empleado1;
	empleado1=new Ejer6();
	empleado1.ingresar();
	empleado1.informacion();
	empleado1.informacion();
}
}