package vehiculo;

import extra.ConAireAcondicionado;
import extra.ConTechoSolar;
import org.junit.Test;

import static org.junit.Assert.*;
import static org.hamcrest.core.Is.*;

/**
 * Created by oscar on 23/03/16.
 */
public class FamiliarTest {
    @Test
    public void testFamiliar() {
        Vehiculo vehiculo = new Familiar(19000);
        vehiculo = new ConAireAcondicionado(vehiculo, 600);
        assertThat(vehiculo.getPrecio(), is(19600.0f));
        vehiculo = new ConTechoSolar(vehiculo, 1000);
        assertThat(vehiculo.getPrecio(), is(20600.0f));
    }
}
