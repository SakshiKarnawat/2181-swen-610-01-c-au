package com.webcheckers.ui.game;

import com.webcheckers.appl.Constants;
import com.webcheckers.appl.GameCenter;
import com.webcheckers.ui.PostLoginRoute;
import spark.ModelAndView;
import spark.Request;
import spark.Response;

import java.util.HashMap;
import java.util.Map;

/**
 * This class ensures the user can view Game Page after successful Login. test
 */
public class GameController extends PostLoginRoute {

    public GameController(GameCenter gameCenter) {

        super(gameCenter);
    }

    /**
     * Checks if there is a user is in the game, if so, handles the response, else returns to Login page
     * @param request - Spark Request
     * @param response - Spark Response
     * @return Model and view of the Game page
     */

    @Override
    public ModelAndView postHandle(Request request, Response response) {
        Map<String, Object> vm = new HashMap<>();
        return new ModelAndView(vm, Constants.GAME_VIEW);
    }

}
