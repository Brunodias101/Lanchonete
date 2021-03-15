package Projeto_Lanchonete;

import javax.swing.JOptionPane;
import java.text.DecimalFormat;

public class JOMensagens {
    public static void welcome() {
        JOptionPane.showMessageDialog(null, "Bem Vindo ao Programa Lanchonete POO !\n"
                + "Clique OK para iniciar seu pedido\n"
                + "Tenha uma boa experiência!", "SEJA BEM VINDO", JOptionPane.PLAIN_MESSAGE);
    }
    public static void pedidoSucesso(double total) {
        JOptionPane.showMessageDialog(null,
                "Produto adicionado a sua comanda\n"+"com o valor de R$ "
                        +total,
                "",
                JOptionPane.PLAIN_MESSAGE);
    }
    public static void pedidoFinalizado(double total) {
        JOptionPane.showMessageDialog(null,
                "Pedido finalizao!\n"+"Valor total R$ "
                        +total+"\n"+"Clique no ok para selecionar a forma de pagamento",
                "COMANDA",
                JOptionPane.PLAIN_MESSAGE);
    }
    public static void finalizarPedido() {
        JOptionPane.showMessageDialog(null,
                "Pedido finalizado com sucesso!\n"+"Obrigado pela preferência, volte sempre!!!",
                "",
                JOptionPane.PLAIN_MESSAGE);
    }
    public static void finalizarPedidoTroco(double troco) {
        DecimalFormat df= new DecimalFormat("##.##");
        JOptionPane.showMessageDialog(null,
                "Pedido finalizado com sucesso!\n"+"Seu troco é de R$"+df.format(troco)+"\n"+"Obrigado pela preferência, volte sempre!!!",
                "",
                JOptionPane.PLAIN_MESSAGE);
    }
}
