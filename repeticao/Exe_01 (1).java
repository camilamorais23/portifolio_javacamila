//Desenvolvido por:Natiely e Lorena         Data:23/09
import java.util.Scanner;

public class Exe_01 {
    public static void main(String[] args) {
        
        Scanner scanner = new Scanner(System.in);
        
        
        System.out.print("Digite um valor inteiro X (1 <= X <= 1000): ");
        int X = scanner.nextInt();
        
        // Verifica se o valor está dentro do intervalo permitido
        if (X >= 1 && X <= 1000) {
            // verifica os números de 1 até X
            for (int i = 1; i <= X; i++) {
                // Verifica se o número é ímpar
                if (i % 2 != 0) {
                    System.out.println(i);
                }
            }
        } else {
            System.out.println("O valor deve estar entre 1 e 1000.");
        }

        
        scanner.close();
    }
}
