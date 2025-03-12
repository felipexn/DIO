package map.ex22;

import java.util.HashMap;
import java.util.Map;

/*2. Contagem de Palavras
Crie uma classe chamada "ContagemPalavras" que utilize um Map para armazenar as palavras e a quantidade de vezes que cada palavra aparece em um texto. Implemente os seguintes métodos:

adicionarPalavra(String palavra, Integer contagem): Adiciona uma palavra à contagem.
removerPalavra(String palavra): Remove uma palavra da contagem, se estiver presente.
exibirContagemPalavras(): Exibe todas as palavras e suas respectivas contagens.
encontrarPalavraMaisFrequente(): Encontra a palavra mais frequente no texto e retorna a palavra e sua contagem.*/
public class ContagemPalavras {
    private Map<String,Integer> palavraMap;

    public ContagemPalavras() {
        this.palavraMap = new HashMap<>();
    }
    public void adicionaPalavra(String palavra,int contagem) {
        palavraMap.put(palavra,contagem);
    }
    public void removePalavra(String palavra) {
        if(!palavraMap.isEmpty()){
            palavraMap.remove(palavra);
        }else System.out.println("map vazio");
    }
    public void exibirContagemPalavras(){
        if(!palavraMap.isEmpty()){
            System.out.println(palavraMap);
        }else System.out.println("map vazio");
    }
    public void encontrarPalavraMaisFrequente(){
        int maisFrequente=0;
        String palavra=null;
        if(!palavraMap.isEmpty()){
            for (Map.Entry<String,Integer> p : palavraMap.entrySet()) {
                if(p.getValue() > maisFrequente){
                    maisFrequente = p.getValue();
                    palavra=p.getKey();
                }
            }
        }else System.out.println("map vazio");
        System.out.println(palavra);
    }

    public static void main(String[] args) {
        ContagemPalavras palavra = new ContagemPalavras();

        palavra.adicionaPalavra("asda",5);
        palavra.adicionaPalavra("asd",3);
        palavra.exibirContagemPalavras();
        palavra.encontrarPalavraMaisFrequente();
    }
}
