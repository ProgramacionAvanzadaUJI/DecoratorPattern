package vehiculo;

import extra.ConAireAcondicionado;
import extra.ConTechoSolar;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;
import static org.hamcrest.MatcherAssert.*;
import static org.hamcrest.core.Is.*;

public class FamiliarTest {
    @Test
    public void testFamiliar() {
        Vehiculo vehiculo = new Familiar(19000.0);
        vehiculo = new ConAireAcondicionado(vehiculo, 600.0);
        assertThat(vehiculo.getPrecio(), is(19600.0));
        vehiculo = new ConTechoSolar(vehiculo, 1000.0);
        assertThat(vehiculo.getPrecio(), is(20600.0));
        assertTrue(vehiculo.descripcion().contains("acondicionado"));
        assertTrue(vehiculo.descripcion().contains("solar"));
    }
}
