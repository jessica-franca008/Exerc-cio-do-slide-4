public class Main {
    public static void main(String[] args) {
        Autor autora = new Autor("Stephenie Meyer");

        Livro livro = new Livro("Crepúsculo", autora);

        livro.adicionarCapitulo("Tipo Sanguíneo", 5);
        livro.adicionarCapitulo("Anjo", 23);

        Biblioteca minhaBiblioteca = new Biblioteca("Minha Biblioteca Pessoal");
        minhaBiblioteca.adicionarLivro(livro);

        minhaBiblioteca.mostrarLivros();
    }
}