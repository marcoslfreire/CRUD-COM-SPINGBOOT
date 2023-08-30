package model;


public class TransacaoFinanceira {
    private int id;
    private String descricao;
    private double valor;
    private String tipo; // "RECEITA" ou "DESPESA"

    // Construtor, getters e setters aqui

    // Exemplo de construtor
    public TransacaoFinanceira(int id, String descricao, double valor, String tipo) {
        this.id = id;
        this.descricao = descricao;
        this.valor = valor;
        this.tipo = tipo;
    }

    // Getters e setters dos atributos
    // ...

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getDescricao() {
        return descricao;
    }

    public void setDescricao(String descricao) {
        this.descricao = descricao;
    }

    public double getValor() {
        return valor;
    }

    public void setValor(double valor) {
        this.valor = valor;
    }

    public String getTipo() {
        return tipo;
    }

    public void setTipo(String tipo) {
        this.tipo = tipo;
    }
}


