package ex2;

import java.util.ArrayList;
import java.util.List;

public class CatalagoLivro {
    private List<Livro> livrosList;
    public CatalagoLivro() {
        this.livrosList = new ArrayList<>();
    }

    public void addLivro(String titulo, String autor, int ano) {
        livrosList.add(new Livro(titulo, autor, ano));
    }
    public List<Livro> pesquisarPorAutor(String autor) {
        List<Livro> livrosPorAutor = new ArrayList<>();
        if (!livrosList.isEmpty()) {
            for (Livro livro : livrosList) {
                if (livro.getAutor().equalsIgnoreCase(autor)) {
                    livrosPorAutor.add(livro);

                }
            }

        }
        return livrosPorAutor;
    }

    public List<Livro> pesquisarPorIntervaloDeAno(int anoInicial, int anoFinal) {
        List<Livro> livrosPorAno = new ArrayList<>();
        if (!livrosList.isEmpty()) {
            for (Livro livro : livrosList) {
                if(livro.getAnoDePublicacao() >= anoInicial && livro.getAnoDePublicacao() <= anoFinal) {
                    livrosPorAno.add(livro);
                }
            }
        }
        return livrosPorAno;
    }
    public Livro getLivro(String titulo) {
        Livro livro = null;
        if (!livrosList.isEmpty()) {
            for (Livro livros : livrosList) {
                if (livros.getTitulo().equalsIgnoreCase(titulo)) {
                    livro = livros;
                    break;
                }

            }
        }
        return livro;

    }





}
