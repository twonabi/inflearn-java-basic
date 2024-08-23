package ref;

public class NullMain2 {

    public static void main(String[] args) {
        Data data = null;
        data.value = 10; //NullPointException 예외 발생
        // 윗줄에서 예외발생되서 프로그램이 종료 되어 버리기 때문에 프린트는 실행되지 않음.
        System.out.println("data = " + data.value);
    }
}
