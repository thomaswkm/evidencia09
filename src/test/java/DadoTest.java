
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class DadoTest {

    @Test
    public void lanzarDadoTest() {
        int caraSuperior = new Dado().lanzarDado();
        assertTrue(caraSuperior >= 0 && caraSuperior <= 6, "Valor fuera de rango válido.");
    }

    @Test
    public void testGetSetCaraSuperior() {
        Dado dado = new Dado();
        dado.setCaraSuperior(3);
        int caraSuperior = dado.getCaraSuperior();
        assertEquals(3, caraSuperior, "La cara superior del dado no coincide.");
    }

}