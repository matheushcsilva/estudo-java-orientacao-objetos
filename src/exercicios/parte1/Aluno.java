package exercicios.parte1;

public class Aluno {
    private String nome;
    private int idade;

    public void exibeInfoAlunos(){
        System.out.println(STR."""
                Nome do aluno: \{nome}
                Idade do aluno: \{idade}
                """);
    }

    public void verificaIdade(){
        if(idade >=18 ){
            System.out.print("Este aluno é maior de idade");
        } else {
            System.out.print("Este aluno é menor de idade");
        }
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
}
