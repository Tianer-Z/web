package javase.interface_learn.interface_two;

public class Test {
    public static void main(String[] args) {

        Bike bikeA = new Bike("bikeA", 11);
        TransportRecoderForLog.recordTransport(bikeA);

        Bike bikeB = new Bike("bikeB", 22);
        TransportRecoderForLog.recordTransport(bikeB);

        Bike bikeC = new Bike("bikeC", 33);
        TransportRecoderForLog.recordTransport(bikeC);
    }
}
