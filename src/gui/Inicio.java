package gui;

/**
 *
 * @author gabriel
 */
public class Inicio {



    public static void main(String args[]) {

        Utilitarios utils = new Utilitarios();

        java.awt.EventQueue.invokeLater(() -> {
            new TelaPrincipal(utils).setVisible(true);
        });
    }

}
