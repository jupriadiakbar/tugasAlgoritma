package GUI;

import javax.swing.*;

public class RunBiodata {
    public static void main(String[] args) {
        JFrame JFrame = new JFrame("Biodata");
        JFrame.setContentPane(new Biodata().getRootPanel());
        JFrame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        JFrame.setLocationRelativeTo(null);
        JFrame.setSize(400, 300);
        JFrame.setVisible(true);
    }
}
