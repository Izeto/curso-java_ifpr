package Principal;

import Armazenamento.Persistencia;
import Screens.TelaPrincipal;

import javax.swing.*;
import java.awt.*;

public class Principal {

    static TelaPrincipal principal;

    public static void main(String[] args) {
        Persistencia.conectar();

        principal = new TelaPrincipal();
        principal.abrirTela();
    }
}