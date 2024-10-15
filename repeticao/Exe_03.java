//Desenvolvido por:Natiely e Lorena         Data:23/09
import java.util.Scanner;

public class Exe_03 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        
        System.out.print("Digite a quantidade de pares de números: ");
        int N = scanner.nextInt();
        
        // Loop para ler os pares de números e realizar a divisão
        for (int i = 0; i < N; i++) {
            System.out.print("Digite o primeiro número do par " + (i + 1) + ": ");
            int numerador = scanner.nextInt();
            
            System.out.print("Digite o segundo número do par " + (i + 1) + ": ");
            int denominador = scanner.nextInt();
            
            if (denominador == 0) {
                System.out.println("divisao impossivel");
            } else {
                double resultado = (double) numerador / denominador;
                System.out.printf("Resultado: %.1f%n", resultado);
            }
        }

        scanner.close();
    }
}
