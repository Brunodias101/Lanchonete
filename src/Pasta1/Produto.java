package Pasta1;

public class Produto {
    //Definição de váriavel
    private String nome;
    private String descricao;
    private Double preco;

    // método construtor
    public Produto(String n, String d, double p) {
        this.setNome(n);
        this.setDescricao(d);
        this.setPreco(p);
    }
    //Criação dos gettters e setters

    public String getNome() {
        return this.nome;
    }

    public void setNome(String nome) {

        this.nome = nome;
    }

    public String getDescricao() {
        return this.descricao;
    }

    public void setDescricao(String descricao) {
        this.descricao = descricao;
    }

    public Double getPreco() {
        return this.preco;
    }

    public void setPreco(Double preco) {
        this.preco = preco;
    }


}
