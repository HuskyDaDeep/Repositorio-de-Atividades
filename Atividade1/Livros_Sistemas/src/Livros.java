public class Livros {
    private String titulo;
    private String autor;
    private String anoPublicacao;
    private String genero;
    private double preco;
    private int desconto;
    private boolean membrovip;
    private String novoTitulo;

    public Livros(String titulo, String autor, String anoPublicacao, String genero, double preco) {
        this.titulo = titulo;
        this.autor = autor;
        this.anoPublicacao = anoPublicacao;
        this.genero = genero;
        this.preco = preco;

        
    }
    public Livros(String titulo, String autor, String anoPublicacao, String genero, double preco, int desconto) {
        this.titulo = titulo;
        this.autor = autor;
        this.anoPublicacao = anoPublicacao;
        this.genero = genero;
        this.preco = preco;
        this.desconto = desconto;
    }

    public void exibirinformacoes(){

        System.out.println("Titulo " + titulo + ", Autor " + autor + ", Ano de Publicacao " + anoPublicacao + ", Genero " + genero + ", Preço " + preco);
    }

    public void precoComDesconto(int desconto) {
     preco = preco - (preco * desconto / 100);
    }

    public void precocomvip( boolean membrovip) {
        
        if (membrovip) {
            preco = preco - (preco * (10 * desconto/ 100));
        }
        else {
            preco = preco - (preco * desconto / 100);
        }
    }
    public void alterartitulo(String novoTitulo) {
        titulo = novoTitulo;
    }

}
