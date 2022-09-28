package Principal;

import java.util.ArrayList;

public class Lista {
    public static void mostrarLista(){
        ArrayList<String> list = new ArrayList<>();
        list.add("Pera");
        list.add("Uva");
        list.add("Maçã");
        for (String fruta : list) {
            System.out.println(fruta);
        }
    }
}
