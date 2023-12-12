public class comidasTipicas {
    public String nombre;
    public int precio;
    public String provincia;
    public int calificacion;

    public comidasTipicas(String nombre, int precio, String provincia, int calificacion) {
        this.nombre = nombre;
        this.precio = precio;
        this.provincia = provincia;
        this.calificacion = calificacion;
    }
    public void Mostrar (){
        System.out.println("\n");
        System.out.println("Nombre: "+nombre);
        System.out.println("Precio: "+precio + "$");
        System.out.println("Provincia: "+provincia);
        System.out.println("Calificacion: "+calificacion + " estrellas");
        System.out.println("\n");
    }
    public static void main(String[] args){
        comidasTipicas comida1 = new comidasTipicas("Ceviche",2,"Esmeraldas",4);
        comidasTipicas comida2 = new comidasTipicas("Hornado",3,"Pichincha",5);
        comidasTipicas comida3 = new comidasTipicas("Encebollado",1,"Guayaquil",5);
        comidasTipicas comida4 = new comidasTipicas("Fritada",3,"Pichincha",4);

        comida1.Mostrar();
        comida2.Mostrar();
        comida3.Mostrar();
        comida4.Mostrar();
    }
}
