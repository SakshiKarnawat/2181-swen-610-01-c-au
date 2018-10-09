package com.webcheckers.ui.login;

import com.webcheckers.appl.GameCenter;
import spark.ModelAndView;
import spark.Request;
import spark.Response;
import spark.TemplateViewRoute;

import java.util.HashMap;
import java.util.Map;

public class LoginController implements TemplateViewRoute {

    public static final String VIEW_NAME = "login.ftl";
    public static final Map<String, Object> DEFAULT_LOGIN_VM;

    static {
        DEFAULT_LOGIN_VM = new HashMap<>();
        DEFAULT_LOGIN_VM.put("title", "Login");
    }

    private GameCenter gameCenter;

    public LoginController(GameCenter gameCenter) {
        this.gameCenter = gameCenter;
    }

    @Override
    public ModelAndView handle(Request request, Response response) {
        return new ModelAndView(DEFAULT_LOGIN_VM , LoginController.VIEW_NAME);
    }

}
