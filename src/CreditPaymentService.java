public class CreditPaymentService {
    public int calculate(double rateYear, int amountCredit, int termInMonth) {
        double rateMonth = rateYear / 12 / 100;
        double x = Math.pow((1 + rateMonth), termInMonth);
        double coefficient = (rateMonth * x) / (x - 1);
        double payment = amountCredit * coefficient;
        return (int) payment;
    }

}
