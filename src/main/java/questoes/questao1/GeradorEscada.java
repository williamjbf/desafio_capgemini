package questoes.questao1;

public class GeradorEscada {

    public String criarEscada(int tamanho) {

        StringBuilder escada = new StringBuilder();
        int quantidadeEspacos, quantidadeAsterisco;

        for (int linha = 1; linha <= tamanho; linha++) {
            quantidadeEspacos = tamanho - linha;
            quantidadeAsterisco = tamanho - quantidadeEspacos;
            String degrau = criarDegrau(quantidadeEspacos, quantidadeAsterisco);
            escada.append(degrau).append("\n");
        }

        return escada.toString();
    }


    private String criarDegrau(int quantidadeEspaco, int quantidadeAsterisco) {
        StringBuilder sb = new StringBuilder();
        sb.append(" ".repeat(Math.max(0, quantidadeEspaco)));
        sb.append("*".repeat(Math.max(0, quantidadeAsterisco)));

        return sb.toString();
    }
}
