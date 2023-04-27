/* Suppose you have an existing class PaymentGateway that provides a 
    method payWithCreditCard() to process credit card payments.

    Now, you want to integrate a new payment service called 
    PaypalPaymentService, but it has a different interface that expects 
    an email and a password instead of a credit card number. You can 
    create an adapter class PaypalAdapter to convert the interface of 
    PaypalPaymentService to match the PaymentGateway interface.

    Now you can use the PaypalAdapter class to process payments through 
    PaypalPaymentService as if it were a credit card payment. This way, 
    the PaypalPaymentService can be used seamlessly with the PaymentGateway 
    interface, thanks to the PaypalAdapter class that adapts the interface 
    of the PaypalPaymentService to match the PaymentGateway interface.
*/

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
