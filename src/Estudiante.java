
public class Estudiante {
    public String nombre;
    public int edad;
    public Estudiante(String _nombre, int _edad) {
        nombre = _nombre;
        edad = _edad;
    }
    public static void main(String[] args){
        Estudiante estudiante1 = new Estudiante("Esteban",34);
            Estudiante estudiante2 = new Estudiante("Mateo", 40);
    }
}
/*En private class*/
/*public class Estudiante {
    private String nombre;
    public String getNombre(){
        return nombre;
    }
    public void setNombre(String nombre){
        this.nombre = nombre;

    }
    public void Saludar(){
        System.out.println("Nombre: " + getNombre());
    }
    public static void main(String[] args){
        Estudiante estudiante1 = new Estudiante();
        estudiante1.setNombre("DESARROLLO");
        System.out.println("La carrera del estudiante es: "+ estudiante1.getNombre());
    }
}*/


