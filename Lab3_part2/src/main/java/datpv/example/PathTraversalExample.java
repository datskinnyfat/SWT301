package datpv.example;

import java.io.*;
import java.util.logging.Logger;

public class PathTraversalExample {
    private static final Logger logger = Logger.getLogger(PathTraversalExample.class.getName());

    public static void main(String[] args) throws IOException {
        String userInput = "../secret.txt";
        File file = new File(userInput);

        // Ngăn chặn Path Traversal bằng cách kiểm tra canonical path
        File allowedDir = new File("allowed_dir");
        String canonicalBase = allowedDir.getCanonicalPath();
        String canonicalTarget = file.getCanonicalPath();

        if (canonicalTarget.startsWith(canonicalBase) && file.exists()) {
            try (BufferedReader ignored = new BufferedReader(new FileReader(file))) {
                logger.info("Reading file: " + file.getPath());
            }
        } else {
            logger.warning("Access denied: Invalid file path.");
        }
    }
}
