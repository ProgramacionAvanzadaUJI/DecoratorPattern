package extra;

import vehiculo.Vehiculo;

public class ConPinturaMetalizada extends Extra {
    public ConPinturaMetalizada(Vehiculo vehiculo, double precioExtra) {
        super(vehiculo, precioExtra);
    }

    @Override
    public String descripcion() {
        return super.descripcion() + ", con pintura metalizada";
    }
}