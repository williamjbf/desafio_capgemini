package menus;

import questoes.questao1.GeradorEscada;

import java.util.Scanner;

public class MenuQuestao1 {

    private final GeradorEscada geradorEscada = new GeradorEscada();
    private final StringBuilder stringBuilder = new StringBuilder();
    private final Scanner scan = new Scanner(System.in);

    private final boolean continuar = true;

    public MenuQuestao1() {
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
                        System.out.println("Digite o tamanho da escada");
                        int tamanho = scan.nextInt();
                        String escada = geradorEscada.criarEscada(tamanho);
                        System.out.println(escada);
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
        stringBuilder.append("----Menu Questao 1 ----");
        stringBuilder.append("\nDigite 1 para gerar a escada");
        stringBuilder.append("\nDigite 2 para voltar ao menu principal");
        return stringBuilder.toString();
    }

    private void limparStringBuilder() {
        stringBuilder.delete(0, stringBuilder.length());
    }

}
