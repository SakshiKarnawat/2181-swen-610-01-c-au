package com.webcheckers.ui;

import com.webcheckers.appl.Constants;
import com.webcheckers.appl.GameCenter;
import com.webcheckers.model.User;
import com.webcheckers.ui.login.LoginController;
import spark.*;

import java.util.HashMap;
import java.util.Map;

public abstract class PostLoginRoute implements TemplateViewRoute {

    protected GameCenter gameCenter;

    public PostLoginRoute(GameCenter gameCenter) {
        this.gameCenter = gameCenter;
    }

    @Override
    public ModelAndView handle(Request request, Response response) {
        Session session = request.session();
        User user = session.attribute(Constants.SESSION_USER);
        if (user != null) {
            return this.postHandle(request, response);
        } else {
            Map<String, Object> vm = new HashMap<>();
            vm.put(Constants.TITLE_ATTR, "Login");
            vm.put(Constants.FAILED_LOGIN_ATTR, true);
            vm.put(Constants.FAILED_LOGIN_MESSAGE_ATTR, "Error: You must be logged in to access this page.");
            return new ModelAndView(vm , Constants.LOGIN_VIEW);
        }
    }

    public abstract ModelAndView postHandle(Request request, Response response);
}
