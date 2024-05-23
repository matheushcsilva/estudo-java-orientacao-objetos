package exercicios.parte1;

import java.util.Calendar;
import java.util.GregorianCalendar;

public class TestesParte1 {
    public static void main(String[] args) {
        Pessoa pessoa = new Pessoa();
        Calculadora dobro = new Calculadora();
        Musica musicaUm = new Musica();
        Carro carroUm = new Carro();
        Calendar cal = GregorianCalendar.getInstance();
        int year = cal.get(Calendar.YEAR);
        Aluno alunoUm = new Aluno();
        Aluno alunoDois = new Aluno();

        pessoa.saudacao();

        dobro.setParamentro(2);
        System.out.println(dobro.calculaDobro());

        musicaUm.setTitulo("Space Oddity");
        musicaUm.setArtista("David Bowie");
        musicaUm.setAnoLancamento(1969);
        musicaUm.avalia(9.0);
        musicaUm.avalia(8.3);
        musicaUm.exibeFichaTecnica();
        System.out.println(musicaUm.calculaMediaAvaliacao());

        carroUm.setModelo("Uno");
        carroUm.setAno(2011);
        carroUm.setCor("Prata");

        carroUm.exibeFichaTecnica();
        System.out.println(carroUm.calculaIdade(year));

        alunoUm.setNome("Matheus");
        alunoUm.setIdade(24);
        alunoDois.setNome("Luiza");
        alunoDois.setIdade(2);
        alunoUm.exibeInfoAlunos();
        alunoUm.verificaIdade();
        alunoDois.exibeInfoAlunos();
        alunoDois.verificaIdade();
    }
}
