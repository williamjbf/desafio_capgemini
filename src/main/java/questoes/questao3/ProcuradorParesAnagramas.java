package questoes.questao3;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class ProcuradorParesAnagramas {

    public int procurarParAnagrama(String anagrama) {
        List<char[]> anagramas = new ArrayList<>();

        for (int letra1 = 0; letra1 < anagrama.length(); letra1++) {
            for (int letra2 = 1; letra2 < anagrama.length(); letra2++) {
                if (anagrama.charAt(letra1) == anagrama.charAt(letra2) && letra1 != letra2 && letra1 < letra2) {
                    String palavra1 = anagrama.substring(letra1, letra1 + 1);
                    String palavra2 = anagrama.substring(letra1, letra2);
                    adicionarAnagrama(palavra1, anagramas);
                    adicionarAnagrama(palavra2, anagramas);
                }
            }
        }
        return anagramas.size();
    }

    private void adicionarAnagrama(String palavra, List<char[]> anagramas) {
        char[] anagrama = palavra.toCharArray();
        Arrays.sort(anagrama);
        if (existe(anagrama, anagramas)) {
            return;
        }
        anagramas.add(anagrama);
    }

    private boolean existe(char[] palavra, List<char[]> anagramas) {
        for (char[] anagrama : anagramas) {
            if (Arrays.equals(anagrama, palavra)) {
                return true;
            }
        }
        return false;

    }

}
