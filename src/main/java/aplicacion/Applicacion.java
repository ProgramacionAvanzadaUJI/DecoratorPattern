package aplicacion;

import extra.ConAireAcondicionado;
import extra.ConPinturaMetalizada;
import extra.ConTechoSolar;
import vehiculo.Familiar;
import vehiculo.Utilitario;
import vehiculo.Vehiculo;

import java.util.Scanner;

public class Applicacion {
    private Vehiculo vehiculo;
    private final Scanner teclado = new Scanner(System.in);
    public void ejecuta() {
        seleccionaVehiculo();
        anyadeExtras();
        despedida();
    }

    private void seleccionaVehiculo() {
        muestraListaVehiculos();
        pideSeleccionVehiculo();
    }

    private void pideSeleccionVehiculo() {
        EnumeracionVehiculo opcion;
        opcion = EnumeracionVehiculo.getOpcion(teclado.nextInt());
        switch (opcion) {
            case FAMILIAR:
                vehiculo = new Familiar(opcion.getPrecio());
                break;
            case UTILITARIO:
                vehiculo = new Utilitario(opcion.getPrecio());
                break;
        }
    }

    private void muestraListaVehiculos() {
        System.out.println("Selecciona un vehículo de la lista:");
        System.out.println(EnumeracionVehiculo.getMenu());
    }

    private void anyadeExtras() {
        EnumeracionExtra extra;
        do {
            muestraListaExtras();
            extra = pideSeleccion();
            anyadeExtra(extra);
        } while(extra != EnumeracionExtra.SALIR);
    }

    private void anyadeExtra(final EnumeracionExtra extra) {
        if(extra != EnumeracionExtra.SALIR) {
            switch (extra) {
                case TECHO_SOLAR:
                    vehiculo = new ConTechoSolar(vehiculo, extra.getPrecio());
                    break;
                case AIRE_ACONDICIONADO:
                    vehiculo = new ConAireAcondicionado(vehiculo, extra.getPrecio());
                    break;
                case PINTURA_METALIZADA:
                    vehiculo = new ConPinturaMetalizada(vehiculo, extra.getPrecio());
                    break;
            }
        }
    }

    private EnumeracionExtra pideSeleccion() {
        int opcion = teclado.nextInt();
        return EnumeracionExtra.getOpcion(opcion);
    }

    private void muestraListaExtras() {
        System.out.println("Selecciona un extra de la lista:");
        System.out.println(EnumeracionExtra.getMenu());
    }

    private void despedida() {
        System.out.println(vehiculo.descripcion() + " " + vehiculo.getPrecio() + " euros.");
    }
}
