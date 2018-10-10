package com.webcheckers.ui.login;

import com.webcheckers.appl.Constants;
import spark.ModelAndView;
import spark.Request;
import spark.Response;
import spark.TemplateViewRoute;

public class LoginController implements TemplateViewRoute {

    @Override
    public ModelAndView handle(Request request, Response response) {
        return new ModelAndView(Constants.DEFAULT_LOGIN_VM , Constants.LOGIN_VIEW);
    }

}
