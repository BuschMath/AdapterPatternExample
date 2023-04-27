public class PaypalPaymentService {
    private String m_password;
    private String m_cardNumber;

    public String getPassword(){
        return m_password;
    }

    public String getCardNumber(String email, String password){
        return m_cardNumber;
    }
}
