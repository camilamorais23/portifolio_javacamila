//Contar Quantidade de Números Pares no Vetor
//Nome:Lorena e Natiely
public class ContarPares {
    public static void main(String[] args) {
        int[] numeros = {5, 8, 2, 14, 7, 10};
        int contadorPares = 0;

        // Contar os números pares
        for (int i = 0; i < numeros.length; i++) {
            if (numeros[i] % 2 == 0) {
                contadorPares++;
            }
        }

        // Exibir a quantidade de números pares
        System.out.println("Quantidade de números pares: " + contadorPares);
    }
}
