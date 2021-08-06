package examination.pattern.proxy.dynamic;

/**
 * @Author: Zhangsl
 * @Date: 2021/07/24
 */
public class RealPerson implements Person {

    @Override
    public void eat() {
        System.out.println("开始吃饭");
    }

}
