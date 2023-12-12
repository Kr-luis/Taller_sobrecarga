import java.util.HashMap;
/*Clase Mortal "Nombre del juego"*/
public class Mortal {
    public String nombre;
    public String ataque;
    public int vida;
    public String clase;
    /*Metodo constructor para inicializar variables*/
    public  Mortal(String _nombre,String _ataque, int _vida, String _clase){
        nombre = _nombre;
        ataque = _ataque;
        vida = _vida;
        clase = _clase;
    }
    /*Metodos para saber de la historia y descripcion de cada objeto*/
    public void Descripcion(){
        System.out.println("\n*-*-*-*-*-*-*-*-*"+"\n"+nombre + "\nAtaque: "
                +ataque+"\nVida: "+vida+"\nClase: "+clase+"\n*-*-*-*-*-*-*-*-*");
    }
    public void Historia(){
        System.out.println("Esta historia trata sobre una guerra entre clanes donde mandan a sus mejores peleadores a combatir por" +
                "\nel honor de su clan o morir en el intento\n");
    }
/*Main en donde se puede crear objetos y llamar metodos*/
    public static void main(String[] args){
        Mortal personaje1 = new Mortal("Kreitos", "puños de fuego",200,"fuego");
        Mortal personaje2 = new Mortal("Zata", "congelacion",250,"hielo");
        Mortal personaje3 = new Mortal("Kik-O", "rafaga",300,"fisico");
        personaje3.Historia();
        personaje1.Descripcion();
        personaje2.Descripcion();
        personaje3.Descripcion();
    }
}
