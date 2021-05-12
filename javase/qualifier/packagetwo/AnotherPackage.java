package javase.qualifier.packagetwo;


import javase.qualifier.packageone.Father;

public class AnotherPackage extends Father {
//    public void usingProtectedMethond(){
//        super.protectedMethond();
//    }
//
//    public void protectedMethond(){
//
//    }
    public static void main(String[] args) {
        AnotherPackage anotherPackage = new AnotherPackage();
        anotherPackage.protectedMethond();
    }
}
