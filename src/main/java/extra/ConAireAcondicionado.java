package extra;

import vehiculo.Vehiculo;

public class ConAireAcondicionado extends Extra {
    public ConAireAcondicionado(Vehiculo vehiculo, double precioExtra) {
        super(vehiculo, precioExtra);
    }

    @Override
    public String descripcion() {
        return super.descripcion() + ", con aire acondicionado";
    }
}