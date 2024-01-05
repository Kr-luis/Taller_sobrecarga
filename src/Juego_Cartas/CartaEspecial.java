package Juego_Cartas;

public class CartaEspecial extends CartaNumerica{
    private float mult;
    private int cura;
    public CartaEspecial(String nombre, int vida, float daño, int cura) {
        super(nombre, vida, daño);
        this.mult = mult;
    }
    public float getMult() {
        return mult;
    }
    public void setMult(float mult) {
        this.mult = mult;
    }
    public void activarEfectoEspecialcura(){
        System.out.println("Activando metodo especial");
        int nvida = getVida() + 20;

    }
    public void activarEfectoEspecialmult(){
        System.out.println("Activando metodo especial");

    }


    public int getCura() {
        return cura;
    }

    public void setCura(int cura) {
        this.cura = cura;
    }

}
