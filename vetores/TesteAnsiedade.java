//Exercicios:
//CRIE UM PROGRAMA CHAMADO TESTE DE ANSIEDADE ONDE O USTUÁRIO RESPONDERA 10 PERGUNTAS ESPECÍFICAS PARA O RESULTADO FINAL O USUÁRIO PODE RESPONDER APENAS SIM OU NÃO PARA CADA PERGUNTA
//AS PERGUNTAS ESPECÍFICAS SÃO
//Você se sente com dificuldade de concentração?
//Você se sente cansado facilmente?
//Tem dificuldades em adormecer ou permanecer a dormir?
//Você se preocupa muito com o futuro?
//Tem dificuldade em relaxar?
//Sentiu-se tão preocupado que foi dificil ficar parado?
//Sentiu-se facilmente irritável ou chateado?
//Sentiu medo como se algo muito ruim fosse acontecer?
//Você se preocupa com a opinião dos outros?
//Você está com dificuldades em lembrar os detalhes?

import java.util.Scanner;

public class TesteAnsiedade {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        String[] perguntas = new String[10];
        String[] respostas = new String[10];

        System.out.println("Esse é um teste para saber o nível de sua ansiedade.");
        System.out.println("Digite 'sim' ou 'não' para as perguntas abaixo.");

        perguntas[0] = "Você se sente com dificuldade de concentração?";
        perguntas[1] = "Você se sente cansado facilmente?";
        perguntas[2] = "Tem dificuldade em adormecer ou permanecer a dormir?";
        perguntas[3] = "Você se preocupa muito com o futuro?";
        perguntas[4] = "Tem dificuldade em relaxar?";
        perguntas[5] = "Sentiu-se tão preocupado que foi difícil ficar parado?";
        perguntas[6] = "Sentiu-se facilmente irritável ou chateado?";
        perguntas[7] = "Sentiu medo como se algo muito ruim fosse acontecer?";
        perguntas[8] = "Você se preocupa com a opinião dos outros?";
        perguntas[9] = "Você está com dificuldade em lembrar de detalhes?";

        for (int i = 0; i < perguntas.length; i++) {
            System.out.println((i + 1) + ". " + perguntas[i]);
            respostas[i] = scanner.nextLine().trim().toLowerCase();
        }

        int contSim = 0;

        for (String resposta : respostas) {
            if (resposta.equals("sim")) {
                contSim++;
            }
        }

        String classificacao;
        if (contSim >= 7) {
            classificacao = "Você possui fortes indicios de ansiedade.Faça terapia.";
        } else if (contSim >= 4) {
            classificacao = "Você está aparentemente bem e sem risco de ansiedade.";
        } else {
            classificacao = "Você precisa cuidar do corpo e da mente. Procure orientação médica.";
        }

        System.out.println("Você respondeu 'sim' a " + contSim + " perguntas.");
        System.out.println("Classificação: " + classificacao);

        scanner.close();
    }
}