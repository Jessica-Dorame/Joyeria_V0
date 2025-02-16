
package Negocio;



import ControladorPersistencia.EmpleadoJpaController;
import ControladorPersistencia.RolJpaController;
import ControladorPersistencia.UsuarioJpaController;
import ControladorPersistencia.usuarioRolJpaController;
import Interface.IEmpleado;
import Interface.IRol;
import Interface.IUsuarioRol;
import java.util.ArrayList;
import java.util.List;
import javax.persistence.EntityManager;
import javax.persistence.Persistence;
import javax.swing.JComboBox;
import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableModel;
import util.HashUtil;
import Interface.IUsuario;
import Negocio.DTO.Rol;
import Negocio.DTO.Usuario;
import Negocio.DTO.usuarioRol;

/**
 *
 * @author Dórame
 */
public class FacadeJoyeria {

    public FacadeJoyeria(){ }
    
    private EntityManager entityM;
    
    private IUsuario usuarioRepositorio;
    private IEmpleado empleadoRepositorio;
    private IRol rolRepositorio;
    private IUsuarioRol usuarioRolRepositorio;

   
    
    public EntityManager getEntituManager(){
        return entityM != null ? entityM : (entityM = Persistence.createEntityManagerFactory("JoyeriaPersistencia").createEntityManager());
    }
    
    public IUsuario getUsuarioRepositorio(){
        return usuarioRepositorio != null ? usuarioRepositorio : (usuarioRepositorio = new UsuarioJpaController(getEntituManager()));
    }
    public IEmpleado getEmpleadoRepositorio(){
        return empleadoRepositorio != null ? empleadoRepositorio : (empleadoRepositorio = new EmpleadoJpaController(getEntituManager()));
    }
     
    public IRol getRolRepositorio(){
        return rolRepositorio != null ? rolRepositorio : (rolRepositorio = new RolJpaController(getEntituManager()));
    }
     
     public IUsuarioRol getUsuarioioRolRepositorio(){
        return usuarioRolRepositorio != null ? usuarioRolRepositorio : (usuarioRolRepositorio = new usuarioRolJpaController(getEntituManager()));
    
//    public IProductoRepositorio getProductoRepositorio(){
//        return productoRepositorio != null ?  productoRepositorio : (productoRepositorio = new Producto(getEntituManager()));
//    }
//    
//    public IVentaRepositorio getVentaRepositorio(){
//        return ventaRepositorio != null ? ventaRepositorio : (ventaRepositorio = new Venta(getEntituManager()));
//    }
    
//    public IDetalleV getDetalleVentaRepositorio(){
//        return detalleVentaRepositorio != null ? detalleVentaRepositorio : (detalleVentaRepositorio = new DetalleVenta(getEntituManager()));
//    }
    

//    }
//      public IVendedorRepositorio getVendedorRepositorio(){
//        return vendedorRepositorio != null ? vendedorRepositorio : (vendedorRepositorio = new Vendedor(getEntituManager())) ;
//    }
//      public IPrestamoRepositorio getPrestamoRepositorio(){
//          return prestamoRepositorio != null ? prestamoRepositorio : (prestamoRepositorio = new Prestamo(getEntituManager()));
//      }
//     public IDetallePrestamoRepositorio getDetallPrestamoRepositorio(){
//         return detallePrestamoRepositorio != null ? detallePrestamoRepositorio : (detallePrestamoRepositorio = new DetallePrestamo(getEntituManager()));
     }

//   /***
//    * Calcula el total de la venta
//    * @param dtb
//    * @param lista
//    * @return total
//    */
//    public float calcularTotal( DefaultTableModel dtb, List <ProductoDTO> lista){
//        float total =0;
//         for (int i =0; i<= dtb.getRowCount()-1; i++) {          
//           total = total + (lista.get(i).getPrecio() * Integer.parseInt(dtb.getValueAt(i, 4).toString()));
//        }
//        return total;
//    }
//
//    /**
//     * Verifica que el producto a agregar en la lista de Venta sea repetido, si lo es
//     * suma la cantidad, si no lo es, regresa un False para ser agregado como nuevo.
//     * @param listaventa
//     * @param p
//     * @param dtb
//     * @return r
//     */
//    public boolean repetido (List <ProductoDTO> listaventa, ProductoDTO p,DefaultTableModel dtb){
//        boolean r = false;
//        for (int i =0; i <= listaventa.size()-1; i++) {
//            
//            if(listaventa.get(i).getCodigo().equals(p.getCodigo()))
//            {
//                r = true;
//                int cantidad = (int) dtb.getValueAt(i, 4);
//                int stock = listaventa.get(i).getStock();
//                if ( cantidad+1 <= listaventa.get(i).getStock()){    
//                     dtb.setValueAt(cantidad+1, i, 4);  // actualiza la cantidad 
//                     listaventa.get(i).setStock(stock-1);
//                     p.setStock(p.getStock()-1);
//                     break; 
//                }
//                else{   
//                    JOptionPane.showMessageDialog(null, "No hay stock suficiente, Verifique el pedido");
//                    break; }
//            }  
//        }
//       return r;
//    }
//    
//    /**
//     * Elimina productos de la lista de Venta
//     * @param listaventa
//     * @param p
//     * @param dtb
//     * @return 
//     */
//    public List <ProductoDTO> eliminar (List <ProductoDTO> listaventa, ProductoDTO p,DefaultTableModel dtb ){
//               
//        for (int i =0; i <= listaventa.size()-1; i++) {
//            if(listaventa.get(i).getCodigo().equals(p.getCodigo()))
//            {               
//                int cantidad = (int) dtb.getValueAt(i, 4);
//                int stock = listaventa.get(i).getStock();
//                if ( cantidad-1 >0){    
//                     dtb.setValueAt(cantidad-1, i, 4);  // actualiza la cantidad  
//                     listaventa.get(i).setStock(stock+1);
//                     break; 
//                }
//                else{                   
//                     dtb.removeRow(i);
//                     listaventa.remove(i);}
//            }          
//        }
//        return listaventa; 
//    } 
//    
//    /**
//     * Muestra la lista de Empleados registrados
//     * @param cbxEmpleados 
//     */
//    public void mostrarLista (JComboBox cbxEmpleados){
//     List <EmpleadoDTO> listaEmpleado = getEmpleadoRepositorio().lista();     
//       for(EmpleadoDTO item: listaEmpleado ) {
//           cbxEmpleados.addItem(String.valueOf(item.getIdEmpledo())+" "+ item.getNombre() + " " + item.getApellido());
//       }      
//    }
//    
//    /**
//     * Muestra la lista de Roles
//     * @param cbxRoles 
//     */
//    public void mostrarRoles(JComboBox cbxRoles){
//       List <RolDTO> listaRol  = getRolRepositorio().lista();
//       for(RolDTO r : listaRol){
//           cbxRoles.addItem(r.getIdRol() + " " + r.getRolNombre());
//       }
//    }
//    
//   /**
//    * Muestra la lista de Empleados que no tienen un Usuario asignado aún
//    * @param cbxEmpleados 
//    */
//     public void mostrarEmpleados(JComboBox cbxEmpleados){
//       empleadoRepositorio = new Empleado(getEntituManager());
//       List<Object[]> listaE = empleadoRepositorio.empleadoSinUsuario(entityM);
//       List<String> nombresE = new ArrayList<>();
//       String nombreCompleto;        
//       
//        for (Object[] result  : listaE) {  
//            String id = String.valueOf(result[0]);
//            String nombres = (String) result[1];  
//            String apellidos = (String) result[2]; 
//            nombreCompleto = id + " " + nombres + " " + apellidos;
//            nombresE.add(nombreCompleto);             
//        }
//        for(int i=0; i <= listaE.size()-1; i++){
//              cbxEmpleados.addItem(nombresE.get(i));
//          }               
//    }
//     
//     /**
//      * Guarda Usuario nuevo y Usuario Rol relacionado con el Empleado
//      * @param id
//      * @param usuario
//      * @param clave
//      * @param rol 
//      */
//     public void guardarNuevoUsuario(int id, String usuario, String clave, int rol){
//         UsuarioDTO user= new UsuarioDTO(id, usuario,clave);
//         try{
//         getUsuarioRepositorio().agregar(user); // Agrega el nuevo usuario
//         List <Object> result = getUsuarioRepositorio().getUltimoUsuario(entityM);
//         
//         UsuarioRolDTO ur = new UsuarioRolDTO(Integer.parseInt(result.get(0).toString()),rol); 
//         getUsuarioioRolRepositorio().agregar(ur);
//         
//         }catch (Exception e){
//             JOptionPane.showMessageDialog(null, "Error al guardar usuario "+ e);
//         }
//     }
//     /**
//      * Valida los campos para iniciar sesion
//      * @param user
//      * @param clave
//      * @param confirm
//      * @param id
//      * @param rolnombre 
//      */
//     public void validarCampos(String user, String clave, String confirm, int id, String rolnombre){
//                
//        if (user.isEmpty() || clave.isEmpty()  || confirm.isEmpty() || rolnombre.equals("LISTA")){
//            JOptionPane.showMessageDialog(null, "Asegurese de ingresar todos los datos!");
//            return;
//        }
//        if (!clave.equals(confirm)){
//            JOptionPane.showMessageDialog(null, "Clave y confirmacion incorrectas, por favor verifique!");
//            return;
//        }      
//        try{
//      
//           int rol = Integer.parseInt(rolnombre.split(" ")[0]);
//           guardarNuevoUsuario(id, user, clave, rol);
//           JOptionPane.showMessageDialog(null, "Usuario Guardado correctamente");
//        }
//        catch(Exception e){
//            JOptionPane.showMessageDialog(null,"Error al registrar usuario"+ e);
//        }
//     }
//     
//     /**
//      * Valida que la clave ingresada sea igual a la de la base de datos
//      * comparando sus hash.
//      * @param usuario
//      * @param clave
//      * @return 
//      */
     public List <Object> validarInicioSesion(String usuario, String clave){
     List <Object> result = getUsuarioRepositorio().getUsuario(entityM, usuario,clave);
     return result;
 
     }
//     public String obtenerEmpleado(int u){
//       List <Object[]>  result = getEmpleadoRepositorio().empleadoNombres(entityM, u);  
//       String nombreCompleto = "";        
//       
//        for (Object[] res  : result) {  
//            
//            String nombre = (String) res[1];  
//            String apellido = (String) res[2]; 
//            nombreCompleto = nombre + " " + apellido;                   
//        }
//         return nombreCompleto;
//     }
//     /**
//      * Regresa la lista de usuatios para mostrarlos en un JComboBox
//      * @param cbxUsuarios 
//      * @param id  
//      */
//     public void mostrarUsuarios(JComboBox cbxUsuarios, int id){
//           List <Object[]> result = getUsuarioRepositorio().obtenerU(entityM, id);
//           List<String> usuarios = new ArrayList<>();
//     
//          for (Object[] res  : result) {  
//           int ids = Integer.parseInt( res[0].toString());
//           String us = (String) res[2]; 
//           usuarios.add(ids +" " + us);
//          }
//          for(int i =0; i <= result.size()-1;i++){
//              cbxUsuarios.addItem(usuarios.get(i));
//          }    
//   }
//     /**
//      * Muestra vendedores
//      * @param cbx 
//      */
//     public void mostrarVendedores(JComboBox cbx){
//         List <VendedorDTO> listaVendedor  = getVendedorRepositorio().lista();
//       for(VendedorDTO r : listaVendedor){
//           cbx.addItem(r.getIdVendedor()+ " "+r.getNombres()+" " + r.getApellidos());
//       }
//     }
//     /**
//      * 
//      * @param u
//      * @return 
//      */
//    public int getRolRepositorio (UsuarioDTO u){
//        List <Object[]> list = getRolRepositorio().getRol(entityM, u);
//        int rol = 0;
//        for (Object [] r: list){
//            rol = Integer.parseInt(r[0].toString());
//        }
//        return  rol;
//    }
     
     
}
