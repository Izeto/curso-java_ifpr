package Principal;

public class Calculadora {
    public void somarSemRetorno(int num1, int num2){
        int soma = num1 + num2;
        System.out.println(soma);
    }
    public int somarComRetorno(int num1, int num2) {
        int soma = num1 + num2;
        return soma;
    }
}
