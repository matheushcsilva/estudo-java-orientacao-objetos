package exercicios.parte1;

public class Musica {
    private String titulo;
    private String artista;
    private int anoLancamento;
    private double avaliacao;
    private int contagemAvaliacao;

    public void exibeFichaTecnica(){
        System.out.println(STR."""
                Título da faixa: \{titulo};
                Artista: \{artista};
                Ano de Lançamento: \{anoLancamento};
                """);
    }
    public void avalia(double nota){
        avaliacao += nota;
        contagemAvaliacao++;
    }

    public double calculaMediaAvaliacao(){
        return avaliacao/contagemAvaliacao;
    }

    public String getTitulo() {
        return titulo;
    }

    public String getArtista() {
        return artista;
    }

    public int getAnoLancamento() {
        return anoLancamento;
    }

    public double getAvaliacao() {
        return avaliacao;
    }

    public void setTitulo(String titulo) {
        this.titulo = titulo;
    }

    public void setArtista(String artista) {
        this.artista = artista;
    }

    public void setAnoLancamento(int anoLancamento) {
        this.anoLancamento = anoLancamento;
    }
}
