package ejercicios;
import java.util.Scanner;
public class Ejer4 {
	    private int n;
	    private Scanner teclado;
	    public void calculo() {
	        teclado = new Scanner(System.in);
	        System.out.print("Introduce un número entero:(numero 5) ");
	        n = teclado.nextInt();
	        System.out.println("Tabla del " + n);
	        for(int i = 1; i<=10; i++){
	             System.out.println(n + " * " + i + " = " + n*i);
	        }
	    }
	        public static void main(String[]ar){
	    	Ejer4 tabla1;
	    	tabla1=new Ejer4();
	    	tabla1.calculo();
	        }
	    }

	    


