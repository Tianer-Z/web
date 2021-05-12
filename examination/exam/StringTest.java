package examination.exam;

public class StringTest {
        public static void main(String []args) {
            String str1 = "abc";
            String str2 = new String("def");
            String str3 = "abc";
            String str4 = str2.intern();
            String str5 = "def";
            System.out.println(str1 == str3);//true
            System.out.println(str2 == str4);//false
            System.out.println(str4 == str5);//true




//            String str1 = "str";
//            String str2 = "ing";
//
//            String str3 = "str" + "ing";
//            String str4 = str1 + str2;
//            System.out.println(str3 == str4);//false
//
//            String str5 = "string";
//            System.out.println(str3 == str5);//true
    }
}
