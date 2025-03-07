package ex33;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
/* Ordenação de Números
Crie uma classe chamada "OrdenacaoNumeros" que possui uma lista de números inteiros como atributo. Implemente os seguintes métodos:

adicionarNumero(int numero): Adiciona um número à lista.
ordenarAscendente(): Ordena os números da lista em ordem ascendente usando a interface Comparable e a class Collections.
ordenarDescendente(): Ordena os números da lista em ordem descendente usando um Comparable e a class Collections.*/

public class OrdenacaoNumeros {
    private List<Integer> numeros;
    public OrdenacaoNumeros() {
        numeros = new ArrayList<>();
    }
    public void adicionarNumero(int numero) {
        numeros.add(numero);
    }
    public void ordernarAscendente(){
        Collections.sort(numeros);
        System.out.println(numeros);
    }
    public void ordernarDescendente(){
        Collections.reverse(numeros);
        System.out.println(numeros);
    }

    public static void main(String[] args) {
        OrdenacaoNumeros numeros = new OrdenacaoNumeros();
        numeros.adicionarNumero(12);
        numeros.adicionarNumero(23);
        numeros.adicionarNumero(13);
        numeros.adicionarNumero(43);
        numeros.adicionarNumero(15);

        System.out.println(numeros.numeros);
        numeros.ordernarAscendente();
        numeros.ordernarDescendente();


    }


}
