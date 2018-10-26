package com.webcheckers.ui.login;

import com.webcheckers.appl.GameCenter;
import org.junit.After;
import org.junit.Before;
import org.junit.Test;
import spark.Request;
import spark.Response;
import spark.Session;

import static org.junit.Assert.*;
import static org.mockito.Mockito.mock;
import static org.mockito.Mockito.when;

public class LoginControllerTest {

    // attributes holding mock objects
    private Request request;
    private Session session;
    private Response response;

    private LoginController CuT = new LoginController(new GameCenter());

    @Before
    public void setUp() throws Exception {
        request = mock(Request.class);
        session = mock(Session.class);
        when(request.session()).thenReturn(session);
        response = mock(Response.class);
    }

    @After
    public void tearDown() throws Exception {

    }

    @Test
    public void handle() {

    }
}