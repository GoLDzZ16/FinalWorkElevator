abstract class Elevator {
    protected int floor;
    protected Status status;

    public Elevator(int floor, Status status) {
        this.floor = floor;
        this.status = status;
    }

    public abstract void move(int targetFloor);

    public abstract void stop();
}