package static2;

//import static static2.DecoData.staticCall;
public class DecoDataMain {

    public static void main(String[] args) {
        System.out.println("1. 정적 호촐");
        DecoData.staticCall();
        DecoData.staticCall();
        DecoData.staticCall();
        DecoData.staticCall();
        DecoData.staticCall();

        System.out.println("2. 인스턴스 호출1");
        DecoData data1 = new DecoData();
        data1.instanceCall();

        System.out.println("3. 인스턴스 호출2");
        DecoData data2 = new DecoData();
        data2.instanceCall();

        //추가
        // 인스턴스를 통한 접근 . // 권장 안함.
        // 인텔리제이에서도 이렇게 하면 안된다고 한디. 클래스를 통한 접근을 해야 한다.
        DecoData data3 = new DecoData();
        data3.staticCall();

        // 클래스를 통한 접근. 명확하게 이렇게 해야 코드를 이해하기 좋다.
        DecoData.staticCall();
    }
}
