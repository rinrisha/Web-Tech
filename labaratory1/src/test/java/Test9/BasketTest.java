package Test9;

import task9.Basket;
import task9.Ball;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.assertEquals;

public class BasketTest {
    private Basket basket;

    @BeforeEach
    public void setUp() {
        basket = new Basket();
    }

    @Test
    public void testGetTotalWeight() {
        Ball ball1 = new Ball("red", 1.5);
        Ball ball2 = new Ball("blue", 2.0);

        basket.addBall(ball1);
        basket.addBall(ball2);

        double totalWeight = basket.getTotalWeight();
        assertEquals(3.5, totalWeight, 0.001);
    }

    @Test
    public void testCountBlueBalls() {
        Ball ball1 = new Ball("red", 1.5);
        Ball ball2 = new Ball("blue", 2.0);
        Ball ball3 = new Ball("blue", 1.0);

        basket.addBall(ball1);
        basket.addBall(ball2);
        basket.addBall(ball3);

        int blueCount = basket.countBlueBalls();
        assertEquals(2, blueCount);
    }
}
