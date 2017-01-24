package br.com.test.unitario;

import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.assertFalse;
import static org.junit.Assert.assertTrue;

/**
 * Created by david on 29/12/16.
 */
public class PalindromoTest {
    private Palindromo palindromo;

    @Before
    public void setUp(){
        this.palindromo = new Palindromo();
    }

    @Test
    public void deveIdentificarPalindromoEFiltrarCaracteresInvalidos() {
        assertTrue(palindromo.ehPalindromo("Socorram-me subi no onibus em Marrocos"));
    }

    @Test
    public void deveIdentificarPalindromo() {
        assertTrue(palindromo.ehPalindromo("Anotaram a data da maratona"));
    }

    @Test
    public void deveIdentificarSeNaoEhPalindromo() {
        assertFalse(palindromo.ehPalindromo("E preciso amar as pessoas como se nao houvesse amanha"));
    }
}