package com.example.jdbc;

import java.sql.*;

public class Application {

    public static void main(String[] args) {

        String url = "jdbc:mysql://localhost:3306/employees_database";
        try {

//            Establish Connection Object
            Connection connection = DriverManager.getConnection(url, "root", "123456");

//            Create a statement object to send to the database
            Statement statement = connection.createStatement();

            insert(statement);

            delete(statement);

            update(statement);

//            Execute the statement object
            ResultSet resultSet = statement.executeQuery("Select * from employees_tbl");

//            process the result
            int salaryTotal = 0;
            while (resultSet.next()){
                System.out.println(resultSet.getString("name"));
                salaryTotal = salaryTotal + resultSet.getInt("salary");
            }
            System.out.println("Total Salary : " + salaryTotal);

        } catch (SQLException e) {
            e.printStackTrace();
        }
    }

    private static void update(Statement statement) throws SQLException {
        try {
            long rowsAffected = statement.executeUpdate("UPDATE employees_tbl SET salary 5550 where id = 600;");
            System.out.println("Executed an update statement - Row Affected: " + rowsAffected);
        } catch (Exception ex) {
            System.out.println("Failure to update");
        }
    }

    private static void delete(Statement statement) throws SQLException {
        try {
            long rowsAffected = statement.executeUpdate("DELETE FROM employees_tbl where id = 800");
            System.out.println("Executed an delete statement - Row Affected: " + rowsAffected);
        } catch (Exception ex) {
            System.out.println("Failure to delete");
        }
    }

    private static void insert(Statement statement) throws SQLException {
        try {
            long rowsAffected = statement.executeUpdate("insert into employees_tbl (name, dept, salary) " +
                    "values ('Juliet', 'Sales', 5500);");
            System.out.println("Executed an insert statement - Row Affected: " + rowsAffected);
        } catch (Exception ex) {
            System.out.println("Failure to insert");
        }

    }
}
