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
     *
     * @param request - Spark Request
     * @param response - Spark Response
     * @return
     */
    @Override
    public ModelAndView postHandle(Request request, Response response) {

        return null;
    }
}
