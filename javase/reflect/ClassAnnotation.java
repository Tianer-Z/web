package javase.reflect;

import java.lang.annotation.*;
import java.lang.reflect.Field;

public class ClassAnnotation {
    public static void main(String[] args) throws NoSuchFieldException {
        Class c1 = Student2.class;

        Annotation[] annotations = c1.getAnnotations();
        for (Annotation annotation : annotations) {
            System.out.println(annotation);
        }

        StudentTable studentTable = (StudentTable) c1.getAnnotation(StudentTable.class);
        System.out.println(studentTable.value());

        Field field = c1.getDeclaredField("name");
        StudentField fieldAnnotation = field.getAnnotation(StudentField.class);
        System.out.println(fieldAnnotation.columnName());
        System.out.println(fieldAnnotation.type());
        System.out.println(fieldAnnotation.length());

    }
}

@StudentTable("db_student")
class Student2 {
    @StudentField(columnName = "db_id", type = "int", length = 10)
    int id;

    @StudentField(columnName = "db_age", type = "int", length = 10)
    int age;

    @StudentField(columnName = "db_name", type = "varchar", length = 10)
    String name;

    public Student2() {
    }

    @Override
    public String toString() {
        return "Student2{" +
                "id=" + id +
                ", age=" + age +
                ", name='" + name + '\'' +
                '}';
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }
}


@Target(ElementType.TYPE)
@Retention(RetentionPolicy.RUNTIME)
@interface StudentTable {
    String value();
}

@Target(ElementType.FIELD)
@Retention(RetentionPolicy.RUNTIME)
@interface StudentField {
    String columnName();
    String type();
    int length();
}