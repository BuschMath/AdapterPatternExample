public class PaymentProcessor {
    public static void main(String[] args) {
        PaymentGateway paymentGateway = new PaymentGateway();

        PaypalPaymentService paypalService = new PaypalPaymentService();
        PaypalAdapter paypalAdapter = new PaypalAdapter(paypalService);

        // process payment with credit card
        paymentGateway.payWithCreditCard("1234 5678 9012 3456", 100.0);

        // process payment with Paypal using the adapter
        paypalAdapter.payWithCreditCard("john@example.com", 200.0);
    }
}
