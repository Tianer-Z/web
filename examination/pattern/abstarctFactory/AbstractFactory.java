package examination.pattern.abstarctFactory;

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



interface Color {
    void fill();
}

class Red implements Color{

    @Override
    public void fill() {
        System.out.println("red");
    }
}

class Blue implements Color{

    @Override
    public void fill() {
        System.out.println("blue");
    }
}

class ColorFactory extends AbstractFactory{

    public Color getColor(String color) {
        if (color.equalsIgnoreCase("red")) {
            return new Red();
        }
        if (color.equalsIgnoreCase("blue")) {
            return new Blue();
        }
        return null;
    }

    @Override
    public Shape getShape(String shape) {
        return null;
    }

}

class ShapeFactory extends AbstractFactory {

    @Override
    public Color getColor(String color) {
        return null;
    }

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

public abstract class AbstractFactory {
    public abstract Color getColor(String color);
    public abstract Shape getShape(String shape);
}

class FactoryProducer {
    public static AbstractFactory getFactory(String choice) {
        if (choice.equalsIgnoreCase("shape")) {
            return new ShapeFactory();
        }
        if (choice.equalsIgnoreCase("color")) {
            return new ColorFactory();
        }
        return null;
    }
}


class Demo {
    public static void main(String[] args) {
        AbstractFactory factory = FactoryProducer.getFactory("color");
        Color color = factory.getColor("red");
        color.fill();
    }
}