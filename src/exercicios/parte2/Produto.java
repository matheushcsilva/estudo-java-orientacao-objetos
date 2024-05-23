package exercicios.parte2;

public class Produto {
    private String nomeProduto;
    private double valorUnitario;

    public double aplicarDesconto(double percentual){
        double desconto = valorUnitario * (percentual/100);
        return valorUnitario -= desconto;
    }

    public String getNomeProduto() {
        return nomeProduto;
    }

    public void setNomeProduto(String nomeProduto) {
        this.nomeProduto = nomeProduto;
    }

    public double getValorUnitario() {
        return valorUnitario;
    }

    public void setValorUnitario(double valorUnitario) {
        this.valorUnitario = valorUnitario;
    }
}
