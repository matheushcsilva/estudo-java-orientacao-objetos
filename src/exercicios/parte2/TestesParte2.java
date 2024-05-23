package exercicios.parte2;

public class TestesParte2 {
    public static void main(String[] args) {
        Aluno2 alunoUm = new Aluno2();
        Aluno2 alunoDois = new Aluno2();
        Livro livroUm = new Livro();
        Produto produtoUm = new Produto();

        alunoUm.setNome("Matheus");
        alunoUm.setIdade(24);
        alunoDois.setNome("Luiza");
        alunoDois.setIdade(2);
        alunoUm.exibeInfoAlunos();
        alunoDois.exibeInfoAlunos();

        livroUm.setTitulo("Harry Potther and the Order of the Phoenix");
        livroUm.setAutor("J.K.Rowling");
        livroUm.exibeDetalhes();

        produtoUm.setNomeProduto("Caneta");
        produtoUm.setValorUnitario(2.00);
        System.out.println(produtoUm.aplicarDesconto(10));
    }
}
