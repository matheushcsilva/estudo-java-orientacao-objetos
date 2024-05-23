package exercicios.parte2;

public class Livro {
    private String titulo;
    private String autor;

    public void exibeDetalhes(){
        System.out.println(STR."""
                Título do livro: \{titulo};
                Autor do livro: \{autor};
                """);
    }

    public String getTitulo() {
        return titulo;
    }

    public void setTitulo(String titulo) {
        this.titulo = titulo;
    }

    public String getAutor() {
        return autor;
    }

    public void setAutor(String autor) {
        this.autor = autor;
    }
}
