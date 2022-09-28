package Principal;

public class TiposDeMetodos {
    public void somarPublico(){
        int num1 = 40;
        int num2 = 10;

        int soma = num1 + num2;
        System.out.println(soma);
    }
    private void somarPrivado(){
        int num1 = 30;
        int num2 = 20;

        int soma = num1 + num2;
        System.out.println(soma);
    }
}
