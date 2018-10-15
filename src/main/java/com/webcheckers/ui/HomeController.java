package com.webcheckers.ui;

import com.webcheckers.appl.Constants;
import com.webcheckers.appl.GameCenter;
import com.webcheckers.model.User;
import spark.ModelAndView;
import spark.Request;
import spark.Response;

import java.util.HashMap;
import java.util.Map;

/**
 * Controller for the home page, display welcome message and gather player and challenge information
 */
public class HomeController extends PostLoginRoute {

  public HomeController(GameCenter gameCenter) {
    super(gameCenter);
  }

  /**
   * Create a HashMap and put in user names to the welcome information and challenge error state
   * @param request - Spark Request
   * @param response - Spark Response
   * @return Model and View for Home page
   */
  @Override
  public ModelAndView postHandle(Request request, Response response) {
    Map<String, Object> vm = new HashMap<>();
    vm.put(Constants.TITLE_ATTR, "Welcome!");
    User user = request.session().attribute(Constants.SESSION_USER);
    vm.put(Constants.WELCOME_MESSAGE_ATTR, "Welcome back " + user.getUserName() + "!");
    vm.put(Constants.CURRENT_PLAYERS_ATTR, gameCenter.getCurrentPlayers());
    vm.put(Constants.CHALLENGE_ERROR_ATTR, false);
    return new ModelAndView(vm , Constants.HOME_VIEW);
  }


}