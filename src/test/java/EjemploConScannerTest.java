import org.junit.jupiter.api.Test;
import java.io.ByteArrayInputStream;
import java.util.Scanner;
import static org.junit.jupiter.api.Assertions.assertEquals;

public class EjemploConScannerTest {

    @Test
    public void testSegundaForma() {
        // Creamos un objeto EjemploConScanner
        EjemploConScanner ejemplo = new EjemploConScanner();

        // Creamos una entrada simulada para el Scanner
        String entrada = "2\n5\n"; // "2" y "5" son los valores de a y b
        ByteArrayInputStream inputStream = new ByteArrayInputStream(entrada.getBytes());
        // Cambiamos el System.in para utilizar nuestra entrada simulada
        System.setIn(inputStream);

        // Comprobamos que el resultado sea el esperado
        assertEquals(14, ejemplo.segundaForma());
    }
}