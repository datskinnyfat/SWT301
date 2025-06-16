package datpv.example;

import java.util.logging.Logger;

public class NullPointerExample {
    private static final Logger logger = Logger.getLogger(NullPointerExample.class.getName());

    public static void main(String[] args) {
        String text = getInput(); // giá trị có thể là null hoặc không

        if (text != null && !text.isEmpty()) {
            logger.info("Text is not empty");
        } else {
            logger.warning("Text is null or empty");
        }
    }

    private static String getInput() {
        // Mô phỏng một hàm trả về chuỗi có thể null hoặc không
        return Math.random() > 0.5 ? "Hello" : null;
    }
}
