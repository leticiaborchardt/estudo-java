package com.company;

public class Main {
    public static void main(String[] args) {
        DbFunction db = new DbFunction();

        db.connectToDb("testedb", "postgres", "password");
    }
}