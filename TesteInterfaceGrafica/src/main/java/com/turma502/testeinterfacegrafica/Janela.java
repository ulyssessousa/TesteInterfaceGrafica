/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.turma502.testeinterfacegrafica;

import java.awt.BorderLayout;
import java.awt.FlowLayout;
import java.awt.GridLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JPanel;
import javax.swing.JTextField;

/**
 *
 * @author ulyss
 */
public class Janela extends JFrame implements ActionListener{
    private JButton botao1, botao2;
    private JTextField texto1, texto2;
    private JLabel label1, label2, titulo, rodape;
    private JPanel painelSuperior, painelCentral, painelInferior;
    
    public Janela(){
        super("Janela Principal");
        inicializarComponentes();
    }
    
    private void inicializarComponentes(){
        painelSuperior = new JPanel();
        painelCentral = new JPanel();
        painelInferior = new JPanel();
        
        add(painelSuperior, BorderLayout.NORTH);
        add(painelInferior, BorderLayout.SOUTH);
        add(painelCentral);
        
        titulo = new JLabel("Janela Principal");
        rodape = new JLabel("Rodapé da janela");
        
        painelSuperior.add(titulo);
        painelInferior.add(rodape);
        
        label1 = new JLabel("Login:");
        label2 = new JLabel("Senha:");
        texto1 = new JTextField(20);
        texto2 = new JTextField(20);
        botao1 = new JButton("Enviar");
        botao2 = new JButton("Limpar campos");
        
        painelCentral.setLayout(null);
        
        label1.setBounds(30, 50, 150, 30);
        texto1.setBounds(180, 50, 200, 30);
        
        label2.setBounds(30, 100, 150, 30);
        texto2.setBounds(180, 100, 200, 30);
       
        botao1.setBounds(90, 150, 140, 40);
        botao2.setBounds(280, 150, 140, 40);
        
        botao1.addActionListener(this);
        botao2.addActionListener(this);
        
        painelCentral.add(label1);
        painelCentral.add(texto1);
        painelCentral.add(label2);
        painelCentral.add(texto2);
        painelCentral.add(botao1);   
        painelCentral.add(botao2);
    }
    
    private void limparCampos(){
        texto1.setText("");
        texto2.setText("");
    }

    private void mostrarDados(){
        String mensagem = "Login: " + texto1.getText();
        mensagem += "\nSenha: " + texto2.getText();
        JOptionPane.showConfirmDialog(this, mensagem);
    }
    
    @Override
    public void actionPerformed(ActionEvent e) {
        
        if (e.getSource() == botao1){
            mostrarDados();
        }else if (e.getSource() == botao2){
            limparCampos();
        }
    }
    
}
