package exercicios.parte3;

public class ContaBancaria2 {
    protected double saldo;

    public void deposita(double valor){
        saldo += valor;
        System.out.println(STR."Depósito de \{valor} realizado. Saldo atual: \{saldo};");
    }
    public void saca(double valor){
        if (valor <= saldo) {
            saldo -= valor;
            System.out.println(STR."Saque de \{valor} realizado. Saldo atual: \{saldo};");
        } else {
            System.out.println("Saldo insuficiente para saque.");
        }
    }
    public void consultaSaldo(){
        System.out.println(STR."Saldo atual: \{saldo}");
    }
}
