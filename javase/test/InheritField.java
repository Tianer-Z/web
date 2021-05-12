package javase.test;

import java.util.ArrayList;
import java.util.List;



public class InheritField {
    class SuperClass {
        protected List<Integer> fun() throws Throwable{
            return null;
        }
    }

    class SubClass extends SuperClass{
        @Override
        public ArrayList<Integer> fun() throws Exception {
            return null;
        }
    }
}
