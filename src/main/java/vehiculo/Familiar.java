package vehiculo;

public class Familiar extends Vehiculo {
    public Familiar(double precio) {
        super(precio);
    }

    @Override
    public String descripcion() {
        return "Vehículo familiar";
    }
}