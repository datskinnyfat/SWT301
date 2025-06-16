package datpv.example;

import java.util.logging.Logger;

class User {
    private static final Logger logger = Logger.getLogger(User.class.getName());

    private final String name;
    private final int age;

    public User(String name, int age) {
        this.name = name;
        this.age = age;
    }

    public void display() {
        logger.info("Name: " + name + ", Age: " + age);
    }

    // Getters (nếu cần)
    public String getName() {
        return name;
    }

}

public class UserApp {
    public static void main(String[] args) {
        User user = new User("Alice", 30);
        user.display();
    }
}
