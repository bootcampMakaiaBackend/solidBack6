package liskov;

public class Nino extends Persona{

    private String tarjetaIdentidad;

    public Nino(String nombre, String apellidos, String tarjetaIdentidad) {
        super( nombre, apellidos, null, null);
        this.tarjetaIdentidad = tarjetaIdentidad;
    }

}
