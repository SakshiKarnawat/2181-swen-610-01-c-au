package com.webcheckers.appl;

import com.webcheckers.model.User;
import org.junit.After;
import org.junit.Before;
import org.junit.Test;
import spark.Session;

import javax.jws.soap.SOAPBinding;

import static org.mockito.Mockito.*;
import static org.junit.Assert.*;



public class GameCenterTest {

    private static final String USERNAME = "George";
    private static String NOT_EQUAL_MESSAGE = "Object is not equal!";
    /**
     * Test that the no-arg constructor works without failure.
     */
    @Test
    public void ctor_noArg() {
        new GameCenter();
    }

    @Before
    public void setUp() throws Exception {

    }

    @After
    public void tearDown() throws Exception {

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
        CuT.login(USERNAME,session);
        CuT.logout(session);
    }

    @Test
    public void getUser() {
        final GameCenter CuT = new GameCenter();
        // test null case
        User user = CuT.getUser(USERNAME);
        assertNull(user);

        Session session = mock(Session.class);
        CuT.login(USERNAME,session);
        User user2 = new User(USERNAME);
        assertEquals(NOT_EQUAL_MESSAGE,user2,CuT.getUser(USERNAME));
    }

    @Test
    public void getCurrentPlayers() {
    }

    @Test
    public void newGame() {
    }
}