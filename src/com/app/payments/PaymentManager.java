public class PaymentManager {
    private String token;

    public String getToken() {
        return token;  // <-- NullPointerException happens when token is null
    }
}