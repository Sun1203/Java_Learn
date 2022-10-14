package sec01.exam01;

public class Student {
    public static void main(String[] args) {
        // 클래스 : 객체를 만들기 위한 설계도.
        // 객체 : 클래스로부터 생성되면 new 클래스()로 생성함.
        // new 연산자 : 객체 생성 연산자이며, 생성자를 호출하고 객체 생성 번지를 리턴.
        // 클래스 변수 : 클래스로 선언한 변수를 말하면 해당 클래스의 객체 번지가 저장됨.
        // 인스턴스 : 객체는 클래스의 인스턴스.
        // 클래스 멤버 : 클래스에 선언되는 멤버는 필드, 생성사, 메소드가 있음.

        Student s1 = new Student();
        System.out.println("s1 변수가 Student 객체를 참조합니다. ");

        Student s2 = new Student();
        System.out.println("s2 변수가 또 다른 Student 객체를 참조합니다");
    }
}