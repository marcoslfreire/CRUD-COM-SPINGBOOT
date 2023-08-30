package model;
//Gerenciamento de Produtos no Estoque:
//Agora, vamos implementar o gerenciamento de produtos no estoque. Primeiro, crie uma classe chamada "Produto" que representará cada item do estoque:

public class Produto {
    private String nome;
    private int codigo;
    private double preco;
    private int quabtidadeEmEstoque;

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public int getCodigo() {
        return codigo;
    }

    public void setCodigo(int codigo) {
        this.codigo = codigo;
    }

    public double getPreco() {
        return preco;
    }

    public void setPreco(double preco) {
        this.preco = preco;
    }

    public int getQuabtidadeEmEstoque() {
        return quabtidadeEmEstoque;
    }

    public void setQuabtidadeEmEstoque(int quabtidadeEmEstoque) {
        this.quabtidadeEmEstoque = quabtidadeEmEstoque;
    }
}
