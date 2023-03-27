package aplicacion;

public enum EnumeracionVehiculo {
    FAMILIAR("Coche familiar", 19000),
    UTILITARIO("Utilitario", 15000);

    private final String descripcion;
    private final double precio;

    private EnumeracionVehiculo(String descripcion, double precio) {
        this.descripcion = descripcion;
        this.precio = precio;
    }

    public static EnumeracionVehiculo getOpcion(int posicion) {
        return values()[posicion];
    }

    public static String getMenu() {
        StringBuilder sb = new StringBuilder();
        for(EnumeracionVehiculo opcion: EnumeracionVehiculo.values()) {
            sb.append(opcion.ordinal());
            sb.append(".- ");
            sb.append(opcion.descripcion);
            sb.append("\n");
        }
        return sb.toString();
    }

    public double getPrecio() {
        return precio;
    }
}
