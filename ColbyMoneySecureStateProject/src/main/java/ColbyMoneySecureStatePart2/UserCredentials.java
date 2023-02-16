package ColbyMoneySecureStatePart2;

public class UserCredentials {
    private String name;
    private EncryptedString pw;

    public UserCredentials(String name, EncryptedString pw) {
        this.name = name;
        this.pw = pw;
    }

    public String getName() {
        return name;
    }

    public boolean validate(EncryptedString pw) {
        return pw.equals(this.pw);
    }

    public boolean isAdministrator() {
        if (pw.getString().equals("myPassword")) {
            return true;
        }
        return false;
    }
}
