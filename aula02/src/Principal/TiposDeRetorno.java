package Principal;

public class TiposDeRetorno {
    public void somarSemRetorno (){
        int num1 = 20;
        int num2 = 4;

        int somar = num1 + num2;
        System.out.println("Somar Sem Retorno: "+somar);
    }
    public int somarComRetorno(){
        int num1 = 20;
        int num2 = 4;

        int somar = num1 + num2;
        return somar;
    }
}
