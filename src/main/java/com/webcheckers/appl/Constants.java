package com.webcheckers.appl;

import java.util.HashMap;
import java.util.Map;

public class Constants {

    // Session Attributes
    public final static String SESSION_USER = "user";

    // Page Attributes
    public static final String TITLE_ATTR = "title";
    public static final String WELCOME_MESSAGE_ATTR = "welcomeMessage";
    public static final String FAILED_LOGIN_MESSAGE_ATTR = "failedLoginMessage";
    public static final String FAILED_LOGIN_ATTR = "failedLogin";

    // View Names
    public static final String HOME_VIEW = "home.ftl";
    public static final String LOGIN_VIEW = "login.ftl";

    // Login VM
    public static final Map<String, Object> DEFAULT_LOGIN_VM;

    static {
        DEFAULT_LOGIN_VM = new HashMap<>();
        DEFAULT_LOGIN_VM.put(Constants.TITLE_ATTR, "Login");
        DEFAULT_LOGIN_VM.put(Constants.FAILED_LOGIN_ATTR, false);
        DEFAULT_LOGIN_VM.put(Constants.FAILED_LOGIN_MESSAGE_ATTR, "");
    }

}
