/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */


import javax.swing.JFrame;
import java.io.FileWriter;
import java.io.IOException;
import java.io.PrintWriter;
import java.util.ArrayList;
import javax.swing.JOptionPane;
import com.mycompany.empresa_transporte_2.Registro;


public class interfaz extends javax.swing.JFrame{



    public interfaz() {
        initComponents();
    }

     // funcion guarda y registra usuario
    private static final String INFO_REGISTRO = "registros.txt";
    private static ArrayList<Registro> registros = new ArrayList<>();

    public static void guardarRegistro(String placa, String descripcion, String nombre, String ruta, String marca, String modelo) {
        
            try (PrintWriter escritor = new PrintWriter(new FileWriter(INFO_REGISTRO, true))) {
            String registro = "placa: " + placa + ", descripcion: " + descripcion + ", nombre: " + nombre
                    + ", ruta: " + ruta + ", marca: " + marca + ", modelo: "
                    + modelo;
            escritor.println(registro);
            // Guardar el registro en la lista de registros
            registros.add(new Registro(placa, descripcion, nombre, ruta, marca, modelo));
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
    

 //este es para que se consulte la informacion ingresada o registrada ps
        private void fnt_consultarRegisto(String codigo) {
        boolean encontrado = false;
        for (Registro registro : registros) {
            if (registro.getPlaca().equals(codigo)) {
                encontrado = true;

                descripcion_txt.setText(registro.getDescripcion());
                nombre_txt.setText(registro.getNombre());
                ruta_txt.setText(registro.getRuta());
                marca_txt.setText(registro.getMarca());
                modelo_txt.setText(registro.getModelo());

                System.out.println(registro);
                break;
            }
        }
        if (!encontrado) {
            JOptionPane.showMessageDialog(null, "No se encontraron registros", "ERROR", JOptionPane.ERROR_MESSAGE);
        }
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        jPanel2 = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        placa_txt = new javax.swing.JTextField();
        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();
        jLabel7 = new javax.swing.JLabel();
        descripcion_txt = new javax.swing.JTextField();
        ruta_txt = new javax.swing.JTextField();
        modelo_txt = new javax.swing.JTextField();
        marca_txt = new javax.swing.JTextField();
        nombre_txt = new javax.swing.JTextField();
        registrar_btn = new javax.swing.JButton();
        consultar_btn = new javax.swing.JButton();
        limpiar_btn = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jPanel1.setBackground(new java.awt.Color(0, 153, 153));

        jPanel2.setBackground(new java.awt.Color(153, 204, 255));

        jLabel1.setFont(new java.awt.Font("Segoe UI", 0, 24)); // NOI18N
        jLabel1.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel1.setText("FORMULARIO EMPRESA DE TRASPORTE  LTDA");

        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addGap(23, 23, 23)
                .addComponent(jLabel1)
                .addContainerGap(29, Short.MAX_VALUE))
        );

        jLabel2.setFont(new java.awt.Font("Segoe UI", 0, 18)); // NOI18N
        jLabel2.setText("PLACA");

        jLabel3.setFont(new java.awt.Font("Segoe UI", 0, 18)); // NOI18N
        jLabel3.setText("DESCRIPCION");

        jLabel4.setFont(new java.awt.Font("Segoe UI", 0, 18)); // NOI18N
        jLabel4.setText("NOMBRE");

        jLabel5.setFont(new java.awt.Font("Segoe UI", 0, 18)); // NOI18N
        jLabel5.setText("RUTA");

        jLabel6.setFont(new java.awt.Font("Segoe UI", 0, 18)); // NOI18N
        jLabel6.setText("MODELO");

        jLabel7.setFont(new java.awt.Font("Segoe UI", 0, 18)); // NOI18N
        jLabel7.setText("MARCA");

        ruta_txt.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                ruta_txtActionPerformed(evt);
            }
        });

        registrar_btn.setFont(new java.awt.Font("Segoe UI", 0, 18)); // NOI18N
        registrar_btn.setText("REGISTRAR");
        registrar_btn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                registrar_btnActionPerformed(evt);
            }
        });

        consultar_btn.setFont(new java.awt.Font("Segoe UI", 0, 18)); // NOI18N
        consultar_btn.setText("CONSULTAR");
        consultar_btn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                consultar_btnActionPerformed(evt);
            }
        });

        limpiar_btn.setFont(new java.awt.Font("Segoe UI", 0, 18)); // NOI18N
        limpiar_btn.setText("LIMPIAR");
        limpiar_btn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                limpiar_btnActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                .addGap(78, 78, 78)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(jLabel4)
                    .addComponent(jLabel7)
                    .addComponent(nombre_txt, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, 142, Short.MAX_VALUE)
                    .addComponent(jLabel2)
                    .addComponent(placa_txt, javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(marca_txt))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 58, Short.MAX_VALUE)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(jLabel6)
                    .addComponent(jLabel5)
                    .addComponent(ruta_txt, javax.swing.GroupLayout.DEFAULT_SIZE, 140, Short.MAX_VALUE)
                    .addComponent(jLabel3)
                    .addComponent(modelo_txt)
                    .addComponent(descripcion_txt))
                .addGap(86, 86, 86)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(registrar_btn, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(limpiar_btn, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(consultar_btn, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addGap(55, 55, 55))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addComponent(jPanel2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(38, 38, 38)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel2)
                    .addComponent(jLabel3))
                .addGap(18, 18, 18)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(placa_txt, javax.swing.GroupLayout.PREFERRED_SIZE, 32, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(descripcion_txt, javax.swing.GroupLayout.PREFERRED_SIZE, 32, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(registrar_btn))
                .addGap(29, 29, 29)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel4)
                    .addComponent(jLabel5))
                .addGap(39, 39, 39)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(ruta_txt, javax.swing.GroupLayout.PREFERRED_SIZE, 34, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(nombre_txt, javax.swing.GroupLayout.PREFERRED_SIZE, 34, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(limpiar_btn))
                .addGap(43, 43, 43)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel6)
                    .addComponent(jLabel7))
                .addGap(18, 18, 18)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(modelo_txt, javax.swing.GroupLayout.PREFERRED_SIZE, 33, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(marca_txt, javax.swing.GroupLayout.PREFERRED_SIZE, 33, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(consultar_btn))
                .addContainerGap(61, Short.MAX_VALUE))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addContainerGap())
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addContainerGap())
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void ruta_txtActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_ruta_txtActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_ruta_txtActionPerformed

    private void limpiar_btnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_limpiar_btnActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_limpiar_btnActionPerformed
    
    
//===========================================================================================================
//boton de registrar
    private void registrar_btnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_registrar_btnActionPerformed
        
        String Placa = placa_txt.getText().toLowerCase();
        String Descipcion = descripcion_txt.getText().toLowerCase();
        String Nombre = nombre_txt.getText().toLowerCase();
        String Ruta = ruta_txt.getText().toLowerCase();
        String Marca = marca_txt.getText().toLowerCase();
        String Modelo = modelo_txt.getText().toLowerCase();




        //este es para ver si la placa ya existe
    if (placaExiste(Placa)) {
        JOptionPane.showMessageDialog(null, "La placa ya existe", "ERROR", JOptionPane.ERROR_MESSAGE);
        return; 
    }

    // Verificar que todos los campos estén llenos
    if (Placa.isEmpty() || Nombre.isEmpty() || Descipcion.isEmpty() 
            || Ruta.isEmpty() || Marca.isEmpty() || Modelo.isEmpty()) {
        JOptionPane.showMessageDialog(this, "Necesitas llenar todos los campos", "Error", JOptionPane.ERROR_MESSAGE);
        return; 
    }

    // pero si todos los campos están llenos y la placa no está duplicada, se registra el registrar el vehículo
    guardarRegistro(Placa, Descipcion, Nombre, Ruta, Marca, Modelo);
    JOptionPane.showMessageDialog(this, "El usuario se registró exitosamente ", "Registro exitoso", JOptionPane.INFORMATION_MESSAGE);
}
//===========================================================================================================
        
    }//GEN-LAST:event_registrar_btnActionPerformed

//===========================================================================================================
       //boton consultar
    private void consultar_btnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_consultar_btnActionPerformed
        fnt_consultarRegistro(placa_txt.getText());
    }
private void fnt_consultarRegistro(String placa) {
    boolean encontrado = false;
    for (Registro registro : registros) {
        if (registro.getPlaca().equals(placa)) {
            encontrado = true;

            descripcion_txt.setText(registro.getDescripcion());
            nombre_txt.setText(registro.getNombre());
            ruta_txt.setText(registro.getRuta());
            marca_txt.setText(registro.getMarca());
            modelo_txt.setText(registro.getModelo());

            System.out.println(registro);
            break;
        }
    }
    if (!encontrado) {
        JOptionPane.showMessageDialog(null, "No se encontraron registros", "ERROR", JOptionPane.ERROR_MESSAGE);
    }
}
    }//GEN-LAST:event_consultar_btnActionPerformed

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
            java.util.logging.Logger.getLogger(interfaz.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(interfaz.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(interfaz.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(interfaz.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new interfaz().setVisible(true);
            }
        });
}

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton consultar_btn;
    private javax.swing.JTextField descripcion_txt;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JButton limpiar_btn;
    private javax.swing.JTextField marca_txt;
    private javax.swing.JTextField modelo_txt;
    private javax.swing.JTextField nombre_txt;
    private javax.swing.JTextField placa_txt;
    private javax.swing.JButton registrar_btn;
    private javax.swing.JTextField ruta_txt;
    // End of variables declaration//GEN-END:variables
}
