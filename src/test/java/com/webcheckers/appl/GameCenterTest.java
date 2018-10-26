package com.webcheckers.appl;

import com.webcheckers.model.Game;
import com.webcheckers.model.User;
import org.junit.After;
import org.junit.Before;
import org.junit.Test;
import spark.Session;

import java.util.ArrayList;
import java.util.List;

import static org.mockito.Mockito.*;
import static org.junit.Assert.*;



public class GameCenterTest {

    private static final String USERNAME = "George";
    private static final String USERNAME2 = "Jacky";
    private static String NOT_EQUAL_MESSAGE = "Object is not equal!";
    /**
     * Test that the no-arg constructor works without failure.
     */
    @Test
    public void ctor_noArg() {
        new GameCenter();
    }

    @Test
    public void login() {
        // Arrange the test scenario: There is a session given a username
        final GameCenter CuT = new GameCenter();
        Session session = mock(Session.class);
        // invoke the test
        boolean boo = CuT.login(USERNAME,session);
        // analyze the result
        assertTrue(boo);
        // the same username again
        boolean bo = CuT.login(USERNAME,session);
        assertFalse(bo);
     }

    @Test
    public void logout() {
        final GameCenter CuT = new GameCenter();
        Session session = mock(Session.class);

        CuT.logout(session);
        assertNull(session.attribute(Constants.SESSION_USER));
        assertFalse(CuT.currentUsers.containsKey(Constants.SESSION_USER));
    }

    @Test
    public void getUser_withNoUser() {
        final GameCenter CuT = new GameCenter();
        // test null case
        User user = CuT.getUser(USERNAME);
        assertNull(user);
    }

    @Test
    public void getUser_withUser(){
        final GameCenter CuT = new GameCenter();
        Session session = mock(Session.class);
        CuT.login(USERNAME,session);
        assertEquals(NOT_EQUAL_MESSAGE,USERNAME,CuT.getUser(USERNAME).getUserName());
    }

    @Test
    public void getCurrentPlayers_withNoPlayer() {
        List <User> user_list = new ArrayList<>();
        final GameCenter CuT = new GameCenter();
        assertEquals(user_list, CuT.getCurrentPlayers());
    }

    @Test
    public void getCurrentPlayers_withPlayer() {
        //List <User> user_list = new ArrayList<>();
        //user_list.add(new User(USERNAME));
        final GameCenter CuT = new GameCenter();
        Session session = mock(Session.class);
        CuT.login(USERNAME,session);
        assertEquals(USERNAME, CuT.getCurrentPlayers().get(0).getUserName());
    }

    @Test
    public void newGame() {
        final GameCenter CuT = new GameCenter();
        Session session = mock(Session.class);
        try {
            Game game = CuT.newGame(new User(USERNAME),new User(USERNAME2));
            assertEquals("white",game.getPlayerOne().getColor());
            assertEquals("red",game.getPlayerTwo().getColor());
            assertEquals(USERNAME,game.getPlayerOne().getName());
            assertEquals(USERNAME2,game.getPlayerTwo().getName());
        } catch (GameCenterException e) {
            e.printStackTrace();
        }
    }
}