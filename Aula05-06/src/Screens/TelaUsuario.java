package Screens;


import Modelos.Pessoa;

import javax.swing.*;
import java.awt.*;

public class TelaUsuario {

    JPanel painel;
    JFrame tela;

    public TelaUsuario(Pessoa pessoa, TelaPrincipal telaPrincipal) {
        painel = new JPanel(null);
        tela = new JFrame("Olá, " + pessoa.usuario + "!");

        int width = 600;
        int height = 240;

        tela.setSize(width, height);
        tela.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        tela.setResizable(false);
        tela.add(painel);
        tela.setLocationRelativeTo(null);

        JLabel bemVindoLabel = new JLabel("Bem-vindo ao sistema,");
        bemVindoLabel.setFont(new Font("Arial", Font.ITALIC, 24));
        bemVindoLabel.setBounds(180, 25, width, bemVindoLabel.getFont().getSize());
        painel.add(bemVindoLabel);

        JLabel usuarioLabel = new JLabel(pessoa.usuario.toUpperCase() + "!");
        usuarioLabel.setFont(new Font("Arial", Font.BOLD, 36));
        usuarioLabel.setBounds(250, 60, width, 48);
        painel.add(usuarioLabel);

        JButton botaoSair = new JButton("Sair da Conta");
        botaoSair.setBounds(230, 120, 150, 40);
        botaoSair.setBackground(Color.red);
        botaoSair.setForeground(Color.black);
        botaoSair.addActionListener((a) -> {

            //showconfirmdialog = tela de confirmacao
            //Mensagem, titulo
            //yes_no_option = Opções Sim ou Não.
            int opcao = JOptionPane.showConfirmDialog(null, "Realmente, você quer sair?", "Deslogar", JOptionPane.YES_NO_OPTION);

            //opcao 0 - primeira opção = sim
            //opcao 1 - segunda opção = nao
            if (opcao == 0) {
                telaPrincipal.abrirTela();
                fecharTela();
            }
        });
        painel.add(botaoSair);

        tela.setVisible(false);
    }

    public void abrirTela() {
        tela.setVisible(true);
    }

    public void fecharTela() {
        tela.setVisible(false);
    }
}