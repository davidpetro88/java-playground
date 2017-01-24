package br.com.test.unitario;

import org.junit.Test;

/**
 * Created by david on 30/12/16.
 */
public class LanceTest {
    @Test(expected=IllegalArgumentException.class)
    public void deveRecusarLancesComValorDeZero() {
        new Lance(new Usuario("John Doe"), 0);
    }

    @Test(expected=IllegalArgumentException.class)
    public void deveRecusarLancesComValorNegativo() {
        new Lance(new Usuario("John Doe"), -10);
    }
}
