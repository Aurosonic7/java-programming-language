package view;
import resources.Persona;
import java.util.Scanner;
public class InterfazPrincipal{
    private Persona pers=null;
    private Scanner entrada=new Scanner(System.in);
    public void menu(){
        int opcion;
        do{
            System.out.println("::Bienvenido al menu::");
            System.out.println("1.- Insertar persona.");
            System.out.println("2.- Ordenar persona.");
            System.out.println("3.- Buscar persona.");
            System.out.println("4.- Eliminar persona.");
            System.out.println("5.- Modificar persona.");
            System.out.println("0.- Salir");
            System.out.print("Digite la opcion a escoger: "); opcion=entrada.nextInt();
            switch(opcion){
                case 1:
                    System.out.print("Digite el id: "); Integer id=entrada.nextInt();
                    System.out.print("Digite el nombre: "); String nombre=entrada.next();
                    System.out.print("Digite la altura: "); double altura=entrada.nextDouble();
                    pers=new Persona(id,nombre,altura);
                    pers.setPersona(pers);
                    System.out.println(pers.getPersonas());
                break;
                case 2:
                    System.out.println(pers.getPersonas());
                break;
                case 3:
                    System.out.print("Digite el id a buscar: "); Integer idBuscar=entrada.nextInt();
                    //if(pers.buscarId(idBuscar)!=null) System.out.println(pers.buscarId(idBuscar));
                    //else System.out.println("No existe");
                break;
                case 4:
                    System.out.print("Digite el id a borrar: "); Integer idEliminar=entrada.nextInt();
                    //pers.eliminarPosicion(idEliminar);
                    System.out.println(pers.getPersonas());
                break;
                case 5:
                    System.out.println(pers.getPersonas());
                    System.out.print("Digite el id de la persona a modificar: "); Integer idModificar=entrada.nextInt();
                    System.out.print("Digite el nuevo nombre de la persona a modificar: "); String nombreModificar=entrada.next();
                    //pers.modificarNombre(idModificar,nombreModificar);
                    System.out.println(pers.getPersonas());
                break;
                case 0:
                    System.out.println("Saliendo...");
                break;
                default:
                    System.out.println("Digite otra vez la opcion a escoger...");
                break;
            }
        }while(opcion!=0);
    }
}