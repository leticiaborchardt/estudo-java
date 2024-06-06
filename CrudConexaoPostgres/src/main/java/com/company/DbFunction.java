package com.company;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.Statement;

public class DbFunction {
    public Connection connectToDb(String dbName, String user, String password) {
        Connection connection = null;

        try {
            Class.forName("org.postgresql.Driver");

            connection = DriverManager.getConnection("jdbc:postgresql://localhost:5432/" + dbName, user, password);

            if (connection != null) {
                System.out.println("Connection Established");
            } else {
                System.out.println("Connection Failed");
            }
        } catch (Exception e) {
            System.out.println(e);
        }

        return connection;
    }

    public void createTable(Connection connection, String tablename) {
        Statement statement;

        try {
            String query = "CREATE TABLE IF NOT EXISTS " + tablename + "(id SERIAL, name VARCHAR(200), address VARCHAR(200), PRIMARY KEY (id))";

            statement = connection.createStatement();
            statement.executeUpdate(query);

            System.out.println("Table '" + tablename + "' created!");
        } catch (Exception e) {
            System.out.println(e);
        }
    }

    public void insertRow(Connection connection, String tablename, String name, String address) {
        Statement statement;

        try {
            String query = String.format("INSERT INTO %s (name, address) VALUES ('%s', '%s')", tablename, name, address);

            statement = connection.createStatement();
            statement.executeUpdate(query);

            System.out.println("Row inserted");
        } catch (Exception e) {
            System.out.println(e);
        }
    }

    public void readData(Connection connection, String tablename) {
        Statement statement;

        try {
            String query = String.format("SELECT * FROM %s", tablename);

            statement = connection.createStatement();
            ResultSet result = statement.executeQuery(query);

            while (result.next()) {
                System.out.print(result.getString("id") + " ");
                System.out.print(result.getString("name") + " ");
                System.out.println(result.getString("address") + " ");
            }
        } catch (Exception e) {
            System.out.println(e);
        }
    }

    public void updateName(Connection connection, String tablename, Integer id, String newName) {
        Statement statement;

        try {
            String query = String.format("UPDATE %s SET NAME = '%s' WHERE id = %s", tablename, newName, id);

            statement = connection.createStatement();
            statement.executeUpdate(query);

            System.out.println("Update succeed");
        } catch (Exception e) {
            System.out.println(e);
        }
    }

    public void searchByName(Connection connection, String tablename, String name) {
        Statement statement;

        try {
            String query = String.format("SELECT * FROM %s WHERE name LIKE '%s'", tablename, name);

            statement = connection.createStatement();
            ResultSet result = statement.executeQuery(query);

            while (result.next()) {
                System.out.print(result.getString("id") + " ");
                System.out.print(result.getString("name") + " ");
                System.out.println(result.getString("address") + " ");
            }
        } catch (Exception e) {
            System.out.println(e);
        }
    }

    public void delete(Connection connection, String tablename, Integer id) {
        Statement statement;

        try {
            String query = String.format("DELETE FROM %s WHERE id = %s", tablename, id);

            statement = connection.createStatement();
            statement.executeUpdate(query);

            System.out.println("Delete succeed");
        } catch (Exception e) {
            System.out.println(e);
        }
    }
}
