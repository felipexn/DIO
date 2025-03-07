package ex22;

import java.util.ArrayList;
import java.util.List;

/*
2. Soma de Números
Crie uma classe chamada "SomaNumeros" que possui uma lista de números inteiros como atributo. Implemente os seguintes métodos:

adicionarNumero(int numero): Adiciona um número à lista de números.
calcularSoma(): Calcula a soma de todos os números na lista e retorna o resultado.
encontrarMaiorNumero(): Encontra o maior número na lista e retorna o valor.
encontrarMenorNumero(): Encontra o menor número na lista e retorna o valor.
exibirNumeros(): Retorna uma lista contendo todos os números presentes na lista.
 */
public class SomaNumeros {
    private List<Integer> listaNumeros;
    public SomaNumeros() {
        listaNumeros = new ArrayList<Integer>();
    }

    public void adcionarNumero(int numero){
        listaNumeros.add(numero);

    }
    public int calcularSoma() {
        int soma = 0;
        for (Integer numero : listaNumeros) {
            soma += numero;
        }
        return soma;
    }
    public int encontrarMaiorNumero() {
        int maior = 0;
        for (Integer numero : listaNumeros) {
            if (numero > maior) {
                maior = numero;
            }
        }
        return maior;
    }
    public int encontrarMenorNumero() {
        int menor = listaNumeros.get(0);
        for (Integer numero : listaNumeros) {
            if (numero < menor) {
                menor = numero;
            }
        }
        return menor;
    }
    public void exibirNumeros(){
        System.out.println(listaNumeros);
    }

    public static void main(String[] args) {
        SomaNumeros somaNumeros = new SomaNumeros();

        somaNumeros.adcionarNumero(13);
        somaNumeros.adcionarNumero(25);
        somaNumeros.adcionarNumero(24);
        somaNumeros.adcionarNumero(14);

        System.out.println(somaNumeros.calcularSoma());
        System.out.println(somaNumeros.encontrarMaiorNumero());
        System.out.println(somaNumeros.encontrarMenorNumero());
        somaNumeros.exibirNumeros();
    }



}
