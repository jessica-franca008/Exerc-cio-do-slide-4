import java.util.ArrayList;

public class Livro {
    public String titulo;
    public Autor autor;
    public ArrayList<Capitulo> capitulos;

    public Livro(String titulo, Autor autor) {
        this.titulo = titulo;
        this.autor = autor;
        this.capitulos = new ArrayList<Capitulo>();
    }

    public void adicionarCapitulo(String tituloCapitulo, int numero) {
        Capitulo cap = new Capitulo(tituloCapitulo, numero);
        capitulos.add(cap);
    }

    public String getTitulo() {
        return titulo;
    }

    public Autor getAutor() {
        return autor;
    }
}