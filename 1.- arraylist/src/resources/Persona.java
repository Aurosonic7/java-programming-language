package resources;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;
public class Persona{
    //* Atributos */
    // Uso private debido a que no ocupare herencia
    // Ademas de ocupar un incrementador para practicar el static para creacion de mis objetos personas
    private static List<Persona> personas=new ArrayList<Persona>();
    private Integer id;
    private String nombre;
    private double altura;
    private static Integer incrementador=0;
    private Integer posicion;
    //* Métodos constructores */
    private Persona(){posicion=Persona.incrementador++;}
    public Persona(Integer id, String nombre, double altura){
        this();
        this.id=id;
        this.nombre=nombre;
        this.altura=altura;
    }
    //* Métodos set y get */
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
    //! Metodos extra de mi objeto
    //* Metodos de ordenacion */
    // Ordenacion mediante posicion
    public void sortPosicion(){Collections.sort(personas, new Comparator<Persona>(){public int compare(Persona a, Persona b){return a.posicion - b.posicion;}});}
    // Ordenacion mediante id
    public void sortId(){Collections.sort(personas, new Comparator<Persona>(){public int compare(Persona a, Persona b){return a.id - b.id;}});}
    // Ordenacion mediante id y nombre
    public void sortGeneral(){
        Collections.sort(personas, new Comparator<Persona>(){
            public int compare(Persona a, Persona b){
                int comparacionId = Integer.compare(a.getId(),b.getId()); // Orden ascendente por id
                if (comparacionId != 0) return comparacionId;
                else return a.getNombre().compareTo(b.getNombre()); // Orden ascendente por nombre
            }
        });
    }
    //* Metodos de busqueda */
    // Busqueda por id
    public Persona buscarId(Integer id){
        for(int i=0;i<personas.size();i++)
            if(personas.get(i).id==id)
                return personas.get(i);
        return null;
    }
    // Busqueda por nombre
    public Persona buscarNombre(String nombre){
        for(int i=0;i<personas.size();i++)
            if(personas.get(i).getNombre().equals(nombre))
                return personas.get(i);
        return null;
    }
    //* Metodos de eliminacion */
    // Eliminar mediante posicion
    public void eliminarPosicion(Integer idEliminar){
        for(int i=0;i<personas.size();i++)
            if(personas.get(i).getId()==idEliminar)
                personas.remove(i);
    }
    //* Metodos de modificación */
    // Modificar mediante id --> nombre
    public void modificarNombre(Integer id,String nuevoNombre){
        for(int i=0;i<personas.size();i++)
            if(personas.get(i).getId()==id)
                personas.get(i).setNombre(nuevoNombre);
    }
}