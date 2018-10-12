package com.webcheckers.ui.login;

import com.webcheckers.appl.Constants;
import com.webcheckers.appl.GameCenter;
import com.webcheckers.model.User;
import spark.ModelAndView;
import spark.Request;
import spark.Response;
import spark.TemplateViewRoute;

import java.util.HashMap;
import java.util.Map;

public class LoginController implements TemplateViewRoute {

    private GameCenter gameCenter;

    public LoginController(GameCenter gameCenter) {
        this.gameCenter = gameCenter;
    }

    @Override
    public ModelAndView handle(Request request, Response response) {
        User user = request.session().attribute(Constants.SESSION_USER);
        if (user == null) {
            return new ModelAndView(Constants.DEFAULT_LOGIN_VM , Constants.LOGIN_VIEW);
        } else {
            Map<String, Object> vm = new HashMap<>();
            vm.put(Constants.TITLE_ATTR, "Welcome!");
            vm.put(Constants.WELCOME_MESSAGE_ATTR, "Welcome back " + user.getUserName() + "!");
            vm.put(Constants.CURRENT_PLAYERS_ATTR, gameCenter.getCurrentPlayers());
            vm.put(Constants.CHALLENGE_ERROR_ATTR, false);
            return new ModelAndView(vm, Constants.HOME_VIEW);
        }
    }

}
