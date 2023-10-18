package obj;
import conexion.ConexionOracle;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.Connection;
import java.sql.SQLException;
import java.util.List;
import java.util.ArrayList;
import java.util.Date;
public class Persona {
    private List<Persona> personas=new ArrayList<Persona>();
    private Integer idPer;
    private String namePer;
    private Date datePer;
    private Integer edadPer;
    private String curp;
    public Connection conn=null;
    public Persona(){}
    public Persona(Integer idPer, String namePer, Date datePer, Integer edadPer, String curp){
        this.idPer=idPer;
        this.namePer=namePer;
        this.datePer=datePer;
        this.edadPer=edadPer;
        this.curp=curp;
    }
    public Integer getIdPer(){return idPer;}
    public void setIdPer(Integer idPer){this.idPer=idPer;}
    public String getNamePer(){return namePer;}
    public void setNamePer(String namePer){this.namePer=namePer;}
    public Date getDatePer(){return datePer;}
    public void setDatePer(Date datePer){this.datePer=datePer;}
    public Integer getEdadPer(){return edadPer;}
    public void setEdadPer(Integer edadPer){this.edadPer=edadPer;}
    public String getCurp(){return curp;}
    public void setCurp(String curp){this.curp=curp;}
    public List<Persona> getPersonas(){return personas;}
    public void setPersonas(Persona persona){personas.add(persona);}
    @Override
    public String toString(){return idPer+" "+namePer+" "+datePer+" "+edadPer+" "+curp;}
    public void MostrarDatos(){
        try{
            ConexionOracle consulta=new ConexionOracle();
            conn=consulta.ConexionOracle();
            String query = "SELECT * FROM Personas";
            PreparedStatement ps = conn.prepareStatement(query);
            ResultSet rs = ps.executeQuery();
            while (rs.next())
                personas.add(new Persona(rs.getInt("IDPER"),rs.getString("NAMEPER"),rs.getDate("datePer"),rs.getInt("edadPer"),rs.getString("curp")));
            conn.close();
        }catch(SQLException e){
            System.out.println(e.getMessage());
        }
    }
}
