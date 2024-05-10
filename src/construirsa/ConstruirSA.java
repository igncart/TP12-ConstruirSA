
package construirsa;


import java.sql.*;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JOptionPane;


public class ConstruirSA {

   
    public static void main(String[] args) {
       
        try {
           
            Class.forName("org.mariadb.jdbc.Driver");
            String bd = "jdbc:mysql://localhost:3306/tp12construirsa";
            String usuario = "root";
            String password = "";
            

                Connection con = DriverManager.getConnection(bd, usuario, password);
                
             /*-----------------------Dar de baja al primer empleado ingresado a la base de datos.(Usando UPDATE) ---------------------
               
                String sql = "UPDATE empleado "
                        + "SET estado = 0 "
                        + "WHERE id_empleado = 5";
                
                PreparedStatement ps = con.prepareStatement(sql);
                
                int resultado = ps.executeUpdate();
                
                if (resultado > 0) {
                    JOptionPane.showMessageDialog(null, "Empleado actualizado.");
                }
                System.out.println(resultado);
                        
                
                /*-----------------------Dar de baja al primer empleado ingresado a la base de datos.(Usando DELETE) ---------------------
               
                String sql = "DELETE FROM empleado "
                        + "WHERE id_empleado = 4" ;
                
                PreparedStatement ps = con.prepareStatement(sql);
                
                int filas = ps.executeUpdate();
                
                System.out.println(filas);
 
                -----------------------Listar todas las herramientas con stock superior a 10.---------------------
                
                /* String sql = "SELECT * "
                        + "FROM herramienta "
                        + "WHERE stock >= 10";
                
                PreparedStatement ps = con.prepareStatement(sql);
                
                ResultSet resultado = ps.executeQuery();
                
                while (resultado.next()) {
            
                    System.out.println("ID: "+resultado.getInt("id_herramienta"));
                    System.out.println("Nombre: "+resultado.getString("nombre"));
                    System.out.println("Descripcion: "+resultado.getString("descripcion"));
                    System.out.println("Estado: "+resultado.getString("estado"));
                    System.out.println("Stock: "+resultado.getString("stock"));
        }
                        
                -----------------------Insertar 2 herramientas.---------------------
                
                /* String sql = "INSERT INTO herramienta(nombre, descripcion, stock, estado) "
                       + "VALUES ('Martillo', 'Martillo mango de madera', 5, 1), "
                       + "('Serrucho', 'Mango de aluminio', 10, 1), "
                       + "('Destornillador', 'Phillips', 30, 1)";
               
               PreparedStatement ps = con.prepareStatement(sql);
               
               int filas = ps.executeUpdate();
               
               if (filas>0) {
                   JOptionPane.showMessageDialog(null, "Herramienta agregada.");
               }
   
                -----------------------Insertar 3 empleados.---------------------
                
                /* String sql = "INSERT INTO empleado(dni, apellido, nombre, acceso, estado)"
                        + "VALUES (40000000, 'Alvarez', 'Juan', 1, 1),"
                        + "(39000000, 'Saez', 'Juanjo', 1, 1),"
                        + "(28000000, 'Mercado', 'Luis', 1, 1)";
                
                PreparedStatement ps = con.prepareStatement(sql);
                
                int filas = ps.executeUpdate();
                
                if (filas>0) {
                    JOptionPane.showMessageDialog(null, "Empleado agregado.");
                }*/
                
                
                
 
            } catch (SQLException ex) {
                JOptionPane.showMessageDialog(null, "Error");
 
            } catch (ClassNotFoundException ex) {
                JOptionPane.showMessageDialog(null, "Error al cargar el driver");
        }
    }
    
}
