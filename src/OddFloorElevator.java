class OddFloorElevator extends Elevator {
    public OddFloorElevator(int floor, Status status) {
        super(floor, status);
    }

    @Override
    public void move(int targetFloor) {
        if (targetFloor % 2 != 0) {
            System.out.println("Moving OddFloorElevator to floor: " + targetFloor);
        } else
            System.out.println("OddFloorElevator cannot move to floor: " + targetFloor);
    }

    @Override
    public void stop() {
        System.out.println("OddFloorElevator stopped");
    }
}