public class Consulta{
    private String Data;
    private String Hora;
    private String Paciente;
    private String Medico;
    private String Especialidade;

    public Consulta(String data, String hora, String paciente, String medico, String especialidade) {
        this.Data = data;
        this.Hora = hora;
        this.Paciente = paciente;
        this.Medico = medico;
        this.Especialidade = especialidade;
    }

    public void exibirDetalhesConsulta(){
        System.out.println("Data: " + Data + ", Hora: " + Hora + ", Paciente: " + Paciente + ", Medico: " + Medico + ", Especialidade: " + Especialidade);
    }

    public void alterarDataHora(String novaData, String novaHora) {
        this.Data = novaData;
        this.Hora = novaHora;
    }

    public void marcarConsulta(String paciente, String medico){
        this.Paciente = paciente;
        this.Medico = medico;
    }
    public void marcarConsulta(String paciente, String medico, String especialidade){
        this.Paciente = paciente;
        this.Medico = medico;
        this.Especialidade = especialidade;
    }
    public void alterarPaciente(String novoPaciente) {
        this.Paciente = novoPaciente;
    }
    public void alterarMedico(String novoMedico) {
        this.Medico = novoMedico;
    }
}