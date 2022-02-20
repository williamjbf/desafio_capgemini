package menus;

import java.util.Scanner;

public class MenuPrincipal {

    private final StringBuilder stringBuilder = new StringBuilder();
    private final Scanner scan = new Scanner(System.in);
    private int opcao;
    private boolean continuar = true;

    public MenuPrincipal() {
        while (continuar) {
            System.out.println(gerarMenu());
            try {
                opcao = scan.nextInt();
                if (opcao >= 5 || opcao <= 0) {
                    System.out.println("Opção inválida");
                    continue;
                }
                switch (opcao) {
                    case 1:
                        new MenuQuestao1();
                        break;
                    case 2:
                        new MenuQuestao2();
                        break;
                    case 3:
                        new MenuQuestao3();
                        break;
                    case 4:
                        System.out.println("Encerrando Sistema");
                        this.continuar = false;

                }
            } catch (Exception e) {
                System.out.println("Opção inválida");
                scan.nextLine();
            }

        }
    }

    private String gerarMenu() {
        limparStringBuilder();
        stringBuilder.append("----Menu Principal----");
        stringBuilder.append("\nDigite 1 para verificar as opções da questão 1");
        stringBuilder.append("\nDigite 2 para verificar as opções da questão 2");
        stringBuilder.append("\nDigite 3 para verificar as opções da questão 3");
        stringBuilder.append("\nDigite 4 para encerrar o programa");

        return stringBuilder.toString();
    }

    private void limparStringBuilder() {
        stringBuilder.delete(0, stringBuilder.length());
    }
}
