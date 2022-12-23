
package com.mycompany.ejercicio_s07.ui.panels;

import com.mycompany.ejercicio_s07.entidades.Alumno;
import java.util.ArrayList;

/**
 *
 * @author Jhordie
 */
public class PnlAlumno extends javax.swing.JPanel {

    /**
     * Creates new form PnlAlumno
     */
    public PnlAlumno() {
        initComponents();
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        cmbSexo = new javax.swing.JComboBox<>();
        jLabel4 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();
        txtId = new javax.swing.JTextField();
        txtNombre = new javax.swing.JTextField();
        txtCorreo = new javax.swing.JTextField();
        spnPromedio = new javax.swing.JSpinner();
        txtEstado = new javax.swing.JTextField();
        btnAgregar = new javax.swing.JButton();
        jScrollPane1 = new javax.swing.JScrollPane();
        txtSalida = new javax.swing.JTextArea();

        jLabel1.setText("ID");

        jLabel2.setText("Nombre");

        jLabel3.setText("Correo");

        cmbSexo.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Masculino", "Femenino", " " }));

        jLabel4.setText("Sexo");

        jLabel5.setText("Promedio");

        jLabel6.setText("Estado");

        spnPromedio.addChangeListener(new javax.swing.event.ChangeListener() {
            public void stateChanged(javax.swing.event.ChangeEvent evt) {
                spnPromedioStateChanged(evt);
            }
        });

        btnAgregar.setText("Agregar");
        btnAgregar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnAgregarActionPerformed(evt);
            }
        });

        txtSalida.setColumns(20);
        txtSalida.setRows(5);
        jScrollPane1.setViewportView(txtSalida);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(this);
        this.setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(63, 63, 63)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(btnAgregar, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(jLabel3)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addComponent(txtCorreo, javax.swing.GroupLayout.PREFERRED_SIZE, 125, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                .addGroup(layout.createSequentialGroup()
                                    .addComponent(jLabel2)
                                    .addGap(18, 18, 18)
                                    .addComponent(txtNombre, javax.swing.GroupLayout.PREFERRED_SIZE, 125, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addGroup(layout.createSequentialGroup()
                                    .addComponent(jLabel1)
                                    .addGap(51, 51, 51)
                                    .addComponent(txtId, javax.swing.GroupLayout.PREFERRED_SIZE, 125, javax.swing.GroupLayout.PREFERRED_SIZE))))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel5, javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(jLabel4, javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(jLabel6, javax.swing.GroupLayout.Alignment.TRAILING))
                        .addGap(26, 26, 26)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(cmbSexo, 0, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(spnPromedio)
                            .addComponent(txtEstado, javax.swing.GroupLayout.PREFERRED_SIZE, 115, javax.swing.GroupLayout.PREFERRED_SIZE))))
                .addGap(68, 68, 68))
            .addGroup(layout.createSequentialGroup()
                .addGap(19, 19, 19)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 541, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(22, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(31, 31, 31)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel1)
                    .addComponent(cmbSexo, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel4)
                    .addComponent(txtId, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(22, 22, 22)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel5)
                    .addComponent(jLabel2)
                    .addComponent(txtNombre, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(spnPromedio, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(28, 28, 28)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel3)
                    .addComponent(jLabel6)
                    .addComponent(txtCorreo, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(txtEstado, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(27, 27, 27)
                .addComponent(btnAgregar)
                .addGap(37, 37, 37)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 324, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(30, Short.MAX_VALUE))
        );
    }// </editor-fold>//GEN-END:initComponents

    ArrayList<Alumno> alumnos = new ArrayList<>();
    
    ArrayList<String> aprobados = new ArrayList<>();
    ArrayList<String> desaprobados = new ArrayList<>();
    private void btnAgregarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnAgregarActionPerformed
        // TODO add your handling code here:
        alumnos.add(new Alumno(
                Integer.parseInt(txtId.getText()),
                txtNombre.getText(),
                txtCorreo.getText(),
                cmbSexo.getSelectedItem().toString(),
                Integer.parseInt(spnPromedio.getValue().toString()),
                txtEstado.getText()
        ));
        double promedioGeneral = 0;
        int promedioMayor = 0;
        txtSalida.setText("");
        
        Alumno a = null;
        
        //Alumno ap = null;
        //Alumno ds = null;
        String apro = "";
        String desap = "";
        for(Alumno alumno: alumnos ){
            txtSalida.append(alumno.getNombre()+"\t");
            txtSalida.append(alumno.getCorreo()+"\t");
            txtSalida.append(alumno.getSexo()+"\t");
            txtSalida.append(Integer.toString(alumno.getPromedio())+"\t");
            txtSalida.append(alumno.getEstado() +"\n");
            
            promedioGeneral += alumno.getPromedio();
            
            if(promedioMayor < alumno.getPromedio()){
                a = alumno;
                promedioMayor = alumno.getPromedio();
            }
            
            if(alumno.getPromedio() > 11){
                apro += alumno.getNombre() + ", " + alumno.getEstado() +"\n";
                //aprobados.add(alumno.getNombre() + ", " + alumno.getEstado()  );
            }else{
                desap += alumno.getNombre() + ", " + alumno.getEstado() +"\n";
                //desaprobados.add(alumno.getNombre() + ", " + alumno.getEstado() );
            }
        }
        
        txtSalida.append("\n\n----------------------------\n");
        txtSalida.append("Lista de alumnos aprobado\n");
        txtSalida.append(apro);
        //for(String ap : aprobados){
        //    txtSalida.append(ap +"\n");
        //}
        
        txtSalida.append("\n\n----------------------------\n");
        txtSalida.append("Lista de alumnos desaprobados\n");
        txtSalida.append(desap);
        //for(String ds : desaprobados){
        //    txtSalida.append(ds +"\n");
        //}
        txtSalida.append("\n----------------------------\n");
        txtSalida.append("Promedop de promedios\n");
        txtSalida.append(Double.toString(promedioGeneral/alumnos.size()) );
        
        txtSalida.append("\n----------------------------\n");
        txtSalida.append("Alumno con el mayor promedio\n");
        txtSalida.append(a.getNombre());
        

    }//GEN-LAST:event_btnAgregarActionPerformed

    private void spnPromedioStateChanged(javax.swing.event.ChangeEvent evt) {//GEN-FIRST:event_spnPromedioStateChanged
        // TODO add your handling code here:
        if(Integer.parseInt(spnPromedio.getValue().toString()) > 11){
            txtEstado.setText("Aprobado");
        }else{
            txtEstado.setText("Desaprobado");

        }
    }//GEN-LAST:event_spnPromedioStateChanged


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnAgregar;
    private javax.swing.JComboBox<String> cmbSexo;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JSpinner spnPromedio;
    private javax.swing.JTextField txtCorreo;
    private javax.swing.JTextField txtEstado;
    private javax.swing.JTextField txtId;
    private javax.swing.JTextField txtNombre;
    private javax.swing.JTextArea txtSalida;
    // End of variables declaration//GEN-END:variables
}
