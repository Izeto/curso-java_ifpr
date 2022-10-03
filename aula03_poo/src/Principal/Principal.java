package Principal;
import java.util.ArrayList;

public class Principal {
    public static void main(String[] args) {
        //instanciando a classe;
        Funcionario novoFuncionario = new Funcionario();
        Funcionario novoFuncionario2 = new Funcionario();
        Funcionario novoFuncionario3 = new Funcionario();
        Funcionario novoFuncionario4 = new Funcionario();
        Funcionario novoFuncionario5 = new Funcionario();


        String informeCargo = novoFuncionario.informarCargo("Gerente");
        System.out.println("Seu cargo é: "+ informeCargo);
        String nomeCompleto = novoFuncionario.retornaNomeCompleto();
        System.out.println(nomeCompleto);

        double salario = novoFuncionario.calculaSalario();
        System.out.println(salario);
        novoFuncionario.incrementarHoras(21);
        double salarioNovo = novoFuncionario.calculaSalario();
        System.out.println("Novo salário "+ salarioNovo);

        ArrayList<Funcionario> lista = new ArrayList<>();
        lista.add(novoFuncionario);
        novoFuncionario.nome = "José";
        novoFuncionario.sobrenome = "Ciriaco";
        novoFuncionario.horasTrabalhadas = 150;
        novoFuncionario.vlrHoraTrabalhada = 10.5;
        novoFuncionario.valorVale = 50;

        lista.add(novoFuncionario2);
        novoFuncionario2.nome = "Jhonatan";
        novoFuncionario2.sobrenome = "Ciriaco";
        novoFuncionario2.horasTrabalhadas = 150;
        novoFuncionario2.vlrHoraTrabalhada = 10.5;
        novoFuncionario2.valorVale = 50;

        lista.add(novoFuncionario3);
        novoFuncionario3.nome = "José";
        novoFuncionario3.sobrenome = "Ciriaco";
        novoFuncionario3.horasTrabalhadas = 150;
        novoFuncionario3.vlrHoraTrabalhada = 10.5;
        novoFuncionario3.valorVale = 50;

        lista.add(novoFuncionario4);
        novoFuncionario4.nome = "José";
        novoFuncionario4.sobrenome = "Ciriaco";
        novoFuncionario4.horasTrabalhadas = 150;
        novoFuncionario4.vlrHoraTrabalhada = 10.5;
        novoFuncionario4.valorVale = 50;

        lista.add(novoFuncionario5);
        novoFuncionario5.nome = "José";
        novoFuncionario5.sobrenome = "Ciriaco";
        novoFuncionario5.horasTrabalhadas = 150;
        novoFuncionario5.vlrHoraTrabalhada = 10.5;
        novoFuncionario5.valorVale = 50;

        for(Funcionario func: lista) {
            System.out.println(func.calculaSalario());
        }
    }
}
