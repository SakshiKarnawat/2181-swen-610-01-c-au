package com.webcheckers.model;

/**
* The user class has a username and determines whether or not a player is in  a game or not.
*/

public class User {
    private String userName;
    private boolean inGame;

    public User(String userName) {
        this.userName = userName;
    }

    public String getUserName() {
        return userName;
    }

    public void setUserName(String userName) {
        this.userName = userName;
    }

    public boolean isInGame() {
        return inGame;
    }

    public void setInGame(boolean inGame) {
        this.inGame = inGame;
    }
}
