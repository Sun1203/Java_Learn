package class1.sec03.exam02;

public class KoreanExample {
    public static void main(String[] args) {
        class1.sec03.exam02.Korean k1 = new class1.sec03.exam02.Korean("박자바", "971203-1234567");
        System.out.println("k1.nation : " + k1.nation);
        System.out.println("k1.name  : " + k1.name);
        System.out.println("k1.ssn : " + k1.ssn);

        class1.sec03.exam02.Korean k2 = new class1.sec03.exam02.Korean("김자바", "931203-1234512");
        System.out.println("k2.nation : " + k2.nation);
        System.out.println("k2.name  : " + k2.name);
        System.out.println("k2.ssn : " + k2.ssn);
    }
}
