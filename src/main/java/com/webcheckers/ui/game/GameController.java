package com.webcheckers.ui.game;

import com.webcheckers.appl.Constants;
import com.webcheckers.appl.GameCenter;
import com.webcheckers.ui.PostLoginRoute;
import spark.ModelAndView;
import spark.Request;
import spark.Response;

import java.util.HashMap;
import java.util.Map;

public class GameController extends PostLoginRoute {

    public GameController(GameCenter gameCenter) {
        super(gameCenter);
    }

    @Override
    public ModelAndView postHandle(Request request, Response response) {
        Map<String, Object> vm = new HashMap<>();
        return new ModelAndView(vm, Constants.GAME_VIEW);
    }

}
