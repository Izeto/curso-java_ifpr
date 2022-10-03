package Principal;

public class Caneta {
    String cor;
    double carga;
    boolean tampada;

    public void tampar() {
        tampada = true;
    }
    public void destampar() {
        tampada = false;
    }
    public void rabiscar() {
        if(carga <= 0){
            System.out.println("A caneta está sem carga");
        }else{
            if(tampada){
                System.out.println("Erro, não é possível rabiscar");
            } else{
                System.out.println("É possível rabiscar");
            }
        }
    }


}
