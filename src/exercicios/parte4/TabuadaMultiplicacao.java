package exercicios.parte4;

import exercicios.parte4.interfaces.Tabuada;

public class TabuadaMultiplicacao implements Tabuada {
    @Override
    public void mostrarTabuada(int numero) {
        for (int i = 1; i <= 10; i++) {
            int resultado = numero*i;
            System.out.println(STR."\{numero}x\{i} = \{resultado}");
        }
    }
}
