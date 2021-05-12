package javase.test;

public class HashTest {
     static class Student {
        private String name;
        private int score;

        public Student(String name, int score) {
            this.name = name;
            this.score = score;
        }

        public boolean equals(Object objStu) {
            if (!(objStu instanceof Student)) {
                return false;
            }
            Student other = (Student) objStu;
            return (name.equals(other.name)) && (score == other.score);
        }

        public int hashCode() {
            final int prime = 31;
            int result = 1;
            result = result * prime + ((name == null) ? 0 :name.hashCode() );
            result = result * prime + score;
            return result;
        }

    }


    public static void main(String[] args) {
        Student student1 = new Student("天儿", 98);
        Student student2 = new Student("天儿", 98);

        System.out.println(student1.equals(student2));
        System.out.println(student1.hashCode());
        System.out.println(student2.hashCode());


    }
}
