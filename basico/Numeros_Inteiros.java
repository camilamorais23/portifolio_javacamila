import java.util.Scanner;
public class Numeros_Inteiros {

	public static void main(String[] args) {
	Scanner input = new Scanner(System.in);
	
	System.out.println("Digite um número inteiro: ");
	int numero1  = input.nextInt();
	
	System.out.println("Digite um segundo número inteiro: ");
	int número2  = input.nextInt(); 
	
	int soma = numero1 + número2; 
	
	System.out.println("Digite um número inteiro: ");
	int num1  = input.nextInt();
	
	System.out.println("Digite um segundo número inteiro: ");
	int núm2  = input.nextInt(); 
	
	int Soma = num1 + núm2; 
	
	System.out.println("Digite um número inteiro: ");
	int numerointeiro1  = input.nextInt();
	
	System.out.println("Digite um segundo número inteiro: ");
	int númerointeiro2  = input.nextInt(); 
	
	int SOMA = numerointeiro1 + númerointeiro2; 
	
	System.out.println("A Soma dos números inteiros é:  " + soma);
	System.out.println("A Soma dos números inteiros é:  " + Soma);
	System.out.println("A Soma dos números inteiros é:  " + SOMA);
	
	
	input.close();
	
	}

}
