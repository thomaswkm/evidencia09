import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class CalculadoraTest {

    @Test
    void sumaTest(){
        int suma = new Calculadora().calcularSuma(2,2);
        assertEquals(4,suma,"La suma no coincide");
    }

}