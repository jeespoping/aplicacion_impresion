package Clases;

import static Clases.Interfaz.jDesktopPane1;
import java.io.InputStream;

import Conexion.Conexion;
import java.awt.Color;
import java.awt.Graphics;
import java.awt.Image;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.image.BufferedImage;
import java.beans.PropertyVetoException;
import java.io.IOException;
import java.sql.Connection;
import java.util.Calendar;
import java.util.GregorianCalendar;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.imageio.ImageIO;
import javax.swing.JOptionPane;
import javax.swing.Timer;

public class Interfaz extends javax.swing.JFrame {
    
    

    private Timer timer;
    Connection con = null;
    Conexion conect = new Conexion();
    public InputStream h =this.getClass().getResourceAsStream("/imagenes/fondo.jpg");

    public Interfaz() {
        initComponents();
        jMenuBar1.setBackground(new Color(149, 165, 166));
        this.setExtendedState(MAXIMIZED_BOTH); //Extender a lo largo de la pantalla
        setTitle("SISTEMA DE INVENTARIO"); //titulo
        Calendar cal = Calendar.getInstance();
        String fecha = cal.get(Calendar.DATE) + "/" + (cal.get(Calendar.MARCH) + 1) + "/" + cal.get(Calendar.YEAR);
        this.JLB_Fecha1.setText(fecha);
    }

    public class cronometro implements ActionListener {

        @Override
        public void actionPerformed(ActionEvent evt) {
            GregorianCalendar tiempo = new GregorianCalendar();
            int hora, minutos, segundos;
            hora = tiempo.get(Calendar.HOUR);
            minutos = tiempo.get(Calendar.MINUTE);
            segundos = tiempo.get(Calendar.SECOND);
            txtHora1.setText(String.valueOf(hora));
            txtMinutos1.setText(String.valueOf(minutos));
            txtSegundos1.setText(String.valueOf(segundos));
        }
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jDesktopPane1 = new javax.swing.JDesktopPane(){
            private Image image;
            {
                try {
                    image = ImageIO.read(getClass().getResource("/imagenes/fondo.jpg"));
                } catch (IOException e) {
                    e.printStackTrace();
                }
            }

            @Override
            protected void paintComponent(Graphics g) {
                super.paintComponent(g);
                g.drawImage(image, 0, 0, getWidth(), getHeight(), this);
            }
            //@Override
            //protected void paintComponent(Graphics g) {
                //super.paintComponent(g);
                //g.setColor(new Color(52, 152, 219));
                //  g.fillRect(0, 0, getWidth(), getHeight());
                //}
        }
        ;
        jLabel6 = new javax.swing.JLabel();
        txtMinutos1 = new javax.swing.JLabel();
        jLabel7 = new javax.swing.JLabel();
        txtSegundos1 = new javax.swing.JLabel();
        jLabel8 = new javax.swing.JLabel();
        jLabel9 = new javax.swing.JLabel();
        JLB_Fecha1 = new javax.swing.JLabel();
        txtHora1 = new javax.swing.JLabel();
        jMenuBar1 = new javax.swing.JMenuBar(){
            @Override
            protected void paintComponent(Graphics g) {
                super.paintComponent(g);
                g.setColor(new Color(149, 165, 166));
                g.fillRect(0, 0, getWidth(), getHeight());
            }
        };
        jMenu1 = new javax.swing.JMenu();
        jMenuItem1 = new javax.swing.JMenuItem();
        jMenuItem2 = new javax.swing.JMenuItem();
        jMenu2 = new javax.swing.JMenu();
        jMenuItem3 = new javax.swing.JMenuItem();
        jMenuItem4 = new javax.swing.JMenuItem();
        jMenuItem6 = new javax.swing.JMenuItem();
        jMenu3 = new javax.swing.JMenu();
        jMenuItem5 = new javax.swing.JMenuItem();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        addWindowListener(new java.awt.event.WindowAdapter() {
            public void windowOpened(java.awt.event.WindowEvent evt) {
                formWindowOpened(evt);
            }
        });

        jLabel6.setFont(new java.awt.Font("Decker", 1, 25)); // NOI18N
        jLabel6.setText(":");

        txtMinutos1.setFont(new java.awt.Font("Decker", 1, 25)); // NOI18N
        txtMinutos1.setText("00");

        jLabel7.setFont(new java.awt.Font("Decker", 1, 25)); // NOI18N
        jLabel7.setText(":");

        txtSegundos1.setFont(new java.awt.Font("Decker", 1, 25)); // NOI18N
        txtSegundos1.setText("00");

        jLabel8.setFont(new java.awt.Font("Decker", 1, 25)); // NOI18N
        jLabel8.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel8.setText("HORA:");

        jLabel9.setFont(new java.awt.Font("Decker", 1, 25)); // NOI18N
        jLabel9.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel9.setText("FECHA:");

        JLB_Fecha1.setFont(new java.awt.Font("Decker", 1, 25)); // NOI18N
        JLB_Fecha1.setText("00/00/00");

        txtHora1.setFont(new java.awt.Font("Decker", 1, 25)); // NOI18N
        txtHora1.setText("00");

        javax.swing.GroupLayout jDesktopPane1Layout = new javax.swing.GroupLayout(jDesktopPane1);
        jDesktopPane1.setLayout(jDesktopPane1Layout);
        jDesktopPane1Layout.setHorizontalGroup(
            jDesktopPane1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jDesktopPane1Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel9)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(JLB_Fecha1, javax.swing.GroupLayout.PREFERRED_SIZE, 150, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 346, Short.MAX_VALUE)
                .addComponent(jLabel8)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(txtHora1)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jLabel6)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(txtMinutos1)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jLabel7)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(txtSegundos1)
                .addContainerGap())
        );
        jDesktopPane1Layout.setVerticalGroup(
            jDesktopPane1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jDesktopPane1Layout.createSequentialGroup()
                .addContainerGap(429, Short.MAX_VALUE)
                .addGroup(jDesktopPane1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel8)
                    .addGroup(jDesktopPane1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(txtHora1)
                        .addComponent(jLabel6)
                        .addComponent(txtMinutos1)
                        .addComponent(jLabel7)
                        .addComponent(txtSegundos1))
                    .addComponent(JLB_Fecha1, javax.swing.GroupLayout.PREFERRED_SIZE, 29, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel9, javax.swing.GroupLayout.PREFERRED_SIZE, 29, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap())
        );
        jDesktopPane1.setLayer(jLabel6, javax.swing.JLayeredPane.DEFAULT_LAYER);
        jDesktopPane1.setLayer(txtMinutos1, javax.swing.JLayeredPane.DEFAULT_LAYER);
        jDesktopPane1.setLayer(jLabel7, javax.swing.JLayeredPane.DEFAULT_LAYER);
        jDesktopPane1.setLayer(txtSegundos1, javax.swing.JLayeredPane.DEFAULT_LAYER);
        jDesktopPane1.setLayer(jLabel8, javax.swing.JLayeredPane.DEFAULT_LAYER);
        jDesktopPane1.setLayer(jLabel9, javax.swing.JLayeredPane.DEFAULT_LAYER);
        jDesktopPane1.setLayer(JLB_Fecha1, javax.swing.JLayeredPane.DEFAULT_LAYER);
        jDesktopPane1.setLayer(txtHora1, javax.swing.JLayeredPane.DEFAULT_LAYER);

        jMenu1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Iconos/casa.png"))); // NOI18N
        jMenu1.setText("INICIO");
        jMenu1.setFont(new java.awt.Font("Ebrima", 1, 14)); // NOI18N

        jMenuItem1.setFont(new java.awt.Font("Ebrima", 1, 12)); // NOI18N
        jMenuItem1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Iconos/subir.png"))); // NOI18N
        jMenuItem1.setText("PROBAR CONEXION");
        jMenuItem1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jMenuItem1ActionPerformed(evt);
            }
        });
        jMenu1.add(jMenuItem1);

        jMenuItem2.setFont(new java.awt.Font("Ebrima", 1, 12)); // NOI18N
        jMenuItem2.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Iconos/cancelar.png"))); // NOI18N
        jMenuItem2.setText("SALIR");
        jMenuItem2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jMenuItem2ActionPerformed(evt);
            }
        });
        jMenu1.add(jMenuItem2);

        jMenuBar1.add(jMenu1);

        jMenu2.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Iconos/avion-de-papel.png"))); // NOI18N
        jMenu2.setText("OPCIONES");
        jMenu2.setFont(new java.awt.Font("Ebrima", 1, 14)); // NOI18N

        jMenuItem3.setFont(new java.awt.Font("Ebrima", 1, 12)); // NOI18N
        jMenuItem3.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Iconos/libro.png"))); // NOI18N
        jMenuItem3.setText("AGREGAR");
        jMenuItem3.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jMenuItem3ActionPerformed(evt);
            }
        });
        jMenu2.add(jMenuItem3);

        jMenuItem4.setFont(new java.awt.Font("Ebrima", 1, 12)); // NOI18N
        jMenuItem4.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Iconos/lupa.png"))); // NOI18N
        jMenuItem4.setText("BUSCAR");
        jMenuItem4.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jMenuItem4ActionPerformed(evt);
            }
        });
        jMenu2.add(jMenuItem4);

        jMenuItem6.setFont(new java.awt.Font("Ebrima", 1, 12)); // NOI18N
        jMenuItem6.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Iconos/basura.png"))); // NOI18N
        jMenuItem6.setText("BORRAR");
        jMenu2.add(jMenuItem6);

        jMenuBar1.add(jMenu2);

        jMenu3.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Iconos/avatar.png"))); // NOI18N
        jMenu3.setText("AYUDA");
        jMenu3.setFont(new java.awt.Font("Ebrima", 1, 14)); // NOI18N

        jMenuItem5.setFont(new java.awt.Font("Ebrima", 1, 12)); // NOI18N
        jMenuItem5.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Iconos/lentes.png"))); // NOI18N
        jMenuItem5.setText("HELP");
        jMenu3.add(jMenuItem5);

        jMenuBar1.add(jMenu3);

        setJMenuBar(jMenuBar1);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jDesktopPane1)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jDesktopPane1)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void jMenuItem3ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jMenuItem3ActionPerformed
        Reportes R = new Reportes();
        jDesktopPane1.add(R);
        R.setVisible(true);
        R.toFront(); //[poner al frente
        R.setLocation(jDesktopPane1.getWidth() / 2 - R.getWidth() / 2, jDesktopPane1.getHeight() / 2 - R.getHeight() / 2);
        //Codigo sacado en facebook para no mover la ventana
        
        try {
        R.setMaximum(true); //OPCIONAL
        } catch (PropertyVetoException ex) {
        Logger.getLogger(Interfaz.class.getName()).log(Level.SEVERE, null, ex);
        }
        R.setVisible(true);
    }//GEN-LAST:event_jMenuItem3ActionPerformed

    private void jMenuItem1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jMenuItem1ActionPerformed
        con = conect.getConnection();
        JOptionPane.showMessageDialog(null, "CONEXION EXITOSA");
    }//GEN-LAST:event_jMenuItem1ActionPerformed

    private void formWindowOpened(java.awt.event.WindowEvent evt) {//GEN-FIRST:event_formWindowOpened
        timer = new Timer(1000, new cronometro());
        timer.start();
    }//GEN-LAST:event_formWindowOpened

    private void jMenuItem2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jMenuItem2ActionPerformed
        JOptionPane.showMessageDialog(null, "CONEXION TERMINADA");
        Conexion obj = new Conexion();
        obj.Desconexion();
    }//GEN-LAST:event_jMenuItem2ActionPerformed

    private void jMenuItem4ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jMenuItem4ActionPerformed

    }//GEN-LAST:event_jMenuItem4ActionPerformed

    /**
     * @param args the command line arguments
     */
    public static void main(String args[]) {
        /* Set the Nimbus look and feel */
        //<editor-fold defaultstate="collapsed" desc=" Look and feel setting code (optional) ">
        /* If Nimbus (introduced in Java SE 6) is not available, stay with the default look and feel.
         * For details see http://download.oracle.com/javase/tutorial/uiswing/lookandfeel/plaf.html 
         */
        try {
            for (javax.swing.UIManager.LookAndFeelInfo info : javax.swing.UIManager.getInstalledLookAndFeels()) {
                if ("Nimbus".equals(info.getName())) {
                    javax.swing.UIManager.setLookAndFeel(info.getClassName());
                    break;
                }
            }
        } catch (ClassNotFoundException ex) {
            java.util.logging.Logger.getLogger(Interfaz.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Interfaz.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Interfaz.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Interfaz.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Interfaz().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel JLB_Fecha1;
    public static javax.swing.JDesktopPane jDesktopPane1;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JMenu jMenu1;
    private javax.swing.JMenu jMenu2;
    private javax.swing.JMenu jMenu3;
    private javax.swing.JMenuBar jMenuBar1;
    private javax.swing.JMenuItem jMenuItem1;
    private javax.swing.JMenuItem jMenuItem2;
    private javax.swing.JMenuItem jMenuItem3;
    private javax.swing.JMenuItem jMenuItem4;
    private javax.swing.JMenuItem jMenuItem5;
    private javax.swing.JMenuItem jMenuItem6;
    private javax.swing.JLabel txtHora1;
    private javax.swing.JLabel txtMinutos1;
    private javax.swing.JLabel txtSegundos1;
    // End of variables declaration//GEN-END:variables
}
