public class Persona {
    public int edad;
    public String nombre;
    public String dni;
    public Persona(String nombre, String dni, int edad){
        this.nombre = nombre;
        this.dni = dni;
        this.edad = edad;
    }
    public void mostrarInformacion(){
        System.out.println("Nombre: " + nombre);
        System.out.println("DNI: " +dni);
        System.out.println("Edad: " +edad);

    }
    public static class Estudiante extends Persona{
        private int matricula;
        private String carrera;

        public Estudiante(String nombre, String dni, int edad, int matricula, String carrera){
            super(nombre,dni,edad);
            this.matricula = matricula;
            this.carrera = carrera;
        }
        @Override
        public void mostrarInformacion (){
            super.mostrarInformacion();
            System.out.println("Matricula: "+ matricula);
            System.out.println("Carrera: "+ carrera);
        }
    }
    public static class Profesor extends Persona{
        private int codigoempleado;
        private String materiaasignada;

        public Profesor(String nombre, String dni, int edad, int matricula, String carrera){
            super(nombre,dni,edad);
            this.codigoempleado = codigoempleado;
            this.materiaasignada = materiaasignada;
        }
        @Override
        public void mostrarInformacion (){
            super.mostrarInformacion();
            System.out.println("codigoempleado: "+ codigoempleado);
            System.out.println("materiaasignada: "+ materiaasignada);
        }
    }
    public static class Administrativo extends Persona{
        private int codigoempleado;
        private String departamento;

        public Administrativo(String nombre, String dni, int edad, int matricula, String carrera){
            super(nombre,dni,edad);
            this.codigoempleado = codigoempleado;
            this.departamento = departamento;
        }
        @Override
        public void mostrarInformacion (){
            super.mostrarInformacion();
            System.out.println("departamento: "+ departamento);
            System.out.println("codigoempleado: "+ codigoempleado);
        }
    }
    public static void main(String[] args){
        Estudiante estudiante =new Estudiante("Juan","1242354", 23, 3,"FEF");
        Profesor profesor = new Profesor("Juan","21323223", 32, 4,"234");
        Administrativo administrativo = new Administrativo("Juan","1242354", 23, 3,"FEF");
        System.out.println("Estudiante");
        estudiante.mostrarInformacion();
        System.out.println("Profesor");
        profesor.mostrarInformacion();
        System.out.println("Administrativo");
        administrativo.mostrarInformacion();
    }
}







