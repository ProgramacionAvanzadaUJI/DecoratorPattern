package extra;

import vehiculo.Vehiculo;

public abstract class Extra extends Vehiculo {
    private Vehiculo vehiculo;

    public Extra(Vehiculo vehiculo, double precioExtra) {
        super(precioExtra);
        this.vehiculo = vehiculo;
    }

    @Override
    public double getPrecio() {
        return vehiculo.getPrecio() + super.getPrecio();
    }

    @Override
    public String descripcion() {
        return vehiculo.descripcion();
    }
}