package ex3;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;

public class OrdenacaoDePessoa {
    private List<Pessoa> pessoas;

    public OrdenacaoDePessoa() {
        pessoas = new ArrayList<Pessoa>();
    }

    public void adicionaPessoa(String nome, int idade, double altura) {
        pessoas.add(new Pessoa(nome, idade, altura));
    }
    public List<Pessoa> ordenarPorIdade() {
        List<Pessoa> pessoasOrdenadas = new ArrayList<>(pessoas);
        Collections.sort(pessoasOrdenadas);
        return pessoasOrdenadas;
    }
    public List<Pessoa> ordenarPorAltura() {
        List<Pessoa> pessoasOrdenadas = new ArrayList<>(pessoas);
        Collections.sort(pessoasOrdenadas, new ComparatorPorAltura());
        return pessoasOrdenadas;
    }
}
