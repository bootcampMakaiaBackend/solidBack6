package liskov;

public class Persona {

    private String nombre;
    private String apellidos;
    private String dni;
    private String tarjetaCredito;

    public Persona(String nombre, String apellidos, String dni, String tarjetaCredito) {
        this.nombre = nombre;
        this.apellidos = apellidos;
        this.dni = dni;
        this.tarjetaCredito = tarjetaCredito;
    }

    public String getNombre() {
        return nombre;
    }

    public String getApellidos() {
        return apellidos;
    }

    public void pagar() {
        System.out.println(" persona pagando.");
    }

}
