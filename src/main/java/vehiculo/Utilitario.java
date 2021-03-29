package vehiculo;

public class Utilitario extends Vehiculo {
    public Utilitario(double precio) {
        super(precio);
    }

    @Override
    public String descripcion() {
        return "Vehículo utilitario";
    }
}