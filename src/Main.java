/*SobreCarga*/
/*Ejemplo 1*/
/*public class Main {
    public int atri1;
    public String atri2;

    public Main(int atri1, String atri2){
        this.atri1 = atri1;
        this.atri2 = atri2;
    }

    public void caminar(int atri1){
        System.out.println("La distancia es: " + atri1 + "\n");
    }
    public void caminar(String atri2){
        System.out.println("Por lo que esta: " + atri2 + "\n");
    }
    public static void main(String[] args){
        Main ej1 = new Main(12,"Lejos");
        Main ej2 = new Main(6,"medio");
        Main ej3 = new Main(1,"cerca");

        ej1.caminar(12);
        ej1.caminar("Lejos");

    }
}*/
/*Ejemplo 2*/
/*public class Main {
    public String nombre;
    public int edad;
    public double precio;

    public Main(String nombre, int edad) {
        this.nombre = nombre;
        this.edad = edad;
    }

    public Main(double precio) {
        this.precio = precio;
    }
    public void imprimir(){
        System.out.print("mi nombre es " + nombre + " y tengo " + edad + " años  ");
    }

    public void imprimir(double pre){
        System.out.print("He ganado " + pre);
    }
    public static void main(String[] args) {
        System.out.println("Hello world!");

        Main persona1 = new Main("Juan", 25);
        Main persona2=new Main("Paco",26);
        persona1.imprimir(23);
        System.out.println("\n");
        persona2.imprimir(34);
    }
}*/
/*Ejemplo con producto */
/*
public class Main {
    public static void main(String[] args) {
        Producto pera = new Producto("Pera",0.1);
        Producto manzana = new Producto("Manzana",0.3);
        Producto sandia = new Producto("Sandia",1.2);
        System.out.println("Metodo sin parametros");
        pera.Imprimir();
        System.out.println("Metodo con dos parametros");
        manzana.Imprimir("Manzana",0.4);
        System.out.println("Metodo con tres parametros");
        manzana.Imprimir("Sandia",1.4,1);
    }
}
*/
/*Ejemplo operacion matematica*/
public class Main {
    public static void main(String[] args){
        OperacionesMatematicas sum1 = new OperacionesMatematicas(/*1, 2, 3, 1.2, 2.3*/);
        sum1.Suma(1,5);
        sum1.Suma(1,4,3);
        sum1.Suma(2.4,23.8);
    }
}

