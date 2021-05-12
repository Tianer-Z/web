package javase.reflect;

import java.lang.annotation.*;

@MyAnnotion(value = {})
//@MyAnnotion(name = "a", a = 'c', value = 1)
public class AnnotationCustom {

}

@Retention(RetentionPolicy.RUNTIME)
@Target({ElementType.TYPE, ElementType.METHOD})
@interface MyAnnotion {
//    String name() default "";
//    char a() default 1;
    int[] value() ;
//    Class c() ;
}
