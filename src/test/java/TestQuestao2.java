import junit.framework.TestCase;
import questoes.questao2.Validador;
import questoes.questao2.model.Senha;

public class TestQuestao2 extends TestCase {

    public void testDevePassarNoTesteCasoAsenhaSejaForteETodasAsvalidacoesSejamTrue(){

        Validador validador = new Validador(new Senha("Tes5*e"));
        String respostaEsperada = "A senha é forte\n" +
                "Tem Caracteres especiais = true\n" +
                "Tem digitos númericos = true\n" +
                "Tem letra minuscula = true\n" +
                "Tem letra maiuscula = true";
        String respostaRecebida = validador.verificarSeguranca();
        assertEquals(respostaEsperada,respostaRecebida);
    }

    public void testDevePassarNoTesteCasoASenhaNaoTenhaTamanhoCerto(){
        Validador validador = new Validador(new Senha("Ya3"));

        String respostaEsperada = "Faltam 3 caracteres";
        String respostaRecebida = validador.verificarSeguranca();
        assertEquals(respostaEsperada,respostaRecebida);
    }
}
