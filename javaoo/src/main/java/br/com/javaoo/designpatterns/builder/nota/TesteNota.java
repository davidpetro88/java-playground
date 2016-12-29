package br.com.javaoo.designpatterns.builder.nota;

/**
 * Created by david on 23/12/16.
 */
public class TesteNota {
    public static void main(String[] args) {
        NotaFiscalBuilder notaFiscalBuilder = new NotaFiscalBuilder();
        notaFiscalBuilder.paraEmpresa("Teste")
               .comCnpj("123.456.789/0001-10")
               .comItem(new ItemDaNota("item 1", 100.0))
               .comItem(new ItemDaNota("item 2", 200.0))
               .comItem(new ItemDaNota("item 3", 300.0))
               .comObservacoes("entregar nf pessoalmente");
    }
}
