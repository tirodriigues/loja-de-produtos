package loja;

public class CD extends Produto {
    private int faixas;

    public CD(String nome, double preco, int faixas) {
        super(nome, preco);
        this.faixas = faixas;
    }

    @Override
    public String getDescricao() {
        return "CD: " + nome + " com " + faixas + " faixas. Preço: R$" + preco;
    }
}
