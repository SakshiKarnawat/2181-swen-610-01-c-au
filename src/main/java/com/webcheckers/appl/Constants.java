package com.webcheckers.appl;

import java.util.HashMap;
import java.util.Map;

/**
 * Constants class stores urls, attributes, VIEW names used by other classes
 */
public class Constants {

    // URLS
    public static final String HOME_URL = "/home";
    public static final String LOGIN_URL = "/";
    public static final String LOGOUT_URL = "/logout";
    public static final String GAME_URL = "/game";
    public static final String CHALLENGE_URL = "/challenge";

    // Session Attributes
    public final static String SESSION_USER = "user";

    // General Page Attributes
    public static final String TITLE_ATTR = "title";

    // Login Page Attributes
    public static final String FAILED_LOGIN_MESSAGE_ATTR = "failedLoginMessage";
    public static final String FAILED_LOGIN_ATTR = "failedLogin";

    // Home Page Attributes
    public static final String WELCOME_MESSAGE_ATTR = "welcomeMessage";
    public static final String CURRENT_PLAYERS_ATTR = "currentPlayers";
    public static final String CHALLENGE_ERROR_ATTR = "challengeError";
    public static final String CHALLENGE_MESSAGE_ATTR = "challengeMessage";

    // Game Page Attributes
    public static final String PLAYER_NAME_ATTR = "playerName";
    public static final String PLAYER_COLOR_ATTR = "playerColor";
    public static final String IS_MY_TURN_ATTR = "isMyTurn";
    public static final String OPPONENT_NAME_ATTR = "opponentName";
    public static final String OPPONENT_COLOR_ATTR = "opponentColor";
    public static final String GAME_MESSAGE_ATTR = "gameMessage";
    public static final String BOARD_ATTR = "board";

    // View Names
    public static final String HOME_VIEW = "home.ftl";
    public static final String LOGIN_VIEW = "login.ftl";
    public static final String GAME_VIEW = "game.ftl";

    // Login VM
    public static final Map<String, Object> DEFAULT_LOGIN_VM;

    static {
        DEFAULT_LOGIN_VM = new HashMap<>();
        DEFAULT_LOGIN_VM.put(Constants.TITLE_ATTR, "Login");
        DEFAULT_LOGIN_VM.put(Constants.FAILED_LOGIN_ATTR, false);
        DEFAULT_LOGIN_VM.put(Constants.FAILED_LOGIN_MESSAGE_ATTR, "");
    }

}
