//Desenvolvido por Leticia Verdelho Ribeiro

import java.util.Scanner;

public class Calc_IMC {

	public static void main(String[] args) {
		
		Scanner scanner = new Scanner (System.in);
		
		System.out.print("Digite seu Nome: ");
		String nome = scanner.nextLine();
		
		System.out.print("Digite seu Sexo: ");
		String sexo = scanner.nextLine();
		
		System.out.print("Digite sua idade: ");
		int idade = scanner.nextInt();
		
		System.out.print("Digite seu Peso: ");
		double peso = scanner.nextDouble();
		
		System.out.print("Digite sua Altura: ");
		double altura = scanner.nextDouble();
		
		double IMC =  peso / (altura*altura);
		
		System.out.println("Seu IMC é: " + IMC);
		
		if (IMC == 18.5) {
			
	    System.out.println( nome + " voce está Abaixo do Peso");	
	    
		}
		else if(IMC >= 18.6 &&  IMC <= 24.9 ){
			
			System.out.println( nome + " Voce está no Peso ideal, Parabéns");
			
	    } 
		else if(IMC >= 25.5 && IMC <= 29.9){
			
			System.out.println( nome + " Voce está Levemente acima do Peso");
		
		}
		else if(IMC >= 30.0 && IMC <= 34.9) {
			
			System.out.println( nome + " Voce está Obesidade grau I ");
			
		}
		else if(IMC >= 35.0 && IMC <= 39.9) {
			
			System.out.println( nome + " Voce está Obesidade grau II (severa) ");
			
		}
		else {
			
			System.out.println( nome + " Voce está Obesidade grau IIi (mÓrbida) ");
			
		}
		
		
	
		scanner.close();

		
	}

}
