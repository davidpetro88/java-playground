package br.com.javaoo.designpatterns.command;

/**
 * Created by david on 26/12/16.
 */
public class ConcluiPedido implements Comando {

    private Pedido pedido;

    public ConcluiPedido(Pedido pedido) {
        this.pedido = pedido;
    }

    @Override
    public void executa() {
        System.out.println("Concluindo pedido do " + pedido.getCliente());
        pedido.finaliza();
    }

}