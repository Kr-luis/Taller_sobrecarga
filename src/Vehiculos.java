public class Vehiculos {
    public void acelerar(){
        System.out.println("Acelerando de manera generica");
    }
}
class Coche extends Vehiculos{
    @Override
    public void acelerar(){
        System.out.println("rum urm");
    }
}
class bicicleta extends Vehiculos{
    @Override
    public void acelerar(){
        System.out.println("hechen pajaa");
    }
}
class Avion extends Vehiculos{
    @Override
    public void acelerar(){
        System.out.println("iiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaa ");
    }
}

