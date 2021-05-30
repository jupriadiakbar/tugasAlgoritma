package GUI;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.ComponentAdapter;

public class Biodata {
    private JTextField textNama;
    private JTextField textNIM;
    private JButton buttonSave;
    private JPanel rootPanel;
    private JLabel textnama;
    private JLabel textNim;
    private JLabel textnim;
    private JLabel textTahunMasuk;
    private JLabel textFakultas;
    private JLabel textJurusan;
    private JLabel textJenisKelamin;
    private JLabel textNomorUrutMahasiswa;
    private JLabel textJenjangPendidikan;
    private JLabel textNomorUrutMahasiswa1;
   
    public Biodata() {
        rootPanel.addComponentListener(new ComponentAdapter() {
        });
        buttonSave.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                //mengambil data dari textNama
               String nama = textNama.getText();

               //mengambil data dari textnim
               String nim = textNIM.getText();

               //diproses
                Mahasiswa mhs = new Mahasiswa();
                mhs.setNama(nama);
                mhs.setNim(nim);
                //Tampilkan output ke Biodata
                textnama.setText("Nama = " + nama);
                textNim.setText("NIM = " + nim);
                textJenisKelamin.setText(mhs.JenisKelamin());
                textJenjangPendidikan.setText(mhs.JenjangPendidikan());
                textTahunMasuk.setText(mhs.TahunMasuk());
                textFakultas.setText(mhs.MenentukanFakultas());
                textJurusan.setText(mhs.MenentukanJurusan());
                textNomorUrutMahasiswa.setText(mhs.NomorUrutMahasiswa());


            }
        });


    }

    public JPanel getRootPanel() {
        return rootPanel;


    }

    private void createUIComponents() {
        // TODO: place custom component creation code here
    }
}
