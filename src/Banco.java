import java.util.concurrent.locks.ReadWriteLock;

public class Banco {
    public String cedula;
    public String nombre;
    public Banco(String nombre, String cedula){
        this.cedula = cedula;
        this.nombre = nombre;
    }
    public static void  RegistrarUsuarios(){
        System.out.println("Datos personales");
    }
    public static void R_cuenta(){
        System.out.println("Registro de usuario con exito");
    }
    public static void main(String[] args){
        Banco usuario = new Banco("Luis", "1750833681");
        RegistrarUsuarios();
        System.out.println(usuario.nombre + "\n" + usuario.cedula);
        R_cuenta();
    }
}
