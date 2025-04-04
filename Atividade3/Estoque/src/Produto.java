public class Produto {

    private String nome;
    private String categoria;
    private int quantidade;
    private double precoUnitario;
    private String codigodeBarras;

    public Produto(String nome, String categoria, int quantidade, double precoUnitario, String codigodeBarras) {
        this.nome = nome;
        this.categoria = categoria;
        this.quantidade = quantidade;
        this.precoUnitario = precoUnitario;
        this.codigodeBarras = codigodeBarras;
    }

    public void exbirProduto(){
        System.out.println("Nome: " + nome + ", Categoria: " + categoria + ", Quantidade: " + quantidade + ", Preço Unitário: R$" + precoUnitario + ", Código de Barras: " + codigodeBarras + ", Preço Total: R$" + (precoUnitario * quantidade));
    }

    public void calcularPrecoTotal() {
        double precoTotal = precoUnitario * quantidade;
        System.out.println("O preço total do produto " + nome + " é: R$" + precoTotal);
    }

    public void atualizarQuantidade(int novaQuantidade) {
        this.quantidade = novaQuantidade;
    }

    public void aplicarPromocao(double percentual) {
        this.precoUnitario -= precoUnitario * (percentual / 100);
    }

    public void aplicarPromocao(double porcentual, int quantidadeMinima) { 
        if (this.quantidade >= quantidadeMinima) {
            this.precoUnitario -= this.precoUnitario * (porcentual / 100);
        } else {
            System.out.println("Quantidade mínima não atingida para aplicar o desconto.");
        }
    }

    public void atualizar(String nomef, String categoriaf){
        this.nome = nomef;
        this.categoria = categoriaf;
    }


}