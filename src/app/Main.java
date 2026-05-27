package app;

import javax.swing.SwingUtilities;

import view.FichaMatricula;

public class Main {

    public static void main(String[] args) {
        SwingUtilities.invokeLater(new Runnable() {
            public void run() {
                FichaMatricula tela = new FichaMatricula();
                tela.setVisible(true);
            }
        });
    }
}