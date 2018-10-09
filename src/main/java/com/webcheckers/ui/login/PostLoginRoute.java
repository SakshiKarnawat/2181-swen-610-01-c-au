package com.webcheckers.ui.login;

import com.webcheckers.appl.GameCenter;
import com.webcheckers.ui.HomeController;
import spark.ModelAndView;
import spark.Request;
import spark.Response;
import spark.TemplateViewRoute;

import java.util.HashMap;
import java.util.Map;

public class PostLoginRoute implements TemplateViewRoute {

    static final String LOGIN_MESSAGE_ATTR = "loginMessage";

    private GameCenter gameCenter;

    public PostLoginRoute(GameCenter gameCenter) {
        this.gameCenter = gameCenter;
    }

    @Override
    public ModelAndView handle(Request request, Response response) {
        Map<String, Object> vm = new HashMap<>();
        String userName = request.queryParams("userName");
        if (gameCenter.login(userName, request.session())) {
            vm.put("title", "Welcome!");
            vm.put(LOGIN_MESSAGE_ATTR, "Success! You are now logged in " + userName);
        } else {
            vm.put("title", "Login");
            vm.put(LOGIN_MESSAGE_ATTR, "Error: User already exists, please choose a new user name.");
            return new ModelAndView(vm, LoginController.VIEW_NAME);
        }
        return new ModelAndView(vm , HomeController.VIEW_NAME);
    }
}
