package br.com.javaoo.solid.openclose;

/**
 * Created by david on 28/12/16.
 */
public class Frete implements ServicoDeEntrega {
    @Override
    public double para(String cidade) {
        if("SAO PAULO".equals(cidade.toUpperCase())) {
            return 15;
        }
        return 30;
    }
}
