package datpv.example;

public class AccountService {

    public boolean registerAccount(String username, String password, String email) {
        if (username == null || username.isBlank()) return false;
        if (password == null || password.length() <= 6) return false;
        if (!isValidEmail(email)) return false;
        return true;
    }

    public boolean isValidEmail(String email) {
        return email != null && email.matches("^[\\w.-]+@[\\w.-]+\\.[a-zA-Z]{2,}$");
    }
}