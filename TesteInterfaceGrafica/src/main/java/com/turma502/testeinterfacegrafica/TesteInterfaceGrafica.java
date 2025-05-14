/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.turma502.testeinterfacegrafica;

import javax.swing.JFrame;

/**
 *
 * @author ulyss
 */
public class TesteInterfaceGrafica {

    public static void main(String[] args) {
        Janela janela = new Janela();
        janela.setVisible(true);
        janela.setSize(800, 600);
        janela.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
    }
}

