package vehiculo;

public abstract class Vehiculo {
    private double precio;

    public Vehiculo(double precio) {
        this.precio = precio;
    }

    public double getPrecio() {
        return precio;
    }

    public abstract String descripcion();
}
