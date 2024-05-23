package exercicios.parte4;

import exercicios.parte4.interfaces.Vendavel;

public class Produto implements Vendavel {
    private String nome;
    private double precoUnitario;

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public double getPrecoUnitario() {
        return precoUnitario;
    }

    public void setPrecoUnitario(double precoUnitario) {
        this.precoUnitario = precoUnitario;
    }

    @Override
    public double calculaPrecoTotal(int qtde) {
        return precoUnitario * qtde;
    }

    @Override
    public void aplicaDesconto(double percentualDesconto) {
        precoUnitario -= precoUnitario *(percentualDesconto/100 );
    }
}
