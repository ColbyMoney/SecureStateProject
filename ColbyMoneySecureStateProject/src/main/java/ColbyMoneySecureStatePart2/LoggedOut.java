package ColbyMoneySecureStatePart2;

import java.util.HashMap;

class LoggedOut extends SecurityState {
    private static HashMap<UserCredentials, LoggedOut> instances =
            new HashMap<UserCredentials, LoggedOut>();
    public static LoggedOut instance(UserCredentials user) {
        if (!instances.containsKey(user))
            instances.put(user, new LoggedOut(user));
        return instances.get(user);
    }
    private UserCredentials user;

    public LoggedOut(UserCredentials user) { this.user = user; }

    public boolean loginPassword(System controller, EncryptedString password) {
        if (controller.getUser().validate(password)) {
            if (controller.getUser().isAdministrator()) {
                setState(controller, LoggedInAdmin.instance(user)); }
            else {
                setState(controller, LoggedInUser.instance(user)); }
            return true;
        }
        return false;
    }
}

