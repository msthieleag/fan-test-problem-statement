import entities.Fan;

public class FanTestProblemStatementApplication {

    public static void main(String[] args) {
        System.out.println("Project to simulate a ceiling fan");

        Fan fan = new Fan();
        System.out.println("Speed: " + fan.getSpeed() + " - Direction: " + fan.getDirection());

        fan.increaseSpeed();
        System.out.println(fan);

        fan.reverseDirection();
        System.out.println(fan);
        fan.reverseDirection();
        System.out.println(fan);

        fan.increaseSpeed();
        System.out.println(fan);
        fan.increaseSpeed();
        System.out.println(fan);
        System.out.println("Speed: " + fan.getSpeed() + " - Direction: " + fan.getDirection());

    }
}
