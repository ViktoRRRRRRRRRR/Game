package com.game;

import javax.swing.*;

public class Main {

    public static void main(String[] args) {
        Gameplay gamePlay = new Gameplay();
        JFrame obj = new JFrame();
        obj.setBounds(10, 10, 700, 600);
        obj.setTitle("Challenge accepted");
        obj.setResizable(false);
        obj.setVisible(true);
        obj.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        obj.add(gamePlay);
    }
}
