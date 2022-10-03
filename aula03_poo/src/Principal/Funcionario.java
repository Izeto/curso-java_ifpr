package Principal;

public class Funcionario {
    String nome;
    String sobrenome;
    int horasTrabalhadas;
    double vlrHoraTrabalhada;
    String cargo;
    double valorVale;

    public String informarCargo(String novoCargo){
        cargo = novoCargo;
        return cargo;
    }
    public double calculaSalario(){
        double salario = (vlrHoraTrabalhada * horasTrabalhadas) - valorVale;
        if(cargo=="Gerente") {
            salario = salario + 500;
        }
        return salario;
    }
    public String retornaNomeCompleto(){
        String nomeCompleto = nome + " " + sobrenome;
        return nomeCompleto;
    }
    public void incrementarHoras(int horas){
        int novasHorasTrabalhadas = horasTrabalhadas + horas;
    }

}
