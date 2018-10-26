package com.webcheckers.appl;

import com.webcheckers.model.Board;
import com.webcheckers.model.Game;
import com.webcheckers.model.Player;
import com.webcheckers.model.User;
import spark.Session;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class GameCenter {

    Map<String, User> currentUsers;
    private List<Game> currentGames;

    public GameCenter() {

        this.currentUsers = new HashMap<>();
    }

    public boolean login(String userName, Session session) {
        // Return false if user already exists
        if (currentUsers.containsKey(userName)) {
            return false;
        } else {
            User user = new User(userName);
            this.currentUsers.put(userName, user);
            session.attribute(Constants.SESSION_USER, user);
            return true;
        }
    }

    public void logout(Session session) {
        // Remove user from map and clear out session
        currentUsers.remove(Constants.SESSION_USER);
        session.removeAttribute(Constants.SESSION_USER);
    }

    public User getUser(String userName) {

        return currentUsers.get(userName);
    }

    public List<User> getCurrentPlayers() {
        return new ArrayList<>(currentUsers.values());
    }

    public Game newGame(User userOne, User userTwo) throws GameCenterException {
        if (!userOne.isInGame() && !userTwo.isInGame()) {
            userOne.setInGame(true);
            userTwo.setInGame(true);
            Player playerOne = new Player(userOne);
            playerOne.setColor("white");
            Player playerTwo = new Player(userTwo);
            playerTwo.setColor("red");
            Board board = new Board();
            return new Game(board, playerOne, playerTwo);
        } else {
            throw new GameCenterException("Error: one of the players is already in a game");
        }
    }
}
