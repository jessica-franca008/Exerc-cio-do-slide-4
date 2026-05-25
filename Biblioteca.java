import java.util.ArrayList;

public class Biblioteca {
    public String nome;
    public ArrayList<Livro> deLivros;

    public Biblioteca(String nome) {
        this.nome = nome;
        this.deLivros = new ArrayList<Livro>();
    }

    public void adicionarLivro(Livro livro) {
        deLivros.add(livro);
    }

    public void mostrarLivros() {
        System.out.println("--- " + nome + " ---");
        for (Livro l : deLivros) {
            System.out.println("Livro: " + l.getTitulo() + " | Autor: " + l.getAutor().getNome());
            System.out.println("Capítulos adicionados:");
            for (Capitulo c : l.capitulos) {
                System.out.println("  Cap. " + c.getNumero() + ": " + c.getTitulo());
            }
        }
    }
}