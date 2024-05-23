package desafio.modelo;

public class MinhasPreferidas {
    public void inclui(Audio audio){
        if(audio.getClassificacao()>=8){
            System.out.println(STR."""
                    \{audio.getNome()} é considerado sucesso absoluto;
                    """);
        }else {
            System.out.println(STR."""
                    \{audio.getNome()} tem muito potencial;
                    """);
        }
    }
}
