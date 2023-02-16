package ColbyMoneySecureStatePart1;

public class StateMachine {
    public State writingState;
    public State reviewingState;
    public State publishedState;

    public State state = writingState;

    public StateMachine() {
        writingState = new WritingState(this);
        reviewingState = new ReviewingState(this);
        publishedState = new PublishedState(this);
    }

    public void setState(State state) {
        this.state = state;
    }

    public State getWritingState() {
        return writingState;
    }

    public State getReviewingState() {
        return reviewingState;
    }

    public State getPublishedState() {
        return publishedState;
    }

    public void write() { state.write(); }
    public void reject() { state.reject(); }
    public void accept() { state.accept(); }
}
