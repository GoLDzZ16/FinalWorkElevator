import java.util.List;
import java.util.Random;

class CallImpl implements Call {
    private CallType callType;
    private int currentFloor;

    public CallImpl(CallType callType, int currentFloor) {
        this.callType = callType;
        this.currentFloor = currentFloor;
    }

    @Override
    public void callElevator() {
        //нужна реализация вызова
    }
}
