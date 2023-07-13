package com.mycompany.peluqueriacanina.igu;
import com.mycompany.peluqueriacanina.logica.Controladora;
import com.mycompany.peluqueriacanina.logica.Mascota;
import java.util.List;
import javax.swing.JDialog;
import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableModel;


public class VerDatos extends javax.swing.JFrame {
    Controladora control; // siempre inicializar null
   
    public VerDatos() {
        control = new Controladora();
        initComponents();
    }

    
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel4 = new javax.swing.JPanel();
        jLabel3 = new javax.swing.JLabel();
        jPanel1 = new javax.swing.JPanel();
        jScrollPane1 = new javax.swing.JScrollPane();
        tablaMascotas = new javax.swing.JTable();
        jLabel1 = new javax.swing.JLabel();
        btnEliminar = new javax.swing.JButton();
        btnEditar = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        addWindowListener(new java.awt.event.WindowAdapter() {
            public void windowOpened(java.awt.event.WindowEvent evt) {
                formWindowOpened(evt);
            }
        });

        jLabel3.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        jLabel3.setText("Visualización de Datos");

        tablaMascotas.setBorder(javax.swing.BorderFactory.createEmptyBorder(1, 1, 1, 1));
        tablaMascotas.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {},
                {},
                {},
                {}
            },
            new String [] {

            }
        ));
        jScrollPane1.setViewportView(tablaMascotas);

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jScrollPane1, javax.swing.GroupLayout.DEFAULT_SIZE, 609, Short.MAX_VALUE)
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jScrollPane1, javax.swing.GroupLayout.DEFAULT_SIZE, 498, Short.MAX_VALUE)
        );

        jLabel1.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        jLabel1.setText("Datos de mascotas:");

        btnEliminar.setText("Eliminar");
        btnEliminar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnEliminarActionPerformed(evt);
            }
        });

        btnEditar.setText("Editar");
        btnEditar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnEditarActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel4Layout = new javax.swing.GroupLayout(jPanel4);
        jPanel4.setLayout(jPanel4Layout);
        jPanel4Layout.setHorizontalGroup(
            jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel4Layout.createSequentialGroup()
                .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(btnEliminar, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(btnEditar, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addGap(0, 289, Short.MAX_VALUE))
            .addGroup(jPanel4Layout.createSequentialGroup()
                .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel4Layout.createSequentialGroup()
                        .addGap(325, 325, 325)
                        .addComponent(jLabel3))
                    .addGroup(jPanel4Layout.createSequentialGroup()
                        .addGap(19, 19, 19)
                        .addComponent(jLabel1)))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        jPanel4Layout.setVerticalGroup(
            jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel4Layout.createSequentialGroup()
                .addGap(54, 54, 54)
                .addComponent(jLabel3)
                .addGap(11, 11, 11)
                .addComponent(jLabel1)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addGroup(jPanel4Layout.createSequentialGroup()
                        .addComponent(btnEliminar, javax.swing.GroupLayout.PREFERRED_SIZE, 68, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(btnEditar, javax.swing.GroupLayout.PREFERRED_SIZE, 68, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(0, 0, Short.MAX_VALUE))))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel4, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel4, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void formWindowOpened(java.awt.event.WindowEvent evt) {//GEN-FIRST:event_formWindowOpened
        
        cargarTabla();
    }//GEN-LAST:event_formWindowOpened

    private void btnEliminarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnEliminarActionPerformed
        // controlo que la tabla no este vacia
        if(tablaMascotas.getRowCount() > 0) {
            // controlo que se haya selecionado a una mascona
            if (tablaMascotas.getSelectedRow()!=-1) {
                //obtengo id de la mascota a eliminar
                int num_cliente = Integer.parseInt(String.valueOf(tablaMascotas.getValueAt(tablaMascotas.getSelectedRow(), 0)));
                
                // llamo al metodo borrar
                control.borrarMascota(num_cliente);
                
                //aviso al usuario que borro correctamente
                mostrarMensaje("Mascota eliminada correctamente", "info", "borrado mascota");
                cargarTabla(); //esto parece que me funcionaba bien, probar ahora con esto puesto
            }
            else{
                mostrarMensaje("No selecciono ninguna mascota", "error", "error al eliminar");
                }
            
        }
        else {
                mostrarMensaje("No hay nada para eliminar en la tabla", "error", "error al eliminar");
        }
    }//GEN-LAST:event_btnEliminarActionPerformed

    private void btnEditarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnEditarActionPerformed
         // controlo que la tabla no este vacia
        if(tablaMascotas.getRowCount() > 0) {
            // controlo que se haya selecionado a una mascona
            if (tablaMascotas.getSelectedRow()!=-1) {
               
                
                //obtengo id de la mascota a editar
                int num_cliente = Integer.parseInt(String.valueOf(tablaMascotas.getValueAt(tablaMascotas.getSelectedRow(), 0)));
                
                ModificarDatos pantallaModif = new ModificarDatos(num_cliente);
                pantallaModif.setVisible(true);
                pantallaModif.setLocationRelativeTo(null);
                
                 this.dispose();
                 
                 
    }//GEN-LAST:event_btnEditarActionPerformed
        else{
                mostrarMensaje("No selecciono ninguna mascota", "error", "error al eliminar");
                }
            
        }
        else {
                mostrarMensaje("No hay nada para eliminar en la tabla", "error", "error al eliminar");
        }
       
    }
public void mostrarMensaje(String mensaje, String tipo, String titulo){
    
    JOptionPane optionPane = new JOptionPane(mensaje);
    if(tipo.equals("Info")){
        optionPane.setMessageType(JOptionPane.INFORMATION_MESSAGE);
    }
    else if (tipo.equals("error")) {
        optionPane.setMessageType(JOptionPane.ERROR_MESSAGE);
    }
                
     JDialog dialog = optionPane.createDialog(titulo);
     dialog.setAlwaysOnTop(true);
     dialog.setVisible(true);
}

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnEditar;
    private javax.swing.JButton btnEliminar;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel4;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JTable tablaMascotas;
    // End of variables declaration//GEN-END:variables

    private void cargarTabla() { // Metodo cargar tabla, se hace cuando creas arriba cargarTabla(); y sale el error
        // Definir el modelo que queremos que tenga la tabla
        DefaultTableModel modeloTabla = new DefaultTableModel() {
          
            //Que fila y columnas no sea editables
        @Override
        public boolean isCellEditable (int row, int column) { // siempre poner el override, xk es metodo default de la tabla
            return false;
        }
    
      };
        
        //Establecemos los nombres de las columnas
        String titulos[] = {"Num", "Nombre", "Color", "Raza", "Alergico", "At. Esp.", "Dueño", "Mvl"};
        modeloTabla.setColumnIdentifiers(titulos);
    
        //Carga de los datos desde la base de  datos
        List <Mascota> listaMascotas = control.traerMascotas();
        
        //recorrer la lista y mostrar cada uno de los elementos de la tabla
        if (listaMascotas !=null) {
            for (Mascota masco : listaMascotas) {
                Object[] objeto = {masco.getNum_cliente(), masco.getNombre(), masco.getColor(), masco.getRaza(),
                    masco.getAlergico(), masco.getAtencion_especial(),masco.getUnDuenio()
                     };
                modeloTabla.addRow(objeto);
            }
        }
        
        tablaMascotas.setModel(modeloTabla);
        
        }
    
    
    }
    

    
    
// paso 1 crea el modelo de la tabla
//paso 2 establecemos el nombre de la columnas
// paso 3 todos estos titulos que guardamos del vector lo establemos en la tabla
//paso 4 traemos la lista de mascotas de la logica y la logica se encarga de traer de la base d datos
//paso 5 lo que traigamos va a estar guardado en una lista, vamos recorriendo esa lista, mascota por mascota en caso de q no sea null
//vamos a crear un array del objeto con cada uno los datos y esto lo agrega