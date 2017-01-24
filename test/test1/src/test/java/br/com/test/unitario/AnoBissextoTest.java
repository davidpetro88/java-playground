package br.com.test.unitario;

import org.junit.AfterClass;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

/**
 * Created by david on 30/12/16.
 */
public class AnoBissextoTest {
    private AnoBissexto anoBissexto;

    @Before
    public void setUp() {
        this.anoBissexto = new AnoBissexto();
    }

    @BeforeClass
    public static void testandoBeforeClass() {
        System.out.println("before class");
    }

    @AfterClass
    public static void testandoAfterClass() {
        System.out.println("after class");
    }

    @Test
    public void deveRetornarAnoBissexto() {
        assertEquals(true, anoBissexto.getAnoBissexto(2016));
        assertEquals(true, anoBissexto.getAnoBissexto(2012));
    }

    @Test
    public void naoDeveRetornarAnoBissexto() {
        assertEquals(false, anoBissexto.getAnoBissexto(2015));
        assertEquals(false, anoBissexto.getAnoBissexto(2011));
    }
}
