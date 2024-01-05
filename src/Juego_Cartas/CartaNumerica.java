package Juego_Cartas;

public class CartaNumerica extends Carta{
    private int numero;
    private int vida;
    private double daño;
    public CartaNumerica(String nombre, int vida, double daño) {
        super(nombre);
        this.numero = numero;
        this.vida = vida;
        this.daño = daño;
    }
    public int getNumero(){
        return numero;
    }
    public void setNumero(int numero){
        this.numero = numero;
    }
    public int getVida() {
        return vida;
    }
    public void setVida(int vida) {
        this.vida = vida;
    }
    public double getDaño() {
        return daño;
    }
    public void setDaño(double daño) {
        this.daño = daño;
    }
    public void Jugar(String nombre, int vida, double daño){
        System.out.println("La carta " + getNombre() + " ha sido atacada");
        int intdan = (int) daño;

    }
    public void mostrarDescripcion(String nombre, int vida, double daño){
        System.out.println("Carta: " + getNombre());
        System.out.println("Vida: " + getVida());
        System.out.println("Daño: " + getDaño());
    }
}
