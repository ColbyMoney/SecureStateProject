package ColbyMoneySecureStatePart1;

public class ReviewingState implements State {
    public StateMachine stateMachine;

    public ReviewingState(StateMachine stateMachine) {
        this.stateMachine = stateMachine;
    }

    public void write() {
        System.out.println("Unable to write a document. One has already been written.");
    }

    public void reject() {
        System.out.println("The document has been rejected!");
        stateMachine.setState(stateMachine.getWritingState());
    }

    public void accept() {
        System.out.println("The document has been accepted.");
        stateMachine.setState(stateMachine.getPublishedState());
    }
}
