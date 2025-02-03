import java.util.*;

public class Main {
    public static void main(String[] args) {
        Produto produto1 = new Produto("Liquidificador", 129.99);
        Produto produto2 = new Produto("Batedeira", 119.99);
        Produto produto3 = new Produto("Geladeira", 599.99);
        Produto produto4 = new Produto("Micro-ondas", 399.99);
        Produto produto5 = new Produto("Purificador de Água", 120.00);
        //produtos instanciados, com valores com o constructor

        List<Produto> produtoList = new ArrayList<>();
        produtoList.add(produto1);
        produtoList.add(produto2);
        produtoList.add(produto3);
        produtoList.add(produto4);
        produtoList.add(produto5);
        //lista com todos os produtos instanciados

        for (Produto forProduto : produtoList) {
            System.out.println(forProduto.toString());
        }
        //espécie de catalogo para melhor visualização de todos os produtos

        System.out.println("Você gostaria de ordenar por: nome (1) ou preço (2)? ");
        Scanner leitura = new Scanner(System.in);
        var escolha = leitura.nextInt();
        leitura.nextLine();
        //aqui acontence que a aplicação conversa com o usuário
        //pedindo se quer ordenar por nome ou preço, 
        //faz a leitura dos dados e salva numa variavel

        int continuar = -1;
        while (continuar != 0) {
        //variavel de controle da condição
            switch (escolha) {
                //uso da biblioteca Collections e a função sort, para organizar a lista ou por nome ou por preço
                // e printar elas depois
                case 1:
                    Collections.sort(produtoList);
                    produtoList.sort(Comparator.comparing(Produto::getNome));
                    System.out.println(produtoList);
                    break;
                case 2:
                    Collections.sort(produtoList);
                    produtoList.sort(Comparator.comparing(Produto::getPreco));
                    System.out.println(produtoList);
                    break;
                //uma exception para uma qualidade melhor de código
                default:
                    throw new IllegalStateException("Valor Inesperado: " + escolha);
            }
        }
    }
}
