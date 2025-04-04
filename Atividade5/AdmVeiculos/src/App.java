public class App {
    public static void main(String[] args) throws Exception {
        Consulta consulta = new Consulta("2023-10-01", "10:00", "João", "Dr. Silva", "Cardiologia");
        Consulta consulta2 = new Consulta("2023-10-02", "11:00", "Maria", "Dr. Souza", "Pediatria");
        Consulta consulta3 = new Consulta("2023-10-03", "12:00", "Carlos", "Dr. Oliveira", "Dermatologia");
        Consulta consulta4 = new Consulta("2023-10-04", "13:00", "Ana", "Dr. Costa", "Oftalmologia");
        Consulta consulta5 = new Consulta("2023-10-05", "14:00", "Pedro", "Dr. Lima", "Ginecologia");



        consulta.marcarConsulta("Lucas", "Dr. Almeida");
        consulta2.alterarDataHora("2023-10-06", "15:00");
        consulta3.alterarPaciente("Fernanda");
        consulta4.alterarMedico("Dr. Santos");



        consulta.exibirDetalhesConsulta();
        consulta2.exibirDetalhesConsulta();
        consulta3.exibirDetalhesConsulta();
        consulta4.exibirDetalhesConsulta();
        consulta5.exibirDetalhesConsulta();
    }
}
