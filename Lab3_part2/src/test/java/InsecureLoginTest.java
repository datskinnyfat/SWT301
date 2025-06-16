import org.junit.jupiter.api.Test;
import datpv.example.InsecureLogin;

class InsecureLoginTest {

    @Test
    void testLoginFail() {
        InsecureLogin.login("user", "wrongpassword");
    }

}
