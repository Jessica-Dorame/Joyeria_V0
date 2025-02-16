
import Negocio.DTO.Usuario;
import javax.swing.JLabel;


////package Presentacion;
////import Negocio.DTOs.ProductoDTO;
////import Negocio.DTOs.UsuarioDTO;
////import Negocio.FacadeJoyeria;
////import java.awt.Color;
////import java.awt.Image;
////import java.util.List;
////import javax.swing.Icon;
////import javax.swing.ImageIcon;
////import javax.swing.JLabel;
////import javax.swing.JOptionPane;
/////**
//// *
//// * @author Dórame
//// */
public class Menu extends javax.swing.JFrame {
////    private ImageIcon imagen;
////    private Icon icono;
////    FacadeJoyeria fv;
////    private UsuarioDTO u;
////    private String empleado;
   public Menu(Usuario us, String emp) {
////        this.u = us;this.empleado = emp;
////        setTitle("Menú");
////        initComponents();
////        fv = new FacadeJoyeria();
////        this.getContentPane().setBackground(Color.WHITE);
////        this.setLocationRelativeTo(null); 
////        this.setExtendedState(Menu.MAXIMIZED_BOTH);
////        this.printImagen(lblLogoMenu, "C:\\Users\\jessi\\Documents\\JoyeriaSD_V0\\JoyeriaSD\\src\\imgs\\SD logo.jpg");
////        jpanelMenu.setBackground(Color.WHITE);
////        getContentPane().add(jpanelMenu, BorderLayout.CENTER);
////        lblNombreUsuario.setText(empleado);      
    }   
//// 
    public Menu(){
////        
    }
////    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jpanelMenu = new java.awt.Panel();
        lblLogoMenu = new javax.swing.JLabel();
        lblBienvenido = new javax.swing.JLabel();
        lblNombreUsuario = new javax.swing.JLabel();
        lblLogousuariomenu = new javax.swing.JLabel();
        jMenuBar1 = new javax.swing.JMenuBar();
        menuMenu = new javax.swing.JMenu();
        menuSalir = new javax.swing.JMenuItem();
        menuUsuarios = new javax.swing.JMenu();
        jMenuItem2 = new javax.swing.JMenuItem();
        jMenuItem3 = new javax.swing.JMenuItem();
        jMenuItem5 = new javax.swing.JMenuItem();
        jMenuItem6 = new javax.swing.JMenuItem();
        menuEmpleados = new javax.swing.JMenu();
        jMenuItem4 = new javax.swing.JMenuItem();
        jMenuItem7 = new javax.swing.JMenuItem();
        jMenuItem8 = new javax.swing.JMenuItem();
        menuVenta = new javax.swing.JMenu();
        jMenuItem1 = new javax.swing.JMenuItem();
        menuVendedores = new javax.swing.JMenu();
        menuPrestamos = new javax.swing.JMenu();
        menuNuevoPrestamo = new javax.swing.JMenuItem();
        menuRecepcion = new javax.swing.JMenuItem();
        menuReportes = new javax.swing.JMenu();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jpanelMenu.setForeground(new java.awt.Color(255, 255, 255));

        lblBienvenido.setFont(new java.awt.Font("Bell MT", 0, 48)); // NOI18N
        lblBienvenido.setText("BIENVENIDO");

        lblNombreUsuario.setFont(new java.awt.Font("Serif", 0, 24)); // NOI18N
        lblNombreUsuario.setText("Jessica Dórame");

        lblLogousuariomenu.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imgs/usuariomenulogo.png"))); // NOI18N

        javax.swing.GroupLayout jpanelMenuLayout = new javax.swing.GroupLayout(jpanelMenu);
        jpanelMenu.setLayout(jpanelMenuLayout);
        jpanelMenuLayout.setHorizontalGroup(
            jpanelMenuLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jpanelMenuLayout.createSequentialGroup()
                .addGap(16, 16, 16)
                .addGroup(jpanelMenuLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jpanelMenuLayout.createSequentialGroup()
                        .addComponent(lblBienvenido, javax.swing.GroupLayout.DEFAULT_SIZE, 422, Short.MAX_VALUE)
                        .addGap(664, 664, 664))
                    .addGroup(jpanelMenuLayout.createSequentialGroup()
                        .addComponent(lblLogousuariomenu, javax.swing.GroupLayout.PREFERRED_SIZE, 49, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(lblNombreUsuario, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addGap(699, 699, 699))))
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jpanelMenuLayout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(lblLogoMenu, javax.swing.GroupLayout.PREFERRED_SIZE, 383, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(121, 121, 121))
        );
        jpanelMenuLayout.setVerticalGroup(
            jpanelMenuLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jpanelMenuLayout.createSequentialGroup()
                .addGap(48, 48, 48)
                .addComponent(lblBienvenido, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGap(18, 18, 18)
                .addGroup(jpanelMenuLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(lblLogousuariomenu, javax.swing.GroupLayout.DEFAULT_SIZE, 64, Short.MAX_VALUE)
                    .addGroup(jpanelMenuLayout.createSequentialGroup()
                        .addGap(8, 8, 8)
                        .addComponent(lblNombreUsuario, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)))
                .addGap(22, 22, 22)
                .addComponent(lblLogoMenu, javax.swing.GroupLayout.DEFAULT_SIZE, 208, Short.MAX_VALUE)
                .addGap(229, 229, 229))
        );

        menuMenu.setText("   MENU   ");
        menuMenu.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N

        menuSalir.setText("SALIR");
        menuSalir.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                menuSalirActionPerformed(evt);
            }
        });
        menuMenu.add(menuSalir);

        jMenuBar1.add(menuMenu);

        menuUsuarios.setText("   USUARIOS   ");
        menuUsuarios.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N

        jMenuItem2.setText("CAMBIAR USUARIO");
        jMenuItem2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jMenuItem2ActionPerformed(evt);
            }
        });
        menuUsuarios.add(jMenuItem2);

        jMenuItem3.setText("AGREGAR ");
        jMenuItem3.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jMenuItem3ActionPerformed(evt);
            }
        });
        menuUsuarios.add(jMenuItem3);

        jMenuItem5.setText("ELIMINAR");
        jMenuItem5.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jMenuItem5ActionPerformed(evt);
            }
        });
        menuUsuarios.add(jMenuItem5);

        jMenuItem6.setText("ACTUALIZAR");
        menuUsuarios.add(jMenuItem6);

        jMenuBar1.add(menuUsuarios);

        menuEmpleados.setText("EMPLEADOS");

        jMenuItem4.setText("INGRESAR");
        jMenuItem4.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jMenuItem4ActionPerformed(evt);
            }
        });
        menuEmpleados.add(jMenuItem4);

        jMenuItem7.setText("DAR DE BAJA");
        jMenuItem7.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jMenuItem7ActionPerformed(evt);
            }
        });
        menuEmpleados.add(jMenuItem7);

        jMenuItem8.setText("ACTUALIZAR");
        jMenuItem8.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jMenuItem8ActionPerformed(evt);
            }
        });
        menuEmpleados.add(jMenuItem8);

        jMenuBar1.add(menuEmpleados);

        menuVenta.setText("   VENTA   ");
        menuVenta.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N

        jMenuItem1.setText("SISTEMA DE VENTAS");
        jMenuItem1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jMenuItem1ActionPerformed(evt);
            }
        });
        menuVenta.add(jMenuItem1);

        jMenuBar1.add(menuVenta);

        menuVendedores.setText("   VENDEDORES   ");
        menuVendedores.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        jMenuBar1.add(menuVendedores);

        menuPrestamos.setText("   PRESTAMOS   ");
        menuPrestamos.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N

        menuNuevoPrestamo.setText("NUEVO");
        menuNuevoPrestamo.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                menuNuevoPrestamoActionPerformed(evt);
            }
        });
        menuPrestamos.add(menuNuevoPrestamo);

        menuRecepcion.setText("RECEPCION");
        menuRecepcion.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                menuRecepcionActionPerformed(evt);
            }
        });
        menuPrestamos.add(menuRecepcion);

        jMenuBar1.add(menuPrestamos);

        menuReportes.setText("   REPORTES   ");
        menuReportes.setFont(new java.awt.Font("SansSerif", 0, 14)); // NOI18N
        jMenuBar1.add(menuReportes);

        setJMenuBar(jMenuBar1);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jpanelMenu, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jpanelMenu, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents
    public void setRol(int rol){
           
//        if (rol == 2) {
//            menuEmpleados.setVisible(false);
//            
//        }     
    }
    private void menuSalirActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_menuSalirActionPerformed
     
        System.exit(0);
    }//GEN-LAST:event_menuSalirActionPerformed

    private void jMenuItem1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jMenuItem1ActionPerformed
     
//      try{
//          List <ProductoDTO> producto = fv.getProductoRepositorio().lista();
//          
//          FrmVenta v = new FrmVenta(null, true,this.u,empleado);
//          v.setResizable(false);
//          v.cargar(producto);
//          v.setVisible(true);
//         
//      }catch(Exception e){
//           JOptionPane.showMessageDialog(null, e.getMessage());
//      }   
        
    }//GEN-LAST:event_jMenuItem1ActionPerformed

    private void jMenuItem2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jMenuItem2ActionPerformed
//      InicioSesion ins = new InicioSesion();
//      ins.setVisible(true);
//      this.dispose();
       
    }//GEN-LAST:event_jMenuItem2ActionPerformed

    private void menuNuevoPrestamoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_menuNuevoPrestamoActionPerformed
//      try{
//          List <ProductoDTO> producto = fv.getProductoRepositorio().lista();
//          
//          Prestamos p = new Prestamos(null, true,this.u,empleado);
//          p.cargar(producto);
//          p.setResizable(false);
//          p.setVisible(true);
//         
//      }catch(Exception e){
//           JOptionPane.showMessageDialog(null, e.getMessage());
//      }      
    }//GEN-LAST:event_menuNuevoPrestamoActionPerformed

    private void menuRecepcionActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_menuRecepcionActionPerformed
//      Recepcion r = new Recepcion(this, true);
//      r.setResizable(false);
//      r.setVisible(true);
    }//GEN-LAST:event_menuRecepcionActionPerformed

    private void jMenuItem3ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jMenuItem3ActionPerformed
//      UsuarioAgregar au = new UsuarioAgregar(this,true);
//      au.setResizable(false);
//      au.setVisible(true);
    }//GEN-LAST:event_jMenuItem3ActionPerformed

    private void jMenuItem4ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jMenuItem4ActionPerformed
//      EmpleadoAgregar ne = new EmpleadoAgregar(this,true);
//      ne.setResizable(false);
//      ne.setVisible(true);      
       
    }//GEN-LAST:event_jMenuItem4ActionPerformed

    private void jMenuItem7ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jMenuItem7ActionPerformed
//      EmpleadoEliminar ee = new EmpleadoEliminar(this,true);
//      ee.setResizable(false);
//      ee.setVisible(true);
    }//GEN-LAST:event_jMenuItem7ActionPerformed

    private void jMenuItem8ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jMenuItem8ActionPerformed
//      EmpleadoActualizar ae = new EmpleadoActualizar(this, true);
//      ae.setResizable(false);
//      ae.setVisible(true);
    }//GEN-LAST:event_jMenuItem8ActionPerformed

    private void jMenuItem5ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jMenuItem5ActionPerformed
//       UsuarioEliminar eu = new UsuarioEliminar(this,true,this.u);
//       eu.setResizable(false);
//       eu.setVisible(true);
    }//GEN-LAST:event_jMenuItem5ActionPerformed

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
            java.util.logging.Logger.getLogger(Menu.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Menu.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Menu.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Menu.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
           //     new Menu().setVisible(true);
            }
            
        });
    }
    /**
     * método que muestra la imagen del logo
     * @param Label
     * @param ruta 
     */
   private void printImagen (JLabel jl, String ruta){
//       this.imagen = new ImageIcon(ruta);
//       this.icono = new ImageIcon 
//           (this.imagen.getImage().getScaledInstance (jl.getWidth(), jl.getWidth(), Image.SCALE_DEFAULT));
//       jl.setIcon(icono);
//       this.repaint();
   }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JMenuBar jMenuBar1;
    private javax.swing.JMenuItem jMenuItem1;
    private javax.swing.JMenuItem jMenuItem2;
    private javax.swing.JMenuItem jMenuItem3;
    private javax.swing.JMenuItem jMenuItem4;
    private javax.swing.JMenuItem jMenuItem5;
    private javax.swing.JMenuItem jMenuItem6;
    private javax.swing.JMenuItem jMenuItem7;
    private javax.swing.JMenuItem jMenuItem8;
    private java.awt.Panel jpanelMenu;
    private javax.swing.JLabel lblBienvenido;
    private javax.swing.JLabel lblLogoMenu;
    private javax.swing.JLabel lblLogousuariomenu;
    private javax.swing.JLabel lblNombreUsuario;
    private javax.swing.JMenu menuEmpleados;
    private javax.swing.JMenu menuMenu;
    private javax.swing.JMenuItem menuNuevoPrestamo;
    private javax.swing.JMenu menuPrestamos;
    private javax.swing.JMenuItem menuRecepcion;
    private javax.swing.JMenu menuReportes;
    private javax.swing.JMenuItem menuSalir;
    private javax.swing.JMenu menuUsuarios;
    private javax.swing.JMenu menuVendedores;
    private javax.swing.JMenu menuVenta;
    // End of variables declaration//GEN-END:variables
}
