package vehiculo;

/**
 * Created by oscar on 23/03/16.
 */
public class Utilitario extends Vehiculo {
    public Utilitario(float precio) {
        super(precio);
    }

    @Override
    public String descripcion() {
        return "Vehículo utilitario";
    }
}