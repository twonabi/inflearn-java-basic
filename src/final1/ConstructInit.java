package final1;

public class ConstructInit {

    final int value;
    // 이처럼 값을 지정하지 않으면 생성자를 통해 값을 할당하게 된다.

    public ConstructInit(int value) {
        this.value = value; // 값을 최초 한번 할당하면(초기화를 하면) 이후에는 값을 변경할 수 없다.
    }
}
