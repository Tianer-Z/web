package javase.reflect;


import java.lang.annotation.*;

@MyAnnotionA
public class AnnotationMeta {
    public static void main(String[] args) {

    }
}


@Inherited
@Documented
@Retention(RetentionPolicy.RUNTIME)
@Target(value = {ElementType.TYPE, ElementType.METHOD})
@interface MyAnnotionA {

}