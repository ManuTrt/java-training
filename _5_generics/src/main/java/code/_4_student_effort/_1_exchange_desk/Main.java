package code._4_student_effort._1_exchange_desk;

public class Main {
    public static void main(String[] args) {

        ExchangeDesk ed = new ExchangeDesk();
        Ron ronValue = new Ron(20);
        EUR eurValue = new EUR(5);
        USD usdValue = new USD(6);

        USD newVal = ed.exchange(ronValue, USD.class, (float)2.4);
        System.out.println("Exchange result="+newVal.getValue());

        EUR newVal2 = ed.exchange(ronValue, EUR.class, (float)(1/4.8));
        System.out.println("Exchange result="+newVal2.getValue());

        EUR newVal3 = ed.exchange(usdValue, EUR.class, (float)(1/2.8));
        System.out.println("Exchange result="+newVal3.getValue());
    }
}
