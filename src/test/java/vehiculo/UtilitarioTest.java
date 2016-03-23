package vehiculo;


import extra.ConAireAcondicionado;
import extra.ConPinturaMetalizada;
import org.junit.Test;

import static org.junit.Assert.*;
import static org.hamcrest.core.Is.*;

/**
 * Created by oscar on 23/03/16.
 */
public class UtilitarioTest {
    @Test
    public void testUtilitarioConAireAcondicinado() {
        Vehiculo vehiculo = new Utilitario(15000);
        vehiculo = new ConAireAcondicionado(vehiculo, 600);
        assertThat(vehiculo.getPrecio(), is(15600.0f));
    }

    @Test
    public void testUtilitarioConAireAcondicionadoPinturaMetalizada() {
        Vehiculo vehiculo = new Utilitario(15000);
        vehiculo = new ConAireAcondicionado(vehiculo, 600);
        assertThat(vehiculo.getPrecio(), is(15600.0f));
        vehiculo = new ConPinturaMetalizada(vehiculo, 600);
        assertThat(vehiculo.getPrecio(), is(16200.0f));
    }

    @Test
    public void testUtilitarioConPinturaMetalizadaAireAcondicionado() {
        Vehiculo vehiculo = new Utilitario(15000);
        vehiculo = new ConPinturaMetalizada(vehiculo, 600);
        assertThat(vehiculo.getPrecio(), is(15600.0f));
        vehiculo = new ConAireAcondicionado(vehiculo, 600);
        assertThat(vehiculo.getPrecio(), is(16200.0f));
    }
}
