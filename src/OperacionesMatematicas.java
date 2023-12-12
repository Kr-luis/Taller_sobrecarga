public class OperacionesMatematicas {
    public int ent1;
    public int ent2;
    public int ent3;
    public double dec1;
    public double dec2;
    public double suma;

    /*public OperacionesMatematicas(int ent1, int ent2, int ent3, double dec1, double dec2){
        this.ent1 = ent1;
        this.ent2 = ent2;
        this.ent3 = ent3;
        this.dec1 = dec1;
        this.dec2 = dec2;
    }*/
    public void Suma(int ent1, int ent2){
        suma= ent1 + ent2;
        System.out.println("Suma de dos enteros: " + suma);
    }
    public void Suma(int ent1, int ent2, int ent3){
        suma= ent1 + ent2 + ent3 + 5;
        System.out.println("Suma de tres enteros: " + suma);
    }
    public void Suma(double dec1, double dec2){
        suma= dec1 + dec2 + 2;
        System.out.println("Suma de dos flotantes: " + suma);
    }

}
