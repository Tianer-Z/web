package javase.exception;

public class Test {
    public static void main(String[] args) throws CapcacityTooSmallException {
        Cup cup = new Cup();
        CupDesigner cupDesigner = new CupDesigner(cup);
//        cupDesigner.designCupCapacity(-1);
        cupDesigner.designCupCapacity(1000000);

//        cup.setCapacity(10000000);

    }
}
