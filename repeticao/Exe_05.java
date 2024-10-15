//Desenvolvido por:Natiely e Lorena         Data:23/09
import java.util.Scanner;

public class Exe_05 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        
        System.out.print("Digite um número inteiro positivo: ");
        int N = scanner.nextInt();

        // Verifica se o número é positivo
        if (N > 0) {
            // Gera as linhas de 1 até N
            for (int i = 1; i <= N; i++) {
                int quadrado = i * i;
                int cubo = i * i * i;
                System.out.println(i + " " + quadrado + " " + cubo);
            }
        } else {
            System.out.println("Por favor, insira um número inteiro positivo.");
        }

        scanner.close();
    }
}
