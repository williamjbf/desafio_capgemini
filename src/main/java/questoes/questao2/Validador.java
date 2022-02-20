package questoes.questao2;

import questoes.questao2.model.Senha;
import questoes.questao2.validacoes.TiposValidacoes;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class Validador {

    private final static int tamanhoSenha = 6;
    private final Senha senha;
    private final String valorSenha;
    private Pattern pattern;

    public Validador(Senha senha) {
        this.senha = senha;
        this.valorSenha = senha.getValor();
    }

    public String verificarSeguranca() {

        senha.setTamanhoAceito(verificarTamanho());
        if (senha.isTamanhoAceito()) {
            senha.setTemCaracteres(verificarCaracteresEspeciais());
            senha.setTemDigito(verificarDigito());
            senha.setTemMinuscula(verificarLetraMinuscula());
            senha.setTemMaiuscula(verificarLetraMaiuscula());
            return senha.toString();
        }
        return String.format("Faltam %d caracteres", tamanhoSenha - valorSenha.length());
    }

    private boolean verificarTamanho() {
        return valorSenha.length() >= tamanhoSenha;
    }

    private boolean verificarCaracteresEspeciais() {
        this.pattern = Pattern.compile(TiposValidacoes.CARACTERES_ESPECIAIS.getValor());
        Matcher matcher = pattern.matcher(valorSenha);
        return matcher.find();
    }

    private boolean verificarDigito() {
        this.pattern = Pattern.compile(TiposValidacoes.DIGITO.getValor());
        Matcher matcher = pattern.matcher(valorSenha);
        return matcher.find();
    }

    private boolean verificarLetraMinuscula() {
        this.pattern = Pattern.compile(TiposValidacoes.LETRA_MINUSCULA.getValor());
        Matcher matcher = pattern.matcher(valorSenha);
        return matcher.find();
    }

    private boolean verificarLetraMaiuscula() {
        this.pattern = Pattern.compile(TiposValidacoes.LETRA_MAIUSCULA.getValor());
        Matcher matcher = pattern.matcher(valorSenha);
        return matcher.find();
    }

}
