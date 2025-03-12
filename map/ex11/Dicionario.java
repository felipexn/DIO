package map.ex11;

import java.util.HashMap;
import java.util.Map;

/*2. Dicionário
Crie uma classe chamada "Dicionario" que utilize um Map para armazenar palavras e suas respectivas definições. Implemente os seguintes métodos:

adicionarPalavra(String palavra, String definicao): Adiciona uma palavra e sua definição ao dicionário, associando a palavra à sua definição correspondente.
removerPalavra(String palavra): Remove uma palavra do dicionário, dado o termo a ser removido.
exibirPalavras(): Exibe todas as palavras e suas definições do dicionário, mostrando cada palavra seguida de sua respectiva definição.
pesquisarPorPalavra(String palavra): Pesquisa uma palavra no dicionário e retorna sua definição correspondente.
*/
public class Dicionario {
    private Map<String,String> dicionario;
    public Dicionario() {
        this.dicionario = new HashMap<>();
    }

    public void adicionarPalavra(String palavra,String definicao) {
        dicionario.put(palavra,definicao);
    }

    public void removerPalavra(String palavra) {
        if(!dicionario.isEmpty()) {
            dicionario.remove(palavra);
        }else System.out.println("map vazio");
    }
    public void exibirPalavras() {
        if(!dicionario.isEmpty()) {
            System.out.println(dicionario);
        }else System.out.println("map vazio");
    }
    public void pesquisarPorPalavra(String palavra) {
        String descricaoPalavra = null;
        if(!dicionario.isEmpty()) {
            descricaoPalavra = dicionario.get(palavra);
            if(descricaoPalavra != null) {
                System.out.println(descricaoPalavra);
            }else System.out.println("descricao nao encontrada");
        }else System.out.println("map vazio");
    }

    public static void main(String[] args) {
        Dicionario dicionario = new Dicionario();
        dicionario.adicionarPalavra("Palavra 1","1");
        dicionario.adicionarPalavra("Palavra 2","2");
        dicionario.adicionarPalavra("Palavra 3","3");

        dicionario.exibirPalavras();
        dicionario.pesquisarPorPalavra("Palavra 3");
        dicionario.removerPalavra("Palavra 2");
        dicionario.exibirPalavras();
    }
}
