package exercicios.parte3;

public class VerificadorPrimo extends NumerosPrimos{
    public void verificaSeEhPrimo(int numero) {
        if (verificaPrimalidade(numero)) {
            System.out.println(STR."\{numero} é primo.");
        } else {
            System.out.println(STR."\{numero} não é primo.");
        }
    }
}
