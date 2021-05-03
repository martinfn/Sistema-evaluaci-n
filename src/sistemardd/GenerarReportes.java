
package sistemardd;

//Hecho por Burboa Astorga Ricardo 5IS-01V

import java.sql.Connection;
import java.util.HashMap;
import java.util.Map;
import javax.swing.JOptionPane;
import net.sf.jasperreports.engine.JasperFillManager;
import net.sf.jasperreports.engine.JasperPrint;
import net.sf.jasperreports.engine.JasperReport;
import net.sf.jasperreports.engine.util.JRLoader;
import net.sf.jasperreports.view.JasperViewer;

//Instituto Tecnológico de Estudios Superiores de Los Cabos
//Ingeniería en Sistemas Computacionales

public class GenerarReportes {
    
    public void reporteUsuarios(String id_materia) {
        
        try {
            JasperReport reporte = (JasperReport) JRLoader.loadObject("reporteEncuesta.jasper");
            Map parametro = new HashMap();
            
            parametro.put("id_materia", id_materia);
            conectar cc = new conectar();
            Connection cn = cc.conexion();
            
            JasperPrint j = JasperFillManager.fillReport(reporte, parametro, cn);
            JasperViewer jv = new JasperViewer(j, false);
            jv.setTitle("Resultados - Encuestas");
            jv.setVisible(true);
            
        } catch (Exception e) {
            JOptionPane.showMessageDialog(null, "Error al mostrar el reporte " +e);
        }
        
    }
    
}
