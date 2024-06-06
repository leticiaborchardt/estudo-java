package com.company;

import java.sql.Connection;

public class Main {
    public static void main(String[] args) {
        DbFunction db = new DbFunction();

        Connection connection = db.connectToDb("testedb", "postgres", "password");

        System.out.println("Criação da tabela");
        db.createTable(connection, "employee");

        System.out.println("Inserindo registros");
        db.insertRow(connection, "employee", "John", "Brasil");
        db.insertRow(connection, "employee", "Bob", "Brasil");

        System.out.println("Lendo registros");
        db.readData(connection, "employee");

        System.out.println("Atualizando registro");
        db.updateName(connection, "employee", 1, "Jonas");

        System.out.println("Pesquisando registros pelo nome");
        db.searchByName(connection, "employee", "Fábio");

        System.out.println("Removendo registro");
        db.delete(connection, "employee", 2);
    }
}