package ColbyMoneySecureStatePart2;

import java.util.HashMap;

class LoggedInSuperuser extends SecurityState {
    private static HashMap<UserCredentials, LoggedInSuperuser> instances =
            new HashMap<UserCredentials, LoggedInSuperuser>();
    public static LoggedInSuperuser instance(UserCredentials user) {
        if (!instances.containsKey(user))
            instances.put(user, new LoggedInSuperuser(user));
        return instances.get(user); }

    private UserMachine userState;

    private UserCredentials user;
    public LoggedInSuperuser(UserCredentials user) {
        this.user = user;
        userState = new UserMachine(user);
    }
    public boolean logout(System controller) {
        setState(controller, LoggedInUser.instance(user));
        return true;
    }
    public boolean op1(System controller) { return true; }
    // superusers are allowed to do op2?
    public boolean op2(System controller) { return true; }

    public boolean connect() {
        if (userState.isConnected() == false) {
            userState.setConnected(true);
            return true;
        }
        else
            return true;
    }

    public boolean disconnect() {
        if (userState.isConnected() == true) {
            userState.setConnected(false);
            return false;
        }
        else
            return false;
    }
}





