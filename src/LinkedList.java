public class LinkedList implements IElevator {
    private boolean isFree;
    private LinkedList next;

    public LinkedList(boolean isFree) {
        this.isFree = isFree;
    }

    public void setNext(LinkedList next) {
        this.next = next;
    }

    @Override
    public boolean isFree() {
        return isFree;
    }

    // Метод для определения свободного лифта
    public LinkedList getFreeElevator() throws Exception {
        LinkedList elevator = this;
        while (!elevator.isFree) {
            elevator = elevator.next;
            if (elevator == this) {
                throw new Exception("All elevators are busy");
            }
        }
        return elevator;
    }
}

