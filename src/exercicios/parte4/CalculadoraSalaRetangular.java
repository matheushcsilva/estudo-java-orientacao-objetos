package exercicios.parte4;

import exercicios.parte4.interfaces.CalculoGeometrico;

public class CalculadoraSalaRetangular implements CalculoGeometrico {

    @Override
    public String calculaArea(double altura, double largura) {
        double area = altura*largura;
        return STR."A area da sala é \{area} m²";
    }

    @Override
    public String calculaPerimetro(double altura, double largura) {
        double perimetro = 2*(altura+largura);
        return STR."O perimetro da sala é \{perimetro} m";
    }

}
