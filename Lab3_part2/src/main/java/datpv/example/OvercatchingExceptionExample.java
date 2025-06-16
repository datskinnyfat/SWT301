package datpv.example;

import java.util.logging.Logger;

public class OvercatchingExceptionExample {
    private static final Logger logger = Logger.getLogger(OvercatchingExceptionExample.class.getName());

    public static void main(String[] args) {
        try {
            int[] arr = new int[5];
            arr[0] = 42; // Gán giá trị để tránh cảnh báo "never written to"
            logger.info("Array element: " + arr[0]); // Truy cập chỉ số hợp lệ
        } catch (ArrayIndexOutOfBoundsException e) {
            logger.severe("Array index is out of bounds: " + e.getMessage());
        }
    }
}
