import java.util.*;

public class Main {
    public static void main(String[] args) {
        System.out.println("Hello, World!");
        Produto produto1 = new Produto("Liquidificador", 129.99);
        Produto produto2 = new Produto("Batedeira", 119.99);
        Produto produto3 = new Produto("Geladeira", 599.99);
        Produto produto4 = new Produto("Micro-ondas", 399.99);
        Produto produto5 = new Produto("Purificador de Água", 120.00);

        List<Produto> produtoList = new ArrayList<>();
        produtoList.add(produto1);
        produtoList.add(produto2);
        produtoList.add(produto3);
        produtoList.add(produto4);
        produtoList.add(produto5);

        for (Produto forProduto : produtoList) {
            System.out.println(forProduto.toString());
        }

        System.out.println("Você gostaria de ordenar por: nome (1) ou preço (2)? ");
        Scanner leitura = new Scanner(System.in);
        var escolha = leitura.nextInt();
        leitura.nextLine();

        int continuar = -1;
        while (continuar != 0) {
            switch (escolha) {
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
                default:
                    throw new IllegalStateException("Valor Inesperado: " + escolha);
            }
        }
    }
}