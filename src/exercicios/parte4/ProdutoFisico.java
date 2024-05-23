package exercicios.parte4;

import exercicios.parte4.interfaces.Calculavel;

public class ProdutoFisico implements Calculavel {
    @Override
    public double calcularPrecoFinal(int qtde, double valorUnitario) {
        double valorFinal;
        if(qtde>5) {
            valorFinal = qtde * valorUnitario - (valorUnitario * .1);
        }else {
            valorFinal = qtde * valorUnitario - (valorUnitario * .05);
        }
        return valorFinal;
    }
}
