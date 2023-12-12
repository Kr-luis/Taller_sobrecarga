public class Ejercicio {
    String nombre;
    int numeroEj;
    int nota;
    public Ejercicio(String nombre, int numeroEj, int nota) {
        this.nombre = nombre;
        this.numeroEj = numeroEj;
        this.nota = nota;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }
    public int getNumeroEj(){
        return numeroEj;
    }
    public void setNumeroEj(int numeroEj){
        this.numeroEj = numeroEj;
    }
    public int getnota(){
        return nota;
    }
    public void setNota(){
        this.nota = nota;
    }
    public void Mostrar (){
        System.out.println("Ejercicio de: "+nombre+"\n"+"Numero: "+numeroEj+"\n"+"Nota: "+nota);
    }
    public static void main(String[] args){
        Ejercicio ej1 = new Ejercicio("Poo",2,4);
        ej1.Mostrar();
    }
}
