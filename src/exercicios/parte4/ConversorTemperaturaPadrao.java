package exercicios.parte4;

import exercicios.parte4.interfaces.ConversorTemperatura;

public class ConversorTemperaturaPadrao implements ConversorTemperatura {
    @Override
    public double celciusParaFahrenheit(double temperatura) {
        return (temperatura*1.8)+32;
    }

    @Override
    public double FahrenheitParaCelcius(double temperatura) {
        return (temperatura-32)/1.8;
    }
}
