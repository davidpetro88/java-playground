package br.com.javaoo.solid.singleresponsibilityprinciple.encapsulamento;

/**
 * Created by david on 28/12/16.
 */
//public class Refatorar_Exemplo {
//    public class ProcessadorDeBoletos {
//
//        public void processa(List<Boleto> boletos, Fatura fatura) {
//            double total = 0;
//            for(Boleto boleto : boletos) {
//                Pagamento pagamento = new Pagamento(boleto.getValor(),
//                        MeioDePagamento.BOLETO);
//                fatura.getPagamentos().add(pagamento);
//
//                total += fatura.getValor();
//            }
//
//            if(total >= fatura.getValor()) {
//                fatura.setPago(true);
//            }
//        }
//    }
//}
