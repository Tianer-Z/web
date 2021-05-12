package javase.exception;

public class CupDesigner {
    private Cup cup;

    public CupDesigner(Cup cup) {
        this.cup = cup;
    }

    public void designCupCapacity(int capacity) throws CapcacityTooSmallException {
        try {
            cup.setCapacity(capacity);
//        } catch (CapcacityTooSmallException e) {
//            System.out.println("捕获异常");
//            System.out.println(e.getMessage());
//            return ;
        } catch (CapacityTooBigException e) {
            System.out.println("捕获异常");
            System.out.println(e.getMessage());
            e.printStackTrace();
        }
        finally {
            System.out.println("天儿");
        }
    }
}
