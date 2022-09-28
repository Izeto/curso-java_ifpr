package Principal;

public class Atividade02_java {
    public static void main(String[] args) {
        System.out.println("Bem-vindo ao IntelliJ");
        testarIdade();
        contarAteDez();
        Lista.mostrarLista();
        System.out.println(Retorno.metRetorno(90, 80));


        //Instanciando uma classe:
        TiposDeMetodos tipoDeMetodos = new TiposDeMetodos();
        tipoDeMetodos.somarPublico();

        TiposDeRetorno tiposDeRetorno = new TiposDeRetorno();
        tiposDeRetorno.somarSemRetorno();

        int soma = tiposDeRetorno.somarComRetorno();
        System.out.println("Somar Com Retorno: "+soma);

        Calculadora calculadora = new Calculadora();
        calculadora.somarSemRetorno(10,20);

        int soma2 = calculadora.somarComRetorno(10,20);

        System.out.println(soma2);

        Retorno retorno = new Retorno();
        boolean situa = retorno.metRetorno(80,90);

        if(situa){
            System.out.println("Aprovado");
        } else {
            System.out.println("Reprovado");
        }

        // ou System.out.println("Sua situação é: "+situa);


    }
    public static void testarIdade() {
        int idadePessoa = 15;
        if(idadePessoa>16){
            System.out.println("Você é maior de idade");
        }
        else{
            System.out.println("Você é menor de idade");
        }
    }
    public static void contarAteDez(){
        for(int numero = 1; numero <= 10; numero++) {
            System.out.println(numero);
        }
    }

}
