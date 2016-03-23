package vehiculo;

/**
 * Created by oscar on 23/03/16.
 */
public abstract class Vehiculo {
    private float precio;

    public Vehiculo(float precio) {
        this.precio = precio;
    }

    public float getPrecio() {
        return precio;
    }

    public abstract String descripcion();
}
