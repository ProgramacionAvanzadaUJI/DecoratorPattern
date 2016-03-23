package extra;

import vehiculo.Vehiculo;

/**
 * Created by oscar on 23/03/16.
 */
public class ConPinturaMetalizada extends Extra {
    public ConPinturaMetalizada(Vehiculo vehiculo, float precioExtra) {
        super(vehiculo, precioExtra);
    }

    @Override
    public String descripcion() {
        return descripcionVehiculo() + ", con pintura metalizada";
    }
}