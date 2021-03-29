package vehiculo;


import extra.ConAireAcondicionado;
import extra.ConPinturaMetalizada;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;
import static org.hamcrest.MatcherAssert.*;
import static org.hamcrest.core.Is.*;


public class UtilitarioTest {
    @Test
    public void testUtilitarioConAireAcondicinado() {
        Vehiculo vehiculo = new Utilitario(15000.0);
        vehiculo = new ConAireAcondicionado(vehiculo, 600);
        assertThat(vehiculo.getPrecio(), is(15600.0));
        assertTrue(vehiculo.descripcion().contains("acondicionado"));
    }

    @Test
    public void testUtilitarioConAireAcondicionadoPinturaMetalizada() {
        Vehiculo vehiculo = new Utilitario(15000.0);
        vehiculo = new ConAireAcondicionado(vehiculo, 600.0);
        assertThat(vehiculo.getPrecio(), is(15600.0));
        vehiculo = new ConPinturaMetalizada(vehiculo, 600.0);
        assertThat(vehiculo.getPrecio(), is(16200.0));
        assertTrue(vehiculo.descripcion().contains("metalizada"));
        assertTrue(vehiculo.descripcion().contains("acondicionado"));
    }

    @Test
    public void testUtilitarioConPinturaMetalizadaAireAcondicionado() {
        Vehiculo vehiculo = new Utilitario(15000.0);
        vehiculo = new ConPinturaMetalizada(vehiculo, 600.0);
        assertThat(vehiculo.getPrecio(), is(15600.0));
        vehiculo = new ConAireAcondicionado(vehiculo, 600.0);
        assertThat(vehiculo.getPrecio(), is(16200.0));
        assertTrue(vehiculo.descripcion().contains("acondicionado"));
        assertTrue(vehiculo.descripcion().contains("metalizada"));
    }
}
