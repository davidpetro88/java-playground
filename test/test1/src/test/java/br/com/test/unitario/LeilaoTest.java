package br.com.test.unitario;

import br.com.test.unitario.matcher.LeilaoMatcher;
import br.com.test.unitario.builder.CriadorDeLeilao;
import org.junit.Before;
import org.junit.Test;

import static org.hamcrest.CoreMatchers.equalTo;
import static org.hamcrest.MatcherAssert.assertThat;
import static org.junit.Assert.assertEquals;

/**
 * Created by david on 30/12/16.
 */
public class LeilaoTest {

    private Usuario steveJobs;
    private Usuario steveWozniak;
    private Usuario billGates;

    @Before
    public void setUp(){
        this.steveJobs = new Usuario("Steve Jobs");
        this.steveWozniak = new Usuario("Steve Wozniak");
        this.billGates = new Usuario("Bill Gates");
    }

    @Test
    public void deveReceberUmLanceUtilizandoMeuMatcher() {
        Leilao leilao = new CriadorDeLeilao().para("Macbook Pro 15").constroi();
        assertEquals(0, leilao.getLances().size());

        Lance lance = new Lance(new Usuario("Steve Jobs"), 2000);
        leilao.propoe(lance);

        assertThat(leilao.getLances().size(), equalTo(1));
        assertThat(leilao, LeilaoMatcher.temUmLance(lance));
    }



    @Test
    public void deveReceberUmLance() {
        Leilao leilao = new CriadorDeLeilao().para("Macbook Pro 15").constroi();
        assertEquals(0, leilao.getLances().size());

        leilao.propoe(new Lance(steveJobs, 2000));

        assertEquals(1, leilao.getLances().size());
        assertEquals(2000, leilao.getLances().get(0).getValor(), 0.00001);
    }

    @Test
    public void deveReceberVariosLances() {
        Leilao leilao = new CriadorDeLeilao()
                .para("Macbook Pro 15")
                .lance(steveJobs, 2000)
                .lance(steveWozniak, 3000)
                .constroi();

        assertEquals(2, leilao.getLances().size());
        assertEquals(2000, leilao.getLances().get(0).getValor(), 0.00001);
        assertEquals(3000, leilao.getLances().get(1).getValor(), 0.00001);
    }

    @Test
    public void naoDeveAceitarDoisLancesSeguidosDoMesmoUsuario() {
        Leilao leilao = new CriadorDeLeilao()
                .para("Macbook Pro 15")
                .lance(steveJobs, 2000.0)
                .lance(steveJobs, 3000.0)
                .constroi();

        assertEquals(1, leilao.getLances().size());
        assertEquals(2000, leilao.getLances().get(0).getValor(), 0.00001);
    }

    @Test
    public void naoDeveAceitarMaisDoQue5LancesDeUmMesmoUsuario() {
        Leilao leilao = new CriadorDeLeilao().para("Macbook Pro 15")
                .lance(steveJobs, 2000)
                .lance(billGates, 3000)
                .lance(steveJobs, 4000)
                .lance(billGates, 5000)
                .lance(steveJobs, 6000)
                .lance(billGates, 7000)
                .lance(steveJobs, 8000)
                .lance(billGates, 9000)
                .lance(steveJobs, 10000)
                .lance(billGates, 11000)
                .lance(steveJobs, 12000) // deve ser ignorado
                .constroi();

        assertEquals(10, leilao.getLances().size());
        int ultimo = leilao.getLances().size() - 1;
        Lance ultimoLance = leilao.getLances().get(ultimo);
        assertEquals(11000.0, ultimoLance.getValor(), 0.00001);
    }

    @Test
    public void deveDobrarOUltimoLanceDado() {
        Leilao leilao = new CriadorDeLeilao().para("Macbook Pro 15")
                        .lance(steveJobs, 2000)
                        .lance(billGates,3000).constroi();
        leilao.dobraLance(steveJobs);
        assertEquals(4000, leilao.getLances().get(2).getValor(), 0.00001);
    }

    @Test
    public void naoDeveDobrarCasoNaoHajaLanceAnterior() {
        Leilao leilao = new CriadorDeLeilao().para("Macbook Pro 15").constroi();
        leilao.dobraLance(steveJobs);
        assertEquals(0, leilao.getLances().size());
    }




}