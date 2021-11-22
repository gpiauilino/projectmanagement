
import dao.UsuarioDAO;
import gui.ConfigDB;
import gui.UsuarioGUI;
import java.sql.SQLException;

/**
 *
 * @author gabriel
 */
public class Inicio {

    public static void main(String args[]) {
        boolean testconect = false;
        
        do {
            testconect = UsuarioDAO.confirmarConexao();
            if (testconect == false) {
                new ConfigDB().setVisible(true);
            }
        } while (!testconect);
        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new UsuarioGUI().setVisible(true);
            }
        });
    }
}
