package vehiculo;

/**
 * Created by oscar on 23/03/16.
 */
public class Familiar extends Vehiculo {
    public Familiar(float precio) {
        super(precio);
    }

    @Override
    public String descripcion() {
        return "Vehículo familiar";
    }
}