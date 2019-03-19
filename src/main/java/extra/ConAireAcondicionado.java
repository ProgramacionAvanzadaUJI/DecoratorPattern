package extra;

import vehiculo.Vehiculo;

/**
 * Created by oscar on 23/03/16.
 */
public class ConAireAcondicionado extends Extra {
    public ConAireAcondicionado(Vehiculo vehiculo, float precioExtra) {
        super(vehiculo, precioExtra);
    }

    @Override
    public String descripcion() {
        return super.descripcion() + ", con aire acondicionado";
    }
}