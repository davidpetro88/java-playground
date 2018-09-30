package com.forttiori.api;

import org.junit.Test;

import static junit.framework.TestCase.assertNotNull;

public class TesteModelTest {

    @Test
    public void deveriaRetornar(){
        assertNotNull(TesteModel.builder().build());
    }
}
