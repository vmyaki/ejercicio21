import java.util.Scanner;

public class main {

	public static void main(String[] args) {
		// Declaramos variables
		
		int num1,num2;
		
		//Mensaje
		System.out.println("Introduce un número:");
		Scanner teclado=new Scanner (System.in);
		
		num1=teclado.nextInt();
		
		do
		{
			System.out.println("Introduce otro número mayor que el anterior:");
			num2=teclado.nextInt();
			
		}
		
		while(num2<=num1);
		System.out.println("Terminado");
		
		
		
	}

}
