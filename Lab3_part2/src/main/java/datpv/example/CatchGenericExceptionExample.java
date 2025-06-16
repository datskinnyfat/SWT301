package datpv.example;

import java.util.logging.Logger;

public class CatchGenericExceptionExample {
    private static final Logger logger = Logger.getLogger(CatchGenericExceptionExample.class.getName());

    public static void main(String[] args) {
        String s = getInput(); // phương thức mô phỏng giá trị có thể null

        if (s != null) {
            logger.info("Chiều dài chuỗi: " + s.length());
        } else {
            logger.warning("Chuỗi bị null – không thể lấy độ dài.");
        }
    }

    private static String getInput() {
        return Math.random() > 0.5 ? "Hello" : null;
    }
}
