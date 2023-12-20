class EmployeeElevator extends Elevator {
    public EmployeeElevator(int floor, Status status) {
        super(floor, status);
    }

    @Override
    public void move(int targetFloor) {
        System.out.println("Moving EmployeeElevator to floor " + targetFloor);
    }

    @Override
    public void stop() {
        System.out.println("EmployeeElevator stopped");
    }
}