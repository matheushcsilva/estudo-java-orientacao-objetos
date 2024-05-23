package exercicios.parte3;

public class TestesParte3 {
    public static void main(String[] args) {
        Carro2 carro = new Carro2();
        Cachorro cachorro = new Cachorro();
        Gato gato = new Gato();
        ContaBancaria2 conta = new ContaBancaria2();
        ContaCorrente contaCorrente = new ContaCorrente();
        VerificadorPrimo verificador = new VerificadorPrimo();
        GeradorPrimo gerador = new GeradorPrimo();
        NumerosPrimos numerosPrimos = new NumerosPrimos();

        carro.setModelo("Uno");
        carro.setValorAno(25000,24000,24500);
        carro.exibeInfo();

        cachorro.emiteSom();
        cachorro.abanaRabo();
        gato.emiteSom();
        gato.arranhaMoveis();

        conta.deposita(1000);
        conta.consultaSaldo();
        contaCorrente.deposita(200);
        contaCorrente.cobraTarifaMensal();
        contaCorrente.consultaSaldo();
        contaCorrente.saca(150);
        contaCorrente.consultaSaldo();

        verificador.verificaSeEhPrimo(17);
        int proximoPrimo = gerador.geraProximoPrimo(17);
        System.out.println(STR."O próximo primo após 17 é: \{proximoPrimo}");
        numerosPrimos.listaPrimos(30);
    }
}
