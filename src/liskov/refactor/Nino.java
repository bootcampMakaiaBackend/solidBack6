package liskov.refactor;

public class Nino extends Persona{

    private Adulto adulto;

    public Nino(String nombre, String apellido, Adulto adulto) {
        super(nombre, apellido);
        this.adulto = adulto;
    }

    public Adulto getAdulto() {
        return adulto;
    }
}
