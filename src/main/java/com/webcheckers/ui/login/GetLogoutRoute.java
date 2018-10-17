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

    /**
     * Logs out user from the game center
     * @param request - Spark Request
     * @param response - Spark Response
     * @return - Model and view for login page
     */
    @Override
    public ModelAndView postHandle(Request request, Response response) {
        gameCenter.logout(request.session());
        return new ModelAndView(Constants.DEFAULT_LOGIN_VM , Constants.LOGIN_VIEW);
    }
}
