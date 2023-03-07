package org.academiadecodigo.wordsgame.application;

import org.academiadecodigo.wordsgame.entities.server.GameServer;

import java.io.IOException;
import java.sql.SQLException;

public class Program {

    public static void main(String[] args) {

        GameServer server = null;
        try {
            server = new GameServer(8001, 2, "src/main/resources/teste.txt");
        } catch (IOException e) {
            System.out.println(e);
            throw new RuntimeException(e);
        } catch (SQLException e) {
            throw new RuntimeException(e);
        }

        server.manageNewConnections();
    }
}
