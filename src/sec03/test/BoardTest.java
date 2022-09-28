package sec03.test;

public class BoardTest {
    public static void main(String[] args) {
        Board board1 = new Board("이재선", "숨쉬기");
        Board board2 = new Board("이재선", "숨쉬기", "성윤모");
        Board board3 = new Board("이재선", "숨쉬기", "성윤모", "오늘");
        Board board4 = new Board("이재선", "숨쉬기", "성윤모", "오늘", 500);


        System.out.println(board1.titie);
        System.out.println(board1.writer);
        System.out.println(board1.date);
        System.out.println(board1.hitcount);

        System.out.println("------------------");

        System.out.println(board2.date);
        System.out.println(board2.hitcount);

        System.out.println("---------------");

        System.out.println(board3.hitcount);

        System.out.println("---------------");
        System.out.println(board4.writer);
        System.out.println(board4.date);
        System.out.println(board4.hitcount);
        System.out.println(board4.titie);

    }
}
