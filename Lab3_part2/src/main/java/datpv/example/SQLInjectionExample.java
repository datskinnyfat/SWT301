package datpv.example;

import java.util.logging.Logger;

public class SQLInjectionExample {
    private static final Logger logger = Logger.getLogger(SQLInjectionExample.class.getName());

    public static void main(String[] args) {
        String userInput = "' OR '1'='1";


        // Giả sử đã có kết nối CSDL (connection)
        logger.info("Thực thi truy vấn an toàn với tham số: " + userInput);

        // Không thực hiện kết nối thật ở đây, chỉ mô phỏng cách an toàn
    }
}
