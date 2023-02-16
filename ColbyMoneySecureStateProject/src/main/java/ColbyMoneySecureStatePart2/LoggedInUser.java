package ColbyMoneySecureStatePart2;

import java.util.HashMap;

class LoggedInUser extends SecurityState {
    private static HashMap<UserCredentials, LoggedInUser> instances =
            new HashMap<UserCredentials, LoggedInUser>();
    public static LoggedInUser instance(UserCredentials user) {
        if (!instances.containsKey(user))
            instances.put(user, new LoggedInUser(user));
        return instances.get(user); }
    private UserCredentials user;
    public LoggedInUser(UserCredentials user) {
        this.user = user;
    }

    public boolean superuserPassword(System controller, EncryptedString password) {
        if (controller.getUser().validate(password)) {
            setState(controller, LoggedInSuperuser.instance(user));
            return true;
        }
        return false;
    }


    public boolean logout(System controller) {
        setState(controller, LoggedOut.instance(user));
        return true;
    }
    public boolean op1(System controller) { return true; }
    // users aren't allowed to do op2
    public boolean op2(System controller) { return false; }
}




