public class CreditPaymentService {
    public float calculate(float sum, float percent, int period) {
        float payment = 0;
        float monthlyRate = 0;
        float ratio = 0;
        /* месячная процентная ставка */
        monthlyRate = percent / 12 / 100;
        /* коэффициент аннуитетного платежа */
        ratio = (monthlyRate * (float) Math.pow((1 + monthlyRate), period)) / ((float) Math.pow((1 + monthlyRate), period) - 1);
        /* ежемесячный платеж */
        payment = sum * ratio;
        return payment;
    }
}