package exercicios.parte2;

public class Aluno2 {
    private String nome;
    private int idade;
    private double nota;

    public void exibeInfoAlunos(){
        System.out.println(STR."""
                Nome do aluno: \{nome}
                Idade do aluno: \{idade}
                """);
    }

    private void calculaMedia(){

    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public int getIdade() {
        return idade;
    }

    public void setIdade(int idade) {
        this.idade = idade;
    }

    public double getNota() {
        return nota;
    }

    public void setNota(double nota) {
        this.nota = nota;
    }
}
