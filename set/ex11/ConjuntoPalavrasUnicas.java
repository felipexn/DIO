package set.ex11;
/*2. Conjunto de Palavras Únicas
Crie uma classe chamada "ConjuntoPalavrasUnicas" que possui um conjunto de palavras únicas como atributo. Implemente os seguintes métodos:

adicionarPalavra(String palavra): Adiciona uma palavra ao conjunto.
removerPalavra(String palavra): Remove uma palavra do conjunto.
verificarPalavra(String palavra): Verifica se uma palavra está presente no conjunto.
exibirPalavrasUnicas(): Exibe todas as palavras únicas do conjunto.*/

import java.util.HashSet;
import java.util.Set;

public class ConjuntoPalavrasUnicas {
    private Set<String> palavrasUnicas;

    public ConjuntoPalavrasUnicas() {
        palavrasUnicas = new HashSet<String>();
    }

    public void adicionaPalavra(String palavra) {
        palavrasUnicas.add(palavra);
    }

    public void removerPalavra(String palavra) {

        if (!palavrasUnicas.isEmpty()) {
            if (palavrasUnicas.contains(palavra)) {
                palavrasUnicas.remove(palavra);
            }
        }
    }

    public void verificaPalavras(String palavra) {
        if (!palavrasUnicas.isEmpty()) {
            if (palavrasUnicas.contains(palavra)) {
                System.out.println("palavra " + palavra + " esta presente no conjunto");
            } else {
                System.out.println("nao existe " + palavra + " no conjunto");
            }
        } else
            System.out.println("Conjunto vazio");
    }

    public void exibirPalavrasUnicas() {
        System.out.println(palavrasUnicas);
    }

    public static void main(String[] args) {
        ConjuntoPalavrasUnicas conjunto = new ConjuntoPalavrasUnicas();
        conjunto.adicionaPalavra("A");
        conjunto.adicionaPalavra("B");
        conjunto.adicionaPalavra("C");

        conjunto.exibirPalavrasUnicas();
        conjunto.removerPalavra("A");
        conjunto.verificaPalavras("B");
        conjunto.verificaPalavras("asd");
        conjunto.exibirPalavrasUnicas();
    }
}

