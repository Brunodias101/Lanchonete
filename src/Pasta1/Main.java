package Pasta1;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        //Definição de variavel
        int quantidadeP1 = 0, quantidadeP2 =0;
        double total, totalP1 = 0, totalP2 =0 ;
        int escolha = 8;
        double pedido;

        //Criação do Scanner, nomeado a entrada de "scanner"
        Scanner scanner = new Scanner(System.in);

        Metodos utilizar = new Metodos();

        //criacao de objeto-produto

        Produto x_burguer = new Produto("X-burguer", "pão trad, burguer bovino 140g, maionese branca da casa", 13.90);
        Produto x_salada = new Produto("X-salada", "pão trad, burguer bovino 140g, queijo pratro, alface, tomate, cebola, picles e maionese de salsa e alho",14.90);


        for (int parametro = 0; parametro <= escolha; ) {
            utilizar.primeiraEscolha();
            parametro = scanner.nextInt();
            if (parametro == 1) {
                System.out.println("Descrição do X-burguer: "+x_burguer.getDescricao());
                System.out.println("Preço: "+x_burguer.getPreco());

                utilizar.segundaEscolha();
                System.out.println("selecione a opção");

                utilizar.setOpcao(scanner.nextInt());


                switch (utilizar.getOpcao()) {
                    case 1:
                        System.out.println("Quantos " + x_burguer.getNome() + " gostaria de comprar:");
                        quantidadeP1 += (quantidadeP1 = scanner.nextInt());
                        totalP1 =  (13.90 * quantidadeP1);
                        pedido= totalP1;
                        System.out.println("Foi adicionado "+pedido+" a sua compra");

                        break;

                    case 2:
                        break;

                    default:
                        System.out.println("Escolha invalida");
                        break;


                }

            }
            if (parametro == 2) {

                System.out.println("Descrição do X-salada: "+x_salada.getDescricao());
                System.out.println("Preço: "+x_salada.getPreco());

                utilizar.segundaEscolha();
                System.out.println("selecione a opção");

                utilizar.setOpcao(scanner.nextInt());


                switch (utilizar.getOpcao()) {
                    case 1:
                        System.out.println("Quantos " + x_salada.getNome() + " gostaria de comprar:");
                        quantidadeP2 += (quantidadeP2 = scanner.nextInt());
                        totalP2 =  (14.90 * quantidadeP2);
                        pedido= totalP2;
                        System.out.println("Foi adicionado "+pedido+" a sua compra");

                        break;

                    case 2:
                        break;

                    default:
                        System.out.println("Escolha invalida");
                        break;


                }

            }

        }
        total= totalP1 + totalP2 ;
        System.out.println("O valor total do pedido é de R$ "+total);
    }

}


