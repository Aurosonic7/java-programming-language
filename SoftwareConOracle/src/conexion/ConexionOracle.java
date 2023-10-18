package conexion;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
public class ConexionOracle{
    private static final String jdbcUrl="jdbc:oracle:thin:@175.1.60.56:1521:XE";
    private static final String user="Brayan";
    private static final String password="1";
    public Connection conexion=null;
    public Connection ConexionOracle(){
        try{
            //Carga el controlador JDBC
            Class.forName("oracle.jdbc.OracleDriver");
            //Establecemos la conexion
            conexion = DriverManager.getConnection(jdbcUrl, user, password);
            if(conexion != null) System.out.println("Conexion exitosa a la base de datos oracle...");
                //Cerramos la conexion una vez finalizado
        }catch(ClassNotFoundException e){
            System.out.println("Error al cargar el controlador JDBC: "+e.getMessage());
        }catch(SQLException e){
            System.out.println("Error al establecer la conexion: "+e.getMessage());
        }
        return conexion;
    }
}
