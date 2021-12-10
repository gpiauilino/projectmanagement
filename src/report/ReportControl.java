package report;

import java.io.File;
import java.io.FileWriter;
import java.io.IOException;
import javax.swing.JTable;
import javax.swing.table.TableModel;

/**
 *
 * @author gabriel
 */
public class ReportControl {

    /*
https://stackoverflow.com/a/8889964
String s = Dashboard.mail_seller.getSelectedItem().toString();
            String selected[] = s.split(" -- ");
            String seller_id = selected[0].trim();
            String filename = sale_date + "_" + selected[1].replaceAll(" ", "_").trim() + ".pdf";
            String reportName = reportPath + "AuctionSale/AuctionSellerMail/AuctionSeller.jasper";
            Map<String, Object> params = new HashMap<String, Object>();
            params.put("sale_date", sale_date);
            params.put("seller_id", seller_id);
            JasperPrint jasperPrint = JasperFillManager.fillReport(reportName, params, DB.getConn());
            OutputStream output = new FileOutputStream(new File("D:/Netbeans Projects/JDSons/mail_reports/"+filename+"")); 
            JasperExportManager.exportReportToPdfStream(jasperPrint, output); 
            output.flush();
            output.close();
     */
    // https://stackoverflow.com/a/45641649
    public static boolean exportarParaCsv(JTable tabela, String arquivoDeSaida, char separador) {
        try {

            TableModel model = tabela.getModel();

            FileWriter csv = new FileWriter(new File(arquivoDeSaida));

            for (int i = 0; i < model.getColumnCount(); i++) {
                csv.write(model.getColumnName(i) + separador);
            }

            csv.write("\n");

            for (int i = 0; i < model.getRowCount(); i++) {
                for (int j = 0; j < model.getColumnCount(); j++) {
                    csv.write(model.getValueAt(i, j).toString() + separador);
                }
                
                // pra tirar o ultima virgula
                //Utilitarios.removeLastChar
                
                csv.write("\n");
            }

            csv.close();
            return true;
        } catch (IOException e) {
        }
        return false;
    }

}
