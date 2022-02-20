package questoes.questao2.validacoes;

public enum TiposValidacoes {

    CARACTERES_ESPECIAIS("[!@#$%^&*()-+]"),
    DIGITO("\\p{Digit}"),
    LETRA_MINUSCULA("\\p{Lower}"),
    LETRA_MAIUSCULA("\\p{Upper}");

    private final String valor;

    TiposValidacoes(String valor) {
        this.valor = valor;
    }

    public String getValor() {
        return this.valor;
    }

}
