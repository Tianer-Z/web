package javase.basic;

public class HelloWorldAnoymousClasses {

    interface HelloWorld {
        void greet();
        void greetSomeone(String someone);
    }

    public void sayHello() {

        class EnglishGreeting implements HelloWorld {
            String name = "world";

            @Override
            public void greet() {
                greetSomeone("world");
            }

            @Override
            public void greetSomeone(String someone) {
                name = someone;
                System.out.println("Hello " + name);
            }
        }

        HelloWorld englishGreeting = new EnglishGreeting();

        HelloWorld frechGreeting = new HelloWorld() {

            String name = "tout le mode";
            @Override
            public void greet() {
                greetSomeone("tout le mode");
            }

            @Override
            public void greetSomeone(String someone) {
                name = someone;
                System.out.println("Sault " + name);
            }
        };

        HelloWorld spanishGreeting = new HelloWorld() {
            String name = "mundo";

            @Override
            public void greet() {
                greetSomeone("mundo");
            }

            @Override
            public void greetSomeone(String someone) {
                name = someone;
                System.out.println("Hola " + name);
            }
        };

        englishGreeting.greet();
        spanishGreeting.greet();
        frechGreeting.greetSomeone("Fred");

    }



    public static void main(String[] args) {
        HelloWorldAnoymousClasses myApp = new HelloWorldAnoymousClasses();
        myApp.sayHello();
    }

}
