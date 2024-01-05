package Juego_Cartas;

public class Autos {
    String modelo;
    String marca;
    String color;
    int anio;
    public Autos(String modelo, String marca, String color, int anio) {
        this.modelo = modelo;
        this.marca = marca;
        this.color = color;
        this.anio = anio;
    }
    public String getModelo() {
        return modelo;
    }
    public void setModelo(String modelo) {
        this.modelo = modelo;
    }
    public String getMarca() {
        return marca;
    }
    public void setMarca(String marca) {
        this.marca = marca;
    }
    public String getColor() {
        return color;
    }
    public void setColor(String color) {
        this.color = color;
    }
    public int getAnio() {
        return anio;
    }
    public void setAnio(int anio) {
        this.anio = anio;
    }
    public void imprimirDatos(){

        System.out.println("Año:"+getAnio()+", " +
                "Modelo:" + getModelo()+", Marca: " +getMarca()+", Color:"+getColor());

    }
}