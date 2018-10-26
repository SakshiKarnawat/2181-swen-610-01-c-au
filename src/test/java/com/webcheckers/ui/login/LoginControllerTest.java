package com.webcheckers.ui.login;

import com.webcheckers.appl.Constants;
import com.webcheckers.appl.GameCenter;
import com.webcheckers.model.User;
import org.junit.After;
import org.junit.Before;
import org.junit.Test;
import spark.ModelAndView;
import spark.Request;
import spark.Response;
import spark.Session;

import java.util.Map;

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

    @Test
    public void has_no_user() {
        request.attribute(Constants.SESSION_USER,new User(Constants.SESSION_USER));

        final ModelAndView result = CuT.handle(request, response);
        // Analyze the results:
        //   * result is non-null
        assertNotNull(result);
        //   * model is a non-null Map
        final Object model = result.getModel();
        assertNotNull(model);
        assertTrue(model instanceof Map);
        //   * model contains all necessary View-Model data
        final Map<String, Object> vm = (Map<String, Object>) model;
        assertEquals(Constants.DEFAULT_LOGIN_VM.get(Constants.TITLE_ATTR),vm.get(Constants.TITLE_ATTR));
    }

}