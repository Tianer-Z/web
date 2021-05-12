package javase.generic;

import java.util.ArrayList;
import java.util.List;

public class Cachu {
    public static void main(String[] args) {
        List<?> list = new ArrayList<Integer>();
        list.get(0);
    }
}
