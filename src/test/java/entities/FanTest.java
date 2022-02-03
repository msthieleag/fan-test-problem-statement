package entities;

import enums.Direction;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

class FanTest {

    private Fan fanTest;

    @BeforeEach
    void setUp() {
        fanTest = new Fan();
    }

    @Test
    @DisplayName("Test all fan speeds")
    void increaseSpeed() {
        assertEquals(0, fanTest.getSpeed());

        fanTest.increaseSpeed();
        assertEquals(1, fanTest.getSpeed());

        fanTest.increaseSpeed();
        assertEquals(2, fanTest.getSpeed());

        fanTest.increaseSpeed();
        assertEquals(3, fanTest.getSpeed());

        fanTest.increaseSpeed();
        assertEquals(0, fanTest.getSpeed());
    }

    @Test
    @DisplayName("Test fan reverse direction")
    void reverseDirection() {
        assertEquals(Direction.FORWARD, fanTest.getDirection());

        fanTest.reverseDirection();
        assertEquals(Direction.BACKWARD, fanTest.getDirection());

        fanTest.reverseDirection();
        assertEquals(Direction.FORWARD, fanTest.getDirection());
    }
}