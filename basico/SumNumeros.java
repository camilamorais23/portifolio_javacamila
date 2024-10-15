//Ele soma dois numeros.
//Nome:Lorena e Natiely
import java.util.Scanner ;
public class SumNumeros{

	public static void main(String[] args) {
		
				Scanner scanner = new Scanner(System.in) ;
				
				System.out.println("digite o primeiro numero: ") ;
				int numero1= scanner.nextInt ();
				
				System.out.println("digite o segundo numero: ") ;
				int numero2= scanner.nextInt ();
				
			
				scanner.close();
				
			    int soma= numero1 + numero2;
				
				System.out.println("A soma de " + numero1 + " + " + numero2 + " = " + soma );

	}

}

