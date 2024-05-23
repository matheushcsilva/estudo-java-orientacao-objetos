package exercicios.parte4;

import exercicios.parte4.interfaces.Calculavel;

public class Livro2 implements Calculavel {
    @Override
    public double calcularPrecoFinal(int qtde, double valorUnitario) {
        double valorFinal;
        if(valorUnitario >= 30) {
            valorFinal = qtde * valorUnitario + (valorUnitario * .12);
        }else {
            valorFinal = qtde * valorUnitario + (valorUnitario * .1);
        }
        return valorFinal;
    }
}
