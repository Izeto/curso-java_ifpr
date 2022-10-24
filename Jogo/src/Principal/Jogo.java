package Principal;


import Modelos.Fase;

import javax.swing.*;

public class Jogo extends JFrame {

    public Jogo() {
        add(new Fase());
        setTitle("Jogo da Aeronave");
        setSize(600,400);
        setLocationRelativeTo(null);
        setResizable(false);
        setVisible(true);
    }

    public static void main(String[] args) {
        new Jogo();
    }
}
