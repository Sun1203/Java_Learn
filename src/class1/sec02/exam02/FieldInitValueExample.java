package sec02.exam02;

public class FieldInitValueExample {
    public static void main(String[] args) {
        // 필드 선언 : 클래스 중괄호 {} 블록 어디서든 선언하나, 생성자와 메소드 내부에서는 선언할 수 없습니다.
        // 필드 사용 : 클래스 내부의 생성자와 메소드에서 바로 사용이 가능하나, 클래스 외부에서 사용할 경우에는 반드시 객체를 생성하고 참조 변수를 통해 사용해야 함.


        FieldInitValue fiv = new FieldInitValue();

        System.out.println("byteField : " + fiv.byteField);
        System.out.println("shortField : " + fiv.shortField);
        System.out.println("intField : " + fiv.intField);
        System.out.println("longField : " + fiv.longField);
        System.out.println("booleanField : " + fiv.booleanField);
        System.out.println("charField : " + fiv.charField);
        System.out.println("floatField : " + fiv.floatField);
        System.out.println("doubleField : " + fiv.doubleField);
        System.out.println("arrField : " + fiv.arrField);
        System.out.println("referenceField : " + fiv.referenceField);
    }
}
