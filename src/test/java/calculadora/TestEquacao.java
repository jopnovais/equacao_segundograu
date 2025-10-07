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
    @Test
    void testGetDeltaMaiorQueZero() {
        Equacao equacao = new Equacao(2.0, 1.0, -3.0);
        double retornoEsperado = 25.0;
        double retornoFeito = equacao.getDelta();
        assertEquals(retornoEsperado, retornoFeito, 0.0001);
    }

    @Test
    void testGetRaizesQuandoDeltaMaiorQueZero() {
        Equacao equacao = new Equacao(2.0, 1.0, -3.0);

        double retornoEsperado1 = 1.0;
        double retornoFeito1 = equacao.getRaiz1();

        double retornoEsperado2 = -1.5;
        double retornoFeito2 = equacao.getRaiz2();

        assertEquals(retornoEsperado1, retornoFeito1, 0.0001);
        assertEquals(retornoEsperado2, retornoFeito2, 0.0001);
    }

    /**
     * Equação: x^2 + 14x + 49 = 0 Delta: 14^2 - 4(1)(49) = 196 - 196 = 0
     * Raízes: x = -14 / 2 = -7
     */
    @Test
    void testGetDeltaIgualZero() {
        Equacao equacao = new Equacao(1.0, 14.0, 49.0);
        double retornoEsperado = 0.0;
        double retornoFeito = equacao.getDelta();
        assertEquals(retornoEsperado, retornoFeito, 0.0001);
    }

    @Test
    void testGetRaizesIguaisQuandoDeltaIgualZero() {
        Equacao equacao = new Equacao(1.0, 14.0, 49.0);
        double retornoEsperado = -7.0;
        double retornoFeito1 = equacao.getRaiz1();
        double retornoFeito2 = equacao.getRaiz2();
        assertEquals(retornoEsperado, retornoFeito1, 0.0001);
        assertEquals(retornoEsperado, retornoFeito2, 0.0001);
    }

    /**
     * Equação: x^2 + x + 1 = 0 Delta: 1^2 - 4(1)(1) = 1 - 4 = -3 Raízes: Não
     * existem raízes reais (NaN)
     */
    @Test
    void testGetDeltaMenorQueZero() {
        Equacao equacao = new Equacao(1.0, 1.0, 1.0);
        double retornoEsperado = -3.0;
        double retornoFeito = equacao.getDelta();
        assertEquals(retornoEsperado, retornoFeito, 0.0001);
    }

    @Test
    void testGetRaizesQuandoDeltaMenorQueZero() {
        Equacao equacao = new Equacao(1.0, 1.0, 1.0);
        double retornoEsperado = Double.NaN;
        double retornoFeito1 = equacao.getRaiz1();
        double retornoFeito2 = equacao.getRaiz2();
        assertEquals(retornoEsperado, retornoFeito1, 0.0001);
        assertEquals(retornoEsperado, retornoFeito2, 0.0001);
    }

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
