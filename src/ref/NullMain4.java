package ref;

public class NullMain4 {

    public static void main(String[] args) {
        BigData bigData = new BigData();
        bigData.data = new Data(); //NullPointerException 을 해결하는 방법.
        System.out.println("bigData.count = " + bigData.count);
        System.out.println("bigData.data = " + bigData.data);

        //NullPointerException 원래 발생되는 부분이었음.
        System.out.println("bigData.data.value = " + bigData.data.value);
    }
}
