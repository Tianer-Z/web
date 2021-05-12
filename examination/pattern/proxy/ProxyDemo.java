package examination.pattern.proxy;

interface Image {
    void display();
}

class RealImage implements Image {
    private String filename;

    public RealImage(String filename) {
        this.filename = filename;
        loadImage();
    }

    @Override
    public void display() {
        System.out.println("展示图像");
    }

    public void loadImage() {
        System.out.println("从磁盘加载图像");
    }

}

class ProxyImage implements Image {

    private String filename;
    private RealImage realImage;

    public ProxyImage(String filename) {
        this.filename = filename;
    }

    @Override
    public void display() {
        if (realImage == null) {
            realImage = new RealImage(filename);
        }
        realImage.display();
    }
}

public class ProxyDemo {
    public static void main(String[] args) {
        Image image = new ProxyImage("123.png");
        image.display();
        System.out.println("============================");
        image.display();
    }
}
