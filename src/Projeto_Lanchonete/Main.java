package Projeto_Lanchonete;


import java.util.Scanner;


public class Main {

    //Criação do Scanner, nomeado a entrada de "scanner"
    static Scanner scanner = new Scanner(System.in);
    static double total = 0;
    static double troco;

    public static void main(String[] args) {
        //Definição de variavel
        int escolha = 8, escolhaDois = 0;
        int opcaoUm, vRecebido = 0;
        Produto[] produtos = criarProduto();
        Menu utilizar = new Menu();


        JOMensagens.welcome();


        for (int parametro = 0; parametro <= escolha; ) {
            utilizar.menuUm(produtos);
            parametro = scanner.nextInt();
            if (parametro == 1) {
                total += criarPedido(produtos[parametro - 1], utilizar);
            }
            if (parametro == 2) {
                total += criarPedido(produtos[parametro - 1], utilizar);
            }
            if (parametro == 3) {
                total += criarPedido(produtos[parametro - 1], utilizar);
            }
            if (parametro == 4) {
                total += criarPedido(produtos[parametro - 1], utilizar);
            }
            if (parametro == 5) {
                total += criarPedido(produtos[parametro - 1], utilizar);
            }
            if (parametro == 6) {
                total += criarPedido(produtos[parametro - 1], utilizar);
            }
            if (parametro == 7) {
                total += criarPedido(produtos[parametro - 1], utilizar);
            }
            if (parametro == 8)
                total += criarPedido(produtos[parametro - 1], utilizar);
        }
        JOMensagens.pedidoFinalizado(total);
        System.out.println("-----------------------");
        System.out.println("Selecione forma de pagamento");
        System.out.println("1-Cartão");
        System.out.println("2 - Dinheiro");
        System.out.println("-----------------------");
        opcaoUm = scanner.nextInt();
        switch (opcaoUm) {
            case 1:
                JOMensagens.finalizarPedido();
                break;
            case 2:
                for (int apoio = 0; apoio <= escolhaDois; ) {
                    System.out.println("Insira o valor :");
                    vRecebido = scanner.nextInt();
                    if (vRecebido > total) {
                        apoio = 2;
                        troco = (vRecebido - total);
                        JOMensagens.finalizarPedidoTroco(troco);

                    } else if (vRecebido == total) {
                        apoio = 2;
                        JOMensagens.finalizarPedido();

                    } else if (vRecebido < total) {
                        System.out.println("Valor incorreto");

                    }

                }
        }
    }

    private static double criarPedido(Produto produto, Menu utilizar) {
        double total = 0;
        int quantidade = 0;

        System.out.println("Descrição do " + produto.getNome() + ": " + produto.getDescricao());
        System.out.println("Preço: " + produto.getPreco());

        utilizar.menuDois();
        System.out.println("selecione a opção");

        utilizar.setOpcao(scanner.nextInt());

        switch (utilizar.getOpcao()) {
            case 1:
                System.out.println("Quantos " + produto.getNome() + " gostaria de comprar:");
                quantidade += (quantidade = scanner.nextInt());
                total = (produto.getPreco() * quantidade);
                JOMensagens.pedidoSucesso(total);
                break;
            case 2:
                break;
            default:
                System.out.println("Escolha invalida");
                break;
        }

        return total;
    }

    private static Produto[] criarProduto() {
        Produto x_burguer = new Produto("X-burguer", "pão trad, burguer bovino 140g, maionese branca da casa", 13.90);
        Produto x_salada = new Produto("X-salada", "pão trad, burguer bovino 140g, queijo pratro, alface, tomate, cebola, picles e maionese de salsa e alho", 14.90);
        Produto x_bacon = new Produto("X-bacon", "pão australiano, burguer bovino 140g, queijo cheddar, bacon e maionese branca da casa", 16.90);
        Produto fritas = new Produto("Fritas", "batata frita com tempero especial e maionese da casa", 10.90);
        Produto Suco_de_laranja = new Produto("Suco de laranja", "300 ml", 6.50);
        Produto suco_de_morango = new Produto("Suco de morango", "300ml", 6.50);
        Produto agua = new Produto("Agua", "sem gas", 2.50);
        Produto refrigerante_lata = new Produto("Refrigerante lata", "350ml", 5.00);

        Produto[] produtos = {x_burguer, x_salada, x_bacon, fritas, Suco_de_laranja, suco_de_morango, agua, refrigerante_lata};
        return produtos;
    }

}

