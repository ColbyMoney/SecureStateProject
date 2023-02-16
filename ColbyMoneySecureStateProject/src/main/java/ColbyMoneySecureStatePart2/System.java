package ColbyMoneySecureStatePart2;

public class System {
    private SecurityState state;
    private UserMachine userMachine;
    private UserCredentials user;

    public System(UserCredentials user) {
        this.user = user;
        userMachine = new UserMachine(user);
        state = LoggedOut.instance(user);
    }

    public void setState(SecurityState newState) {
        this.state = newState;
    }

    public UserCredentials getUser() { return user; }

    public void loginPassword() {

    }

    public void logout() {

    }

    public void superuserPassword() {

    }

    public void connect() {

    }

    public void disconnect() {

    }

    public void op1() {

    }

    public void op2() {

    }


}
