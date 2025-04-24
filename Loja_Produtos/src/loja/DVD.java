package loja;

public class DVD extends Produto {
    private int duracao; 

    public DVD(String nome, double preco, int duracao) {
        super(nome, preco);
        this.duracao = duracao;
    }

    @Override
    public String getDescricao() {
        return "DVD: " + nome + " com duração de " + duracao + " minutos. Preço: R$" + preco;
    }
}
