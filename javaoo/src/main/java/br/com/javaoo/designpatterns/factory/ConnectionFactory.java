package br.com.javaoo.designpatterns.factory;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

/**
 * Created by david on 24/12/16.
 */
public class ConnectionFactory {

    public Connection getConnection() {
        try {

            Connection conexao ;
            String tipoBanco = System.getenv("tipoBanco");
            if("mysql".equals(tipoBanco)) {
                conexao =
                        DriverManager.getConnection("jdbc:mysql://localhost:3306/banco", "usuario", "senha");
            }
            else {
                conexao =
                        DriverManager.getConnection("jdbc:postgres://localhost:3306/banco", "usuario", "senha");
            }

            return conexao;
        } catch (SQLException e) {
            throw new RuntimeException(e);
        }
    }
}