package exercicios.parte1;

public class Carro {
    private String modelo;
    private int ano;
    private String cor;

    public void exibeFichaTecnica(){
        System.out.println(STR."""
                Modelo: \{modelo};
                Ano de Fabricação: \{ano};
                cor: \{cor};
                """);
    }
    public int calculaIdade(int ano){
        return ano - this.ano;
    }

    public String getModelo() {
        return modelo;
    }

    public void setModelo(String modelo) {
        this.modelo = modelo;
    }

    public int getAno() {
        return ano;
    }

    public void setAno(int ano) {
        this.ano = ano;
    }

    public String getCor() {
        return cor;
    }

    public void setCor(String cor) {
        this.cor = cor;
    }
}
