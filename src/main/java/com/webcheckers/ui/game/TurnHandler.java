package com.webcheckers.ui.game;

import com.webcheckers.appl.GameCenter;
import com.webcheckers.ui.PostLoginRoute;
import spark.ModelAndView;
import spark.Request;
import spark.Response;

public class TurnHandler extends PostLoginRoute {

    public TurnHandler(GameCenter gameCenter) {
        super(gameCenter);
    }

    /**
     * Checks if there is a user is in the game, if so, handles the response, else returns to the Login page
     * @param request - Spark Request
     * @param response - Spark Response
     * @return Null
     */
    @Override
    public ModelAndView postHandle(Request request, Response response) {
        return null;
    }
}
