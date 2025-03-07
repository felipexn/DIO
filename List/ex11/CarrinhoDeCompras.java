package ex11;

/*Carrinho de Compras:
Crie uma classe chamada "CarrinhoDeCompras" que representa um carrinho de compras online. O carrinho deve ser implementado como uma lista de itens. Cada item é representado por uma classe chamada "Item" que possui atributos como nome, preço e quantidade. Implemente os seguintes métodos:

adicionarItem(String nome, double preco, int quantidade): Adiciona um item ao carrinho com o nome, preço e quantidade especificados.
removerItem(String nome): Remove um item do carrinho com base no seu nome.
calcularValorTotal(): Calcula e retorna o valor total do carrinho, levando em consideração o preço e a quantidade de cada item.
exibirItens(): Exibe todos os itens presentes no carrinho, mostrando seus nomes, preços e quantidades.*/

import java.util.ArrayList;
import java.util.List;

public class CarrinhoDeCompras {
    private List<Item>  listaItems;
    public CarrinhoDeCompras() {
        listaItems = new ArrayList<Item>();
    }
    public void adicionaItem(String nome, int quantidade, double preco) {
        listaItems.add( new Item(nome, quantidade, preco));
    }
    public void removerItem(String nome) {
        List<Item> itemPraRemover = new  ArrayList<>();
        if(!listaItems.isEmpty()){
            for(Item item : listaItems){
                if(item.getNome().equalsIgnoreCase(nome)){
                    itemPraRemover.add(item);
                }
            }
        }
        listaItems.removeAll(itemPraRemover);
    }
    public double calculaValorTotal() {
        double total = 0;
        for(Item item : listaItems){
            total =  total+ item.getPreco()*item.getQuantidade();
        }
        return total;
    }
    public void exibeItens(){
        for(Item item : listaItems){
            System.out.println(item.toString());
        }

    }

    public static void main(String[] args) {
        CarrinhoDeCompras lista = new CarrinhoDeCompras();
        lista.adicionaItem("leite", 10, 6.0);
        lista.adicionaItem("cafe", 20, 55.0);
        lista.adicionaItem("tomate", 30, 7.0);
        lista.adicionaItem("cebola", 40, 5.0);

        lista.removerItem("tomate");
        System.out.println(lista.calculaValorTotal());
        lista.exibeItens();

    }


}
