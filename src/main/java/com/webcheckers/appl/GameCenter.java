package com.webcheckers.appl;

import com.webcheckers.model.User;
import spark.Session;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class GameCenter {

    private Map<String, User> currentUsers;

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
        User user = session.attribute(Constants.SESSION_USER);
        currentUsers.remove(user.getUserName());
        session.removeAttribute(Constants.SESSION_USER);
    }

    public User getUser(String userName) {
        return currentUsers.get(userName);
    }

    public List<User> getCurrentPlayers() {
        return new ArrayList<>(currentUsers.values());
    }
}
