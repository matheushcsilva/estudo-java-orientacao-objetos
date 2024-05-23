package exercicios.parte3;

public class ContaCorrente extends ContaBancaria2{
    private double tarifaMensal;

    public void cobraTarifaMensal(){
        saldo -= tarifaMensal;
        System.out.println(STR."Tarifa mensal de \{tarifaMensal} cobrada.Saldo atual: \{saldo};");
    }
}
