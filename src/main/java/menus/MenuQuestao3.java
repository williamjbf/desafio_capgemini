package menus;

import questoes.questao3.ProcuradorParesAnagramas;

import java.util.Scanner;

public class MenuQuestao3 {


    private final StringBuilder stringBuilder = new StringBuilder();
    private final Scanner scan = new Scanner(System.in);

    private final boolean continuar = true;

    public MenuQuestao3() {
        while (continuar) {
            System.out.println(gerarMenu());
            try {
                int opcao = scan.nextInt();
                if (opcao >= 3 || opcao <= 0) {
                    System.out.println("Opção inválida");
                    continue;
                }
                switch (opcao) {
                    case 1:
                        scan.nextLine();
                        System.out.println("Digite a palavra");
                        String palavra = scan.nextLine();
                        int quantidadeAnagramaPares = new ProcuradorParesAnagramas().procurarParAnagrama(palavra);
                        System.out.println(String.format("Foi encontrado %d anagramas pares", quantidadeAnagramaPares));
                        break;
                    case 2:
                        return;
                }
            } catch (Exception e) {
                System.out.println("Opção inválida");
                scan.nextLine();
            }

        }
    }

    public String gerarMenu() {
        limparStringBuilder();
        stringBuilder.append("----Menu Questao 3 ----");
        stringBuilder.append("\nDigite 1 para ver a quantidade de anagramas pares");
        stringBuilder.append("\nDigite 2 para voltar ao menu principal");
        return stringBuilder.toString();
    }

    private void limparStringBuilder() {
        stringBuilder.delete(0, stringBuilder.length());
    }

}
