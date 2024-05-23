package exercicios.parte4;

import exercicios.parte4.interfaces.ConversaoFinanceira;

public class ConversorMoeda implements ConversaoFinanceira {
    @Override
    public double converterDolarParaReal(double dolar) {
        return dolar/5.15;

    }
}
