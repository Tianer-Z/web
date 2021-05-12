package examination.pattern.factory;

interface Shape {
    void draw();
}

class Triangle implements Shape {

    @Override
    public void draw() {
        System.out.println("triangle");
    }
}

class Square implements Shape {

    @Override
    public void draw() {
        System.out.println("square");
    }
}

class ShapeFactory {

    public Shape getShape(String shape) {
        if (shape.equalsIgnoreCase("triangle")) {
            return new Triangle();
        }
        if (shape.equalsIgnoreCase("square")) {
            return new Square();
        }
        return null;
    }
}



public class FactoryDemo {

    public static void main(String[] args) {
        ShapeFactory factory = new ShapeFactory();
        Shape shape1 = factory.getShape("triangle");
        shape1.draw();
        Shape shape2 = factory.getShape("square");
        shape2.draw();
    }

}
