import junit.framework.TestCase;
import questoes.questao1.GeradorEscada;

import static org.junit.Assert.assertNotEquals;

public class TestQuestao1 extends TestCase {

    public void testDevePassarNoTesteCasoAsEscadasSejamIguais(){

        GeradorEscada geradorEscada = new GeradorEscada();

        String escadaEsperada = "     *\n" +
                "    **\n" +
                "   ***\n" +
                "  ****\n" +
                " *****\n" +
                "******\n";
        String escadaRecebida = geradorEscada.criarEscada(6);
        assertEquals(escadaEsperada,escadaRecebida);
    }

    public void testDevePassarNoTesteCasoAsEscadasSejamDiferentes(){
        GeradorEscada geradorEscada = new GeradorEscada();

        String escadaEsperada = "     *\n" +
                "    **\n" +
                "   ***\n";
        String escadaRecebida = geradorEscada.criarEscada(6);
        assertNotEquals(escadaEsperada, escadaRecebida);
    }

}
