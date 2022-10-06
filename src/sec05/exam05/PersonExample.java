package sec05.exam05;

public class PersonExample {

    public static void main(String[] args) {

        Person p1 = new Person("123456-123456", "이재선");

        System.out.println(p1.nation);
        System.out.println( p1.name);
        System.out.println(p1.ssn);

        // p1.nation = "usa";
        // p1.ssn = "32124-1231251";
        p1.name = "홍길동";
        System.out.println(p1.name);
    }
}
