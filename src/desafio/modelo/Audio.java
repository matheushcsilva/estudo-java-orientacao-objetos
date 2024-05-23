package desafio.modelo;

public class Audio {
    private String nome;
    private int duracao;
    private int ano;
    private int totalReproducoes;
    private int totalCurtidas;
    private int classificacao;

    public String getNome() {
        return nome;
    }

    public int getDuracao() {
        return duracao;
    }

    public int getClassificacao() {
        return classificacao;
    }

    public void setDuracao(int duracao) {
        this.duracao = duracao;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public int getAno() {
        return ano;
    }

    public void setAno(int ano) {
        this.ano = ano;
    }

    public void curte(){
        this.totalCurtidas++;
    }

    public void toca(){
        this.totalReproducoes++;
    }

    public void setClassificacao(int classificacao) {
        this.classificacao = classificacao;
    }

    public int getTotalReproducoes() {
        return totalReproducoes;
    }

    public int getTotalCurtidas() {
        return totalCurtidas;
    }
}
