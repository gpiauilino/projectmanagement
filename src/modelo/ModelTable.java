package modelo;

/*
 * 
 */
import java.util.ArrayList;
import javax.swing.table.AbstractTableModel;

// Implementacao do modelo das JTable de detalhes.
public class ModelTable extends AbstractTableModel {

    private ArrayList linhas = null;
    private String[] colunas = null;

    public ModelTable(ArrayList lin, String[] col) {
        this.linhas = lin;
        this.colunas = col;
    }

    public ArrayList getLinhas() {
        return linhas;
    }

    public String[] getColunas() {
        return colunas;
    }

    @Override
    public int getRowCount() {
        return linhas.size();
    }

    @Override
    public int getColumnCount() {
        return colunas.length;
    }

    // Expecifica o nome das colunas na tabela
    @Override
    public String getColumnName(int numCol) {
        return colunas[numCol];
    }

    // Retornas as informacoes na tabela
    @Override
    public Object getValueAt(int numLinhas, int numColunas) {

        Object[] linha = (Object[]) getLinhas().get(numLinhas);

        return linha[numColunas];
    }

}
