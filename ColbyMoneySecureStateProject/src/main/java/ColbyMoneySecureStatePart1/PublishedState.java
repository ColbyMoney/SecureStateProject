package ColbyMoneySecureStatePart1;

public class PublishedState implements State {
    public StateMachine stateMachine;

    public PublishedState(StateMachine stateMachine) {
        this.stateMachine = stateMachine;
    }

    public void write() {
        System.out.println("Unable to write. Document already written.");
    }

    public void reject() {
        System.out.println("Cannot reject. Document already accepted.");
    }

    public void accept() {
        System.out.println("Cannot accept. Document already accepted.");
    }
}
