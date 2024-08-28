package construct;

public class MemberInit {
    String name;
    int age;
    int grade;

    //추가,  this 추가( * 이유 = 더 가까운 것에서 우선순위로 쓰기 때문에..
    // 위에 있는 나의 인스턴스의 name, gae, grade를 쓰기 위해 this를 쓴다.
    // initMember(..) 는 초기값 설정 기능을 제공하는 메서드 이다.
    // 외부에서 자신의 값을 받아서 자신의 값을 바꾼다.
    void initMember(String name, int age, int grade) { // (this에서 꺼내오지 않으면 이곳에서 꺼내서 사용)
        this.name = name;
        this.age = age;
        this.grade = grade;
    }
}
