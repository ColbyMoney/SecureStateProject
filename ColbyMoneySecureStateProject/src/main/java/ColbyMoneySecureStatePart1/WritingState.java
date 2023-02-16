package ColbyMoneySecureStatePart1;

public class WritingState implements State {
    public StateMachine stateMachine;

    public WritingState(StateMachine stateMachine) {
        this.stateMachine = stateMachine;
    }

    public void write() {
        System.out.println("You have written a document.");
        stateMachine.setState(stateMachine.getReviewingState());
    }

    public void reject() {
        System.out.println("There is no document to reject.");
    }

    public void accept() {
        System.out.println("There is no document to accept.");
    }
}
