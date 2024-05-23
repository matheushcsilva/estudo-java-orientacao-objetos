package exercicios.parte4;

import exercicios.parte4.interfaces.Vendavel;

public class Servico implements Vendavel {
    private String descricao;
    private double precoHora;

    public String getDescricao() {
        return descricao;
    }

    public void setDescricao(String descricao) {
        this.descricao = descricao;
    }

    public double getPrecoHora() {
        return precoHora;
    }

    public void setPrecoHora(double precoHora) {
        this.precoHora = precoHora;
    }

    @Override
    public double calculaPrecoTotal(int qtde) {
        return precoHora*qtde;
    }

    @Override
    public void aplicaDesconto(double percentualDesconto) {
        precoHora -= precoHora*(percentualDesconto/100);
    }
}
