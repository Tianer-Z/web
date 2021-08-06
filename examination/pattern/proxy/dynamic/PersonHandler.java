package examination.pattern.proxy.dynamic;

import java.lang.reflect.InvocationHandler;
import java.lang.reflect.Method;
import java.lang.reflect.Proxy;

/**
 * @Author: Zhangsl
 * @Date: 2021/07/24
 */
public class PersonHandler implements InvocationHandler {

    private Object readlObject;

    public PersonHandler(Object readlObject) {
        this.readlObject = readlObject;
    }

    @Override
    public Object invoke(Object proxy, Method method, Object[] args) throws Throwable {
        before();
        Object value = method.invoke(readlObject, args);
        after();
        return value;
    }

    public void before() {
        System.out.println("洗手");
    }
    public void after() {
        System.out.println("洗碗");
    }


    public static void main(String[] args) {
        Person realPerson = new RealPerson();
        PersonHandler handler = new PersonHandler(realPerson);
        Person proxyPerson = (Person) Proxy.newProxyInstance(realPerson.getClass().getClassLoader(),
                realPerson.getClass().getInterfaces(), handler);
        proxyPerson.eat();
    }
}
