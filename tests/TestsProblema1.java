import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

public class TestsProblema1 {

    @Test
    public void numerosConcatenadosTest() {
        String numeros = null;




    }

    @Test
    public void multiploDeTresTest() {
        String cadena = null;

        String expected = "Fizz";
        String actual = Problema1.cadenaDeNumeros();

        Assertions.assertEquals(expected, actual);
    }

    @Test
    public void multiploDeCincoTest() {
        int n = 0;
        String cadena = null;

        String expected = "Buzz";
        String actual = Problema1.cadenaDeNumeros();

        Assertions.assertEquals(expected, actual);
    }



}
