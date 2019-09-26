package Reporte;

import java.util.HashMap;
import java.util.Map;
import net.sf.jasperreports.engine.JasperFillManager;
import net.sf.jasperreports.engine.JasperPrint;
import net.sf.jasperreports.engine.JasperReport;
import net.sf.jasperreports.engine.util.JRLoader;
import net.sf.jasperreports.view.JasperViewer;

public class GenerarReportes {
    
    public void reporteusuario(String id){
        try {
            JasperReport reporte = (JasperReport) JRLoader.loadObject("Usuario.jasper");
            Map parametro = new HashMap();
            parametro.put("idusuario", id);
            JasperPrint j = JasperFillManager.fillReport(reporte, parametro);
            JasperViewer jv = new JasperViewer(j,false);
            jv.setTitle("Reporte usuarios");
            jv.setVisible(true);
            
        } catch (Exception e) {
        }
    }
}
