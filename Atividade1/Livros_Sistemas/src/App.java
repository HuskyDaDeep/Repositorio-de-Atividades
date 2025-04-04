public class App {
    public static void main(String[] args) throws Exception {
        Livros livro1 = new Livros("O Senhor dos Anéis", "J.R.R. Tolkien", "1954", "Fantasia", 50);
        Livros livro2 = new Livros("1984", "George Orwell", "1949", "Ficção Científica", 30, 15);
        Livros livro3 = new Livros("Dom Casmurro", "Machado de Assis", "1899", "Romance", 20);

        livro1.alterartitulo("O Senhor dos Anéis: A Sociedade do Anel");
        livro2.precocomvip(true);


        livro1.exibirinformacoes();
        livro2.exibirinformacoes();
        livro3.exibirinformacoes();

    }
}
