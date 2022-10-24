package Modelos;

import javax.swing.*;
import java.awt.*;

public class Shot {

    Image imagem;

    int x;
    int y;

    int velX;

    int largura;
    int altura;

    boolean visivel;

    int xMaximo;

    public Shot(int x, int y) {
        this.x = x;
        this.y = y;

        visivel = true;
        xMaximo = 300;
        velX = 4;
    }

    public void load() {
        ImageIcon referencia = new ImageIcon("res/shot.png");
        imagem = referencia.getImage();

        largura = imagem.getWidth(null);
        altura = imagem.getHeight(null);
    }

    public Rectangle getBounds(){
        return new Rectangle(x, y, largura, altura);
    }

    public void update() {
        x += velX;
        if(x >= xMaximo) {
            visivel = false;
        }
    }
}
