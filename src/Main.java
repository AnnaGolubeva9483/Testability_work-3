public class Main {
    public static void main(String[] args) {
        CreditPaymentService service = new CreditPaymentService();

        int paymentYear = service.calculate(9.99, 1_000_000, 12);
        System.out.println((paymentYear) + " рублей");

        int paymentTwoYears = service.calculate(9.99, 1_000_000, 24);
        System.out.println((paymentTwoYears) + " рублей");

        int paymentThreeYears = service.calculate(9.99, 1_000_000, 36);
        System.out.println((paymentThreeYears) + " рублей");


    }
}
