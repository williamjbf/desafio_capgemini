package questoes.questao2.model;

public class Senha {

    private String valor;
    private boolean tamanhoAceito;
    private boolean temCaracteres;
    private boolean temDigito;
    private boolean temMinuscula;
    private boolean temMaiuscula;

    public Senha(String valor) {
        this.valor = valor;
    }

    public boolean isSenhaForte() {
        return temCaracteres & temDigito & temMinuscula & temMaiuscula;
    }

    public String getValor() {
        return valor;
    }

    public void setValor(String valor) {
        this.valor = valor;
    }

    public boolean isTamanhoAceito() {
        return tamanhoAceito;
    }

    public void setTamanhoAceito(boolean tamanhoAceito) {
        this.tamanhoAceito = tamanhoAceito;
    }

    public boolean isTemCaracteres() {
        return temCaracteres;
    }

    public void setTemCaracteres(boolean temCaracteres) {
        this.temCaracteres = temCaracteres;
    }

    public boolean isTemDigito() {
        return temDigito;
    }

    public void setTemDigito(boolean temDigito) {
        this.temDigito = temDigito;
    }

    public boolean isTemMinuscula() {
        return temMinuscula;
    }

    public void setTemMinuscula(boolean temMinuscula) {
        this.temMinuscula = temMinuscula;
    }

    public boolean isTemMaiuscula() {
        return temMaiuscula;
    }

    public void setTemMaiuscula(boolean temMaiuscula) {
        this.temMaiuscula = temMaiuscula;
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append(isSenhaForte() ? "A senha é forte" : "A senha é fraca");
        sb.append("\nTem Caracteres especiais = ").append(temCaracteres);
        sb.append("\nTem digitos númericos = ").append(temDigito);
        sb.append("\nTem letra minuscula = ").append(temMinuscula);
        sb.append("\nTem letra maiuscula = ").append(temMaiuscula);
        return sb.toString();
    }
}
