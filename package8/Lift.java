package packages.package8;

public class Elevator {
    private int numberOfFloors;
    private int currentFloor;
    private int maximumCapacity;
    private int peopleInElevator;

    public void setNumberOfFloors(int numberOfFloors) {
        this.numberOfFloors = numberOfFloors;
    }

    public void setCurrentFloor(int currentFloor) {
        this.currentFloor = currentFloor;
    }

    public void setMaximumCapacity(int maximumCapacity) {
        this.maximumCapacity = maximumCapacity;
    }

    public void setPeopleInElevator(int peopleInElevator) {
        this.peopleInElevator = peopleInElevator;
    }

    public void enter(int numberOfPeople) {
        if (numberOfPeople + peopleInElevator > maximumCapacity) {
            System.out.println("Too many people, that's not allowed");
        } else {
            peopleInElevator += numberOfPeople;
        }
    }

    public void exit(int numberOfPeople) {
        if (numberOfPeople > peopleInElevator) {
            System.out.println("There can never be 0 people in the elevator");
        } else {
            peopleInElevator -= numberOfPeople;
        }
    }

    public void goTo(int floor) {
        if (floor > currentFloor) {
            System.out.println(currentFloor + "\n---" + "\n---");
            while (floor != currentFloor) {
                currentFloor++;
                System.out.println(currentFloor + "\n---" + "\n---");
            }
        } else if (floor < currentFloor) {
            System.out.println(currentFloor + "\n---" + "\n---");
            while (floor != currentFloor) {
                currentFloor--;
                System.out.println(currentFloor + "\n---" + "\n---");
            }
        } else {
            System.out.println("You are already there!");
        }
    }
}
