package gui;

import javax.swing.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class Biodata {
    private JTextField textNama;
    private JTextField textNim;
    private JButton checkButton;
    private JButton exitButton;
    private JLabel hasil;
    private JLabel hasil2;
    private JLabel hasil3;
    private JLabel hasil4;
    private JLabel hasil5;
    private JLabel hasil6;
    private JLabel hasil7;
    private JLabel hasil8;
    private JPanel rootPanel;

    public Biodata() {
        checkButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                String nama = textNama.getText();
                String nim = textNim.getText();
                Data mhs = new Data();
                mhs.setNama(nama);
                mhs.setNim(nim);
                hasil.setText("Nama: " +mhs.getNama());
                hasil2.setText("NIM: " +mhs.getNim());
                hasil3.setText("Jenjang Pendidikan: " +mhs.getJenjang());
                hasil4.setText("Tahun Masuk: 20" +mhs.getTahun());
                hasil5.setText("Fakultas: " +mhs.getFakultas());
                hasil6.setText("Jurusan: " +mhs.getJurusan());
                hasil7.setText("Jenis Kelamin: " +mhs.getJenisKelamin());
                hasil8.setText("Nomor Urut: " +mhs.getNomorurut());
            }
        });
        exitButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                System.exit(0);
            }
        });
    }

    public JPanel getRootPanel() {
        return rootPanel;
    }
}
