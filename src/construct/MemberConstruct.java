package construct;

public class MemberConstruct {
    String name;
    int age;
    int grade;

    // 추가 (오버로딩) -> this() 자기 자신의(17번줄에 있는) 생성자를 호출
    MemberConstruct(String name, int age) {
        this(name, age, 50); // this() 호출로 변경 후
        /*this.name = name; // 변경전.
        this.age = age;
        this.grade = 50;*/

    }

    MemberConstruct(String name, int age, int grade) {
        System.out.println("생성자 호출 name=" + name + ",age" + age + ",grade=" + grade);
        this.name = name;
        this.age = age;
        this.grade = grade;
    }
}
