package Modelos;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.ArrayList;

public class Fase extends JPanel implements ActionListener {

    Image imagem;
    Jogador jogador;
    Timer timer;

    ArrayList<Enemy> inimigos;

    boolean emJogo = true;

    public Fase() {
        setFocusable(true);
        setDoubleBuffered(true);

        inimigos = new ArrayList<>();

        ImageIcon referencia = new ImageIcon("res/background.png");
        imagem = referencia.getImage();

        jogador = new Jogador();
        jogador.load();

        addKeyListener(new Teclado(jogador));

        carregarInimigos();

        timer = new Timer(3, this);
        timer.start();

    }

    public void checarColisoes(){
        Rectangle jogadorBounds = jogador.getBounds();
        for(Enemy inimigo : inimigos){
            Rectangle inimigoBounds = inimigo.getBounds();
            if(jogadorBounds.intersects(inimigoBounds)){
                emJogo = false;
            }
        }

        ArrayList<Shot> tiros = jogador.tiros;
        for(Shot tiro : tiros){
            Rectangle tiroBounds = tiro.getBounds();
            for(Enemy inimigo : inimigos){
                Rectangle inimigoBounds = inimigo.getBounds();
                if(tiroBounds.intersects(inimigoBounds)){
                    inimigo.setVisible(false);
                    tiro.visivel = false;
                }
            }
        }
    }

    public void carregarInimigos(){
        for (int i = 0; i < 100; i++){
            int x = (int) (Math.random()*8000+1024);
            int y = (int) (Math.random()*650);

            Enemy inimigo = new Enemy(x, y);
            inimigos.add(inimigo);

        }
    }

    @Override
    public void paint(Graphics g) {
        Graphics2D graficos2D = (Graphics2D) g;
        graficos2D.drawImage(imagem, 0, 0, null);
        if(emJogo==true){
            ArrayList<Shot> tiros = jogador.tiros;

            for(Shot tiro : tiros) {
                tiro.load();
                graficos2D.drawImage(tiro.imagem, tiro.x, tiro.y, this);
            }
            graficos2D.drawImage(jogador.imagem, jogador.x, jogador.y, this);

            for(Enemy inimigo: inimigos){
                inimigo.load();
                graficos2D.drawImage(inimigo.getImage(), inimigo.getX(), inimigo.getY(), this);
            }
        }else {
            int x = 1024/10;
            int y = 728/4;

            String texto = "Game Over";
            graficos2D.setFont(new Font("Public Sans", Font.BOLD, 70));
            graficos2D.setColor(Color.WHITE);
            graficos2D.drawString(texto, x, y);

        }
    }

    @Override
    public void actionPerformed(ActionEvent e) {
        jogador.update();
        for (int i = 0; i < jogador.tiros.size(); i++) {
            Shot tiro = jogador.tiros.get(i);
            if(tiro.visivel == true) {
                tiro.update();
            }else {
                jogador.tiros.remove(tiro);
            }
        }

        for (int i = 0; i < inimigos.size(); i++){
            Enemy inimigo = inimigos.get(i);
            if (inimigo.isVisible()) {
                inimigo.update();
            }else{
                inimigos.remove(inimigo);
            }
        }
        checarColisoes();
        repaint();
    }
}
