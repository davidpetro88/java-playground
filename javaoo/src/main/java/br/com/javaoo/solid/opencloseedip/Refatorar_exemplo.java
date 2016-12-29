//package br.com.javaoo.solid.openclose;
//
///**
// * Created by david on 27/12/16.
// */
//public class CalculadoraDePrecos {
//
//    public double calcula(Compra produto) {
//        TabelaDePrecoPadrao tabela = new TabelaDePrecoPadrao();
//        Frete correios = new Frete();
//
//        double desconto = tabela.descontoPara(produto.getValor());
//        double frete = correios.para(produto.getCidade());
//
//        return produto.getValor() * (1-desconto) + frete;
//    }
//}
//
//public class TabelaDePrecoPadrao {
//    public double descontoPara(double valor) {
//        if(valor>5000) return 0.03;
//        if(valor>1000) return 0.05;
//        return 0;
//    }
//}
//
//public class Frete {
//    public double para(String cidade) {
//        if("SAO PAULO".equals(cidade.toUpperCase())) {
//            return 15;
//        }
//        return 30;
//    }
//}