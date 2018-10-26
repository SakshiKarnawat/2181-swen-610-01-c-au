import com.webcheckers.appl.GameCenter;
import static org.junit.Assert.*;
import static org.mockito.Mockito.*;

import com.webcheckers.model.User;
import org.junit.Test;
import spark.Session;

public class GameCenterTest {

    private static final String USERNAME = "George";
    /**
     * Test that the no-arg constructor works without failure.
     */
    @Test
    public void cstor_noArg() { new GameCenter();  }

    /**
     * Test the login method
     */
    @Test
    public void login() {

        final GameCenter CuT = new GameCenter();
        // Arrange the test scenario: There is a session with given username.
        final Session session = mock(Session.class);
        // Invoke the test
        boolean boo = CuT.login(USERNAME,session);
        // Analyze the result
        assertTrue(boo);
        // try the same username again
        boolean bo = CuT.login(USERNAME,session);
        assertFalse(bo);

    }

    /**
     *   Test the logout method
     */
    @Test
    public void logout() {
        final GameCenter CuT = new GameCenter();
        final Session session = makeSession();
        CuT.logout(session);
    }
    /** Make a new session with a user in it. */
    private Session makeSession() {
        final Session session = mock(Session.class);
        final GameCenter gamecenter = new GameCenter();
        gamecenter.login(USERNAME,session);
        return session;
    }
    /**
     * Test the getUser method
     */
    @Test
    public void getUser() {
        final GameCenter CuT = new GameCenter();
        // Invoke the test
        final User user = CuT.getUser("asdf");
    }

    /**
     * Test the getCurrentPlayers method
     */
    @Test
    public void getCurrentPlayers() {

    }

    /**
     * Test the newGame method
     */
    @Test
    public void newGame() {

    }
}
