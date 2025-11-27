package gvaCEED;

import org.junit.jupiter.api.Test;
import java.io.ByteArrayOutputStream;
import java.io.PrintStream;

import static org.junit.jupiter.api.Assertions.*;

class DibujarLetraUTest {

    @Test
    void testDibuixU() {
        // Captura la sortida de consola
        ByteArrayOutputStream output = new ByteArrayOutputStream();
        PrintStream originalOut = System.out;
        System.setOut(new PrintStream(output));

        // Executa el main
        DibujarLetraU.main(new String[]{});

        // Restaura System.out
        System.setOut(originalOut);

        String resultat = output.toString().replace("\r", "");

        String esperat =
                "*   *\n" +
                "*   *\n" +
                "*   *\n" +
                "*   *\n" +
                "*   *\n" +
                "*   *\n" +
                " ****\n";

        assertEquals(esperat, resultat);
    }
}

