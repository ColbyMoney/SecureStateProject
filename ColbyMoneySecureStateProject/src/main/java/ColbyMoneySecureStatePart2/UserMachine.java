package ColbyMoneySecureStatePart2;

public class UserMachine {
    private boolean connected;
    private UserCredentials user;
    // Someone is trying to log onto the system as the current user.
    public void connect(EncryptedString password) {
        java.lang.System.out.println("Logging in " + user.getName());
        connected = true;
    }
    // The user is logging out.
    public void disconnect() {connected = false;}
    // The user is attempting to perform one of the three user-level
    // system operations.
    public void op1() {
        java.lang.System.out.println("this is op1");}
    public void op2() {
        java.lang.System.out.println("this is op2");}

    // Create a new user functionality state machine for the given user.
    public UserMachine(UserCredentials user) {
        this.user = user;
        this.connected = false;
    };

    public boolean isConnected() {
        return connected;
    }

    public void setConnected(boolean connected) {
        this.connected = connected;
    }
}
