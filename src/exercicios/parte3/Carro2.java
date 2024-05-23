package exercicios.parte3;

public class Carro2 {
    private String modelo;
    private double valorAno1;
    private double valorAno2;
    private double valorAno3;

    public String getModelo() {
        return modelo;
    }

    public void setModelo(String modelo) {
        this.modelo = modelo;
    }

    public double getValorAno1() {
        return valorAno1;
    }

    public void setValorAno(double valorAno1,double valorAno2,double valorAno3) {
        this.valorAno1 = valorAno1;
        this.valorAno2 = valorAno2;
        this.valorAno3 = valorAno3;
    }

    public double calculaMenorValor() {
        double menorValor;
        if (valorAno1 < valorAno2 && valorAno1 < valorAno3) {
            menorValor = valorAno1;
        } else if (valorAno2 < valorAno1 && valorAno2 < valorAno3) {
            menorValor = valorAno2;
        } else {
            menorValor = valorAno3;
        }
        return  menorValor;
    }

    public double calculaMaiorValor() {
        double maiorValor;
        if (valorAno1 > valorAno2 && valorAno1 > valorAno3) {
            maiorValor = valorAno1;
        } else if (valorAno2 > valorAno1 && valorAno2 > valorAno3) {
            maiorValor = valorAno2;
        } else {
            maiorValor = valorAno3;
        }
        return  maiorValor;
    }

    public void exibeInfo(){
        System.out.println(STR."""
                Modelo: \{modelo};
                Valor no 1º ano: \{valorAno1};
                Valor no 2º ano: \{valorAno2};
                Valor no 3º ano: \{valorAno3};
                Valor mais baixo no período: \{calculaMenorValor()}
                Valor mais alto no período: \{calculaMaiorValor()}
                """);
    }
}
