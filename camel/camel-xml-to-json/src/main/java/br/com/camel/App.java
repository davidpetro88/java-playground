package br.com.camel;

import org.apache.camel.CamelContext;
import org.apache.camel.builder.RouteBuilder;
import org.apache.camel.impl.DefaultCamelContext;

/**
 * Created by david on 12/11/16.
 */
public class App {

    public static void main(String[] args) throws Exception {
        CamelContext context = new DefaultCamelContext();
        context.addRoutes(new RouteBuilder() {
            @Override
            public void configure() throws Exception {
                from("file:pedidos?delay=5s&noop=true").
                        split().
                        xpath("/pedido/itens/item").
                        log("${id}").
                        filter().
                        xpath("/item/formato[text()='EBOOK']").
                        log("${id} - ${body}").
                        marshal().xmljson().
                        log("${body}").
                        setHeader("CamelFileName", simple("${file:name.noext}.json")).
                        to("file:saida");
            }
        });
        context.start();
        Thread.sleep(20000);
        context.stop();
    }
}