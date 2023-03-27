package aplicacion;

public enum EnumeracionExtra {
    AIRE_ACONDICIONADO("Aire acondicionado", 600),
    PINTURA_METALIZADA("Pintura metalizada", 600),
    TECHO_SOLAR("Techo solar", 1000),
    SALIR("Salir", 0);

    private final String descripcion;
    private final double precio;

    private EnumeracionExtra(String descripcion, double precio) {
        this.descripcion = descripcion;
        this.precio = precio;
    }

    public static EnumeracionExtra getOpcion(int posicion) {
        return values()[posicion];
    }

    public static String getMenu() {
        StringBuilder sb = new StringBuilder();
        for(EnumeracionExtra opcion: EnumeracionExtra.values()) {
            sb.append(opcion.ordinal());
            sb.append(".- ");
            sb.append(opcion.descripcion);
            sb.append("\n");
        }
        return sb.toString();
    }

    double getPrecio() {
        return precio;
    }

}
