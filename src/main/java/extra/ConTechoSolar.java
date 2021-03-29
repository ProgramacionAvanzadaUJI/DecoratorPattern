package extra;

import vehiculo.Vehiculo;

public class ConTechoSolar extends Extra {
    public ConTechoSolar(Vehiculo vehiculo, double precioExtra) {
        super(vehiculo, precioExtra);
    }

    @Override
    public String descripcion() {
        return super.descripcion() + ", con techo solar";
    }
}
