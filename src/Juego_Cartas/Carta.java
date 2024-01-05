package Juego_Cartas;
import java.util.Random;
import java.util.Scanner;
public class Carta {
    private String nombre;
    public Carta(String nombre){
        this.nombre = nombre;
    }

    public String getNombre() {
        return nombre;
    }
    public void setNombre(String nombre){
        this.nombre = nombre;
    }
    public void Jugar(){
    }
    public void mostrarDescripcion(){
        System.out.println("Empezando el jogo...");
        System.out.println("Jogo iniciacdo... ;)");
    }
    public static void main(String[] args) {
        Scanner tirada = new Scanner(System.in);
        CartaNumerica carta1 = new CartaNumerica("Jefe Final", 500, 15);
        CartaNumerica carta2 = new CartaNumerica("Hechicero", 300, 20);
        carta1.mostrarDescripcion();
        System.out.println();
        carta1.mostrarDescripcion("Jefe Final", 500, 15);
        carta2.mostrarDescripcion("Hechicero", 300, 20);
        carta1.setVida(500);
        while (carta1.getVida() != 0) {
            System.out.println("Ingrese su numero");
            int numero = tirada.nextInt();
            switch (numero) {
                case 1:
                    carta1.Jugar("Jefe Final", 500, 15);
                    carta1.setVida((int) ((int) carta1.getVida() - carta2.getDaño()));
                    carta1.mostrarDescripcion("Jefe Final", carta1.getVida(), carta1.getDaño());
                    break;
                case 2:
                    carta2.Jugar("Hechicero", 300, 20);
                    carta2.setVida((int) ((int) carta2.getVida() - carta1.getDaño()));
                    carta2.mostrarDescripcion("Hechicero", carta2.getVida(), 20);
                    break;
                case 3:
                    System.out.println("El hechicero se esta curando");
                    carta2.setVida((int) ((int) carta2.getVida() + 20));
                    carta2.mostrarDescripcion("Hechicero", carta2.getVida(), 20);
                    break;
                case 4:
                    System.out.println("El Jefe final incrementa su daño");
                    carta1.setDaño((double) ((double) carta1.getDaño() * 1.5));
                    carta1.mostrarDescripcion("Jefe Final", carta1.getVida(), carta1.getDaño());
                    break;
                case 5:
                    carta1.Jugar("Jefe Final", 500, 15);
                    carta1.setVida((int) ((int) carta1.getVida() - carta2.getDaño()));
                    carta1.mostrarDescripcion("Jefe Final", carta1.getVida(), carta1.getDaño());

                    break;
                default:
                    System.out.println("El número ingresado no está en el rango del 1 al 5");
                    break;
            }
        }
        System.out.println("Has gandado :D");
    }}