public class Producto {
    public String nombre;
    public double precio;
    public int cantidad;

    public Producto (){

    }
    public Producto(String nombre, double precio){
        this.nombre = nombre;
        this.precio = precio;
    }
    public Producto(String nombre, double precio, int cantidad){
        this.nombre = nombre;
        this.precio = precio;
        this.cantidad = cantidad;
    }

    public void Imprimir(){
        System.out.println("Nada");
    }
    public void Imprimir(String nombre, double precio){
        System.out.println("Nombre: " + nombre );
        System.out.println("Precio: " + precio);
    }
    public void Imprimir(String nombre, double precio, int cantidad){
        System.out.println("Nombre  Precio  Cantidad");
        System.out.println(nombre+"     "+precio+"     "+cantidad);
    }
}
