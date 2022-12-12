/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package BD;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
/**
 *
 * @author cesar
 */
public class conexion {
    String setrConexionDB = "jdbc:sqlite:D:/DB/analizador.s3db";
    Connection conn = null;
    public conexion(){
        try {
            Class.forName("org.sqlite.JDBC");
            conn = DriverManager.getConnection(setrConexionDB);
            
            System.out.println("conccion hecha");
        } catch (Exception e) {
             System.out.println("error en "+ e);
        }
    }
  public int ejecutar(String sentencia){
      try {
          PreparedStatement pstm = conn.prepareStatement(sentencia);
          pstm.execute();
          System.out.println("Se ejecuto: " + sentencia);
          return 1;
      } catch (Exception e) {
          System.out.println("Error en "+sentencia+" : "+e);
          return 0;
      }
  }
  public ResultSet consultar(String sentencia){
      try {
          PreparedStatement pstm = conn.prepareStatement(sentencia);
          ResultSet respuesta = pstm.executeQuery();
          return respuesta;
      } catch (Exception e) {
          System.out.println("Error: "+e);
          return null;
      }
  }
}
