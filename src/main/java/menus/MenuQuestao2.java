package menus;

import questoes.questao2.Validador;
import questoes.questao2.model.Senha;

import java.util.Scanner;

public class MenuQuestao2 {

    private final StringBuilder stringBuilder = new StringBuilder();
    private final Scanner scan = new Scanner(System.in);

    private final boolean continuar = true;

    public MenuQuestao2() {
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
                        System.out.println("Digite a senha");
                        String senhaUsuario = scan.nextLine();
                        Senha senha = new Senha(senhaUsuario);
                        String resultadoValidacao = new Validador(senha).verificarSeguranca();
                        System.out.println(resultadoValidacao);
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
        stringBuilder.append("----Menu Questao 2 ----");
        stringBuilder.append("\nDigite 1 para validar a senha");
        stringBuilder.append("\nDigite 2 para voltar ao menu principal");
        return stringBuilder.toString();
    }

    private void limparStringBuilder() {
        stringBuilder.delete(0, stringBuilder.length());
    }
}
