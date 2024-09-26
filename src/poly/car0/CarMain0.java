package poly.car0;

public class CarMain0 {

    public static void main(String[] args) {
        Driver driver = new Driver();
        K3Car k3Car = new K3Car();
        driver.setK3Car(k3Car);
        driver.drive();

        // - K3를 운전하던 운전자가 Model3로 차량을 변경해서 운전하는 코드이다.
        //추가
        Model3Car model3Car = new Model3Car();
        driver.setK3Car(null); // 기존 K3Car 의 참조를 제거!
        driver.setModel3Car(model3Car); // 새로운 참조 추가!
        driver.drive(); // 호출!!
    }
}
