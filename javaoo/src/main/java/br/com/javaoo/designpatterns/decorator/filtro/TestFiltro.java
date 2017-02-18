package br.com.javaoo.designpatterns.decorator.filtro;

import java.util.ArrayList;
import java.util.Calendar;
import java.util.List;

/**
 * Created by david on 24/12/16.
 */
public class TestFiltro {

    public static void main(String[] args) {

        Filtro filtroMaiorQue500MillReais = new FiltroMaiorQue500MilReais(new FiltroMenorQue100Reais());
        Filtro filtroMenorQue100Reais = new FiltroMenorQue100Reais(new FiltroMesmoMes());
        Filtro filtroMesmoMes = new FiltroMesmoMes();

        Conta conta = new Conta("Titular",66.00, Calendar.getInstance());
        Conta conta2 = new Conta("Titular",600000.00, Calendar.getInstance());
        ArrayList<Conta> listConta = new ArrayList<Conta>();
        listConta.add(conta);
        listConta.add(conta2);

        List<Conta> listFiltroMaiorQue500MillReais = filtroMaiorQue500MillReais.filtra(listConta);
        listFiltroMaiorQue500MillReais.forEach( valorMaiorQue500MillReais -> {
            System.out.println(" Titular : " + valorMaiorQue500MillReais.getTitular() +
                               " Saldo :" + valorMaiorQue500MillReais.getValor() +
                               " Data Abertura :" + valorMaiorQue500MillReais.getDataAbertura().getTime());
        } );

        List<Conta> listFiltroMenorQue100Reais = filtroMenorQue100Reais.filtra(listConta);
        listFiltroMenorQue100Reais.forEach( valorMaiorQue500MillReais -> {
            System.out.println(" Titular : " + valorMaiorQue500MillReais.getTitular() +
                               " Saldo :" + valorMaiorQue500MillReais.getValor() +
                               " Data Abertura :" + valorMaiorQue500MillReais.getDataAbertura().getTime());
        } );

        List<Conta> listFiltroMesmoMes = filtroMesmoMes.filtra(listConta);
        listFiltroMesmoMes.forEach( valorMaiorQue500MillReais -> {
            System.out.println(" Titular : " + valorMaiorQue500MillReais.getTitular() +
                               " Saldo :" + valorMaiorQue500MillReais.getValor() +
                               " Data Abertura :" + valorMaiorQue500MillReais.getDataAbertura().getTime());
        } );
//
//        System.out.println(impostoMuitoAlto.calcula(orcamento));
//        System.out.println(ikvc.calcula(orcamento));
//        System.out.println(icpp.calcula(orcamento));
    }
}