public class Cliente {
    public int edad;
    public String cedula;
    public String nombre;
    public Cliente(int _edad, String _cedula, String _nombre){
        cedula = _cedula;
        nombre = _nombre;
        edad = _edad;
    }
    public void Saludar(){
        System.out.println("Hola "+ nombre);
    }
    public static void main(String[] args){
        Cliente cliente1 = new Cliente(20,"1750833681","Luis");
        Cliente cliente2 = new Cliente(30,"1783457364","Eduardo");
        Cliente cliente3 = new Cliente(40,"1861944792","Mateo");
        cliente1.Saludar();
        System.out.println("\n--*--*--*--*--*--*--*--"+"\nEdad: "+cliente1.edad+"\ncedula: "+cliente1.cedula+"\n--*--*--*--*--*--*--*--");
        cliente2.Saludar();
        System.out.println("Edad: "+cliente2.edad+"\ncedula: "+cliente1.cedula+"\n--*--*--*--*--*--*--*--");
        cliente3.Saludar();
        System.out.println("Edad: "+cliente3.edad+"\ncedula: "+cliente1.cedula+"\n--*--*--*--*--*--*--*--");
    }
}

