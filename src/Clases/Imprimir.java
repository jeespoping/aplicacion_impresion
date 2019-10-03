
package Clases;

import static Clases.Reportes.jDateChooser1;
import Conexion.Conexion;
import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.text.DecimalFormat;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.HashMap;
import javax.swing.JOptionPane;
import net.sf.jasperreports.engine.JREmptyDataSource;
import net.sf.jasperreports.engine.JasperFillManager;
import net.sf.jasperreports.engine.JasperPrint;
import net.sf.jasperreports.view.JasperViewer;

public class Imprimir {
    String ID,cliente,tel,nit,direccion,equipo,marca,modelo,sarial,accesorios,falla,obsrvacion,tecnico,fechaEnt,fechaRep;
    Integer costoRev,costoDom,total;
    SimpleDateFormat format = new SimpleDateFormat("dd/MM/YYYY");
    DecimalFormat formato = new DecimalFormat("###,###.##");
    
    public void Imprimir() throws SQLException{
        
        
        try {
            String master = System.getProperty("user.dir")+"/src/Reporte/Usuario.Jasper";
            HashMap parametros = new HashMap();
       
            parametros.put("ID",ID);
            parametros.put("cliente",cliente);
            parametros.put("tel",tel);
            parametros.put("nit",nit);
            parametros.put("direccion",direccion);
            parametros.put("equipo",equipo);
            parametros.put("marca",marca);
            parametros.put("modelo",modelo);
            parametros.put("sarial",sarial);
            parametros.put("accesorios",accesorios);
            if(falla.length() > 72){
                parametros.put("falla",falla.substring(0, 72));
                parametros.put("falla2",falla.substring(73));
            }
            else {
                parametros.put("falla",falla);
                parametros.put("falla2","");
            }
            if(obsrvacion.length() > 56){
                parametros.put("observacion",obsrvacion.substring(0, 56));
                parametros.put("observacion2",obsrvacion.substring(57));
            }
            else {
                parametros.put("observacion",obsrvacion);
                parametros.put("observacion2","");
            }
            parametros.put("tecnico", tecnico);
            parametros.put("D",format.format(new Date()).substring(0,2));
            parametros.put("M",format.format(new Date()).substring(3,5));
            parametros.put("A",format.format(new Date()).substring(6));
            parametros.put("costoRev",formato.format(costoRev));
            parametros.put("costoDom",formato.format(costoDom));
            parametros.put("total",formato.format(total));
            parametros.put("fechaRep", fechaRep);
            parametros.put("fechaEnt",fechaEnt);
            
            //parametros.put("equipo",jTextField7.getText());
            //parametros.put("equipo",jTextField7.getText());
            
            JasperPrint informe = JasperFillManager.fillReport(master, parametros, new JREmptyDataSource());
            JasperViewer.viewReport(informe,false);
        } catch (Exception e) {
            JOptionPane.showMessageDialog(null,"Error"+e.getMessage().toString());
        }
    }
    
    public void datos() throws SQLException{
        try{
            Connection con = null;
            Conexion conect = new Conexion();
            con = conect.getConnection();
            String sql = "select * from Registro";
            Statement st = con.createStatement();
            ResultSet rs = st.executeQuery(sql);
            
            while(rs.next()){
                this.ID = rs.getString("Id_registro");
                this.cliente = rs.getString("cliente");
                this.tel = rs.getString("telefono");
                this.nit = rs.getString("nit");
                this.direccion = rs.getString("direccion");
                this.equipo = rs.getString("equipo");
                this.marca = rs.getString("marca");
                this.modelo = rs.getString("modelo");
                this.sarial = rs.getString("serial");
                this.accesorios = rs.getString("accesorios_recibidos");
                this.falla = rs.getString("manifestacion_cliente");
                this.obsrvacion = rs.getNString("manifestacion_tecnico");
                this.costoRev = rs.getInt("costo_revision");
                this.costoDom = rs.getInt("costo_domicilio");
                this.total = rs.getInt("total_pagar");
                this.tecnico = rs.getString("tecnico_cargo");
                this.fechaEnt = rs.getString("fecha_entrega");
                this.fechaRep = rs.getString("fecha_reparacion");
            }
        }catch(Exception e){
            JOptionPane.showMessageDialog(null, "NO HAY DATOS", "Advertencia", JOptionPane.WARNING_MESSAGE);
        }
    }
    
    public boolean buscarDatos(String id) throws SQLException{
        Boolean flag = false;
        try {
            Connection con = null;
            Conexion conect = new Conexion();
            con = conect.getConnection();
            String sql = "select * from Registro";
            Statement st = con.createStatement();
            ResultSet rs = st.executeQuery(sql);
            while(rs.next()){
                if(id.equalsIgnoreCase(rs.getString("Id_registro"))){
                    this.ID = rs.getString("Id_registro");
                    this.cliente = rs.getString("cliente");
                    this.tel = rs.getString("telefono");
                    this.nit = rs.getString("nit");
                    this.direccion = rs.getString("direccion");
                    this.equipo = rs.getString("equipo");
                    this.marca = rs.getString("marca");
                    this.modelo = rs.getString("modelo");
                    this.sarial = rs.getString("serial");
                    this.accesorios = rs.getString("accesorios_recibidos");
                    this.falla = rs.getString("manifestacion_cliente");
                    this.obsrvacion = rs.getNString("manifestacion_tecnico");
                    this.costoRev = rs.getInt("costo_revision");
                    this.costoDom = rs.getInt("costo_domicilio");
                    this.total = rs.getInt("total_pagar");
                    this.tecnico = rs.getString("tecnico_cargo");
                    this.fechaEnt = rs.getString("fecha_entrega");
                    this.fechaRep = rs.getString("fecha_reparacion");
                    return true;
                }
            }
            if(flag == false){
                JOptionPane.showMessageDialog(null, "NO SE HA ENCONTRADO EL ID", "Advertencia", JOptionPane.WARNING_MESSAGE);
            }
        } catch (Exception e) {
            JOptionPane.showMessageDialog(null, "NO SE HA ENCONTRADO EL ID", "Advertencia", JOptionPane.WARNING_MESSAGE);
        }
        return false;
    }
}
