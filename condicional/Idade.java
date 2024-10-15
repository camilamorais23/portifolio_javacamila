//Utilizando o if e else
import java.util.Scanner;
public class Idade {
	public static void main(String[]args) {
	    
	    	
	        // Criando o scanner para entrada de dados
	        Scanner scanner = new Scanner(System.in);

	        // Solicitando a idade ao usuário
	        System.out.print("Digite sua idade: ");
	        int idade = scanner.nextInt();

	        // Estrutura condicional para verificar se a pessoa é maior de idade
	        if (idade >= 18) {
	            System.out.println("Você é maior de idade.");
	        } else {
	            System.out.println("Você é menor de idade.");
	        }

	        // Fechando o scanner
	        scanner.close();
	    
	}

}
