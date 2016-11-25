/* Autor @Javifast */
package facturacion;

import clases.control_existencias;
import java.awt.event.ItemEvent;
import javax.swing.JOptionPane;

public class Interfaz_actualizarstock extends javax.swing.JInternalFrame {
     control_existencias ctrl = new control_existencias();

    public Interfaz_actualizarstock() {
        initComponents();
        nuevo_stock.setEnabled(false);
        desc_articulo.setEnabled(false);
        Object[] idarticulo = ctrl.combox("articulo","id_articulo");
        combo_articulo.removeAllItems();
        for(int i=0;i<idarticulo.length;i++)
        {
        combo_articulo.addItem(idarticulo[i]);
        }
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        combo_articulo = new javax.swing.JComboBox();
        jLabel1 = new javax.swing.JLabel();
        desc_articulo = new javax.swing.JTextField();
        nuevo_stock = new javax.swing.JTextField();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jButton1 = new javax.swing.JButton();
        jButton2 = new javax.swing.JButton();
        jLabel4 = new javax.swing.JLabel();
        registrar_nuevo = new javax.swing.JTextField();
        jartx = new javax.swing.JTextField();

        setTitle("Actualizar stock");

        combo_articulo.setModel(new javax.swing.DefaultComboBoxModel(new String[] { "Item 1", "Item 2", "Item 3", "Item 4" }));
        combo_articulo.addItemListener(new java.awt.event.ItemListener() {
            public void itemStateChanged(java.awt.event.ItemEvent evt) {
                combo_articuloItemStateChanged(evt);
            }
        });
        combo_articulo.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                combo_articuloActionPerformed(evt);
            }
        });

        jLabel1.setText("Id_articulo");

        jLabel2.setText("Descricion articulo");

        jLabel3.setText("Stock actual");

        jButton1.setText("Salir");
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });

        jButton2.setText("Registrar");
        jButton2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton2ActionPerformed(evt);
            }
        });

        jLabel4.setText("Registr nuevo stock");

        jartx.setEditable(false);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(10, 10, 10)
                        .addComponent(jLabel1)
                        .addGap(62, 62, 62)
                        .addComponent(combo_articulo, javax.swing.GroupLayout.PREFERRED_SIZE, 151, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(10, 10, 10)
                        .addComponent(jartx, javax.swing.GroupLayout.DEFAULT_SIZE, 125, Short.MAX_VALUE))
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(layout.createSequentialGroup()
                                .addGap(10, 10, 10)
                                .addComponent(jLabel2)
                                .addGap(27, 27, 27)
                                .addComponent(desc_articulo, javax.swing.GroupLayout.PREFERRED_SIZE, 151, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(layout.createSequentialGroup()
                                .addGap(10, 10, 10)
                                .addComponent(jLabel3)
                                .addGap(55, 55, 55)
                                .addComponent(nuevo_stock, javax.swing.GroupLayout.PREFERRED_SIZE, 151, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(layout.createSequentialGroup()
                                .addGap(10, 10, 10)
                                .addComponent(jLabel4)
                                .addGap(18, 18, 18)
                                .addComponent(registrar_nuevo, javax.swing.GroupLayout.PREFERRED_SIZE, 151, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(layout.createSequentialGroup()
                                .addGap(19, 19, 19)
                                .addComponent(jButton2, javax.swing.GroupLayout.PREFERRED_SIZE, 97, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(58, 58, 58)
                                .addComponent(jButton1, javax.swing.GroupLayout.PREFERRED_SIZE, 72, javax.swing.GroupLayout.PREFERRED_SIZE)))
                        .addGap(0, 0, Short.MAX_VALUE)))
                .addContainerGap())
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(11, 11, 11)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(3, 3, 3)
                        .addComponent(jLabel1))
                    .addComponent(combo_articulo, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jartx, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(14, 14, 14)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(12, 12, 12)
                        .addComponent(jLabel2))
                    .addComponent(desc_articulo, javax.swing.GroupLayout.PREFERRED_SIZE, 38, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(10, 10, 10)
                        .addComponent(jLabel3))
                    .addComponent(nuevo_stock, javax.swing.GroupLayout.PREFERRED_SIZE, 35, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(17, 17, 17)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(10, 10, 10)
                        .addComponent(jLabel4))
                    .addComponent(registrar_nuevo, javax.swing.GroupLayout.PREFERRED_SIZE, 34, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jButton2, javax.swing.GroupLayout.PREFERRED_SIZE, 33, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jButton1, javax.swing.GroupLayout.PREFERRED_SIZE, 33, javax.swing.GroupLayout.PREFERRED_SIZE)))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed
    this.dispose();
    }//GEN-LAST:event_jButton1ActionPerformed

    private void combo_articuloActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_combo_articuloActionPerformed
    if(combo_articulo.getSelectedItem()!=null )
     {
            
            Object[][] datos = ctrl.datos_articulo(combo_articulo.getSelectedItem().toString());
            desc_articulo.setText(datos[0][0].toString());
            nuevo_stock.setText(datos[0][2].toString());    
           
                    
        }        
    }//GEN-LAST:event_combo_articuloActionPerformed

    private void jButton2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton2ActionPerformed
    if(!registrar_nuevo.getText().equals("0") && !registrar_nuevo.getText().equals(""))
        {
            
            
            if( ctrl.update_stock(registrar_nuevo.getText(),combo_articulo.getSelectedItem().toString()))
            {
                JOptionPane.showMessageDialog(this, "Se actualizo correctamente el stock");
                registrar_nuevo.setText("0");     
                Object[][] datos = ctrl.datos_articulo(combo_articulo.getSelectedItem().toString());
                nuevo_stock.setText(datos[0][2].toString()); 
                
            }
            else
            {
                JOptionPane.showMessageDialog(this, "Error al actualizar");
            }
            }
            
            else
            {
            JOptionPane.showMessageDialog(this, "La cantidad a ingresar no es valida");
            }
    }//GEN-LAST:event_jButton2ActionPerformed

    private void combo_articuloItemStateChanged(java.awt.event.ItemEvent evt) {//GEN-FIRST:event_combo_articuloItemStateChanged
        if(evt.getStateChange() == ItemEvent.SELECTED)
       {
         if(this.combo_articulo.getSelectedIndex() == 0)
         {
           this.jartx.setText("Bota Larga");
         }
          if(this.combo_articulo.getSelectedIndex() == 1)
         {
           this.jartx.setText("Bota corta");
         }
           if(this.combo_articulo.getSelectedIndex() == 2)
         {
           this.jartx.setText("Botin");
         }
            if(this.combo_articulo.getSelectedIndex() == 3)
         {
           this.jartx.setText("Tenis");
         }
             if(this.combo_articulo.getSelectedIndex() == 4)
         {
           this.jartx.setText("Zandalias");
         }
              if(this.combo_articulo.getSelectedIndex() == 5)
         {
           this.jartx.setText("Jeans");
         }
               if(this.combo_articulo.getSelectedIndex() == 6)
         {
           this.jartx.setText("Camisas");
         }
                if(this.combo_articulo.getSelectedIndex() == 7)
         {
           this.jartx.setText("Chaquetas");
         }
                 if(this.combo_articulo.getSelectedIndex() == 8)
         {
           this.jartx.setText("Chaquetas sudadera");
         }
                  if(this.combo_articulo.getSelectedIndex() == 9)
         {
           this.jartx.setText("Pantalon sudadera");
         }
                   if(this.combo_articulo.getSelectedIndex() == 10)
         {
           this.jartx.setText("Sudadera completa");
         }
                    if(this.combo_articulo.getSelectedIndex() == 11)
         {
           this.jartx.setText("Camisetas");
         }
       }
    }//GEN-LAST:event_combo_articuloItemStateChanged

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JComboBox combo_articulo;
    private javax.swing.JTextField desc_articulo;
    private javax.swing.JButton jButton1;
    private javax.swing.JButton jButton2;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JTextField jartx;
    private javax.swing.JTextField nuevo_stock;
    private javax.swing.JTextField registrar_nuevo;
    // End of variables declaration//GEN-END:variables
}
