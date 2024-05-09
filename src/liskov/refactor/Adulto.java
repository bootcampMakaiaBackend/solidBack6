package liskov.refactor;

public class Adulto extends Persona {
    private String cedula;
    private String tarjetaCredito;

    public Adulto(String nombre, String apellido, String cedula, String tarjetaCredito) {
        super(nombre, apellido);
        this.cedula = cedula;
        this.tarjetaCredito = tarjetaCredito;
    }

    public void pagar() {
        System.out.println(" Adulto pagando");
    }
}
