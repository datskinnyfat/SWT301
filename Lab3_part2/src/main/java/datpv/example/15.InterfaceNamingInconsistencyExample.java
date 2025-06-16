// File: SimpleLoginHandler.java
package datpv.example;

import java.util.logging.Logger;

interface LoginHandler {
    String login(String username, String password);
}

class SimpleLoginHandler implements LoginHandler {
    @Override
    public String login(String username, String password) {
        if ("admin".equals(username) && "123456".equals(password)) {
            return "Login successful";
        } else {
            return "Login failed";
        }
    }
}

// Đổi tên class để tránh trùng với class Main ở file khác
class LoginDemo {
    private static final Logger logger = Logger.getLogger(LoginDemo.class.getName());

    public static void main(String[] args) {
        LoginHandler handler = new SimpleLoginHandler();
        String result = handler.login("admin", "123456");
        logger.info(result);
    }
}
