package br.com.javaoo.designpatterns.factory;

import java.sql.Connection;

/**
 * Created by david on 24/12/16.
 */
public class Programa {

    public static void main(String[] args) {
        Connection connection = new ConnectionFactory().getConnection();

    }
}
