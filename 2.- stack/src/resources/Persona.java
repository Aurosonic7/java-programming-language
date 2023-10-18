package resources;
import java.util.List;
import java.util.ArrayList;
public class Persona{
    //* Atributos */
    private static List<Persona> personas=new ArrayList<Persona>();
    private Integer id;
    private String nombre;
    private double altura;
    private static Integer incrementador=0;
    private Integer posicion;
    //* Metodos constructores */
    private Persona(){posicion=Persona.incrementador++;}
    public Persona(Integer id, String nombre, double altura){
        this();
        this.id=id;
        this.nombre=nombre;
        this.altura=altura;
    }
    //* Metodos get y set */
    public void setId(Integer id){this.id=id;}
    public Integer getId(){return id;}
    public void setNombre(String nombre){this.nombre=nombre;}
    public String getNombre(){return nombre;}
    public void setAltura(double altura){this.altura=altura;}
    public double getAltura(){return altura;}
    public void setPersona(Persona persona){personas.add(persona);}
    public List<Persona> getPersonas(){return personas;}
    //* Método toString */
    @Override
    public String toString(){return "Posicion: "+posicion+" El id es: "+id+" con nombre "+nombre+" con altura "+altura+"\n";}
}