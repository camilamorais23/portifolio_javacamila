import java.util.Scanner;
public class ValorEquals {

	public static void main(String[] args) {
		
		Scanner scanner = new Scanner(System.in);
		
		String valor ;
		
		System.out.println("Digite bom dia,boa tarde ou boa noite: ");
		valor = scanner.nextLine();
		
		
		if (valor.equalsIgnoreCase("boa tarde")) {
			System.out.println("Boa tarde");
		}
		
		else if(valor.equalsIgnoreCase("bom dia")) {
			System.out.println("Bom dia");
		}
		else {
			System.out.println("Boa noite");
		}

		}

	}


