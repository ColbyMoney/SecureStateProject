package ColbyMoneySecureStatePart2;

import java.util.HashMap;

class LoggedInAdmin extends SecurityState {
    private static HashMap<UserCredentials, LoggedInAdmin> instances =
            new HashMap<UserCredentials, LoggedInAdmin>();

    private UserMachine userState;

    public static LoggedInAdmin instance(UserCredentials user) {
        if (!instances.containsKey(user))
            instances.put(user, new LoggedInAdmin(user));
        return instances.get(user); }
    private UserCredentials user;
    public LoggedInAdmin(UserCredentials user) {
        this.user = user;
        userState = new UserMachine(user);
    }
    public boolean logout(System controller) {
        setState(controller, LoggedOut.instance(user));
        return true;
    }
    public boolean op1(System controller) { return true; }
    public boolean op2(System controller) {
        return true;
    }

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




