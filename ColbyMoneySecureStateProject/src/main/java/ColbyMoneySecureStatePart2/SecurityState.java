package ColbyMoneySecureStatePart2;

public abstract class SecurityState {
    public boolean loginPassword(System controller, EncryptedString password) { return false; }
    public boolean logout(System controller) { return false; }
    public boolean superuserPassword(System controller) { return false; }
    public boolean connect(System controller) { return false; }
    public boolean disconnect(System controller) { return false; }
    public boolean op1(System controller) { return false; }
    public boolean op2(System controller) { return false; }

    public void setState(System controller, SecurityState newState) {
        controller.setState(newState);
    }
}

