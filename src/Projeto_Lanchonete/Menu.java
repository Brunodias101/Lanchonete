package Projeto_Lanchonete;

public class Menu {

    private int opcao;

    public int getOpcao() {
        return opcao;
    }

    public void setOpcao(int opcao) {
        this.opcao = opcao;
    }

    public void menuUm(Produto[] produtos) {
        System.out.println("----------------------------");
        System.out.println("ArquivoAntigo.Menu de opções:");
        for (int i = 0; i < produtos.length; i++) {
            System.out.println(i + 1 + "- " + produtos[i].getNome());
        }
        System.out.println("9-Finalizar pedido");
        System.out.println("----------------------------");
        System.out.println("faça uma escolha:");
        System.out.println("----------------------------");
    }

    public void menuDois() {
        System.out.println("----------------------------");
        System.out.println("1-Efetuar uma compra");
        System.out.println("2-volta ao menu de opções");
        System.out.println("----------------------------");
        System.out.println("faça uma escolha:");
        System.out.println("----------------------------");
    }
}