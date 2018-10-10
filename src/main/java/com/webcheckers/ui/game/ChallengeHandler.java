package com.webcheckers.ui.game;

import com.webcheckers.appl.Constants;
import com.webcheckers.appl.GameCenter;
import com.webcheckers.model.User;
import com.webcheckers.ui.PostLoginRoute;
import spark.ModelAndView;
import spark.Request;
import spark.Response;

import java.util.HashMap;
import java.util.Map;

public class ChallengeHandler extends PostLoginRoute {

    public ChallengeHandler(GameCenter gameCenter) {
        super(gameCenter);
    }

    @Override
    public ModelAndView postHandle(Request request, Response response) {
        Map<String, Object> vm = new HashMap<>();
        String playerName = request.queryParams("playerName");
        User user = gameCenter.getUser(playerName);
        vm.put(Constants.TITLE_ATTR, "Welcome!");
        vm.put(Constants.WELCOME_MESSAGE_ATTR, "Welcome back " + user.getUserName() + "!");
        vm.put(Constants.CURRENT_PLAYERS_ATTR, gameCenter.getCurrentPlayers());
        if (user != null) {
            if (!user.isInGame()) {
                // Set up game between two players
                User currentUser = request.session().attribute(Constants.SESSION_USER);
                currentUser.setInGame(true);
                user.setInGame(true);
                vm.put(Constants.CHALLENGE_ERROR_ATTR, false);
            } else {
                // User in Game
                vm.put(Constants.CHALLENGE_ERROR_ATTR, true);
                vm.put(Constants.CHALLENGE_MESSAGE_ATTR, "Error: User is already in a game.");
                return new ModelAndView(vm, Constants.HOME_VIEW);
            }
        } else {
            // User doesn't exist
            vm.put(Constants.CHALLENGE_ERROR_ATTR, true);
            vm.put(Constants.CHALLENGE_MESSAGE_ATTR, "Error: User does not exist.");
            return new ModelAndView(vm, Constants.HOME_VIEW);
        }
        return new ModelAndView(vm, Constants.HOME_VIEW);
    }

}
