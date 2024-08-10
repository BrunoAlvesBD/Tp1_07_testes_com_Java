import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

public class retanguloTest {

   /* @Test
    public void retanguloAreaTest() {
        double esperado = 10;

        Retangulo retangulo = new Retangulo();
        double resultado = retangulo.RetanguloArea(2, 5);

        Assertions.assertEquals(esperado, resultado);
    }
*/
    @Test
    public void retanguloPerimetroTest() {
        double esperado = 10;

        Retangulo retangulo = new Retangulo();
        double resultado = retangulo.RetanguloPerimetro(2, 3);

        Assertions.assertEquals(esperado, resultado);
    }
}
