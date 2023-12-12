/*Se creo una clase llmada Celular con los atributos marca, precio y modelo*/
public class Celular {
    private String marca;
    private int precio;
    private String modelo;
    /*Se creo un metodo constructor para inicalizar los atributos*/
    public Celular(String marca, int precio, String modelo) {
        this.marca = marca;
        this.precio = precio;
        this.modelo = modelo;
    }
    /*Se crea un metodo para la clase Celular este se llama Descripcion*/
    public void Descripcion(){
        System.out.println("Este celular es de la marca " + this.marca + " tiene un precio de " + this.precio + " el modelo es " + this.modelo);

    }
}
