package br.com.test.integracao.dao;

import br.com.test.integracao.CriadorDeSessao;
import br.com.test.integracao.dominio.Usuario;
import org.hibernate.Session;
import org.junit.After;
import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertNotNull;
import static org.junit.Assert.assertNull;

/**
 * Created by david on 30/12/16.
 */
//Teste de integração
public class UsuarioDaoTest {

    private Session session;
    private UsuarioDao usuarioDao;

    @Before
    public void antes() {
        session = new CriadorDeSessao().getSession();
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
    public void deveEncontrarPeloNomeEEmail() {
        // criando usuario
        UsuarioDao usuarioDao = new UsuarioDao(session);

        // persistindo no banco
        usuarioDao.salvar(new Usuario("João da Silva", "joao@dasilva.com.br"));

        // agora buscamos no banco
        Usuario usuarioDoBanco = usuarioDao.porNomeEEmail("João da Silva", "joao@dasilva.com.br");

        // garantindo que a query funcionou
        assertEquals("João da Silva", usuarioDoBanco.getNome());
        assertEquals("joao@dasilva.com.br", usuarioDoBanco.getEmail());
    }

    @Test
    public void deveRetornarNuloSeNaoEncontrarUsuario() {
        // criando usuario
        UsuarioDao usuarioDao = new UsuarioDao(session);

        // buscando usuario
        Usuario usuarioDoBanco = usuarioDao.porNomeEEmail("João da Silva", "joao@dasilva.com.br");

        // garantindo que a query funcionou
        assertNull(usuarioDoBanco);
    }

    @Test
    public void deveDeletarUmUsuario() {
        // criando usuario
        Usuario usuario = new Usuario("Mauricio Aniche", "mauricio@aniche.com.br");

        // persitindo usuario
        usuarioDao.salvar(usuario);
        usuarioDao.deletar(usuario);

        // envia tudo para o banco de dados
        session.flush();

        // buscando usuario
        Usuario usuarioNoBanco = usuarioDao.porNomeEEmail("Mauricio Aniche", "mauricio@aniche.com.br");

        // garantindo que a query funcionou
        assertNull(usuarioNoBanco);
    }

    @Test
    public void deveAlterarUmUsuario() {
        // criando usuario
        Usuario usuario = new Usuario("Mauricio Aniche", "mauricio@aniche.com.br");

        // persitindo usuario
        usuarioDao.salvar(usuario);

        // alterando dados usuario
        usuario.setNome("João da Silva");
        usuario.setEmail("joao@silva.com.br");

        // persitindo usuario
        usuarioDao.atualizar(usuario);

        // envia tudo para o banco de dados
        session.flush();

        // buscando usuario
        Usuario novoUsuario = usuarioDao.porNomeEEmail("João da Silva", "joao@silva.com.br");
        Usuario usuarioInexistente = usuarioDao.porNomeEEmail("Mauricio Aniche", "mauricio@aniche.com.br");

        // garantindo que a query funcionou
        assertNotNull(novoUsuario);
        assertNull(usuarioInexistente);

    }
}
