package datpv.example;

import java.util.logging.Logger;

class Constants {
    public static final int MAX_USERS = 100;
    private Constants() {
        // ngăn tạo instance
    }

}

public class InterfaceFieldModificationExample {
    private static final Logger logger = Logger.getLogger(InterfaceFieldModificationExample.class.getName());

    public static void main(String[] args) {
        logger.info("Giá trị MAX_USERS là: " + Constants.MAX_USERS);
    }
}
