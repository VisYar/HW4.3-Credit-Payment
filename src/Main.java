public class Main {
    public static void main(String[] args) {
        CreditPaymentService payment = new CreditPaymentService();

        int payment1 = (int) payment.calculate(1_000_000, 9.99F, 12);
        System.out.println("Ежемесячный платёж по кредиту на 1 год  составит " + payment1 + " рублей");

        int payment2 = (int) payment.calculate(1_000_000, 9.99F, 24);
        System.out.println("Ежемесячный платёж по кредиту на 2 года составит " + payment2 + " рублей");

        int payment3 = (int) payment.calculate(1_000_000, 9.99F, 36);
        System.out.println("Ежемесячный платёж по кредиту на 3 года составит " + payment3 + " рублей");
    }
}