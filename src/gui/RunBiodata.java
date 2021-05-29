package gui;

import javax.swing.*;

public class RunBiodata {
    public static void main(String[] args) {
        JFrame gambar = new JFrame("Aplikasi Scan Biodata Berdasarkan NIM");
        gambar.setContentPane(new Biodata().getRootPanel());
        gambar.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        gambar.setLocationRelativeTo(null);
        gambar.setSize(500,400);
        gambar.setVisible(true);
    }
}
