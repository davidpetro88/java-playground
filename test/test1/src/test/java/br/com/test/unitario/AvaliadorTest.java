package br.com.test.unitario;

import br.com.test.unitario.builder.CriadorDeLeilao;
import org.junit.After;
import org.junit.Before;
import org.junit.Test;

import java.util.List;

import static org.hamcrest.MatcherAssert.assertThat;
import static org.hamcrest.Matchers.equalTo;
import static org.hamcrest.Matchers.hasItems;
import static org.junit.Assert.assertEquals;

/**
 * Created by david on 29/12/16.
 */
public class AvaliadorTest {

    private Avaliador leiloeiro;
    private Usuario maria;
    private Usuario joao;
    private Usuario jose;

    @Before
    public void setUp() {
        this.leiloeiro = new Avaliador();
        this.joao = new Usuario("Joao");
        this.jose = new Usuario("José");
        this.maria = new Usuario("Maria");
    }

    @After
    public void finaliza() {
        System.out.println("fim");
    }


    @Test
    public void deveEntenderLancesEmOrdemCrescente() {
        leiloeiro.avalia(new CriadorDeLeilao().para("Playstation 3 Novo")
                .lance(maria, 250.0)
                .lance(joao, 300.0)
                .lance(jose, 400.0).constroi());

        // comparando a saida com o esperado
        double maiorEsperado = 400;
        double menorEsperado = 250;
        assertEquals(maiorEsperado, leiloeiro.getMaiorLance(), 0.0001);
        assertEquals(menorEsperado, leiloeiro.getMenorLance(), 0.0001);
        assertThat(leiloeiro.getMenorLance(), equalTo(menorEsperado));
    }

    @Test
    public void deveCalcularAMedia() {
        leiloeiro.avalia(new CriadorDeLeilao().para("Playstation 3 Novo")
                .lance(maria, 300.0)
                .lance(joao, 400.0)
                .lance(jose, 500.0).constroi());
        // comparando a saida com o esperado
        assertEquals(400, leiloeiro.getMedia(), 0.0001);
    }

    @Test
    public void deveEntenderLancesEmOrdemCrescenteComOutrosValores() {
        leiloeiro.avalia(new CriadorDeLeilao().para("Playstation 3 Novo")
                        .lance(maria, 1000.0)
                        .lance(joao, 2000.0)
                        .lance(jose, 3000.0).constroi());
        assertEquals(3000, leiloeiro.getMaiorLance(), 0.0001);
        assertEquals(1000, leiloeiro.getMenorLance(), 0.0001);
    }

    @Test
    public void deveEntenderLeilaoComApenasUmLance() {
        leiloeiro.avalia(new CriadorDeLeilao().para("Playstation 3 Novo").lance(joao, 200.0).constroi());
        // veja que não precisamos mais da palavra Assert!
        assertEquals(200, leiloeiro.getMaiorLance(), 0.0001);
        assertEquals(200, leiloeiro.getMenorLance(), 0.0001);
    }

    @Test
    public void deveEncontrarOsTresMaioresLances() {
        leiloeiro.avalia(new CriadorDeLeilao().para("Playstation 3 Novo")
                        .lance(joao, 100.0)
                        .lance(maria, 200.0)
                        .lance(joao, 300.0)
                        .lance(maria, 400.0)
                        .constroi());
        List<Lance> maiores = leiloeiro.getTresMaiores();

        // Junit AssertEqual
        assertEquals(3, maiores.size());
        assertEquals(400, maiores.get(0).getValor(), 0.00001);
        assertEquals(300, maiores.get(1).getValor(), 0.00001);
        assertEquals(200, maiores.get(2).getValor(), 0.00001);

        //Hamcrest assertThat
        assertThat(maiores, hasItems(
                new Lance(maria,400),
                new Lance(joao,300),
                new Lance(maria,200)
        ));
    }

    @Test
    public void deveEntenderLeilaoComLancesEmOrdemRandomica() {
        leiloeiro.avalia(new CriadorDeLeilao().para("Playstation 3 Novo")
                .lance(joao, 200.0)
                .lance(maria, 450.0)
                .lance(joao, 120.0)
                .lance(maria, 700.0)
                .lance(joao, 630.0)
                .lance(maria, 230.0)
                .constroi());

        assertEquals(700.0, leiloeiro.getMaiorLance(), 0.0001);
        assertEquals(120.0, leiloeiro.getMenorLance(), 0.0001);
    }

    @Test
    public void deveEntenderLeilaoComLancesEmOrdemDecrescente() {
        leiloeiro.avalia(new CriadorDeLeilao().para("Playstation 3 Novo")
                .lance(joao, 400.0)
                .lance(maria, 300.0)
                .lance(joao, 200.0)
                .lance(maria, 100.0)
                .constroi());

        assertEquals(400.0, leiloeiro.getMaiorLance(), 0.0001);
        assertEquals(100.0, leiloeiro.getMenorLance(), 0.0001);
    }

    @Test
    public void deveDevolverTodosLancesCasoNaoHajaNoMinimo3() {
        leiloeiro.avalia(new CriadorDeLeilao().para("Playstation 3 Novo")
                .lance(joao, 100.0)
                .lance(maria, 200.0)
                .constroi());

        List<Lance> maiores = leiloeiro.getTresMaiores();

        assertEquals(2, maiores.size());
        assertEquals(200, maiores.get(0).getValor(), 0.00001);
        assertEquals(100, maiores.get(1).getValor(), 0.00001);
    }

    @Test(expected = RuntimeException.class)
    public void deveDevolverListaVaziaCasoNaoHajaLances() {
        leiloeiro.avalia(new Leilao("Playstation 3 Novo"));
        List<Lance> maiores = leiloeiro.getTresMaiores();
        assertEquals(0, maiores.size());
    }
}