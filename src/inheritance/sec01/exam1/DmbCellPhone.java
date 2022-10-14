package inheritance.sec01.exam1;

public class DmbCellPhone extends CellPhone{

    // 필드
    int chanel;

    // 생성자
    DmbCellPhone(String model, String color, int chanel) {
        this.model = model;
        this.color = color;
        this.chanel = chanel;
    }

    // 메서드
    void turnOnDmb() {
        System.out.println("채널 " + chanel + "번 DMB 방송 수신을 시작합니다");
    }

    void changeChannelDmb(int chanel) {
        this.chanel = chanel;
        System.out.println("채널 " +  chanel + "번으로 바꿉니다");
    }
    void turnOffDmb() {
        System.out.println("DMB 방송 수신을 멈춥니다");
    }
}
