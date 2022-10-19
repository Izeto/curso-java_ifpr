package Screens;


import Armazenamento.Persistencia;
import Modelos.Pessoa;

import javax.swing.*;
import java.awt.*;

public class TelaLogar {

    JPanel painel;
    JFrame tela;

    public TelaLogar(TelaPrincipal telaPrincipal) {
        painel = new JPanel(null);
        tela = new JFrame("Tela - Logar");

        tela.setSize(400, 200);
        tela.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        tela.setResizable(false);
        tela.setLocationRelativeTo(null);
        tela.add(painel);

        painel.setLayout(null);


        JLabel labelUsuario = new JLabel("Usuário");
        labelUsuario.setBounds(50, 20, 80, 25);
        painel.add(labelUsuario);

        JTextField textoUsuario = new JTextField();
        textoUsuario.setBounds(140, 20, 165, 25);
        painel.add(textoUsuario);

        JLabel labelSenha = new JLabel("Senha");
        labelSenha.setBounds(50, 50, 80, 25);
        painel.add(labelSenha);

        JTextField textoSenha = new JPasswordField();
        textoSenha.setBounds(140, 50, 165, 25);
        painel.add(textoSenha);

        JLabel label = new JLabel("Já há uma conta com esté usuário.");
        label.setForeground(Color.red);
        label.setBounds(105, 120, 300, 30);
        label.setVisible(false);
        painel.add(label);

        JButton botaoLogar = new JButton("Logar");
        botaoLogar.setBounds(20, 90, 100, 30);
        botaoLogar.addActionListener((a) -> {
            String usuario = textoUsuario.getText().toLowerCase();
            if(usuario.replace(" ", "").isEmpty()) {
                label.setVisible(true);
                label.setText("O usuário precisa estar preenchido com algo.");
                return;
            }
            if(Persistencia.temCadastro(usuario)) {
                Pessoa pessoa = Persistencia.pessoas.get(usuario.toLowerCase());
                if(textoSenha.getText().equals(pessoa.senha)) {
                    TelaUsuario telaUsuario = new TelaUsuario(pessoa, telaPrincipal);
                    telaUsuario.abrirTela();
                    fecharTela();
                }else {

                    label.setVisible(true);
                    label.setText("A senha não coincide com o login correto.");
                }
            }else {
                label.setVisible(true);
                label.setText("Não há login com este usuário.");
            }
        });
        painel.add(botaoLogar);

        JButton botaoResetar = new JButton("Resetar");
        botaoResetar.setBounds(135, 90, 100, 30);
        botaoResetar.addActionListener((a) -> {
            textoUsuario.setText("");
            textoSenha.setText("");
        });
        painel.add(botaoResetar);

        JButton botaoVoltar = new JButton("Voltar");
        botaoVoltar.setBounds(250, 90, 100, 30);
        botaoVoltar.addActionListener((a) -> {
            telaPrincipal.abrirTela();
            fecharTela();
        });
        painel.add(botaoVoltar);

        tela.setVisible(false);
    }

    public void abrirTela() {
        tela.setVisible(true);
    }

    public void fecharTela() {
        tela.setVisible(false);
    }
}