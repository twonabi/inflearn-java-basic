package poly.ex3;

public abstract class AbstractAnimal {

    public abstract void sound(); // 반드시 자식이 오버라이드 해야 한다.

    public void move() { // 오버라이드 안해도 된당.
        System.out.println("동물이 움직입니다.");
    }
}
