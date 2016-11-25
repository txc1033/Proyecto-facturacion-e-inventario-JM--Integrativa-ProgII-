/* Autor @Javifast */
package clases;
import java.sql.*;

public class conexion {

   private final String url = "jdbc:mysql://localhost/facturacion";
    PreparedStatement psPrepararSentencia;
    Connection con = null;

    public conexion() {
     try{  
         
         Class.forName("com.mysql.jdbc.Driver");
         
         con = DriverManager.getConnection(url,"javier","1031");
         if (con!=null){
            System.out.println("Conexión a base de datos facturacion. listo");
         }
      }
         catch(SQLException e)
         {
         System.out.println(e);
         }
         catch(ClassNotFoundException e)
         {
          System.out.println(e);
         }
    }

    public Connection conectado(){
      return con;
}

    public void desconectar(){
      con = null;
      System.out.println("conexion terminada");

    } 

}
