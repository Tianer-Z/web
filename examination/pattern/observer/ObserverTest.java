package examination.pattern.observer;

import java.util.ArrayList;
import java.util.List;

interface Observer {
    void update(String info);
}

interface Subject {
    void registerObserver(Observer observer);
    void removeObserver(Observer observer);
    void notifyObservers(String msg);

}

class StudentObserver implements Observer {
    String name;

    public StudentObserver(String name) {
        this.name = name;
    }

    @Override
    public void update(String info) {
        System.out.println(name + " 收到消息 " + info);
    }
}

class TeacherSubject implements Subject {
    private List<Observer> observers = new ArrayList<>();

    @Override
    public void registerObserver(Observer observer) {
        observers.add(observer);
    }

    @Override
    public void removeObserver(Observer observer) {
        if (observers.contains(observer)) {
            observers.remove(observer);
        }
    }

    @Override
    public void notifyObservers(String msg) {
        for (Observer observer : observers) {
            observer.update(msg);
        }
    }
}


public class ObserverTest {
    public static void main(String[] args) {
        TeacherSubject teacher = new TeacherSubject();
        StudentObserver student1 = new StudentObserver("张三");
        StudentObserver student2 = new StudentObserver("李四");

        teacher.registerObserver(student1);
        teacher.registerObserver(student2);
        teacher.notifyObservers("收作业了");
    }
}
