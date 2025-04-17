public class Livro {
    private String titulo;
    private String autor;

    public void setTitulo(String titulo) {
        this.titulo = titulo;
    }

    public void setAutor(String autor) {
        this.autor = autor;
    }

    public String getAutor() {
        return autor;
    }

    public String getTitulo() {
        return titulo;
    }

    public void exibirDetalhes() {
        System.out.println("Título: " + titulo);
        System.out.println("Autor:  " + autor);
    }
}
