package loja;

public class Livro extends Produto {
    private String autor;
    private int paginas;

    public Livro(String nome, double preco, String autor, int paginas) {
        super(nome, preco);
        this.autor = autor;
        this.paginas = paginas;
    }

    @Override
    public String getDescricao() {
        return "Livro: " + nome + " por " + autor + " com " + paginas + " páginas. Preço: R$" + preco;
    }
}
