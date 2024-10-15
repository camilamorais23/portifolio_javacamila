//Desenvolvido por:Natiely e Lorena         Data:23/09
import java.util.Scanner;

public class Exe_02 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        
        System.out.print("Digite a quantidade de valores a serem lidos: ");
        int N = scanner.nextInt();
        
        int dentro = 0;
        int fora = 0;

        // Lê os valores de X e verifica se estão dentro ou fora do intervalo [10, 20]
        for (int i = 0; i < N; i++) {
            System.out.print("Digite o valor inteiro " + (i + 1) + ": ");
            int X = scanner.nextInt();
            
            if (X >= 10 && X <= 20) {
                dentro++;
            } else {
                fora++;
            }
        }
        
        
        System.out.println(dentro + " dentro");
        System.out.println(fora + " fora");
        
        scanner.close();
    }
}