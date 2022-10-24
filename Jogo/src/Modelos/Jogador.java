package Modelos;

import javax.swing.*;
import java.awt.*;
import java.awt.event.KeyEvent;
import java.util.ArrayList;

public class Jogador {

    Image imagem;

    int x;
    int y;

    int velY;

    int largura;
    int altura;

    ArrayList<Shot> tiros;

    public Jogador() {
        x = 100;
        y = 100;

        tiros = new ArrayList<>();
    }

    public Rectangle getBounds(){
        return new Rectangle(x, y, largura, altura);
    }

    public void atirar() {
        tiros.add(new Shot(x, y + (altura/2)));
    }

    public void load() {
        ImageIcon referencia = new ImageIcon("res/player.png");
        imagem = referencia.getImage();

        largura = imagem.getWidth(null);
        altura = imagem.getHeight(null);
    }

    public void update() {
        if(y <= 0) {
            y+=5;
        }else if(y >= 330) {
            y-=5;
        }
        y += velY;
    }

    public void keyPressed(KeyEvent evento) {
        int tecla = evento.getKeyCode();
        if(tecla == KeyEvent.VK_UP) {
            velY = -4;
        }else if(tecla == KeyEvent.VK_DOWN) {
            velY = 4;
        }
    }

    public void keyReleased(KeyEvent evento) {
        int tecla = evento.getKeyCode();
        if(tecla == KeyEvent.VK_UP) {
            velY = 0;
        }else if(tecla == KeyEvent.VK_DOWN) {
            velY = 0;
        }else if(tecla == KeyEvent.VK_SPACE) {
            atirar();
        }
    }


}
