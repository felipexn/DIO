package map.ex33;

import java.util.*;

/*2. Livraria Online
Crie uma classe chamada "LivrariaOnline" que representa uma livraria online. Essa classe utiliza um Map para armazenar os livros disponíveis na livraria, utilizando o link da obra na Amazon Marketplace como chave e um objeto da classe "Livro" como valor. A classe "Livro" possui atributos como título, autor e preço. Através da classe "LivrariaOnline", implemente os seguintes métodos:

adicionarLivro(String link, String titulo, String autor, private double preco): Adiciona um livro à livraria, utilizando o ISBN como chave no Map.
removerLivro(String titulo): Remove um livro da livraria, dado o titulo do livro.
exibirLivrosOrdenadosPorPreco(): Exibe os livros da livraria em ordem crescente de preço.
pesquisarLivrosPorAutor(String autor): Retorna uma lista de todos os livros escritos por um determinado autor.
obterLivroMaisCaro(): Retorna o livro mais caro disponível na livraria.
exibirLivroMaisBarato(): Retorna o livro mais barato disponível na livraria.*/
public class LivrariaOnline {
    private Map<String, Livro> livros;

    public LivrariaOnline() {
        this.livros = new HashMap<String, Livro>();
    }

    public void adicionarLivro(String link, String nome, String autor, double preco) {
        livros.put(link, new Livro(nome, autor, preco));
    }

    public void removerLivro(String titulo) {
        if (!livros.isEmpty()) {
            for(Map.Entry<String, Livro> livro : livros.entrySet()) {
                if (livro.getValue().getTitulo().equals(titulo)) {
                    livros.remove(livro.getKey());
                }
            }
        }else System.out.println("map vazia");
    }

    public void exibirLivrosOrdenadosPorPreco() {
        List<Map.Entry<String, Livro>> livrosParaOrdenarPorPreco = new ArrayList<>(livros.entrySet());

        Collections.sort(livrosParaOrdenarPorPreco, new ComparatorPorPreco());

        Map<String, Livro> livrosOrdenadosPorPreco = new LinkedHashMap<>();

        for (Map.Entry<String, Livro> entry : livrosParaOrdenarPorPreco) {
            livrosOrdenadosPorPreco.put(entry.getKey(), entry.getValue());
        }

        System.out.println(livrosOrdenadosPorPreco);
    }
    public void exibirLivrosOrdenadosPorTitulo() {
        List<Map.Entry<String,Livro>> livrosParaOrdenadosPorTitulo = new ArrayList<>(livros.entrySet());
        Collections.sort(livrosParaOrdenadosPorTitulo,new ComparatorPorAutor());

        Map<String,Livro> livrosOrdenadosPorTitulo = new LinkedHashMap<>();
        for (Map.Entry<String,Livro> entry : livrosParaOrdenadosPorTitulo) {
            livrosOrdenadosPorTitulo.put(entry.getKey(), entry.getValue());
        }
        System.out.println(livrosOrdenadosPorTitulo);
    }

    public void pesquisarLivrosPorAutor(String autor) {
        Map<String, Livro> livrosPorAutor = new LinkedHashMap<>();
        for (Map.Entry<String, Livro> entry : livros.entrySet()) {
            Livro livro = entry.getValue();
            if (livro.getAutor().equals(autor)) {
                System.out.println(livro);
            }
        }
        //System.out.println(livrosPorAutor);
    }
    public void obterLivroMaisCaro() {
        List<Livro> livrosMaisCaros = new ArrayList<>();
        double precoMaisAlto = Double.MIN_VALUE;

        if (!livros.isEmpty()) {
            for (Livro livro : livros.values()) {
                if (livro.getPreco() > precoMaisAlto) {
                    precoMaisAlto = livro.getPreco();
                }
            }
        } else {
            throw new NoSuchElementException("A livraria está vazia!");
        }

        for(Map.Entry<String, Livro> entry: livros.entrySet()) {
            if(entry.getValue().getPreco() == precoMaisAlto) {
                Livro livroComPrecoMaisAlto = livros.get(entry.getKey());
                livrosMaisCaros.add(livroComPrecoMaisAlto);
            }
        }
        System.out.println(livrosMaisCaros);
    }
    public void obterLivroMaisBarato() {
        List<Livro> livrosMaisBaratos = new ArrayList<>();
        double precoMaisBaixo = Double.MAX_VALUE;

        if (!livros.isEmpty()) {
            for (Livro livro : livros.values()) {
                if (livro.getPreco() < precoMaisBaixo) {
                    precoMaisBaixo = livro.getPreco();
                }
            }
        } else {
            throw new NoSuchElementException("A livraria está vazia!");
        }

        for(Map.Entry<String, Livro> entry: livros.entrySet()) {
            if(entry.getValue().getPreco() == precoMaisBaixo) {
                Livro livroComPrecoMaisBaixo = livros.get(entry.getKey());
                livrosMaisBaratos.add(livroComPrecoMaisBaixo);
            }
        }
        System.out.println(livrosMaisBaratos);
    }

    public static void main(String[] args) {
        LivrariaOnline livrariaOnline = new LivrariaOnline();

        livrariaOnline.adicionarLivro("asda","feee","324",34.43);
        livrariaOnline.removerLivro("asda");
        livrariaOnline.adicionarLivro("https://amzn.to/3EclT8Z", "1984", "George Orwell", 50d);
        livrariaOnline.adicionarLivro("https://amzn.to/47Umiun", "A Revolução dos Bichos", "George Orwell", 7.05);
        livrariaOnline.adicionarLivro("https://amzn.to/3L1FFI6", "Caixa de Pássaros - Bird Box: Não Abra os Olhos", "Josh Malerman", 19.99d);
        livrariaOnline.adicionarLivro("https://amzn.to/3OYb9jk", "Malorie", "Josh Malerman", 5d);
        livrariaOnline.adicionarLivro("https://amzn.to/45HQE1L", "E Não Sobrou Nenhum", "Agatha Christie", 50d);

        livrariaOnline.obterLivroMaisCaro();
        livrariaOnline.obterLivroMaisBarato();
        livrariaOnline.exibirLivrosOrdenadosPorPreco();
        //livrariaOnline.exibirLivrosOrdenadosPorTitulo();
        livrariaOnline.pesquisarLivrosPorAutor("Josh Malerman");
        
    }
}
