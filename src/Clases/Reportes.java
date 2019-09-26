package Clases;

import Conexion.Conexion;
import com.placeholder.PlaceHolder;
import java.awt.Color;
import java.awt.Component;
import java.awt.HeadlessException;
import java.awt.event.MouseMotionListener;
import java.sql.Connection;
import java.sql.Date;
import java.sql.PreparedStatement;
import java.sql.SQLException;
import java.sql.Statement;
import java.text.DateFormat;
import java.text.DecimalFormat;
import java.text.SimpleDateFormat;
import java.util.HashMap;
import javax.swing.JOptionPane;
import javax.swing.plaf.basic.BasicInternalFrameUI;
import net.sf.jasperreports.engine.JREmptyDataSource;
import net.sf.jasperreports.engine.JasperFillManager;
import net.sf.jasperreports.engine.JasperPrint;
import net.sf.jasperreports.view.JasperViewer;

public class Reportes extends javax.swing.JInternalFrame {
    public Reportes() {
        initComponents();
        this.getContentPane().setBackground(new Color(236, 240, 241));
    }
    
    
    public void limpiar(){
        jTextField1.setText("");
        jTextField2.setText("");
        jTextField3.setText("");
        jTextField4.setText("");
        jTextField5.setText("");
        jTextField6.setText("");
        jTextField7.setText("");
        jTextField8.setText("");
        jTextField9.setText("");
        jTextField10.setText("");
        jTextField11.setText("");
        jTextField12.setText("");
        jTextField13.setText("");
        jTextField14.setText("");
        jLabel19.setText("");
        jDateChooser1.setDate(null);
        jDateChooser2.setDate(null);
    }
    
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jLabel1 = new javax.swing.JLabel();
        jTextField1 = new javax.swing.JTextField();
        jLabel2 = new javax.swing.JLabel();
        jTextField2 = new javax.swing.JTextField();
        jLabel3 = new javax.swing.JLabel();
        jTextField3 = new javax.swing.JTextField();
        jLabel4 = new javax.swing.JLabel();
        jTextField4 = new javax.swing.JTextField();
        jLabel5 = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();
        jTextField6 = new javax.swing.JTextField();
        jTextField7 = new javax.swing.JTextField();
        jTextField8 = new javax.swing.JTextField();
        jLabel7 = new javax.swing.JLabel();
        jLabel8 = new javax.swing.JLabel();
        jTextField9 = new javax.swing.JTextField();
        jLabel9 = new javax.swing.JLabel();
        jTextField5 = new javax.swing.JTextField();
        jLabel10 = new javax.swing.JLabel();
        jTextField10 = new javax.swing.JTextField();
        jLabel11 = new javax.swing.JLabel();
        jTextField11 = new javax.swing.JTextField();
        jLabel12 = new javax.swing.JLabel();
        jTextField12 = new javax.swing.JTextField();
        jLabel13 = new javax.swing.JLabel();
        jTextField13 = new javax.swing.JTextField();
        jLabel14 = new javax.swing.JLabel();
        jTextField14 = new javax.swing.JTextField();
        jLabel15 = new javax.swing.JLabel();
        jLabel16 = new javax.swing.JLabel();
        jLabel17 = new javax.swing.JLabel();
        jButton1 = new javax.swing.JButton();
        jLabel18 = new javax.swing.JLabel();
        jLabel19 = new javax.swing.JLabel();
        jButton2 = new javax.swing.JButton();
        jDateChooser1 = new com.toedter.calendar.JDateChooser();
        jDateChooser2 = new com.toedter.calendar.JDateChooser();
        jButton3 = new javax.swing.JButton();

        setBackground(new java.awt.Color(255, 255, 255));
        setClosable(true);
        setTitle("Registrar factura");

        jLabel1.setFont(new java.awt.Font("Comic Sans MS", 1, 12)); // NOI18N
        jLabel1.setText("CLIENTE");

        jTextField1.setFont(new java.awt.Font("Comic Sans MS", 0, 12)); // NOI18N
        jTextField1.setHorizontalAlignment(javax.swing.JTextField.CENTER);

        jLabel2.setFont(new java.awt.Font("Comic Sans MS", 1, 12)); // NOI18N
        jLabel2.setText("TEL");

        jTextField2.setFont(new java.awt.Font("Comic Sans MS", 0, 12)); // NOI18N
        jTextField2.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        jTextField2.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                jTextField2KeyTyped(evt);
            }
        });

        jLabel3.setFont(new java.awt.Font("Comic Sans MS", 1, 12)); // NOI18N
        jLabel3.setText("EQUIPO");

        jTextField3.setFont(new java.awt.Font("Comic Sans MS", 0, 12)); // NOI18N
        jTextField3.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        jTextField3.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                jTextField3KeyTyped(evt);
            }
        });

        jLabel4.setFont(new java.awt.Font("Comic Sans MS", 1, 12)); // NOI18N
        jLabel4.setText("DIRECCIÓN");

        jTextField4.setFont(new java.awt.Font("Comic Sans MS", 0, 12)); // NOI18N
        jTextField4.setHorizontalAlignment(javax.swing.JTextField.CENTER);

        jLabel5.setFont(new java.awt.Font("Comic Sans MS", 1, 12)); // NOI18N
        jLabel5.setText("NIT");

        jLabel6.setFont(new java.awt.Font("Comic Sans MS", 1, 12)); // NOI18N
        jLabel6.setText("MARCA");

        jTextField6.setFont(new java.awt.Font("Comic Sans MS", 0, 12)); // NOI18N
        jTextField6.setHorizontalAlignment(javax.swing.JTextField.CENTER);

        jTextField7.setFont(new java.awt.Font("Comic Sans MS", 0, 12)); // NOI18N
        jTextField7.setHorizontalAlignment(javax.swing.JTextField.CENTER);

        jTextField8.setFont(new java.awt.Font("Comic Sans MS", 0, 12)); // NOI18N
        jTextField8.setHorizontalAlignment(javax.swing.JTextField.CENTER);

        jLabel7.setFont(new java.awt.Font("Comic Sans MS", 1, 12)); // NOI18N
        jLabel7.setText("MODELO");

        jLabel8.setFont(new java.awt.Font("Comic Sans MS", 1, 12)); // NOI18N
        jLabel8.setText("SERIAL");

        jTextField9.setFont(new java.awt.Font("Comic Sans MS", 0, 12)); // NOI18N
        jTextField9.setHorizontalAlignment(javax.swing.JTextField.CENTER);

        jLabel9.setFont(new java.awt.Font("Comic Sans MS", 1, 12)); // NOI18N
        jLabel9.setText("ACCESORIOS RECIBIDOS");

        jTextField5.setFont(new java.awt.Font("Comic Sans MS", 0, 12)); // NOI18N

        jLabel10.setFont(new java.awt.Font("Comic Sans MS", 1, 12)); // NOI18N
        jLabel10.setText("EL CLIENTE MANIFIESTA");

        jTextField10.setFont(new java.awt.Font("Comic Sans MS", 0, 12)); // NOI18N
        jTextField10.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jTextField10ActionPerformed(evt);
            }
        });

        jLabel11.setFont(new java.awt.Font("Comic Sans MS", 1, 12)); // NOI18N
        jLabel11.setText("OBSERVACIONES DEL TÉCNICO");

        jTextField11.setFont(new java.awt.Font("Comic Sans MS", 0, 12)); // NOI18N
        jTextField11.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jTextField11ActionPerformed(evt);
            }
        });

        jLabel12.setFont(new java.awt.Font("Comic Sans MS", 1, 12)); // NOI18N
        jLabel12.setText("TÉCNICO A CARGO");

        jTextField12.setFont(new java.awt.Font("Comic Sans MS", 0, 12)); // NOI18N
        jTextField12.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        jTextField12.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jTextField12ActionPerformed(evt);
            }
        });

        jLabel13.setFont(new java.awt.Font("Comic Sans MS", 1, 12)); // NOI18N
        jLabel13.setText("COSTO REVISIÓN Y/O REPARACIÓN");

        jTextField13.setFont(new java.awt.Font("Comic Sans MS", 0, 12)); // NOI18N
        jTextField13.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        jTextField13.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jTextField13ActionPerformed(evt);
            }
        });
        jTextField13.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                jTextField13KeyTyped(evt);
            }
        });

        jLabel14.setFont(new java.awt.Font("Comic Sans MS", 1, 12)); // NOI18N
        jLabel14.setText("COSTO DOMICILIO AUTORIZADO");

        jTextField14.setFont(new java.awt.Font("Comic Sans MS", 0, 12)); // NOI18N
        jTextField14.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        jTextField14.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jTextField14ActionPerformed(evt);
            }
        });
        jTextField14.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                jTextField14KeyTyped(evt);
            }
        });

        jLabel15.setFont(new java.awt.Font("Comic Sans MS", 1, 18)); // NOI18N
        jLabel15.setForeground(new java.awt.Color(255, 0, 51));
        jLabel15.setText("TOTAL A PAGAR");

        jLabel16.setFont(new java.awt.Font("Comic Sans MS", 1, 12)); // NOI18N
        jLabel16.setText("FECHA DE REPARACION");

        jLabel17.setFont(new java.awt.Font("Comic Sans MS", 1, 12)); // NOI18N
        jLabel17.setText("FECHA DE ENTREGA");

        jButton1.setBackground(new java.awt.Color(231, 76, 60));
        jButton1.setFont(new java.awt.Font("Comic Sans MS", 1, 12)); // NOI18N
        jButton1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Iconos/guardar.png"))); // NOI18N
        jButton1.setText("GUARDAR");
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });

        jLabel18.setFont(new java.awt.Font("Comic Sans MS", 1, 12)); // NOI18N

        jLabel19.setFont(new java.awt.Font("Comic Sans MS", 1, 18)); // NOI18N
        jLabel19.setForeground(new java.awt.Color(255, 0, 51));
        jLabel19.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel19.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));

        jButton2.setFont(new java.awt.Font("Comic Sans MS", 1, 12)); // NOI18N
        jButton2.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Iconos/calculadora-de-estudio.png"))); // NOI18N
        jButton2.setText("VALOR");
        jButton2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton2ActionPerformed(evt);
            }
        });

        jButton3.setBackground(new java.awt.Color(231, 76, 60));
        jButton3.setFont(new java.awt.Font("Comic Sans MS", 1, 12)); // NOI18N
        jButton3.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Iconos/imprimir.png"))); // NOI18N
        jButton3.setText("IMPRIMIR");
        jButton3.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton3ActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(jLabel3)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(jTextField7, javax.swing.GroupLayout.PREFERRED_SIZE, 175, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(jLabel6)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(jTextField6, javax.swing.GroupLayout.PREFERRED_SIZE, 141, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(jLabel7)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(jTextField8)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(jLabel8)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(jTextField9, javax.swing.GroupLayout.PREFERRED_SIZE, 103, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(12, 12, 12))
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(jLabel1)
                                .addGap(18, 18, 18)
                                .addComponent(jTextField1, javax.swing.GroupLayout.PREFERRED_SIZE, 259, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(18, 18, 18)
                                .addComponent(jLabel2)
                                .addGap(18, 18, 18)
                                .addComponent(jTextField2))
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(jLabel9)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addComponent(jTextField5))
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(jLabel5)
                                .addGap(18, 18, 18)
                                .addComponent(jTextField3, javax.swing.GroupLayout.PREFERRED_SIZE, 259, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(18, 18, 18)
                                .addComponent(jLabel4)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addComponent(jTextField4))
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(jLabel10)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addComponent(jTextField10))
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(jLabel11)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addComponent(jTextField11))
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(jLabel12)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addComponent(jTextField12))
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(jLabel13)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addComponent(jTextField13))
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(jLabel14)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addComponent(jTextField14)))
                        .addContainerGap())
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(jLabel15)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addComponent(jLabel19, javax.swing.GroupLayout.PREFERRED_SIZE, 275, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                .addGroup(layout.createSequentialGroup()
                                    .addComponent(jLabel17)
                                    .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                    .addComponent(jDateChooser2, javax.swing.GroupLayout.PREFERRED_SIZE, 138, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addGroup(javax.swing.GroupLayout.Alignment.LEADING, layout.createSequentialGroup()
                                    .addComponent(jLabel16)
                                    .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                    .addComponent(jDateChooser1, javax.swing.GroupLayout.PREFERRED_SIZE, 138, javax.swing.GroupLayout.PREFERRED_SIZE))))
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(layout.createSequentialGroup()
                                .addGap(200, 200, 200)
                                .addComponent(jLabel18, javax.swing.GroupLayout.PREFERRED_SIZE, 167, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(layout.createSequentialGroup()
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addComponent(jButton2))
                            .addGroup(layout.createSequentialGroup()
                                .addGap(2, 2, 2)
                                .addComponent(jButton1)
                                .addGap(18, 18, 18)
                                .addComponent(jButton3)))
                        .addContainerGap(56, Short.MAX_VALUE))))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel1)
                    .addComponent(jTextField1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel2)
                    .addComponent(jTextField2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jTextField3, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel4)
                    .addComponent(jTextField4, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel5))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel3)
                    .addComponent(jLabel6)
                    .addComponent(jTextField6, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jTextField7, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel7)
                    .addComponent(jTextField8, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel8)
                    .addComponent(jTextField9, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel9)
                    .addComponent(jTextField5, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel10)
                    .addComponent(jTextField10, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel11)
                    .addComponent(jTextField11, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(71, 71, 71)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel12)
                    .addComponent(jTextField12, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel13)
                    .addComponent(jTextField13, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel14)
                    .addComponent(jTextField14, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(jLabel18)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel19, javax.swing.GroupLayout.PREFERRED_SIZE, 26, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jButton2)))
                    .addComponent(jLabel15))
                .addGap(15, 15, 15)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(39, 39, 39)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jButton1, javax.swing.GroupLayout.DEFAULT_SIZE, 74, Short.MAX_VALUE)
                            .addComponent(jButton3, javax.swing.GroupLayout.DEFAULT_SIZE, 74, Short.MAX_VALUE)))
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(jLabel16, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(jDateChooser1, javax.swing.GroupLayout.DEFAULT_SIZE, 28, Short.MAX_VALUE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jDateChooser2, javax.swing.GroupLayout.PREFERRED_SIZE, 28, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel17, javax.swing.GroupLayout.PREFERRED_SIZE, 28, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(0, 0, Short.MAX_VALUE)))
                .addContainerGap())
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void jTextField10ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jTextField10ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jTextField10ActionPerformed

    private void jTextField11ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jTextField11ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jTextField11ActionPerformed

    private void jTextField12ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jTextField12ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jTextField12ActionPerformed

    private void jTextField13ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jTextField13ActionPerformed
        
    }//GEN-LAST:event_jTextField13ActionPerformed

    private void jTextField14ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jTextField14ActionPerformed

    }//GEN-LAST:event_jTextField14ActionPerformed

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed
        if (jTextField1.getText().isEmpty())
        {
            JOptionPane.showMessageDialog(this, "FALTA INGRESAR EL CLIENTE", "Advertencia", JOptionPane.WARNING_MESSAGE);
            jTextField1.requestFocus(); //pone el puntero en el textfield
        }
        else if (jTextField2.getText().isEmpty())
        {
            JOptionPane.showMessageDialog(this, "FALTA INGRESAR EL TELEFONO", "Advertencia", JOptionPane.WARNING_MESSAGE);
            jTextField2.requestFocus();
        }
        else if (jTextField3.getText().isEmpty())
        {
            JOptionPane.showMessageDialog(this, "FALTA INGRESAR EL NIT", "Advertencia", JOptionPane.WARNING_MESSAGE);
            jTextField3.requestFocus();
        }
        else if (jTextField4.getText().isEmpty())
        {
            JOptionPane.showMessageDialog(this, "FALTA INGRESAR LA DIRECCION", "Advertencia", JOptionPane.WARNING_MESSAGE);
            jTextField4.requestFocus();
        }
        else if (jTextField7.getText().isEmpty())
        {
            JOptionPane.showMessageDialog(this, "FALTA INGRESAR EL EQUIPO", "Advertencia", JOptionPane.WARNING_MESSAGE);
            jTextField7.requestFocus();
        }
        else if (jTextField6.getText().isEmpty())
        {
            JOptionPane.showMessageDialog(this, "FALTA INGRESAR LA MARCA", "Advertencia", JOptionPane.WARNING_MESSAGE);
            jTextField6.requestFocus();
        }
        else if (jTextField8.getText().isEmpty())
        {
            JOptionPane.showMessageDialog(this, "FALTA INGRESAR EL MODELO", "Advertencia", JOptionPane.WARNING_MESSAGE);
            jTextField8.requestFocus();
        }
        else if (jTextField9.getText().isEmpty())
        {
            JOptionPane.showMessageDialog(this, "FALTA INGRESAR EL SERIAL", "Advertencia", JOptionPane.WARNING_MESSAGE);
            jTextField9.requestFocus();
        }
        else if (jTextField5.getText().isEmpty())
        {
            JOptionPane.showMessageDialog(this, "FALTA INGRESAR LOS ACCESORIOS RECIBIDOS", "Advertencia", JOptionPane.WARNING_MESSAGE);
            jTextField5.requestFocus();
        }
        else if (jTextField10.getText().isEmpty())
        {
            JOptionPane.showMessageDialog(this, "FALTA INGRESAR LA MANIFESTACION DEL CLIENTE", "Advertencia", JOptionPane.WARNING_MESSAGE);
            jTextField10.requestFocus();
        }
        else if (jTextField1.getText().isEmpty())
        {
            JOptionPane.showMessageDialog(this, "FALTA INGRESAR LAS OBSERVACIONES DEL TECNICO", "Advertencia", JOptionPane.WARNING_MESSAGE);
            jTextField1.requestFocus();
        }
        else
        {
            int total = 0;
        try
            {
                Connection con = null;
                Conexion conect = new Conexion();
                con = conect.getConnection();
                Statement st = con.createStatement();
                String sql = "insert into Registro (cliente,telefono,nit,direccion,equipo,marca,modelo,serial,accesorios_recibidos,manifestacion_cliente,tecnico_cargo,costo_revision,costo_domicilio,total_pagar,fecha_reparacion,fecha_entrega,fecha) values (?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?)";
                PreparedStatement pst = con.prepareStatement(sql);
                pst.setString(1, jTextField1.getText());
                pst.setString(2, jTextField2.getText());
                pst.setString(3, jTextField3.getText());
                pst.setString(4, jTextField4.getText());
                pst.setString(5, jTextField7.getText());
                pst.setString(6, jTextField6.getText());
                pst.setString(7, jTextField8.getText());
                pst.setString(8, jTextField9.getText());
                pst.setString(9, jTextField5.getText());
                pst.setString(10, jTextField10.getText());
                pst.setString(11, jTextField12.getText());
                pst.setString(12, jTextField13.getText());
                pst.setString(13, jTextField14.getText());
                if(jTextField13.getText().length()>0 || jTextField14.getText().length()>0){
                int numero1 = Integer.parseInt(jTextField13.getText());
                int numero2 = Integer.parseInt(jTextField14.getText());
                total = numero1 + numero2;
                pst.setString(14, Integer.toString(total));
                }
                java.util.Date fecha1 = jDateChooser1.getDate();
                java.util.Date fecha2 = jDateChooser2.getDate();
                DateFormat f = new SimpleDateFormat("dd-mm-yyyy");
                pst.setString(15, f.format(fecha1));
                pst.setString(16, f.format(fecha2)); 
                pst.setString(17, f.format(fecha1));
                
                int n = pst.executeUpdate();
                if (n > 0)
                {
                    JOptionPane.showMessageDialog(this, "DATOS GUARDADOS CORRECTAMENTE");
                    limpiar();
                }
            } catch (SQLException | HeadlessException e)
            {
                JOptionPane.showMessageDialog(this, "LOS DATOS NO HAN SIDO GUARDADOS CORRECTAMENTE", "Error", JOptionPane.ERROR_MESSAGE);
            }
        }
        
    }//GEN-LAST:event_jButton1ActionPerformed

    private void jTextField13KeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_jTextField13KeyTyped
        char validar = evt.getKeyChar();
        
        if(Character.isLetter(validar)){
            getToolkit().beep();
            evt.consume();
            
            JOptionPane.showMessageDialog(rootPane, "Ingresar solo numeros");
        }
    }//GEN-LAST:event_jTextField13KeyTyped

    private void jTextField14KeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_jTextField14KeyTyped
        char validar = evt.getKeyChar();
        
        if(Character.isLetter(validar)){
            getToolkit().beep();
            evt.consume();
            
            JOptionPane.showMessageDialog(rootPane, "Ingresar solo numeros");
        }
    }//GEN-LAST:event_jTextField14KeyTyped

    private void jButton2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton2ActionPerformed
        int total = 0;
        DecimalFormat formatea = new DecimalFormat("###,###.##"); //decimales miles
        if(jTextField13.getText().length()>0 || jTextField14.getText().length()>0){
            int numero1 = Integer.parseInt(jTextField13.getText());
            int numero2 = Integer.parseInt(jTextField14.getText());
            total = numero1 + numero2;
            jLabel19.setText(formatea.format(total));
        }
    }//GEN-LAST:event_jButton2ActionPerformed

    private void jButton3ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton3ActionPerformed
        try {
            String master = System.getProperty("user.dir")+"/src/Reporte/Usuario.Jasper";
            HashMap parametros = new HashMap();
            
            parametros.put("ID","1");
            parametros.put("cliente",jTextField1.getText());
            parametros.put("tel",jTextField2.getText());
            parametros.put("nit",jTextField3.getText());
            parametros.put("direccion",jTextField4.getText());
            parametros.put("equipo",jTextField7.getText());
            parametros.put("marca",jTextField6.getText());
            parametros.put("modelo",jTextField8.getText());
            parametros.put("sarial",jTextField9.getText());
            parametros.put("accesorios",jTextField5.getText());
            if(jTextField10.getText().length() > 72){
                parametros.put("falla",jTextField10.getText().substring(0, 72));
                parametros.put("falla2",jTextField10.getText().substring(73));
            }
            else {
                parametros.put("falla",jTextField10.getText());
                parametros.put("falla2","");
            }
            if(jTextField11.getText().length() > 56){
                parametros.put("observacion",jTextField11.getText().substring(0, 56));
                parametros.put("observacion2",jTextField11.getText().substring(57));
            }
            else {
                parametros.put("observacion",jTextField11.getText());
                parametros.put("observacion2","");
            }
            //parametros.put("equipo",jTextField7.getText());
            //parametros.put("equipo",jTextField7.getText());
            
            
            JasperPrint informe = JasperFillManager.fillReport(master, parametros, new JREmptyDataSource());
            JasperViewer.viewReport(informe,false);
        } catch (Exception e) {
            JOptionPane.showMessageDialog(null,"Error"+e.getMessage().toString());
        }
    }//GEN-LAST:event_jButton3ActionPerformed

    private void jTextField2KeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_jTextField2KeyTyped
        char validar = evt.getKeyChar();
        
        if(Character.isLetter(validar)){
            getToolkit().beep();
            evt.consume();
            
            JOptionPane.showMessageDialog(rootPane, "Ingresar solo numeros");
        }
    }//GEN-LAST:event_jTextField2KeyTyped

    private void jTextField3KeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_jTextField3KeyTyped
        char validar = evt.getKeyChar();

            if(Character.isLetter(validar)){
                getToolkit().beep();
                evt.consume();

                JOptionPane.showMessageDialog(rootPane, "Ingresar solo numeros");
            }
    }//GEN-LAST:event_jTextField3KeyTyped


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton jButton1;
    private javax.swing.JButton jButton2;
    private javax.swing.JButton jButton3;
    private com.toedter.calendar.JDateChooser jDateChooser1;
    private com.toedter.calendar.JDateChooser jDateChooser2;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel10;
    private javax.swing.JLabel jLabel11;
    private javax.swing.JLabel jLabel12;
    private javax.swing.JLabel jLabel13;
    private javax.swing.JLabel jLabel14;
    private javax.swing.JLabel jLabel15;
    private javax.swing.JLabel jLabel16;
    private javax.swing.JLabel jLabel17;
    private javax.swing.JLabel jLabel18;
    private javax.swing.JLabel jLabel19;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JTextField jTextField1;
    private javax.swing.JTextField jTextField10;
    private javax.swing.JTextField jTextField11;
    private javax.swing.JTextField jTextField12;
    private javax.swing.JTextField jTextField13;
    private javax.swing.JTextField jTextField14;
    private javax.swing.JTextField jTextField2;
    private javax.swing.JTextField jTextField3;
    private javax.swing.JTextField jTextField4;
    private javax.swing.JTextField jTextField5;
    private javax.swing.JTextField jTextField6;
    private javax.swing.JTextField jTextField7;
    private javax.swing.JTextField jTextField8;
    private javax.swing.JTextField jTextField9;
    // End of variables declaration//GEN-END:variables
}
