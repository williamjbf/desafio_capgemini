import junit.framework.TestCase;
import questoes.questao3.ProcuradorParesAnagramas;

public class TestQuestao3 extends TestCase {

    public void testDeveDarTrueCasoAQuantidadeAnagramasSejamIguais(){
        int quantidadeEsperadaTeste1 = 2;
        int quantidadeEsperadaTeste2 = 3;

        ProcuradorParesAnagramas procuradorParesAnagramas = new ProcuradorParesAnagramas();

        int quantidadeRecebidaTeste1 = procuradorParesAnagramas.procurarParAnagrama("ovo");
        int quantidadeRecebidaTeste2 = procuradorParesAnagramas.procurarParAnagrama("ifailuhkqq");
        assertTrue(quantidadeEsperadaTeste1 == quantidadeRecebidaTeste1);
        assertTrue(quantidadeEsperadaTeste2 == quantidadeRecebidaTeste2);
    }

    public void testDeveDarFalseCasoAQuantidadeAnagramasSejamDiferentes(){
        int quantidadeEsperadaTeste1 = 3;
        int quantidadeEsperadaTeste2 = 4;

        ProcuradorParesAnagramas procuradorParesAnagramas = new ProcuradorParesAnagramas();

        int quantidadeRecebidaTeste1 = procuradorParesAnagramas.procurarParAnagrama("ovo");
        int quantidadeRecebidaTeste2 = procuradorParesAnagramas.procurarParAnagrama("ifailuhkqq");
        assertFalse(quantidadeEsperadaTeste1 == quantidadeRecebidaTeste1);
        assertFalse(quantidadeEsperadaTeste2 == quantidadeRecebidaTeste2);
    }
}
