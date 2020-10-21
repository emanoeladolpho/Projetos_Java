package controller;

import javafx.beans.property.SimpleDoubleProperty;
import javafx.beans.property.SimpleIntegerProperty;
import javafx.beans.property.SimpleStringProperty;

public class Produto {
    private SimpleIntegerProperty quantidade;
    private SimpleStringProperty nome;
    private SimpleDoubleProperty preco;
    private SimpleStringProperty codigo;

    public Produto(int quantidade, String nome, double preco, String codigo) {
        this.quantidade = new SimpleIntegerProperty(quantidade);
        this.nome = new SimpleStringProperty(nome);
        this.preco = new SimpleDoubleProperty(preco);
        this.codigo = new SimpleStringProperty(codigo);
    }

    public int getQuantidade() {
        return quantidade.get();
    }

    public void setQuantidade(int quantidade) {
        this.quantidade = new SimpleIntegerProperty(quantidade);
    }

    public String getNome() {
        return nome.get();
    }

    public void setNome(String nome) {
        this.nome = new SimpleStringProperty(nome);
    }

    public double getPreco() {
        return preco.get();
    }

    public void setPreco(double preco) {
        this.preco = new SimpleDoubleProperty(preco);
    }

    public String getCodigo() {
        return codigo.get();
    }

    public void setCodigo(String codigo) {
        this.codigo = new SimpleStringProperty(codigo);
    }
}
