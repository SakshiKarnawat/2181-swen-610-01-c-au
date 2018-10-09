package com.webcheckers.ui.login;

import com.webcheckers.appl.GameCenter;
import spark.ModelAndView;
import spark.Request;
import spark.Response;
import spark.TemplateViewRoute;

public class GetLogoutRoute implements TemplateViewRoute {

    private GameCenter gameCenter;

    public GetLogoutRoute(GameCenter gameCenter) {
        this.gameCenter = gameCenter;
    }

    @Override
    public ModelAndView handle(Request request, Response response) {
        gameCenter.logout(request.session());
        return new ModelAndView(LoginController.DEFAULT_LOGIN_VM , LoginController.VIEW_NAME);
    }
}
