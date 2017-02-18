//package br.com.javaoo.solid.singleresponsibilityprinciple.acoplamento;
//
///**
// * Created by david on 27/12/16.
// */
//public class GeradorDeNotaFiscal_Refatorar_Exemplo {
//       private final EnviadorDeEmail email;
//       private final NotaFiscalDao dao;
//
//        public GeradorDeNotaFiscal_Refatorar_Exemplo(EnviadorDeEmail email, NotaFiscalDao dao) {
//            this.email = email;
//            this.dao = dao;
//        }
//
//        public NotaFiscal gera(Fatura fatura) {
//
//            double valor = fatura.getValorMensal();
//
//            NotaFiscal nf = new NotaFiscal(valor, impostoSimplesSobreO(valor));
//
//            email.enviaEmail(nf);
//            dao.persiste(nf);
//
//            return nf;
//        }
//
//        private double impostoSimplesSobreO(double valor) {
//            return valor * 0.06;
//        }
//    }
