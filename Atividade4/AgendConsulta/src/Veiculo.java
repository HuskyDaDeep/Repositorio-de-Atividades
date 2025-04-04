public class Veiculo {

    private String marca;
    private String modelo;
    private String anoFabricacao;
    private String cor;
    private int placa;
    private double preco;
    private double promocao;

    public Veiculo(String marca, String modelo, String anoFabricacao, String cor, int placa) {
        this.marca = marca;
        this.modelo = modelo;
        this.anoFabricacao = anoFabricacao;
        this.cor = cor;
        this.placa = placa;
    }

    public void exibirVeiculo(){
        System.out.println("Marca: " + marca + ", Modelo: " + modelo + ", Ano de Fabricação: " + anoFabricacao + ", Cor: " + cor + ", Placa: " + placa);
    }

    public void calcularDepreciacao(int anoAtual) {
        int anoVeiculo = Integer.parseInt(anoFabricacao);
        int depreciacao = anoAtual - anoVeiculo;
        System.out.println("O veículo " + modelo + " tem " + depreciacao + " anos de uso.");
    }

    public void alterarCor(String novaCor) {
        this.cor = novaCor;
        
    }

    public void ajustarPreco(double novoPreco){
        this.preco = novoPreco;
    }

    public void ajustarPreco(double novoPreco, double promocao){
        preco = novoPreco - (novoPreco * promocao / 100);

    }

    public void alterarMarca(String novaMarca) {
        this.marca = novaMarca;
    }
    public void alterarModelo(String novoModelo) {
        this.modelo = novoModelo;
    }
    

    
}
