public class Empleado {
    private final String dni;
    private final String nombre;
    private final String apellido;
    private float salarioMensual;

    private Empleado() {
        this.dni = "";
        this.nombre = "";
        this.apellido = "";
        this.salarioMensual = 0;
    }

    public Empleado(String dni, String nombre, String apellido, float salarioMensual) {
        this.dni = dni;
        this.nombre = nombre;
        this.apellido = apellido;
        this.salarioMensual = salarioMensual;
    }

    public float getAnualidad(){
        float anio = this.salarioMensual*13;
        System.out.println("La anualidad es de  " +anio);
        return anio;
    }

    public void aumentarSalario(float porcentaje){
        porcentaje = porcentaje/100 + 1;
        this.salarioMensual = this.salarioMensual * porcentaje;
    }

    public void getEmpleado(){
        System.out.println(this.dni);
        System.out.println(this.nombre);
        System.out.println(this.apellido);
        System.out.println(this.salarioMensual);
    }

}
