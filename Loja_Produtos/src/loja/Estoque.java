package loja;

import java.util.ArrayList;

public class Estoque {
    private ArrayList<Produto> produtos;

    public Estoque() {
        produtos = new ArrayList<>();
    }

    public void adicionarProduto(Produto produto) {
        produtos.add(produto);
    }

    public void listarProdutos() {
        if (produtos.isEmpty()) {
            System.out.println("Estoque vazio.");
            return;
        }

        for (int i = 0; i < produtos.size(); i++) {
            Produto p = produtos.get(i);
            System.out.println((i + 1) + ". " + p.getNome() + " - R$" + p.getPreco());
        }
    }

    public void exibirDetalhes(int indice) {
        if (indice < 0 || indice >= produtos.size()) {
            System.out.println("Índice inválido.");
            return;
        }
        Produto p = produtos.get(indice);
        System.out.println(p.getDescricao());
    }
}
