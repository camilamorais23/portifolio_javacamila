//Desenvolvido por:Camila e Maria                 
import java.util.Scanner;
public class Exe_01 {
	public static void main(String[] args) {

		Scanner scanner = new Scanner(System.in);

		System.out.println("Digite um numero de 1 a 100: ");
		int x = scanner.nextInt();

		if (x < 1 || x > 100) {
			System.out.println("Número digitado inválido.");
		} else {

			for (int i = 1; i <= x; i++) {
				if (i % 2 != 0) {
					System.out.println(i);
				}
			}
		}

		scanner.close();
	}
}
