package final1;

public class FieldInit {

    static final int CONST_VALUE = 10;
    // static final 은 변수명을 대문자로 써야 한다. 상수라고 한다.
    final int value = 10;
    // 값을 이미 할당하여 생성자에서도 값을 바꿀수 없음.(이미 필드에서 초기화를 했기 때문에)
}
