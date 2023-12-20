class EvenFloorElevator extends Elevator {
    public EvenFloorElevator(int floor, Status status) {
        super(floor, status);
    }

    @Override
    public void move(int targetFloor) {
        if (targetFloor % 2 == 0) {
            System.out.println("Moving EvenFloorElevator to floor: " + targetFloor);
        } else
            System.out.println("EvenFloorElevator cannot move to floor: " + targetFloor);
    }

    @Override
    public void stop() {
        System.out.println("EvenFloorElevator stopped");
    }
}