public class PaypalAdapter extends PaymentGateway {
    private PaypalPaymentService paypalService;

    public PaypalAdapter(PaypalPaymentService paypalService) {
        this.paypalService = paypalService;
    }

    @Override
    public void payWithCreditCard(String email, double amount) {
        // convert email and password to credit card number
        String cardNumber = paypalService.getCardNumber(email, paypalService.getPassword());
        
        // call the original method with the converted card number
        super.payWithCreditCard(cardNumber, amount);
    }
}

