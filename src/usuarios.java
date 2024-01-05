public class usuarios {
    public static void main(String[] args){
        Persona usuario1 = new Persona();
        Persona usuario2 = new Persona();
        usuario1.nombre = "David";
        usuario2.nombre = "Dilan";
        usuario1.setNumTarjetaBanco(12345678);
        usuario2.setNumTarjetaBanco(87654321);
        System.out.println("Hola, el nombre es " + usuario1.nombre);
        System.out.println("Num tarjeta de credito: " +  usuario1.getNumTarjetaBanco());
        System.out.println( );
        System.out.println("Hola, el nombre es " + usuario2.nombre);
        System.out.println("Num tarjeta de credito: " +  usuario2.getNumTarjetaBanco());

    }
}
