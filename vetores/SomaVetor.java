//Somar Vetor
//Nome:Lorena e Natiely
import java.util.Scanner;

public class SomaVetor {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        
        // Criação de um vetor com 5 posições
        int[] numeros = new int[5];
        int soma = 0;

        // Preenchendo o vetor com valores fornecidos pelo usuário
        for (int i = 0; i < numeros.length; i++) {
            System.out.print("Digite o número para a posição " + i + ": ");
            numeros[i] = scanner.nextInt();
            soma += numeros[i]; // Acumula a soma
        }

        // Exibe a soma dos valores
        System.out.println("A soma dos elementos do vetor é: " + soma);
        scanner.close();
    }
}



