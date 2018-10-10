package com.webcheckers.ui.login;

import com.webcheckers.appl.Constants;
import com.webcheckers.appl.GameCenter;
import com.webcheckers.ui.PostLoginRoute;
import spark.ModelAndView;
import spark.Request;
import spark.Response;

public class GetLogoutRoute extends PostLoginRoute {

    public GetLogoutRoute(GameCenter gameCenter) {
        super(gameCenter);
    }

    @Override
    public ModelAndView postHandle(Request request, Response response) {
        gameCenter.logout(request.session());
        return new ModelAndView(Constants.DEFAULT_LOGIN_VM , Constants.LOGIN_VIEW);
    }
}
