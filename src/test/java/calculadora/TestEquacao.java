package calculadora;

import equacao.Equacao;
import static org.junit.jupiter.api.Assertions.assertEquals;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.CsvSource;

class TestEquacao {

    /**
     * Equação: 2x^2 + x - 3 = 0 Delta: b^2 - 4ac = 1^2 - 4(2)(-3) = 1 + 24 = 25
     * Raízes: x = (-b ± √delta) / 2a x1 = (-1 + 5) / 4 = 1 x2 = (-1 - 5) / 4 =
     * -1.5
     */

    @ParameterizedTest
    @CsvSource({
        "2.0,1.0,-3.0,1.0,-1.5",
        "1.0,14.0,49.0,-7.0,-7.0",
        "1.0,-5.0,6.0,3.0,2.0"
    })
    void testCalculoDeRaizes(double a, double b, double c, double x1Esperado, double x2Esperado) {
        Equacao equacao = new Equacao(a, b, c);

        double x1Feito = equacao.getRaiz1();
        double x2Feito = equacao.getRaiz2();

        assertEquals(x1Esperado, x1Feito, 0.0001);
        assertEquals(x2Esperado, x2Feito, 0.0001);
    }
}
