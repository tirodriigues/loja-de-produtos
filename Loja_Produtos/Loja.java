import java.util.Scanner;

public class Loja {
    public static void main(String[] args) {
        Estoque estoque = new Estoque();
        Scanner sc = new Scanner(System.in);
        int opcao;

        do {
            System.out.println("\n--- MENU ---");
            System.out.println("1. Adicionar Livro");
            System.out.println("2. Adicionar DVD");
            System.out.println("3. Adicionar CD");
            System.out.println("4. Listar Produtos");
            System.out.println("5. Exibir Detalhes de Produto");
            System.out.println("0. Sair");
            System.out.print("Opção: ");
            opcao = sc.nextInt();
            sc.nextLine(); 
            switch (opcao) {
                case 1:
                    System.out.print("Nome do livro: ");
                    String nomeLivro = sc.nextLine();
                    System.out.print("Preço: ");
                    double precoLivro = sc.nextDouble();
                    sc.nextLine();
                    System.out.print("Autor: ");
                    String autor = sc.nextLine();
                    System.out.print("Número de páginas: ");
                    int paginas = sc.nextInt();
                    estoque.adicionarProduto(new Livro(nomeLivro, precoLivro, autor, paginas));
                    break;
                case 2:
                    System.out.print("Nome do DVD: ");
                    String nomeDVD = sc.nextLine();
                    System.out.print("Preço: ");
                    double precoDVD = sc.nextDouble();
                    System.out.print("Duração (min): ");
                    int duracao = sc.nextInt();
                    estoque.adicionarProduto(new DVD(nomeDVD, precoDVD, duracao));
                    break;
                case 3:
                    System.out.print("Nome do CD: ");
                    String nomeCD = sc.nextLine();
                    System.out.print("Preço: ");
                    double precoCD = sc.nextDouble();
                    System.out.print("Número de faixas: ");
                    int faixas = sc.nextInt();
                    estoque.adicionarProduto(new CD(nomeCD, precoCD, faixas));
                    break;
                case 4:
                    estoque.listarProdutos();
                    break;
                case 5:
                    System.out.print("Digite o número do produto: ");
                    int index = sc.nextInt() - 1;
                    estoque.exibirDetalhes(index);
                    break;
                case 0:
                    System.out.println("Saindo...");
                    break;
                default:
                    System.out.println("Opção inválida.");
            }

        } while (opcao != 0);

        sc.close();
    }
}
