package org.ensf480.forms;

import javax.swing.*;

public class Main extends JFrame {

    public Main () {
        setTitle("Theater Management System");
        setSize(400, 300);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setLocationRelativeTo(null);
        setVisible(true);
    }

    public static void main(String[] args) {
        new Main();
    }
}
