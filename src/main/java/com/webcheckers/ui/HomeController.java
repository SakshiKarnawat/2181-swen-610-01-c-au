package com.webcheckers.ui;

import java.util.HashMap;
import java.util.Map;

import com.webcheckers.appl.Constants;
import com.webcheckers.appl.GameCenter;
import com.webcheckers.model.User;
import spark.ModelAndView;
import spark.Request;
import spark.Response;
import spark.TemplateViewRoute;

/**
 * The Web Controller for the Home page.
 *
 * @author <a href='mailto:bdbvse@rit.edu'>Bryan Basham</a>
 */
public class HomeController extends PostLoginRoute {

  public HomeController(GameCenter gameCenter) {
    super(gameCenter);
  }

  @Override
  public ModelAndView postHandle(Request request, Response response) {
    Map<String, Object> vm = new HashMap<>();
    vm.put(Constants.TITLE_ATTR, "Welcome!");
    User user = request.session().attribute(Constants.SESSION_USER);
    vm.put(Constants.WELCOME_MESSAGE_ATTR, "Welcome back " + user.getUserName() + "!");
    return new ModelAndView(vm , Constants.HOME_VIEW);
  }


}