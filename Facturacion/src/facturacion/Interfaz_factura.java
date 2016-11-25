/* Autor @Javifast */
package facturacion;

import clases.control_existencias;
import clases.IVA;
import java.text.DateFormat;
import java.text.SimpleDateFormat;
import java.util.Date;
import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableModel;

public class Interfaz_factura extends javax.swing.JInternalFrame {

    control_existencias con;
    private Object [][] datostabla;
    public Interfaz_factura(control_existencias con) {
        initComponents();
        
        fecha_fact.setEnabled(false);
        num_factura.setEnabled(false);
        cliente_factura.setEnabled(false);
        apell_cli.setEnabled(false);
        articulo_venta.setEnabled(false);
        stock_art.setEnabled(false);
        preciu_unid.setEnabled(false);
        cant_art.setEnabled(false);
        iva_art.setEnabled(false);
        desc_art.setEnabled(false);
        Total_art.setEnabled(false);
        combo_articulos.setEnabled(false);
        Reg_articulo.setEnabled(false);
        imprimir_bt.setEnabled(false);
        total_factura.setEnabled(false);
        
        
        this.con = con;
        
        cliente_factura.setText( con.ingresa_nombre_Cliente() );
        
        apell_cli.setText(con.ingresa_apellidos_Cliente());
        
        num_factura.setText(con.GenerarNumeroFactura());  
        
        Date hoy = new Date();
        fecha_fact.setText( hoy.getDate()+"/"+(hoy.getMonth()+1) +"/"+(hoy.getYear()+1900) );
        
        Object[] idarticulo = con.combox("articulo","id_articulo");
        combo_articulos.removeAllItems();
        for(int i=0;i<idarticulo.length;i++)
        {
        combo_articulos.addItem(idarticulo[i]);
        }
        Object[] formapago = con.combox("forma_de_pago","id_formapago");
        combo_formapago.removeAllItems();
        for(int i=0;i<formapago.length;i++)
        {
        combo_formapago.addItem(formapago[i]);
        }
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jLabel1 = new javax.swing.JLabel();
        cliente_factura = new javax.swing.JTextField();
        jLabel2 = new javax.swing.JLabel();
        num_factura = new javax.swing.JTextField();
        jLabel3 = new javax.swing.JLabel();
        vend_fact = new javax.swing.JTextField();
        jLabel4 = new javax.swing.JLabel();
        fecha_fact = new javax.swing.JTextField();
        jLabel5 = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();
        combo_articulos = new javax.swing.JComboBox();
        jLabel7 = new javax.swing.JLabel();
        articulo_venta = new javax.swing.JTextField();
        jLabel8 = new javax.swing.JLabel();
        preciu_unid = new javax.swing.JTextField();
        stock_art = new javax.swing.JTextField();
        jLabel9 = new javax.swing.JLabel();
        jLabel10 = new javax.swing.JLabel();
        Total_art = new javax.swing.JTextField();
        jScrollPane1 = new javax.swing.JScrollPane();
        jTable1 = new javax.swing.JTable();
        Reg_articulo = new javax.swing.JButton();
        apell_cli = new javax.swing.JTextField();
        jLabel11 = new javax.swing.JLabel();
        reg_factura = new javax.swing.JButton();
        jButton2 = new javax.swing.JButton();
        jLabel12 = new javax.swing.JLabel();
        cant_art = new javax.swing.JTextField();
        combo_formapago = new javax.swing.JComboBox();
        desc_art = new javax.swing.JTextField();
        jLabel13 = new javax.swing.JLabel();
        jLabel14 = new javax.swing.JLabel();
        iva_art = new javax.swing.JTextField();
        total_factura = new javax.swing.JTextField();
        jLabel15 = new javax.swing.JLabel();
        imprimir_bt = new javax.swing.JButton();

        setIconifiable(true);
        setMaximizable(true);
        setResizable(true);
        setTitle("Generar factura");

        jLabel1.setText("Nombre cliente");

        jLabel2.setText("Num factura");

        jLabel3.setText("Vendedor");

        jLabel4.setText("Forma pago");

        jLabel5.setText("Fecha");

        jLabel6.setText("Id_articulo");

        combo_articulos.setModel(new javax.swing.DefaultComboBoxModel(new String[] { "Item 1", "Item 2", "Item 3", "Item 4" }));
        combo_articulos.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                combo_articulosActionPerformed(evt);
            }
        });

        jLabel7.setText("Articulo");

        jLabel8.setText("Precio_unidad");

        jLabel9.setText("stock");

        jLabel10.setText("Total articulos");

        jTable1.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {},
                {},
                {},
                {}
            },
            new String [] {

            }
        ));
        jScrollPane1.setViewportView(jTable1);

        Reg_articulo.setText("Registrar detalle");
        Reg_articulo.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                Reg_articuloActionPerformed(evt);
            }
        });

        jLabel11.setText("Apellido cliente");

        reg_factura.setText("registrar factura");
        reg_factura.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                reg_facturaActionPerformed(evt);
            }
        });

        jButton2.setText("Salir");
        jButton2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton2ActionPerformed(evt);
            }
        });

        jLabel12.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jLabel12.setText("Cantidad");

        cant_art.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                cant_artActionPerformed(evt);
            }
        });
        cant_art.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyReleased(java.awt.event.KeyEvent evt) {
                cant_artKeyReleased(evt);
            }
        });

        combo_formapago.setModel(new javax.swing.DefaultComboBoxModel(new String[] { "Item 1", "Item 2", "Item 3", "Item 4" }));

        jLabel13.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jLabel13.setText("Descuento");

        jLabel14.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jLabel14.setText("IVA");

        jLabel15.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jLabel15.setText("Total factura");

        imprimir_bt.setText("Registrar total");
        imprimir_bt.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                imprimir_btActionPerformed(evt);
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
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel11)
                            .addComponent(jLabel2)
                            .addComponent(jLabel1)
                            .addComponent(jLabel6)
                            .addComponent(jLabel12))
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addGroup(layout.createSequentialGroup()
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addGroup(layout.createSequentialGroup()
                                        .addGap(41, 41, 41)
                                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                            .addComponent(cliente_factura, javax.swing.GroupLayout.PREFERRED_SIZE, 172, javax.swing.GroupLayout.PREFERRED_SIZE)
                                            .addComponent(num_factura, javax.swing.GroupLayout.PREFERRED_SIZE, 104, javax.swing.GroupLayout.PREFERRED_SIZE)))
                                    .addGroup(layout.createSequentialGroup()
                                        .addGap(42, 42, 42)
                                        .addComponent(apell_cli, javax.swing.GroupLayout.PREFERRED_SIZE, 172, javax.swing.GroupLayout.PREFERRED_SIZE)))
                                .addGap(119, 119, 119))
                            .addGroup(layout.createSequentialGroup()
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                    .addGroup(layout.createSequentialGroup()
                                        .addComponent(combo_articulos, javax.swing.GroupLayout.PREFERRED_SIZE, 111, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addGap(44, 44, 44)
                                        .addComponent(jLabel7))
                                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                                        .addComponent(cant_art, javax.swing.GroupLayout.PREFERRED_SIZE, 57, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                        .addComponent(jLabel13)))
                                .addGap(18, 18, 18)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(articulo_venta, javax.swing.GroupLayout.PREFERRED_SIZE, 163, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(desc_art, javax.swing.GroupLayout.PREFERRED_SIZE, 53, javax.swing.GroupLayout.PREFERRED_SIZE))))
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(layout.createSequentialGroup()
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(jLabel4)
                                    .addComponent(jLabel5)
                                    .addComponent(jLabel3))
                                .addGap(18, 18, 18)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addGroup(layout.createSequentialGroup()
                                        .addGap(0, 0, Short.MAX_VALUE)
                                        .addComponent(jLabel8)
                                        .addGap(18, 18, 18)
                                        .addComponent(preciu_unid, javax.swing.GroupLayout.PREFERRED_SIZE, 98, javax.swing.GroupLayout.PREFERRED_SIZE))
                                    .addGroup(layout.createSequentialGroup()
                                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                                            .addComponent(vend_fact, javax.swing.GroupLayout.Alignment.LEADING)
                                            .addComponent(fecha_fact, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, 95, Short.MAX_VALUE)
                                            .addComponent(combo_formapago, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                        .addComponent(reg_factura, javax.swing.GroupLayout.PREFERRED_SIZE, 148, javax.swing.GroupLayout.PREFERRED_SIZE)))
                                .addGap(20, 20, 20))
                            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                                .addGap(0, 52, Short.MAX_VALUE)
                                .addComponent(jLabel9)
                                .addGap(18, 18, 18)
                                .addComponent(stock_art, javax.swing.GroupLayout.PREFERRED_SIZE, 70, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(246, 246, 246))
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(jLabel10)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addComponent(Total_art, javax.swing.GroupLayout.PREFERRED_SIZE, 120, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(0, 0, Short.MAX_VALUE))))
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jScrollPane1)
                            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                                .addGap(0, 0, Short.MAX_VALUE)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                    .addGroup(layout.createSequentialGroup()
                                        .addComponent(Reg_articulo, javax.swing.GroupLayout.PREFERRED_SIZE, 204, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addGap(172, 172, 172)
                                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                                                .addComponent(jLabel15)
                                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                                .addComponent(total_factura, javax.swing.GroupLayout.PREFERRED_SIZE, 165, javax.swing.GroupLayout.PREFERRED_SIZE))
                                            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                                                .addComponent(jLabel14)
                                                .addGap(18, 18, 18)
                                                .addComponent(iva_art, javax.swing.GroupLayout.PREFERRED_SIZE, 165, javax.swing.GroupLayout.PREFERRED_SIZE))))
                                    .addGroup(layout.createSequentialGroup()
                                        .addComponent(jButton2, javax.swing.GroupLayout.PREFERRED_SIZE, 138, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addGap(21, 21, 21)
                                        .addComponent(imprimir_bt, javax.swing.GroupLayout.PREFERRED_SIZE, 165, javax.swing.GroupLayout.PREFERRED_SIZE)))))
                        .addContainerGap())))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                        .addComponent(num_factura, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel4)
                            .addComponent(combo_formapago, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                    .addComponent(jLabel2, javax.swing.GroupLayout.Alignment.TRAILING))
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                .addComponent(fecha_fact, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addComponent(jLabel5))
                            .addComponent(cliente_factura, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel1, javax.swing.GroupLayout.Alignment.TRAILING)))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(2, 2, 2)
                        .addComponent(reg_factura, javax.swing.GroupLayout.PREFERRED_SIZE, 39, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addGap(7, 7, 7)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                        .addComponent(apell_cli, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(jLabel11))
                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(vend_fact, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(jLabel3)))
                .addGap(50, 50, 50)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(combo_articulos, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(articulo_venta, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(jLabel7)
                        .addComponent(stock_art, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(jLabel9)
                        .addComponent(preciu_unid, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(jLabel8))
                    .addComponent(jLabel6))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(desc_art, javax.swing.GroupLayout.PREFERRED_SIZE, 29, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel13)
                    .addComponent(cant_art, javax.swing.GroupLayout.PREFERRED_SIZE, 28, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel12)
                    .addComponent(jLabel10)
                    .addComponent(Total_art, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(21, 21, 21)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 122, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(34, 34, 34)
                        .addComponent(iva_art, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(total_factura, javax.swing.GroupLayout.PREFERRED_SIZE, 35, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel15)))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(37, 37, 37)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(Reg_articulo, javax.swing.GroupLayout.PREFERRED_SIZE, 47, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel14))))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 40, Short.MAX_VALUE)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jButton2, javax.swing.GroupLayout.PREFERRED_SIZE, 41, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(imprimir_bt, javax.swing.GroupLayout.PREFERRED_SIZE, 41, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(21, 21, 21))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void reg_facturaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_reg_facturaActionPerformed
    con.registrar_factura(num_factura.getText(),vend_fact.getText(),fecha_fact.getText(),combo_formapago.getSelectedItem().toString());
        cant_art.setEnabled(true);
        iva_art.setEnabled(true);
        desc_art.setEnabled(true);
        Total_art.setEnabled(true);
        combo_articulos.setEnabled(true);
        Reg_articulo.setEnabled(true);
        total_factura.setEnabled(true);
        imprimir_bt.setEnabled(true);
        reg_factura.setEnabled(false);
        combo_formapago.setEnabled(false);
        vend_fact.setEnabled(false);
    }//GEN-LAST:event_reg_facturaActionPerformed

    private void jButton2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton2ActionPerformed
    this.dispose();
    }//GEN-LAST:event_jButton2ActionPerformed

    private void combo_articulosActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_combo_articulosActionPerformed
     if(combo_articulos.getSelectedItem()!=null )
     {
            
            Object[][] datos = con.datos_articulo(combo_articulos.getSelectedItem().toString());
            articulo_venta.setText(datos[0][0].toString());
            preciu_unid.setText(datos[0][1].toString());
            stock_art.setText(datos[0][2].toString());
            cant_art.setText("0");
            Total_art.setText("0");
            desc_art.setText("0");
            
           
        
            
        }        
    }//GEN-LAST:event_combo_articulosActionPerformed
              
        
        
        
    private void cant_artActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_cant_artActionPerformed
     
    }//GEN-LAST:event_cant_artActionPerformed

    private void cant_artKeyReleased(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_cant_artKeyReleased
        double suma;      
        double descuento = Double.parseDouble(desc_art.getText());
        double precio = Double.parseDouble(preciu_unid.getText());
        int cant = Integer.parseInt( cant_art.getText() );
        double desc = descuento/100;
        double porcent;
        if (descuento == 0)
        {
        suma = precio*cant ;
        }
        else
        {
        porcent = precio*desc;
        suma = (precio-porcent)*cant ;
        }
        Total_art.setText(Double.toString(suma));
        
    }//GEN-LAST:event_cant_artKeyReleased

    private void Reg_articuloActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_Reg_articuloActionPerformed
        int c = Integer.parseInt(stock_art.getText());
        int b = Integer.parseInt(cant_art.getText());
                
        if(!cant_art.getText().equals("0") )
        {
            if (c > b)
            {            
            
            if( con.registrar_producto(num_factura.getText(),combo_articulos.getSelectedItem().toString(),cant_art.getText(),Total_art.getText()))
            {
                JOptionPane.showMessageDialog(this, "El articulo se registro con exito");
                cant_art.setText("0");
                Total_art.setText("0");                
                desc_art.setText("");
            }
            else
            {
                JOptionPane.showMessageDialog(this, "Error al registrar el articulo");
            }
            }
            else
            {
                JOptionPane.showMessageDialog(this, "El stock del articulo no soporta la venta por favor actualize en stock");
            }
        }
            else
            {
            JOptionPane.showMessageDialog(this, "La cantidad no es valida");
            }
        
        String[] columnas = {"Numero_factura","Codigo articulo","Descripcion","Cantidad","Total"};
        datostabla = con.datos_detallefactura(num_factura.getText());
        DefaultTableModel datosta = new DefaultTableModel(datostabla,columnas);
        jTable1.setModel(datosta);
        
        Double a = con.total_factura(num_factura.getText());
        
        total_factura.setText(a.toString());
        IVA iva = new IVA(Double.parseDouble(total_factura.getText()));
        iva_art.setText(iva.calcular_iva().toString());
        
    }//GEN-LAST:event_Reg_articuloActionPerformed

    private void imprimir_btActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_imprimir_btActionPerformed
    if(!total_factura.getText().equals("0") )
        {
            
            
            if( con.update_factura(num_factura.getText(),total_factura.getText(),iva_art.getText()))
            {
                JOptionPane.showMessageDialog(this, "Se registro la venta");
                total_factura.setText("0");
                iva_art.setText("0");  
                cant_art.setEnabled(false);
                iva_art.setEnabled(false);
                desc_art.setEnabled(false);
                Total_art.setEnabled(false);
                combo_articulos.setEnabled(false);
                Reg_articulo.setEnabled(false);
                imprimir_bt.setEnabled(false);
                total_factura.setEnabled(false);
                
            }
            else
            {
                JOptionPane.showMessageDialog(this, "Error al registrar la venta");
            }
            }
            
            else
            {
            JOptionPane.showMessageDialog(this, "El total no es valido");
            }
    }//GEN-LAST:event_imprimir_btActionPerformed

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton Reg_articulo;
    private javax.swing.JTextField Total_art;
    private javax.swing.JTextField apell_cli;
    private javax.swing.JTextField articulo_venta;
    private javax.swing.JTextField cant_art;
    private javax.swing.JTextField cliente_factura;
    private javax.swing.JComboBox combo_articulos;
    private javax.swing.JComboBox combo_formapago;
    private javax.swing.JTextField desc_art;
    private javax.swing.JTextField fecha_fact;
    private javax.swing.JButton imprimir_bt;
    private javax.swing.JTextField iva_art;
    private javax.swing.JButton jButton2;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel10;
    private javax.swing.JLabel jLabel11;
    private javax.swing.JLabel jLabel12;
    private javax.swing.JLabel jLabel13;
    private javax.swing.JLabel jLabel14;
    private javax.swing.JLabel jLabel15;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JTable jTable1;
    private javax.swing.JTextField num_factura;
    private javax.swing.JTextField preciu_unid;
    private javax.swing.JButton reg_factura;
    private javax.swing.JTextField stock_art;
    private javax.swing.JTextField total_factura;
    private javax.swing.JTextField vend_fact;
    // End of variables declaration//GEN-END:variables
}
