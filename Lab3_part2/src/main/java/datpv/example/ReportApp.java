package datpv.example;

import java.util.logging.Logger;

class Printer {
    private static final Logger logger = Logger.getLogger(Printer.class.getName());

    void print() {
        logger.info("Generating report...");
    }
}

class Report {
    private final Printer printer = new Printer(); // đã thêm 'final'

    void generate() {
        printer.print();
    }
}

public class ReportApp {
    public static void main(String[] args) {
        Report report = new Report();
        report.generate(); // Gọi để tránh cảnh báo unused
    }
}
