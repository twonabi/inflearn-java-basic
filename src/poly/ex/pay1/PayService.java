package poly.ex.pay1;

public class PayService {

    public void processPay(String option, int amount) {

        // 변하지 않는 부분
        boolean result = false;
        System.out.println("결제를 시작합니다: option=" + option + ", amount=" +amount);

        Pay pay = PayStore.findPay(option);
        if (pay != null) {
            result = pay.pay(amount);
        }

        if (result) {
            System.out.println("결제가 성공했습니다.");
            System.out.println();
        } else {
            System.out.println("결제가 실패했습니다.");
            System.out.println();
        }
    }
}
