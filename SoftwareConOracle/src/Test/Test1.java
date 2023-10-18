package Test;
import conexion.ConexionOracle;
import java.sql.Connection;
public class Test1 {
    public static void main(String [] args){
         ConexionOracle conn = new ConexionOracle();
         Connection con=conn.ConexionOracle();
         if(con == null) System.out.println("Conexion nula");
         else System.out.println("Ya estoy dentro!!!");
                 
    }
}
