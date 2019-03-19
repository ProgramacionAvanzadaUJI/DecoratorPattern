package extra;

import vehiculo.Vehiculo;

/**
 * Created by oscar on 23/03/16.
 */
public abstract class Extra extends Vehiculo {
    private Vehiculo vehiculo;

    public Extra(Vehiculo vehiculo, float precioExtra) {
        super(precioExtra);
        this.vehiculo = vehiculo;
    }

    @Override
    public float getPrecio() {
        return vehiculo.getPrecio() + super.getPrecio();
    }

    @Override
    public String descripcion() {
        return vehiculo.descripcion();
    }
}