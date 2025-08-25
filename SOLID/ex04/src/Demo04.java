public class Demo04 {
    public static void main(String[] args) {
        PaymentService ps = new UPIPaymentService();
        System.out.println(ps.pay(499));
    }
}
