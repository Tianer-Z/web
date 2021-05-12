package javase.reflect;

import java.util.ArrayList;
import java.util.List;

public class AnnotationBuildIn extends Object {
    @Override
    public String toString() {
        return super.toString();
    }
//    @SuppressWarnings("all")

    @Deprecated
    public static int getId() {
        List list = new ArrayList();
        return 0;
    }

    public static void main(String[] args) {
    }

}
