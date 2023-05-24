import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class JuegoTest {

    @Test
    void entregarResultadoPartida() {
        Dado d1 = new Dado();
        Dado d2 = new Dado();
        d1.setCaraSuperior(3);
        d2.setCaraSuperior(4);
        int resultado = d1.getCaraSuperior() + d2.getCaraSuperior();
        assertEquals(7,resultado,"La suma no coincide");
    }
}