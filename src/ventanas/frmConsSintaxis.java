/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */
package ventanas;

import BD.conexion;
import analisissintaxis.gramatica;
import analisissintaxis.logica;
import analisissintaxis.pilita;
import java.sql.ResultSet;
import java.util.ArrayList;
import java.util.Stack;
import javax.swing.JTable;
import javax.swing.table.DefaultTableModel;

/**
 *
 * @author cesar
 */
public class frmConsSintaxis extends javax.swing.JFrame {
    DefaultTableModel modelo;
    DefaultTableModel modelo2;
    /**
     * Creates new form frmConsSintaxis
     */
    public frmConsSintaxis() {
        initComponents();

       String[] titulos = {"idG", "Nombre"};
       String[] titulos2 = {"Pila", "B", "i", "j","A", "a", "P","Y"}; 
       modelo = new DefaultTableModel(null,titulos);
       tblAc1.setModel(modelo);
       modelo2 = new DefaultTableModel(null,titulos2);
       tbl2.setModel(modelo2);
       mostrarDatos();
    }
    public void mostrarDatos(){
        while(modelo.getRowCount()>0){
        modelo.removeRow(0);
        }
        conexion conec = new conexion();
              try {
                  ResultSet resultado = conec.consultar("SELECT * FROM gramaticas");
                  while(resultado.next()){
                  Object[] objAceptador = {resultado.getString("idG"), resultado.getString("nombre")};
                  modelo.addRow(objAceptador);
                  }
        } catch (Exception e) {
            System.out.println("Error :"+ e);
        }
    }
    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jScrollPane1 = new javax.swing.JScrollPane();
        tblAc = new javax.swing.JTable();
        jScrollPane3 = new javax.swing.JScrollPane();
        jTextArea1 = new javax.swing.JTextArea();
        jLabel1 = new javax.swing.JLabel();
        jScrollPane2 = new javax.swing.JScrollPane();
        tblAc1 = new javax.swing.JTable();
        jLabel3 = new javax.swing.JLabel();
        lblNombre = new javax.swing.JLabel();
        lblId = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jButton1 = new javax.swing.JButton();
        jLabel4 = new javax.swing.JLabel();
        txtW = new javax.swing.JTextField();
        jScrollPane4 = new javax.swing.JScrollPane();
        tbl2 = new javax.swing.JTable();
        lblEmer = new javax.swing.JLabel();
        btnBack = new javax.swing.JButton();

        tblAc.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null}
            },
            new String [] {
                "Title 1", "Title 2", "Title 3", "Title 4"
            }
        ));
        tblAc.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                tblAcMouseClicked(evt);
            }
        });
        jScrollPane1.setViewportView(tblAc);

        jTextArea1.setColumns(20);
        jTextArea1.setRows(5);
        jScrollPane3.setViewportView(jTextArea1);

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jLabel1.setFont(new java.awt.Font("Segoe UI", 0, 18)); // NOI18N
        jLabel1.setText("Analizar sintaxis");

        tblAc1.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null}
            },
            new String [] {
                "Title 1", "Title 2", "Title 3", "Title 4"
            }
        ));
        tblAc1.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                tblAc1MouseClicked(evt);
            }
        });
        jScrollPane2.setViewportView(tblAc1);

        jLabel3.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        jLabel3.setText("Nombre:");

        lblNombre.setText("   ");

        lblId.setText("       ");

        jLabel2.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        jLabel2.setText("Id:");

        jButton1.setText("Analizar");
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });

        jLabel4.setFont(new java.awt.Font("Segoe UI", 0, 18)); // NOI18N
        jLabel4.setText("w");

        tbl2.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null}
            },
            new String [] {
                "Title 1", "Title 2", "Title 3", "Title 4"
            }
        ));
        jScrollPane4.setViewportView(tbl2);

        btnBack.setText("regresar");
        btnBack.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnBackActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(12, 12, 12)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addGroup(javax.swing.GroupLayout.Alignment.LEADING, layout.createSequentialGroup()
                        .addComponent(jScrollPane2, javax.swing.GroupLayout.PREFERRED_SIZE, 272, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(225, 225, 225)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel1)
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(jLabel2, javax.swing.GroupLayout.PREFERRED_SIZE, 26, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(24, 24, 24)
                                .addComponent(lblId, javax.swing.GroupLayout.PREFERRED_SIZE, 103, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(jLabel3)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addComponent(lblNombre, javax.swing.GroupLayout.PREFERRED_SIZE, 85, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addComponent(jButton1)
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(jLabel4)
                                .addGap(31, 31, 31)
                                .addComponent(txtW, javax.swing.GroupLayout.PREFERRED_SIZE, 71, javax.swing.GroupLayout.PREFERRED_SIZE)))
                        .addContainerGap())
                    .addGroup(layout.createSequentialGroup()
                        .addGap(17, 17, 17)
                        .addComponent(jScrollPane4, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(layout.createSequentialGroup()
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addComponent(lblEmer, javax.swing.GroupLayout.PREFERRED_SIZE, 212, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addContainerGap(208, Short.MAX_VALUE))
                            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addComponent(btnBack)
                                .addGap(169, 169, 169))))))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel1)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(58, 58, 58)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel2)
                            .addComponent(lblId))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel3)
                            .addComponent(lblNombre))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel4)
                            .addComponent(txtW, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(70, 70, 70)
                        .addComponent(jButton1)
                        .addGap(32, 32, 32)
                        .addComponent(lblEmer, javax.swing.GroupLayout.PREFERRED_SIZE, 38, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addComponent(btnBack))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(46, 46, 46)
                        .addComponent(jScrollPane2, javax.swing.GroupLayout.PREFERRED_SIZE, 72, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jScrollPane4, javax.swing.GroupLayout.PREFERRED_SIZE, 215, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap(19, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void tblAcMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_tblAcMouseClicked
        if(evt.getClickCount() == 1){
            JTable receptor = (JTable)evt.getSource();
            lblId.setText(receptor.getModel().getValueAt(receptor.getSelectedRow(),0).toString());
            lblNombre.setText(receptor.getModel().getValueAt(receptor.getSelectedRow(),1).toString());
        }        // TODO add your handling code here:
    }//GEN-LAST:event_tblAcMouseClicked

    private void tblAc1MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_tblAc1MouseClicked
        if(evt.getClickCount() == 1){
            JTable receptor = (JTable)evt.getSource();
            lblId.setText(receptor.getModel().getValueAt(receptor.getSelectedRow(),0).toString());
            lblNombre.setText(receptor.getModel().getValueAt(receptor.getSelectedRow(),1).toString());
        }        // TODO add your handling code here:
    }//GEN-LAST:event_tblAc1MouseClicked

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed
// TODO add your handling code here:
    String auxId = lblId.getText();
    String w = txtW.getText();
    lblEmer.setText(" ");
    String B = "";
    String A = "";
    String  a = "";
    String phi = " ";
    String t = " ";
    int vi, j = -1;
    ArrayList<gramatica> regla = new ArrayList<gramatica>();
    ArrayList<logica> logicas = new ArrayList<logica>();
    Stack<pilita> pila = new Stack();
    ///-------------------------------------------------------
    String sentencia = String.format("SELECT * FROM reglas WHERE idG == '%s'", auxId);
    conexion conec = new conexion();
                  try {
                  ResultSet resultado = conec.consultar(sentencia);
                  while(resultado.next()){
                   //estadosCon[cont] = new convertidor(resultado.getString("estadoAc"), resultado.getString("estado0"),resultado.getString("estado1"),resultado.getString("esInicial"),resultado.getString("esAceptador"));  
                   //cont++;
                   regla.add(new gramatica());
              
                   regla.get(regla.size() -1).setNumerR(Integer.parseInt(resultado.getString("NUMERO")));
                   regla.get(regla.size() -1).setAlpha(resultado.getString("alp"));
                   regla.get(regla.size() -1).setBeta(resultado.getString("beta"));
                  }
        } catch (Exception e) {
            System.out.println("Error en conversor:"+ e);
        }
///---------------------------------------------LOGICA--------------------------------------
        //modelo2.rowsRemoved(tbl2);
        int flag1While = 1;
        
        pila.push(new pilita("sig",0));
        logicas.add(new logica());
        logicas.get(logicas.size() - 1).setPila("sig,0");
        while(flag1While == 1 && !pila.isEmpty()){
            pilita AA = new pilita();
            AA = pila.pop();
            B = AA.getPila();
            logicas.get(logicas.size() - 1).setB(B);
            vi = AA.getI();
            logicas.get(logicas.size() - 1).setI(vi);
            System.out.println("i = "+vi);
            
            int flagWhile2 = 1;
            while(flagWhile2 == 1){
            System.out.println("B = "+ B);
            if(B.equals("sig")){
                A = "sig";
                System.out.println("llegue a que A es " + A);
            }else{
            int f1 = 0;
            int op = 0;
            int g = 0;
            int fg = 0;
            int h = 0;
            /*while(f1 == 0){
                if(Character.toString(B.charAt(op)).matches("[A-Z]")){
                    A = String.valueOf(B.charAt(op));
                    f1 = 1;
                    System.out.println("llegue a que A es " + A);
                }else{
                 phi = String.valueOf(B.charAt(op))
                }
                op++;
            }*/
            for(int i = 0; i < B.length(); i++){
                    if(Character.toString(B.charAt(i)).matches("[A-Z]") && f1 == 0){
                        A = String.valueOf(B.charAt(i));
                        f1 = 1;
                        fg = 1;
                    }else if(fg == 0){
                        if(g == 0){
                           phi = String.valueOf(B.charAt(i));
                           g = 1;
                        }else{
                            phi = phi + String.valueOf(B.charAt(i));
                        }
                    }else if(fg == 1){
                      if(h == 0){
                          t = String.valueOf(B.charAt(i));
                          h = 1;
                      }else{
                          t = t + String.valueOf(B.charAt(i));
                      }  
                    }
                }
            }
            System.out.println("phi: "+phi);
            System.out.println("T: "+t);
            System.out.println("A: "+A);
            logicas.get(logicas.size() - 1).setA(A);
            logicas.get(logicas.size() - 1).setP(phi);
            logicas.get(logicas.size() - 1).setY(t);
                int f2 = 0;
                int p = 0;
                int flgy = 0;
                while(f2 == 0){
                    //System.out.println("llegue al while de f2");
                    if(A.equals(regla.get(p).getAlpha()) && regla.get(p).getNumerR() > vi){
                        
                    j = regla.get(p).getNumerR();
                    a = regla.get(p).getBeta();
                    f2 = 1;
                    flgy = 1;
                    }
                    if(p == regla.size() - 1){
                        f2 = 1;
                    }
                 p++;
                }
                
                if(flgy == 0){
                System.out.println("No se encontro");
                j = -1;
                }
                
                int f3 = 0;
                if(j > 0){
                System.out.println("j: " + j);
                System.out.println("a: " + a);
                logicas.get(logicas.size() - 1).setJ(j);
                logicas.get(logicas.size() - 1).setAlp(a);
                pila.push(new pilita(B,j));
                logicas.add(new logica());
                logicas.get(logicas.size() - 1).setPila(B+","+String.valueOf(j));
                if(" ".equals(phi) && " ".equals(t)){
                    B = a;
                }else{
                    B = phi + a + t;
                }
                System.out.println("tamanio b: " + B.length());
                System.out.println("tamanio w: " + w.length());
                  if(B.length() <= w.length()){
                   System.out.println("Se va a comprobar B: " + B);
                    for(int i = 0; i < B.length(); i++){
                    if(Character.toString(B.charAt(i)).matches("[A-Z]")){
                        f3 = 1;
                        vi = 0;
                    }
                }
                }
                }
    
                if(f3 == 0){
                    flagWhile2 = 0;
                }
            }
            System.out.println("Sali del segun while");
            if(B.equals(w)){
               flag1While = 0;
               System.out.println("Fue un exito");
               lblEmer.setText("Fue un exito");
            }else if(pila.isEmpty()){
            lblEmer.setText("Error");
            }
        }
        for(int k = 0; k <logicas.size(); k++){
            Object auxPila,auxB,auxI,auxJ,auxA,auxAlph,auxPhi,auxTen;
            Object[] pasos = {logicas.get(k).getPila(),logicas.get(k).getB(),String.valueOf(logicas.get(k).getI()), String.valueOf(logicas.get(k).getJ()),logicas.get(k).getA(),logicas.get(k).getAlp(),logicas.get(k).getP(),logicas.get(k).getY()};
            modelo2.addRow(pasos);
        }
        
    }//GEN-LAST:event_jButton1ActionPerformed

    private void btnBackActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnBackActionPerformed
    frmPrincipal back = new frmPrincipal();
    back.setVisible(true);
    this.dispose();         // TODO add your handling code here:
    }//GEN-LAST:event_btnBackActionPerformed

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
            java.util.logging.Logger.getLogger(frmConsSintaxis.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(frmConsSintaxis.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(frmConsSintaxis.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(frmConsSintaxis.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new frmConsSintaxis().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnBack;
    private javax.swing.JButton jButton1;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JScrollPane jScrollPane2;
    private javax.swing.JScrollPane jScrollPane3;
    private javax.swing.JScrollPane jScrollPane4;
    private javax.swing.JTextArea jTextArea1;
    private javax.swing.JLabel lblEmer;
    private javax.swing.JLabel lblId;
    private javax.swing.JLabel lblNombre;
    private javax.swing.JTable tbl2;
    private javax.swing.JTable tblAc;
    private javax.swing.JTable tblAc1;
    private javax.swing.JTextField txtW;
    // End of variables declaration//GEN-END:variables
}
