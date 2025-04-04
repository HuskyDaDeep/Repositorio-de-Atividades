public class App {
    public static void main(String[] args) throws Exception {
        Produto produto = new Produto("Produto A", "Categoria A", 10, 20.0, "1234567890123");
        Produto produto2 = new Produto("Produto B", "Categoria B", 5, 15.0, "9876543210987");
        Produto produto3 = new Produto("Produto C", "Categoria C", 8, 30.0, "4567891234567");
        Produto produto4 = new Produto("Produto D", "Categoria D", 12, 25.0, "3216549873210");

        produto.aplicarPromocao(10, 5);
        produto2.atualizarQuantidade(20);
        produto3.atualizar("Produto C Atualizado", "Categoria C Atualizada");
        produto4.aplicarPromocao(10, 10);;


        produto.exbirProduto();
        produto2.exbirProduto();
        produto3.exbirProduto();
        produto4.exbirProduto();
        
        
        
    }
}
