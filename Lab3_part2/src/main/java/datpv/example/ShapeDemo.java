package datpv.example;

import java.util.logging.Logger;

interface Shape {
    void draw();
    void resize();
}

class Square implements Shape {
    private static final Logger logger = Logger.getLogger(Square.class.getName());

    @Override
    public void draw() {
        logger.info("Drawing square");
    }

    @Override
    public void resize() {
        logger.info("Resizing square");
    }
}

public class ShapeDemo {
    public static void main(String[] args) {
        Shape shape = new Square();
        shape.draw();
        shape.resize();
    }
}
