package br.com.test.integracao.dao;

import br.com.test.integracao.CriadorDeSessao;
import br.com.test.integracao.builder.LeilaoBuilder;
import br.com.test.integracao.dominio.Leilao;
import br.com.test.integracao.dominio.Usuario;
import org.hibernate.Session;
import org.junit.After;
import org.junit.Before;
import org.junit.Test;

import java.util.Calendar;
import java.util.List;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertNull;

/**
 * Created by david on 30/12/16.
 */
public class LeilaoDaoTests {
    private Session session;
    private LeilaoDao leilaoDao;
    private UsuarioDao usuarioDao;

    @Before
    public void antes() {
        session = new CriadorDeSessao().getSession();
        leilaoDao = new LeilaoDao(session);
        usuarioDao = new UsuarioDao(session);

        // inicia transacao
        session.beginTransaction();
    }

    @After
    public void depois() {
        // faz o rollback
        session.getTransaction().rollback();
        session.close();
    }

    @Test
    public void deveContarLeiloesNaoEncerrados() {
        // criamos um usuario
        Usuario mauricio = new Usuario("Mauricio Aniche", "mauricio@aniche.com.br");

        // criamos os dois leiloes
        Leilao ativo = new LeilaoBuilder().comDono(mauricio).comNome("Geladeira").constroi();
        Leilao encerrado = new LeilaoBuilder().comDono(mauricio).comNome("XBox").encerrado().constroi();

        // persistimos todos no banco
        usuarioDao.salvar(mauricio);
        leilaoDao.salvar(ativo);
        leilaoDao.salvar(encerrado);

        // invocamos a acao que queremos testar
        // pedimos o total para o DAO
        long total = leilaoDao.total();

        // garantindo que a query funcionou
        assertEquals(1L, total);
    }

    @Test
    public void deveRetornarZeroSeNaoHaLeiloesNovos() {
        // criando usuario
        Usuario mauricio = new Usuario("Mauricio Aniche", "mauricio@aniche.com.br");

        // criando os leiloes
        Leilao encerrado = new LeilaoBuilder().comDono(mauricio).comNome("XBox").comValor(700.0).encerrado().constroi();
        Leilao tambemEncerrado = new LeilaoBuilder().comDono(mauricio).comNome("Geladeira").comValor(1500.0).encerrado().constroi();

        // persistimos todos no banco
        usuarioDao.salvar(mauricio);
        leilaoDao.salvar(encerrado);
        leilaoDao.salvar(tambemEncerrado);

        // invocando o metodo para testar
        long total = leilaoDao.total();

        // garantindo que a query funcionou
        assertEquals(0L, total);
    }

    @Test
    public void deveRetornarLeiloesDeProdutosNovos() {
        // criando usuario
        Usuario mauricio = new Usuario("Mauricio Aniche", "mauricio@aniche.com.br");

        // criando os leiloes
        Leilao produtoNovo = new LeilaoBuilder().comDono(mauricio).comNome("XBox").comValor(700.0).constroi();
        Leilao produtoUsado = new LeilaoBuilder().comDono(mauricio).comNome("Geladeira").comValor(1500.0).usado().constroi();

        // persistimos todos no banco
        usuarioDao.salvar(mauricio);
        leilaoDao.salvar(produtoNovo);
        leilaoDao.salvar(produtoUsado);

        // invocando o metodo para testar
        List<Leilao> novos = leilaoDao.novos();

        // garantindo que a query funcionou
        assertEquals(1, novos.size());
        assertEquals("XBox", novos.get(0).getNome());
    }

    @Test
    public void deveTrazerSomenteLeiloesAntigos() {
        // criando usuarios
        Usuario mauricio = new Usuario("Mauricio Aniche", "mauricio@aniche.com.br");

        // criando os leiloes
        Leilao recente = new LeilaoBuilder().comDono(mauricio).comNome("XBox").comValor(700.0).constroi();
        Leilao antigo = new LeilaoBuilder().comDono(mauricio).comNome("Geladeira").comValor(1500.0).diasAtras(10).usado().constroi();

        // persistimos todos no banco
        usuarioDao.salvar(mauricio);
        leilaoDao.salvar(recente);
        leilaoDao.salvar(antigo);

        // invocando o metodo para testar
        List<Leilao> antigos = leilaoDao.antigos();

        // garantindo que a query funcionou
        assertEquals(1, antigos.size());
        assertEquals("Geladeira", antigos.get(0).getNome());
    }

    @Test
    public void deveTrazerSomenteLeiloesAntigosHaMaisDe7Dias() {
        //criando usuario
        Usuario mauricio = new Usuario("Mauricio Aniche", "mauricio@aniche.com.br");

        // criando os leiloes, cada um com uma data
        Leilao noLimite = new LeilaoBuilder().comDono(mauricio).comNome("XBox").comValor(700.0).diasAtras(7).constroi();

        // persistindo os objetos no banco
        usuarioDao.salvar(mauricio);
        leilaoDao.salvar(noLimite);

        // invocando o metodo para testar
        List<Leilao> antigos = leilaoDao.antigos();

        // garantindo que a query funcionou
        assertEquals(1, antigos.size());
    }

    @Test
    public void deveTrazerLeiloesNaoEncerradosNoPeriodo() {

        // criando as datas
        Calendar comecoDoIntervalo = Calendar.getInstance();
        comecoDoIntervalo.add(Calendar.DAY_OF_MONTH, -10);
        Calendar fimDoIntervalo = Calendar.getInstance();

        //criando usuario
        Usuario mauricio = new Usuario("Mauricio Aniche", "mauricio@aniche.com.br");

        // criando os leiloes, cada um com uma data
        Leilao leilao1 = new LeilaoBuilder().comDono(mauricio).comNome("XBox").comValor(700.0).diasAtras(2).constroi();
        Leilao leilao2 = new LeilaoBuilder().comDono(mauricio).comNome("Geladeira").comValor(1500.0).diasAtras(20).usado().constroi();

        // persistindo os objetos no banco
        usuarioDao.salvar(mauricio);
        leilaoDao.salvar(leilao1);
        leilaoDao.salvar(leilao2);

        // invocando o metodo para testar
        List<Leilao> leiloes = leilaoDao.porPeriodo(comecoDoIntervalo, fimDoIntervalo);

        // garantindo que a query funcionou
        assertEquals(1, leiloes.size());
        assertEquals("XBox", leiloes.get(0).getNome());
    }

    @Test
    public void naoDeveTrazerLeiloesEncerradosNoPeriodo() {
        // criando as datas
        Calendar comecoDoIntervalo = Calendar.getInstance();
        comecoDoIntervalo.add(Calendar.DAY_OF_MONTH, -10);
        Calendar fimDoIntervalo = Calendar.getInstance();

        // criando usuario
        Usuario mauricio = new Usuario("Mauricio Aniche", "mauricio@aniche.com.br");

        // criando os leiloes, cada um com uma data
        Leilao leilao1 = new LeilaoBuilder().comDono(mauricio).comNome("XBox").comValor(700.0).diasAtras(2).encerrado().constroi();

        // persistindo os objetos no banco
        usuarioDao.salvar(mauricio);
        leilaoDao.salvar(leilao1);

        // invocando o metodo para testar
        List<Leilao> leiloes = leilaoDao.porPeriodo(comecoDoIntervalo, fimDoIntervalo);

        // garantindo que a query funcionou
        assertEquals(0, leiloes.size());
    }

    @Test
    public void deveRetornarLeiloesDisputados() {
        // criando as datas
        Usuario mauricio = new Usuario("Mauricio", "mauricio@aniche.com.br");
        Usuario marcelo = new Usuario("Marcelo", "marcelo@aniche.com.br");

        // criando os leiloes, cada um com uma data
        Leilao leilao1 = new LeilaoBuilder()
                .comDono(marcelo)
                .comValor(3000.0)
                .comLance(Calendar.getInstance(), mauricio, 3000.0)
                .comLance(Calendar.getInstance(), marcelo, 3100.0)
                .constroi();
        Leilao leilao2 = new LeilaoBuilder()
                .comDono(mauricio)
                .comValor(3200.0)
                .comLance(Calendar.getInstance(), mauricio, 3000.0)
                .comLance(Calendar.getInstance(), marcelo, 3100.0)
                .comLance(Calendar.getInstance(), mauricio, 3200.0)
                .comLance(Calendar.getInstance(), marcelo, 3300.0)
                .comLance(Calendar.getInstance(), mauricio, 3400.0)
                .comLance(Calendar.getInstance(), marcelo, 3500.0)
                .constroi();

        // persistindo os objetos no banco
        usuarioDao.salvar(marcelo);
        usuarioDao.salvar(mauricio);
        leilaoDao.salvar(leilao1);
        leilaoDao.salvar(leilao2);

        // invocando o metodo para testar
        List<Leilao> leiloes = leilaoDao.disputadosEntre(2500, 3500);

        // garantindo que a query funcionou
        assertEquals(1, leiloes.size());
        assertEquals(3200.0, leiloes.get(0).getValorInicial(), 0.00001);
    }

    @Test
    public void listaSomenteOsLeiloesDoUsuario() throws Exception {
        // criando os usuarios
        Usuario dono = new Usuario("Mauricio", "m@a.com");
        Usuario comprador = new Usuario("Victor", "v@v.com");
        Usuario comprador2 = new Usuario("Guilherme", "g@g.com");

        // criando os leiloes
        Leilao leilao = new LeilaoBuilder()
                .comDono(dono)
                .comValor(50.0)
                .comLance(Calendar.getInstance(), comprador, 100.0)
                .comLance(Calendar.getInstance(), comprador2, 200.0)
                .constroi();
        Leilao leilao2 = new LeilaoBuilder()
                .comDono(dono)
                .comValor(250.0)
                .comLance(Calendar.getInstance(), comprador2, 100.0)
                .constroi();

        // persistindo os objetos no banco
        usuarioDao.salvar(dono);
        usuarioDao.salvar(comprador);
        usuarioDao.salvar(comprador2);
        leilaoDao.salvar(leilao);
        leilaoDao.salvar(leilao2);

        // invocando o metodo para testar
        List<Leilao> leiloes = leilaoDao.listaLeiloesDoUsuario(comprador);

        // garantindo que a query funcionou
        assertEquals(1, leiloes.size());
        assertEquals(leilao, leiloes.get(0));
    }

    @Test
    public void listaDeLeiloesDeUmUsuarioNaoTemRepeticao() throws Exception {
        // criando os usuarios
        Usuario dono = new Usuario("Mauricio", "m@a.com");
        Usuario comprador = new Usuario("Victor", "v@v.com");

        // criando os leiloes
        Leilao leilao = new LeilaoBuilder()
                .comDono(dono)
                .comLance(Calendar.getInstance(), comprador, 100.0)
                .comLance(Calendar.getInstance(), comprador, 200.0)
                .constroi();

        // persistindo os objetos no banco
        usuarioDao.salvar(dono);
        usuarioDao.salvar(comprador);
        leilaoDao.salvar(leilao);

        // invocando o metodo para testar
        List<Leilao> leiloes = leilaoDao.listaLeiloesDoUsuario(comprador);

        // garantindo que a query funcionou
        assertEquals(1, leiloes.size());
        assertEquals(leilao, leiloes.get(0));
    }

    @Test
    public void devolveAMediaDoValorInicialDosLeiloesQueOUsuarioParticipou(){
        // criando os usuarios
        Usuario dono = new Usuario("Mauricio", "m@a.com");
        Usuario comprador = new Usuario("Victor", "v@v.com");

        // criando os leiloes
        Leilao leilao = new LeilaoBuilder().comDono(dono).comValor(50.0)
                            .comLance(Calendar.getInstance(), comprador, 100.0)
                            .comLance(Calendar.getInstance(), comprador, 200.0).constroi();
        Leilao leilao2 = new LeilaoBuilder().comDono(dono).comValor(250.0)
                            .comLance(Calendar.getInstance(), comprador, 100.0).constroi();

        // persistindo os objetos no banco
        usuarioDao.salvar(dono);
        usuarioDao.salvar(comprador);
        leilaoDao.salvar(leilao);
        leilaoDao.salvar(leilao2);

        // invocando o metodo para testar
        double valorInicialMedioDoUsuario = leilaoDao.getValorInicialMedioDoUsuario(comprador);

        // garantindo que a query funcionou
        assertEquals(150.0, valorInicialMedioDoUsuario, 0.001);
    }



    @Test
    public void deveDeletarUmLeilao() {
        // criando os usuarios
        Usuario dono = new Usuario("Mauricio", "m@a.com");
        Usuario comprador = new Usuario("Victor", "v@v.com");

        // criando os leiloes
        Leilao leilao = new LeilaoBuilder().comDono(dono).comValor(50.0).comLance(Calendar.getInstance(), comprador, 200.0).constroi();

        System.out.println(" ID DO LEILAO " + leilao.getId());

        // persistindo os objetos no banco
        usuarioDao.salvar(dono);
        usuarioDao.salvar(comprador);
        leilaoDao.salvar(leilao);

        // envia tudo para o banco de dados
        session.flush();

        // deleta o leilão
        leilaoDao.deleta(leilao);

        // garantindo que a query funcionou
        assertNull(leilaoDao.porId(leilao.getId()));
    }

}