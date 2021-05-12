package javase.interface_learn.interface_two;

public class TransportRecoderForLog {
    public static int counter = 0;
    public static void recordTransport(RecordeAble recordeAble) {
        if (recordeAble == null) {
            return ;
        } else {
            counter++;
            TransportStatusForLog status = recordeAble.getTransportStatus();
            System.out.println("当前为第" + counter + "辆车");
            System.out.println("车名为" + status.getName() + "车速为:" + status.getSpeed());
        }
    }
}