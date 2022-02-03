package entities;

import enums.Direction;

public class Fan {
    private int speed;
    private Direction direction;

    public Fan() {
        this.speed = 0;
        this.direction = Direction.FORWARD;
    }

    public int getSpeed() {
        return speed;
    }

    public Direction getDirection() {
        return direction;
    }

    public void increaseSpeed(){
        if (this.speed == 3){
            this.speed = 0;
        } else {
            this.speed++;
        }
    }

    public void reverseDirection(){
        this.direction = this.direction == Direction.FORWARD ? Direction.BACKWARD : Direction.FORWARD;
    }

    @Override
    public String toString() {
        if (this.speed == 0){
            return String.format("The fan is not working anymore", speed, direction);
        }
        return String.format("The fan is working in the %d speed and in the %s direction", speed, direction);
    }
}
