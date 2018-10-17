package com.webcheckers.ui.game;

import com.webcheckers.appl.Constants;
import com.webcheckers.appl.GameCenter;
import com.webcheckers.appl.GameCenterException;
import com.webcheckers.model.Game;
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

    /**
     * Checks if there is a user is in the game, if so, handles the response, else returns error that User is already in a game,
     * or User does not exist or Cannot challenge yourself
     * @param request - Spark Request
     * @param response - Spark Response
     * @return Model and view for the board page
     */
    @Override
    public ModelAndView postHandle(Request request, Response response) {
        Map<String, Object> vm = new HashMap<>();
        String playerName = request.queryParams("playerName");
        User user = gameCenter.getUser(playerName);
        vm.put(Constants.TITLE_ATTR, "Welcome!");
        vm.put(Constants.WELCOME_MESSAGE_ATTR, "Welcome back " + user.getUserName() + "!");
        vm.put(Constants.CURRENT_PLAYERS_ATTR, gameCenter.getCurrentPlayers());
        User currentUser = request.session().attribute(Constants.SESSION_USER);
        if (user != currentUser) {
            if (user != null) {
                // Set up game between two players
                try {
                    Game game = gameCenter.newGame(currentUser, user);
                    vm.put(Constants.CHALLENGE_ERROR_ATTR, false);

                    // Set up game view
                    vm.put(Constants.PLAYER_NAME_ATTR, game.getPlayerOne().getName());
                    vm.put(Constants.PLAYER_COLOR_ATTR, game.getPlayerOne().getColor());
                    vm.put(Constants.IS_MY_TURN_ATTR, true);
                    vm.put(Constants.OPPONENT_NAME_ATTR, game.getPlayerTwo().getName());
                    vm.put(Constants.OPPONENT_COLOR_ATTR, game.getPlayerTwo().getColor());
                    vm.put(Constants.GAME_MESSAGE_ATTR, null);
                    vm.put(Constants.BOARD_ATTR, game.getBoard().getBoard());

                    return new ModelAndView(vm, Constants.GAME_VIEW);
                } catch (GameCenterException e) {
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
        } else {
            vm.put(Constants.CHALLENGE_ERROR_ATTR, true);
            vm.put(Constants.CHALLENGE_MESSAGE_ATTR, "Error: Cannot challenge yourself.");
            return new ModelAndView(vm, Constants.HOME_VIEW);
        }
    }
}
