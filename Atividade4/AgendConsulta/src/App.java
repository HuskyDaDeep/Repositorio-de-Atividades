public class App {
    public static void main(String[] args) {
        Veiculo veiculo1 = new Veiculo("Toyota", "Corolla", "2020", "Preto", 1234);
        Veiculo veiculo2 = new Veiculo("Ford", "Fiesta", "2018", "Branco", 5678);
        Veiculo veiculo3 = new Veiculo("Chevrolet", "Onix", "2021", "Azul", 9101);
        Veiculo veiculo4 = new Veiculo("Honda", "Civic", "2019", "Cinza", 1121);
        Veiculo veiculo5 = new Veiculo("Nissan", "Versa", "2022", "Verde", 3141);

        
        veiculo1.calcularDepreciacao(2023);
        veiculo2.alterarCor("Vermelho");
        veiculo3.ajustarPreco(50000, 10);
        veiculo4.alterarMarca("Honda");
        veiculo5.alterarModelo("Civic");

        veiculo1.exibirVeiculo();
        veiculo2.exibirVeiculo();
        veiculo3.exibirVeiculo();
        veiculo4.exibirVeiculo();
        veiculo5.exibirVeiculo();
    }
}